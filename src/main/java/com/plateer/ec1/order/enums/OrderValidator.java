package com.plateer.ec1.order.enums;

import com.plateer.ec1.order.dto.OrderRequest;
import com.plateer.ec1.order.dto.OrderValidationDto;
import com.plateer.ec1.order.validator.OrderCommonValidator;
import com.plateer.ec1.order.validator.OrderProductValidator;

import java.util.Arrays;
import java.util.function.Predicate;

public enum OrderValidator implements Predicate<OrderValidationDto> {
    FO_GENERAL("FO", "general", OrderCommonValidator.commonValidator
                                                        .and(OrderProductValidator.productValidator)),
    BO_GENERAL("BO" , "general", OrderCommonValidator.commonValidator
                                                        .and(OrderProductValidator.productValidator)),
    FO_ECOUPON("FO" , "ecoupon" ,OrderCommonValidator.commonValidator
                                                        .and(OrderProductValidator.productValidator)),
    BO_ECOUPON("BO", "ecoupon", OrderCommonValidator.commonValidator
                                                        .and(OrderProductValidator.productValidator));

    private String systemCode;
    private String orderType;
    private Predicate<OrderValidationDto> predicate;

    OrderValidator(String systemCode, String orderType, Predicate<OrderValidationDto> predicate) {
        this.systemCode = systemCode;
        this.orderType = orderType;
        this.predicate = predicate;
    }

    public static OrderValidator get(OrderRequest request) {
        return Arrays.stream(OrderValidator.values()).filter(v -> v.systemCode.equals(request.getSystemCode()) && v.orderType.equals(request.getOrderType()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(""));
    }

    public boolean test(OrderValidationDto orderValidationDto) {
        return predicate.test(orderValidationDto);
    }


}
