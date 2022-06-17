package com.plateer.ec1.promotion.factory;

import com.plateer.ec1.promotion.dto.request.PromotionReqVo;
import com.plateer.ec1.promotion.dto.request.ReqBaseVo;
import com.plateer.ec1.promotion.dto.response.ResBaseVo;

public interface Calculator {

    ResBaseVo getCalculationInfo(ReqBaseVo promotionReqVo);

}
