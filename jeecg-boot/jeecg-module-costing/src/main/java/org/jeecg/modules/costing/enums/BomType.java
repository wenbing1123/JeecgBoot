package org.jeecg.modules.costing.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum BomType {
    FINISHED_PRODUCT(1, "预制BOM"),
    SEMI_FINISHED_PRODUCT(2, "大料BOM"),
    RAW_MATERIAL(3, "小料BOM")
    ;

    @EnumValue
    @JsonValue
    private final int value;
    private final String name;

    BomType(int value, String name) {
        this.value = value;
        this.name = name;
    }

}
