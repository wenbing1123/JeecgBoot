package org.jeecg.modules.flowable.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;
import org.jeecg.config.mybatis.entity.BaseEntity;
import org.jeecg.modules.flowable.enums.ProcessStatus;

import java.io.Serializable;

// 流程表单
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_form")
@SuperBuilder
@NoArgsConstructor
public class Form extends BaseEntity implements Serializable {

    private Long typeId; // 类型ID
    private String content; // 类型表单内容
    private String code; //表单编码
    private String name; //表单名称
    private ProcessStatus processStatus; //流程状态
    private String processDefinitionId; //流程定义ID
    private String processInstanceId; //流程实例ID

}
