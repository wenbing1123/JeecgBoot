package org.jeecg.modules.costing.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.jeecg.modules.costing.enums.BomType;

import java.io.Serializable;
import java.time.LocalDateTime;

// BOM表
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_bom")
public class Bom implements Serializable {

    @TableId(type = IdType.AUTO)
    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String createdBy;
    private String updatedBy;
    private String remark;

    private String code; // BOM编码
    private String name; // BOM名称
    private BomType type; // BOM类型
    private Integer status; //状态
    private Integer version; //版本号

}
