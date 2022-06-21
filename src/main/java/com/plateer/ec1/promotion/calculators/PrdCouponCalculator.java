package com.plateer.ec1.promotion.calculators;

import com.plateer.ec1.promotion.dto.request.RequestPromotionVo;
import com.plateer.ec1.promotion.dto.response.ResBaseVo;
import com.plateer.ec1.promotion.enums.PromotionType;
import com.plateer.ec1.promotion.factory.Calculator;
import org.springframework.stereotype.Component;

@Component
public class PrdCouponCalculator implements Calculator {

    @Override
    public PromotionType getType() {
        return PromotionType.PRD_CPN;
    }

    @Override
    public ResBaseVo getCalculationInfo(RequestPromotionVo requestPromotionVo) {
        System.out.println("상품쿠폰 계산");
        return null;
    }
}
