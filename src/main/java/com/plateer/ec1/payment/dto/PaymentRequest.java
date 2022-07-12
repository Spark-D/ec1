package com.plateer.ec1.payment.dto;

import lombok.Data;
import java.util.List;

@Data
public class PaymentRequest {
    private OrderInfo orderInfo;
    private List<PayInfo> payInfoList;
}
