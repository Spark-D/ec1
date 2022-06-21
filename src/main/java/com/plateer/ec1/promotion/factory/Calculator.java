package com.plateer.ec1.promotion.factory;

import com.plateer.ec1.promotion.dto.request.RequestPromotionVo;
import com.plateer.ec1.promotion.dto.response.PriceDcResVo;
import com.plateer.ec1.promotion.dto.response.ResBaseVo;
import com.plateer.ec1.promotion.enums.PromotionType;

public interface Calculator {

    PromotionType getType();
    ResBaseVo getCalculationInfo(RequestPromotionVo requestPromotionVo);

}
