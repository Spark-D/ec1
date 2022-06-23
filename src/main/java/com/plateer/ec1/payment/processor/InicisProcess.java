package com.plateer.ec1.payment.processor;

import com.plateer.ec1.payment.dto.ApproveResVo;
import com.plateer.ec1.payment.dto.PayInfo;
import com.plateer.ec1.payment.enums.PaymentType;
import org.springframework.stereotype.Component;

@Component
public class InicisProcess implements PayProcess{
    @Override
    public PaymentType getPaymentType() {
        return PaymentType.INICIS;
    }

    @Override
    public void validateAuth(PayInfo payInfo) {

    }

    @Override
    public ApproveResVo approvePay(PayInfo payInfo) {
        System.out.println("[payment] inicis");
        return null;
    }


    @Override
    public void cancelPay(PayInfo payInfo) {

    }
}
