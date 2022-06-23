package com.plateer.ec1.order.dto;

import lombok.Data;

import java.util.List;

@Data
public class OrderValidationDto {
    private OrderRequest request;
    private List<OrderProductView> product;

    public OrderValidationDto(OrderRequest request, List<OrderProductView> product) {
        this.request = request;
        this.product = product;
    }
}
