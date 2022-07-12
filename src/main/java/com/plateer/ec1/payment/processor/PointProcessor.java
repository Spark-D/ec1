package com.plateer.ec1.payment.processor;

import com.plateer.ec1.payment.enums.PaymentType;
import org.springframework.stereotype.Component;

@Component
public class PointProcessor extends PaymentProcessor{
    @Override
    public PaymentType getType() {
        return PaymentType.POINT;
    }

    @Override
    protected void validation() {
        System.out.println("포인트 인증");
    }

    @Override
    protected void approve() {
        System.out.println("포인트 승인");
    }

    @Override
    protected void savePayData() {
        System.out.println("포인트 사용 결과 저장");
    }
}
