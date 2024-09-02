package org.jeecg.modules.flowable.enums;


import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum ProcessStatus {
    TO_COMMIT(0, "待提交"),
    PROCESSING(1, "处理中"),
    INVALIDATE(2, "已作废")
    ;

    @EnumValue
    @JsonValue
    private final int value;
    private final String name;

    ProcessStatus(int value, String name) {
        this.value = value;
        this.name = name;
    }
}
