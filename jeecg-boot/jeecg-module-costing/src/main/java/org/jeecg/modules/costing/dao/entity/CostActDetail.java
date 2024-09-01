package org.jeecg.modules.costing.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

// 实际成本项表
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_cost_act_detail")
public class CostActDetail {

    @TableId(type = IdType.AUTO)
    private Long id;
    private Long actualId; //实际成本ID
    private Long materialId; //物料ID
    private String sku; //规格

    /** 成本相关字段 **/
    //原料成本
    private BigDecimal rawMaterialAmount; //原料金额
    private BigDecimal auxMaterialAmount; //辅料金额
    private Integer cartonCount; //纸箱个数
    private Integer innerBagCount; // 内袋个数

    //人工成本
    private BigDecimal slittingLaborFee; //分切人工费
    private BigDecimal regulateLaborFee; //调理（摆盘灌装）人工费
    private BigDecimal fryLaborFee; //油炸人工费
    private BigDecimal packagingLaborFee; //包装人工费

    //其它成本
    private BigDecimal applyBatterFee; //上浓浆费用
    private BigDecimal coatFlourFee; //上粉费用
    private BigDecimal fuelFee; //油耗费用
    private BigDecimal steamFee; //蒸汽/液氮费用
    private BigDecimal electricityFee; //电费
    private BigDecimal makeFee; //制造费用
    private BigDecimal manageFee; //生产管理费
    private BigDecimal tonneFee; //吨成本

    //肠类特有成本
    private BigDecimal sausageCasingFee; //肠衣费用

    //调理器特有成本

    //蒸煮品特有成本

    //半成品特有成本

    //分切正品特有成本

}
