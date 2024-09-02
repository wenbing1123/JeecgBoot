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

import java.io.Serializable;
import java.time.LocalDateTime;

// 流程表单分类组
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_form_type_group")
@SuperBuilder
@NoArgsConstructor
public class FormTypeGroup extends BaseEntity implements Serializable {

    private String name;
    private String description;

}
