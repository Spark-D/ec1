package com.plateer.ec1.order.strategy;

import com.plateer.ec1.order.dto.OrderDto;
import com.plateer.ec1.order.dto.OrderRequest;

public interface DataStrategy {
    String getProductType();
    OrderDto create(OrderRequest request);
}
