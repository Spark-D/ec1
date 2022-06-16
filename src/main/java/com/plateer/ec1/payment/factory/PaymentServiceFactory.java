package com.plateer.ec1.payment.factory;

import com.plateer.ec1.payment.enums.PaymentType;
import com.plateer.ec1.payment.processor.PayProcess;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

@Component
public class PaymentServiceFactory {
    private Map<String, PayProcess> paymentMap = new LinkedHashMap<>(); // LinkedHashMap은 정렬이 되어 저장됨

    @PostConstruct
    void init() {
        Arrays.stream(PaymentType.values())
                .forEach(paymentType -> {
                    paymentMap.put(paymentType.name(), paymentType.getProcessor().get());
                });
    }

    public PayProcess getPaymentService(String type) {
        return paymentMap.get(type);
    }
}
