package org.jeecg.modules.costing.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

// 销售订单
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_sale_plan_detail")
public class SalePlanDetail implements Serializable {

    @TableId(type = IdType.AUTO)
    private Long id;
    private Long planId; //订单ID
    private Long productId; //产品ID
    private String sku; //SKU
    private Integer quantity; //数量

}
