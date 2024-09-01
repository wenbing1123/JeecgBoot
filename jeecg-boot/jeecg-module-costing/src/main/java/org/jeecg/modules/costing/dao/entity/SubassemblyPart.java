package org.jeecg.modules.costing.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

// 子件表
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("bom_subassembly_part")
public class SubassemblyPart implements Serializable {

    @TableId(type = IdType.AUTO)
    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String createdBy;
    private String updatedBy;

    private Long materialId; //物料ID
    private Long masterId; //母件ID
    private BigDecimal amount; //数量
    private Integer unit; //计量单位

}
