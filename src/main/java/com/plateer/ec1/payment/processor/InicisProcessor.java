package com.plateer.ec1.payment.processor;

import com.plateer.ec1.payment.enums.PaymentType;
import org.springframework.stereotype.Component;

@Component
public class InicisProcessor extends PaymentProcessor{
    @Override
    public PaymentType getType() {
        return PaymentType.INICIS;
    }

    @Override
    protected void validation() {
        System.out.println("이니시스 인증");
    }
    @Override
    protected void approve() {
        System.out.println("이니시스 승인요청");
    }

    @Override
    protected void savePayData() {
        System.out.println("이니시스 승인결과 저장");
    }

}
