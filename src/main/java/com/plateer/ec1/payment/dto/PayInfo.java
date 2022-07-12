package com.plateer.ec1.payment.dto;

import com.plateer.ec1.payment.enums.PaymentType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PayInfo {
    private PaymentType paymentType;
}
