package org.jeecg.modules.flowable.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.flowable.bpmn.model.BpmnModel;
import org.flowable.engine.*;
import org.flowable.engine.repository.ProcessDefinition;
import org.flowable.engine.runtime.Execution;
import org.flowable.engine.runtime.ProcessInstance;
import org.flowable.image.ProcessDiagramGenerator;
import org.flowable.task.api.Task;
import org.jeecg.modules.flowable.service.FlowService;
import org.jeecg.modules.flowable.service.dto.res.GetProcessDefinitionListResDto;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@Slf4j
@RequiredArgsConstructor
public class FlowServiceImpl implements FlowService {

    private final ProcessEngine processEngine;
    private final RepositoryService repositoryService;
    private final RuntimeService runtimeService;

    @Override
    public GetProcessDefinitionListResDto getProcessDefinitionList() {
        return GetProcessDefinitionListResDto
                .builder()
                .items(repositoryService
                        .createProcessDefinitionQuery()
                        .list()
                        .stream().map(x -> GetProcessDefinitionListResDto
                                .ProcessDefinition
                                .builder()
                                .processDefinitionId(x.getId())
                                .processDefinitionKey(x.getKey())
                                .processDefinitionName(x.getName())
                                .processDefinitionCategory(x.getCategory())
                                .build())
                        .toList())
                .build();
    }

    @Override
    public InputStream getProcessDefinitionImage(String processDefinitionId, String resType) {
        ProcessDefinition pd = repositoryService.createProcessDefinitionQuery().processDefinitionId(processDefinitionId).singleResult();
        String resName = StringUtils.equalsIgnoreCase(resType, "image/png") ? pd.getDiagramResourceName() : pd.getResourceName();
        return repositoryService.getResourceAsStream(pd.getDeploymentId(), resName);
    }

    @Override
    public InputStream getProcessInstanceImage(String processInstanceId) {
        ProcessInstance pi = runtimeService
                .createProcessInstanceQuery()
                .processInstanceId(processInstanceId)
                .singleResult();
        if (Objects.isNull(pi)) {
            return null;
        }

        List<String> activityIds = new ArrayList<>();
        List<Execution> executions = runtimeService
                .createExecutionQuery()
                .processInstanceId(pi.getId())
                .list();
        for (Execution exe : executions) {
            List<String> ids = runtimeService.getActiveActivityIds(exe.getId());
            activityIds.addAll(ids);
        }

        BpmnModel bpmnModel = repositoryService.getBpmnModel(pi.getProcessDefinitionId());
        ProcessEngineConfiguration engconf = processEngine.getProcessEngineConfiguration();
        ProcessDiagramGenerator diagramGenerator = engconf.getProcessDiagramGenerator();
        return diagramGenerator.generateDiagram(bpmnModel, "png", activityIds, List.of(), engconf.getActivityFontName(), engconf.getLabelFontName(), engconf.getAnnotationFontName(), engconf.getClassLoader(), 2.0, true);
    }

}
