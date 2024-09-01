package org.jeecg.modules.costing.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.jeecg.modules.costing.enums.MaterialType;

import java.io.Serializable;
import java.time.LocalDateTime;

// 物料表
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_material")
public class Material implements Serializable {

    @TableId(type = IdType.AUTO)
    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String createdBy;
    private String updatedBy;

    private String code; //物料编码
    private String name; //物料名称
    private String shortName; //物料简称
    private MaterialType materialType; //物料类型
    private Long categoryId; //物料分类ID
    private Long craftTypeId; //工艺类型ID
    private Long companyId; //生产公司ID
    private Long accountingWayId; //核算方式ID

    //原料相关字段
    private Long factoryId; //工厂ID

}
