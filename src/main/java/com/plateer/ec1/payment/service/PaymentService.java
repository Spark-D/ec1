package com.plateer.ec1.payment.service;

import com.plateer.ec1.payment.dto.PayInfo;
import com.plateer.ec1.payment.factory.PaymentServiceFactory;
import com.plateer.ec1.payment.processor.PayProcess;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService {
    private final PaymentServiceFactory paymentServiceFactory;

    public void approve(PayInfo payInfo) {
        PayProcess paymentService = paymentServiceFactory.getPaymentService(payInfo.getPayType());
        paymentService.approvePay(payInfo);
    }
}
