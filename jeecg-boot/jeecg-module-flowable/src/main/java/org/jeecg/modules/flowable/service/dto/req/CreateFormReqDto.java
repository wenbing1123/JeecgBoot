package org.jeecg.modules.flowable.service.dto.req;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateFormReqDto {

    private Long formTypeId; //表单类型ID

}
