package com.plateer.ec1.promotion.factory;

import com.plateer.ec1.promotion.enums.PromotionType;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Component
public class CalculatorFactory {

    private final Map<PromotionType, Calculator> calculatorMap = new LinkedHashMap<>();
    private final List<Calculator> calculators;

    public CalculatorFactory(List<Calculator> calculators) {
        this.calculators = calculators;
    }

    @PostConstruct
    void init() {
        calculators.stream().forEach(c -> calculatorMap.put(c.getType(), c));
    }

    public Calculator getCalculator(PromotionType type) {
        return calculatorMap.get(type);
    }

}
