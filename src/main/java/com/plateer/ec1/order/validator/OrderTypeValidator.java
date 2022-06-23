package com.plateer.ec1.order.validator;

import com.plateer.ec1.order.dto.OrderValidationDto;

import java.util.function.Predicate;

public class OrderTypeValidator {
    public static Predicate<OrderValidationDto> orderTypeValidator = (dto) -> {
        System.out.println("주문 유형 벨리데이션 체크");
        return dto != null;
    };
}
