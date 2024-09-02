package org.jeecg.modules.flowable.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.runtime.ProcessInstance;
import org.jeecg.modules.flowable.dao.entity.Form;
import org.jeecg.modules.flowable.dao.mapper.FormDataMapper;
import org.jeecg.modules.flowable.dao.mapper.FormMapper;
import org.jeecg.modules.flowable.enums.ProcessStatus;
import org.jeecg.modules.flowable.service.FormService;
import org.jeecg.modules.flowable.service.dto.req.CreateFormReqDto;
import org.jeecg.modules.flowable.service.dto.res.CreateFormResDto;
import org.jeecg.modules.flowable.service.dto.res.GetFormTypeListResDto;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

import static com.google.common.base.Preconditions.checkState;

@Service
@Slf4j
@RequiredArgsConstructor
public class FormServiceImpl implements FormService {

    private final RuntimeService runtimeService;
    private final FormMapper formMapper;
    private final FormDataMapper formDataMapper;

    @Override
    public GetFormTypeListResDto getFormTypeList() {
        return null;
    }

    @Override
    public CreateFormResDto createForm(CreateFormReqDto dto) {
        return null;
    }

    @Override
    public void submitProcess(Long formId) {
        Form form = formMapper.selectById(formId);

        String processDefinitionId = form.getProcessDefinitionId();
        Map<String, Object> variables = new HashMap<>();
        variables.put("formId", formId); //对应表单ID
        ProcessInstance pi = runtimeService.startProcessInstanceById(processDefinitionId, variables);

        form.setProcessDefinitionId(processDefinitionId);
        form.setProcessStatus(ProcessStatus.PROCESSING);
        int count = formMapper.updateById(form);
        checkState(count == 1, "update fail");
    }

}
