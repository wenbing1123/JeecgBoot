package org.jeecg.modules.flowable.service.dto.res;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class GetProcessDefinitionListResDto {

    private List<ProcessDefinition> items;

    @Data
    @Builder
    public static class ProcessDefinition {

        private String processDefinitionId;
        private String processDefinitionKey;
        private String processDefinitionName;
        private String processDefinitionCategory; // 流程分类

    }

}
