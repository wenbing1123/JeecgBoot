package org.jeecg.modules.flowable.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;
import org.jeecg.config.mybatis.entity.BaseEntity;
import org.jeecg.modules.flowable.enums.TaskStatus;

import java.io.Serializable;
import java.time.LocalDateTime;

// 流程任务
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_task")
@SuperBuilder
@NoArgsConstructor
public class Task extends BaseEntity implements Serializable {

    private String initiator; //任务发起人
    private String assignee; //任务所属用户
    private String title; //任务标题
    private String content; //任务内容
    private TaskStatus status; //任务状态

    private String processInstanceId; // 流程实例ID
    private String processInstanceName; // 流程实例名称
    private String currentStep; //当前环节

}
