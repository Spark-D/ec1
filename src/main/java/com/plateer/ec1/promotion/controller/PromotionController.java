package com.plateer.ec1.promotion.controller;

import com.plateer.ec1.promotion.dto.request.PriceDiscountReqVo;
import com.plateer.ec1.promotion.service.PromotionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PromotionController {

    private final PromotionService promotionService;

    public PriceDiscountResVo getApplyDiscountPrice(PriceDiscountReqVo discountReqVo) {
        return promotionService.getApplyDiscountPrice(discountReqVo);
    }

}
