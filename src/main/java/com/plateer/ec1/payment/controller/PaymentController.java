package com.plateer.ec1.payment.controller;

import com.plateer.ec1.payment.dto.PayInfo;
import com.plateer.ec1.payment.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping("pay")
    public void approvePay(PayInfo payInfo) {
        paymentService.approve(payInfo);
    }

}
