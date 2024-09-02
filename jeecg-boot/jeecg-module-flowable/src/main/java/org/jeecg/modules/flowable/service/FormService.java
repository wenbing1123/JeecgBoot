package org.jeecg.modules.flowable.service;

import org.jeecg.modules.flowable.service.dto.req.CreateFormReqDto;
import org.jeecg.modules.flowable.service.dto.res.CreateFormResDto;
import org.jeecg.modules.flowable.service.dto.res.GetFormTypeListResDto;

public interface FormService {

    GetFormTypeListResDto getFormTypeList();

    CreateFormResDto createForm(CreateFormReqDto dto);

    void submitProcess(Long formId);

}
