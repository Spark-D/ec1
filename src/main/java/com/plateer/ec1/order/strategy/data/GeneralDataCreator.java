package com.plateer.ec1.order.strategy.data;

import com.plateer.ec1.order.dto.OrderDto;
import com.plateer.ec1.order.dto.OrderRequest;
import com.plateer.ec1.order.enums.OrderType;
import com.plateer.ec1.order.strategy.DataStrategy;
import org.springframework.stereotype.Component;

@Component
public class GeneralDataCreator implements DataStrategy {
    @Override
    public String getProductType() {
        return OrderType.GENERAL.getCode();
    }

    @Override
    public OrderDto create(OrderRequest request) {
        System.out.println("일반상품 데이터 create" + request);
        return null;
    }
}
