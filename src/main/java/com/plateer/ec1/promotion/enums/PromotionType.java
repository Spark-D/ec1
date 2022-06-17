package com.plateer.ec1.promotion.enums;

import com.plateer.ec1.promotion.calculators.CartCouponCalculator;
import com.plateer.ec1.promotion.calculators.DiscountCalculator;
import com.plateer.ec1.promotion.calculators.PrdCouponCalculator;
import com.plateer.ec1.promotion.factory.Calculator;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.function.Supplier;

@RequiredArgsConstructor
@Getter
public enum PromotionType {
    DISCOUNT(DiscountCalculator::new),
    PRD_CPN(PrdCouponCalculator::new),
    CART_CPN(CartCouponCalculator::new);

    private final Supplier<Calculator> calculator;
}
