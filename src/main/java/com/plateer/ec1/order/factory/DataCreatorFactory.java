package com.plateer.ec1.order.factory;

import com.plateer.ec1.order.strategy.AfterStrategy;
import com.plateer.ec1.order.strategy.DataStrategy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Component
public class DataCreatorFactory {
    Map<String, DataStrategy> dataStrategyMap = new LinkedHashMap<>();
    List<DataStrategy> dataStrategyList;

    public DataCreatorFactory(List<DataStrategy> dataStrategyList) {
        this.dataStrategyList = dataStrategyList;
    }

    @PostConstruct
    void init() {
        dataStrategyList.stream()
                .forEach(ds -> dataStrategyMap.put(ds.getProductType(), ds));
    }

    public DataStrategy getDataStrategy(String code) {
        if(!dataStrategyMap.containsKey(code)) { throw new IllegalArgumentException(""); }
        return dataStrategyMap.get(code);
    }
}
