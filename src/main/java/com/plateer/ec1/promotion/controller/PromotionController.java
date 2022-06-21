package com.plateer.ec1.promotion.controller;

import com.plateer.ec1.promotion.dto.request.RequestPromotionVo;
import com.plateer.ec1.promotion.dto.response.PriceDcResVo;
import com.plateer.ec1.promotion.service.PromotionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PromotionController {

    private final PromotionService promotionService;

    @PostMapping("promotion/discount")
    public PriceDcResVo getApplyDiscountPriceData(RequestPromotionVo requestPromotionVo) {
        return promotionService.getApplyDiscountPrice(requestPromotionVo);
    }

}
