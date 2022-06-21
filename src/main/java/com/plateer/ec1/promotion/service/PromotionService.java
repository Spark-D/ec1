package com.plateer.ec1.promotion.service;

import com.plateer.ec1.promotion.dto.request.RequestPromotionVo;
import com.plateer.ec1.promotion.dto.response.PriceDcResVo;
import com.plateer.ec1.promotion.factory.Calculator;
import com.plateer.ec1.promotion.factory.CalculatorFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PromotionService {

    private final CalculatorFactory calculatorFactory;

    public PriceDcResVo getApplyDiscountPrice(RequestPromotionVo discountReqVo) {
        Calculator priceDiscountCalculator = calculatorFactory.getCalculator(discountReqVo.getPromotionType());
        return null;
    }




}
