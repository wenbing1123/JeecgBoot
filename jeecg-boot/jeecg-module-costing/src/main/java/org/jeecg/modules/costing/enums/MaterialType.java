package org.jeecg.modules.costing.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum MaterialType {
    FINISHED_PRODUCT(1, "成品"),
    SEMI_FINISHED_PRODUCT(2, "半成品"),
    RAW_MATERIAL(3, "原料")
    ;

    @EnumValue
    @JsonValue
    private final int value;
    private final String name;

    MaterialType(int value, String name) {
        this.value = value;
        this.name = name;
    }

}
