package org.jeecg.modules.costing.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum SaleOrderStatus {

    FINISHED(0, "已下单")
    ;

    @EnumValue
    @JsonValue
    private final int value;
    private final String name;

    SaleOrderStatus(int value, String name) {
        this.value = value;
        this.name = name;
    }

}
