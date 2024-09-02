package org.jeecg.modules.flowable.service;

import org.jeecg.modules.flowable.service.dto.res.GetProcessDefinitionListResDto;

import java.io.InputStream;

public interface FlowService {

    // 流程定义
    GetProcessDefinitionListResDto getProcessDefinitionList();
    InputStream getProcessDefinitionImage(String processDefinitionId, String resType);

    // 流程实例
    InputStream getProcessInstanceImage(String processInstanceId);

}
