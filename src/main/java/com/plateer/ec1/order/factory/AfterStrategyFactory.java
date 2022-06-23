package com.plateer.ec1.order.factory;

import com.plateer.ec1.order.strategy.AfterStrategy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Component
public class AfterStrategyFactory {
    Map<String, AfterStrategy> afterStrategyMap = new LinkedHashMap<>();
    List<AfterStrategy> afterStrategyList;

    public AfterStrategyFactory(List<AfterStrategy> afterStrategyList) {
        this.afterStrategyList = afterStrategyList;
    }

    @PostConstruct
    void init() {
        afterStrategyList.stream()
                .forEach(as -> afterStrategyMap.put(as.getSystemCode(), as));
    }

    public AfterStrategy getAfterStrategy(String code) {
        if(!afterStrategyMap.containsKey(code)) { throw new IllegalArgumentException(""); }
        return afterStrategyMap.get(code);
    }
}
