package com.plateer.ec1.promotion.service;

import com.plateer.ec1.promotion.dto.request.PriceDiscountReqVo;
import com.plateer.ec1.promotion.dto.response.PriceDcResVo;
import com.plateer.ec1.promotion.factory.Calculator;
import com.plateer.ec1.promotion.factory.CalculatorFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PromotionService {

    private final CalculatorFactory calculatorFactory;

    public PriceDcResVo getApplyDiscountPrice(PriceDiscountReqVo discountReqVo) {
        calculatorFactory.getCalculator(discountReqVo.getPromotionType().name())
        return null;
    }




}
