package org.jeecg.modules.flowable.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;
import org.jeecg.config.mybatis.entity.IdEntity;
import org.jeecg.modules.flowable.enums.ProcessStatus;

import java.io.Serializable;
import java.time.LocalDateTime;

// 流程表单数据
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_form_data")
@SuperBuilder
@NoArgsConstructor
public class FormData extends IdEntity implements Serializable {

    private Long formId; //表单ID
    private String name; // 字段名称
    private String value; //字段值
    private String description; //字段描述

}
