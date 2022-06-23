package com.plateer.ec1.payment.factory;

import com.plateer.ec1.payment.enums.PaymentType;
import com.plateer.ec1.payment.processor.PayProcess;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@Component
public class PaymentServiceFactory {
    private Map<PaymentType, PayProcess> paymentMap = new LinkedHashMap<>(); // LinkedHashMap은 정렬이 되어 저장됨
    private List<PayProcess> payProcessList;

    public PaymentServiceFactory(List<PayProcess> payProcessList) {
        this.payProcessList = payProcessList;
    }

    @PostConstruct
    void init() {
        payProcessList.stream()
                .forEach(p -> paymentMap.put(p.getPaymentType(), p));
    }

    public PayProcess getPaymentService(String type) {
        return paymentMap.get(PaymentType.valueOf(type.toUpperCase(Locale.ROOT)));
    }
}
