package org.jeecg.modules.flowable.service.dto.res;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class GetFormTypeListResDto {

    private List<FormGroup> items;

    @Data
    @Builder
    public static class FormGroup {
        private Long groupId; //分组ID
        private String groupName; // 分组名称
        private List<FormType> formTypes; // 表单类型列表
    }

    @Data
    @Builder
    public static class FormType {
        private Long formId;
        private String formName;
    }

}
