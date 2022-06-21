package com.plateer.ec1.promotion.calculators;

import com.plateer.ec1.promotion.dto.request.RequestPromotionVo;
import com.plateer.ec1.promotion.dto.response.PriceDcResVo;
import com.plateer.ec1.promotion.dto.response.ResBaseVo;
import com.plateer.ec1.promotion.enums.PromotionType;
import com.plateer.ec1.promotion.factory.Calculator;
import org.springframework.stereotype.Component;

@Component
public class DiscountCalculator implements Calculator {

    @Override
    public PromotionType getType() {
        return PromotionType.DISCOUNT;
    }

    @Override
    public ResBaseVo getCalculationInfo(RequestPromotionVo requestPromotionVo) {
        System.out.println("가격조정 계산");
        return null;
    }

    PriceDcResVo getPriceDiscountApplyData(RequestPromotionVo discountReqVo){
        return null;
    }
}
