package org.jeecg.modules.costing.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

// 销售订单明细
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_sale_order_detail")
public class SaleOrderDetail implements Serializable {

    @TableId(type = IdType.AUTO)
    private Long id;
    private Long orderId; //订单ID
    private Long productId; //产品ID
    private String sku; //SKU
    private Integer quantity; //数量
    private Integer stockoutQuantity; // 缺货数量


}
