package com.plateer.ec1.order.enums;

import lombok.Getter;

@Getter
public enum OrderType {
    GENERAL("general"),
    ECOUPON("ecoupon");

    private String code;

    OrderType(String code) {
        this.code = code;
    }
}
