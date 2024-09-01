package org.jeecg.modules.costing.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

// 母件表
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("bom_master_part")
public class MasterPart implements Serializable {

    @TableId(type = IdType.AUTO)
    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String createdBy;
    private String updatedBy;

    private String code; //母件编码
    private String name; //母件名称

    private Long parentId; //父级母件ID

    private Long productId; //成品ID

}
