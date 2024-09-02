package org.jeecg.modules.flowable.service.dto.res;

import lombok.Builder;
import lombok.Data;
import org.jeecg.modules.flowable.enums.TaskStatus;

import java.util.List;

@Data
@Builder
public class GetTaskListResDto {

    private List<Task> items;


    @Data
    @Builder
    public static class Task {
        private String id;
        private String name;
        private String userId;
        private TaskStatus status;
    }

}
