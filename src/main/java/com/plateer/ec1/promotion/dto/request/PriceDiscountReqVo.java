package com.plateer.ec1.promotion.dto.request;

import com.plateer.ec1.promotion.dto.Product;
import com.plateer.ec1.promotion.enums.PromotionType;
import com.sun.tools.javac.util.List;
import lombok.Data;

@Data
public class PriceDiscountReqVo {
    private PromotionType promotionType;
    private String mbrNo;
    private List<Product> productList;
    private Long cpnIssuNo;
}
