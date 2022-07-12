package com.plateer.ec1.payment.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum PaymentType {
    INICIS("", ""),
    POINT("","");

    private final String approveSuccessCode;
    private final String cancelSuccessCode;

}
