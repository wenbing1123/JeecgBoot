package org.jeecg.modules.flowable.service;

import org.jeecg.modules.flowable.enums.TaskStatus;
import org.jeecg.modules.flowable.service.dto.res.GetTaskListResDto;

public interface TaskService {

    GetTaskListResDto getTaskListByUserId(String userId, TaskStatus status);

    void completeTask(String taskId);

}
