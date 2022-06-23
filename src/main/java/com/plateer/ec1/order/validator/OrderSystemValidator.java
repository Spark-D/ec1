package com.plateer.ec1.order.validator;

import com.plateer.ec1.order.dto.OrderValidationDto;

import java.util.function.Predicate;

public class OrderSystemValidator {
    public static Predicate<OrderValidationDto> systemValidator = (dto) -> {
        System.out.println("시스템 벨리데이션을 체크");
        return dto != null;
    };
}
