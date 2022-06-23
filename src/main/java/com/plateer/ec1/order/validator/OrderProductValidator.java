package com.plateer.ec1.order.validator;

import com.plateer.ec1.order.dto.OrderValidationDto;

import java.util.function.Predicate;

public class OrderProductValidator {
    public static Predicate<OrderValidationDto> productValidator = (dto) -> {
        System.out.println("상품유효성을 체크");
        return dto != null;  
    };
}
