package org.jeecg.modules.costing.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

// 生产计划
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_produce_plan")
public class ProducePlan implements Serializable {

    @TableId(type = IdType.AUTO)
    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String createdBy;
    private String updatedBy;

    private String code;
    private String name;
    private Integer status; //状态
    private String manager; //负责人
    private LocalDateTime startTime; //开始时间
    private LocalDateTime endTime; //结束时间

}
