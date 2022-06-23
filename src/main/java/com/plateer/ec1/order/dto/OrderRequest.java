package com.plateer.ec1.order.dto;

import com.plateer.ec1.payment.dto.PayInfo;
import lombok.Data;

@Data
public class OrderRequest {
    private String orderNo;
    private String systemCode;
    private String orderType;
    private PayInfo payInfo;
}
