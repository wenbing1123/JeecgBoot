package org.jeecg.modules.flowable.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum TaskStatus {
    TO_DO(0, "待办"),
    COMPLETED(1, "已办")
    ;

    @EnumValue
    @JsonValue
    private final int value;
    private final String name;

    TaskStatus(int value, String name) {
        this.value = value;
        this.name = name;
    }

}
