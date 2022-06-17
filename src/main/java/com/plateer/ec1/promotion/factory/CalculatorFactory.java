package com.plateer.ec1.promotion.factory;

import com.plateer.ec1.payment.processor.PayProcess;
import com.plateer.ec1.promotion.enums.PromotionType;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

@Component
public class CalculatorFactory {

    private final Map<PromotionType, Calculator> calculatorMap = new LinkedHashMap<>();

    @PostConstruct
    void init() {
        Arrays.stream(PromotionType.values())
                .forEach(promotionType -> {
                    calculatorMap.put(promotionType, promotionType.getCalculator().get());
                });
    }

    public Calculator getCalculator(String type) {
        return calculatorMap.get(type);
    }

}
