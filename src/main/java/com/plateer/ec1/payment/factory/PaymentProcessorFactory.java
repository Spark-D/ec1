package com.plateer.ec1.payment.factory;

import com.plateer.ec1.payment.enums.PaymentType;
import com.plateer.ec1.payment.processor.PaymentProcessor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class PaymentProcessorFactory {

    private final Map<PaymentType, PaymentProcessor> paymentProcessorMap = new HashMap<>();

    public PaymentProcessorFactory(List<PaymentProcessor> processorList){
        processorList.forEach(e -> paymentProcessorMap.put(e.getType(), e));
    }

    public PaymentProcessor getPaymentProcessor(PaymentType type) {

        try {
            return paymentProcessorMap.get(type);
        } catch (NullPointerException npe){
            throw new IllegalArgumentException("해당하는 결제타입이 없습니다.");
        }
    }

}
