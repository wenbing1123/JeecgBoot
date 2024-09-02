package org.jeecg.modules.flowable.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.flowable.engine.HistoryService;
import org.flowable.task.api.Task;
import org.flowable.task.api.history.HistoricTaskInstance;
import org.jeecg.modules.flowable.enums.TaskStatus;
import org.jeecg.modules.flowable.service.TaskService;
import org.jeecg.modules.flowable.service.dto.res.GetTaskListResDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

    private final org.flowable.engine.TaskService taskService;
    private final HistoryService historyService;

    @Override
    public GetTaskListResDto getTaskListByUserId(String userId, TaskStatus status) {
        return GetTaskListResDto
                .builder()
                .items(status == TaskStatus.COMPLETED ? getCompletedTasks(userId) : getToDoTasks(userId))
                .build();
    }

    @Override
    public void completeTask(String taskId) {
        taskService.complete(taskId);
    }

    private List<GetTaskListResDto.Task> getToDoTasks(String userId) {
        return taskService
                .createTaskQuery()
                .taskCandidateOrAssigned(userId)
                .list()
                .stream()
                .map(x -> GetTaskListResDto.Task
                        .builder()
                        .id(x.getId())
                        .name(x.getName())
                        .userId(x.getAssignee())
                        .status(TaskStatus.TO_DO)
                        .build())
                .toList();
    }

    private List<GetTaskListResDto.Task> getCompletedTasks(String userId) {
        return historyService
                .createHistoricTaskInstanceQuery()
                .finished()
                .taskAssignee(userId)
                .list()
                .stream()
                .map(x -> GetTaskListResDto.Task
                        .builder()
                        .id(x.getId())
                        .name(x.getName())
                        .userId(x.getAssignee())
                        .status(TaskStatus.COMPLETED)
                        .build())
                .toList();
    }

}
