package org.jeecg.modules.costing.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

// 生产计划
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_produce_order_item")
public class ProduceOrderDetail implements Serializable {

    @TableId(type = IdType.AUTO)
    private Long id;

    private Long orderId; //工单ID
    private Long productId; //产品ID
    private String sku; //产品SKU
    private BigDecimal quantity; //计划生产数量
    private BigDecimal producingQuantity; //已派工数量

}
