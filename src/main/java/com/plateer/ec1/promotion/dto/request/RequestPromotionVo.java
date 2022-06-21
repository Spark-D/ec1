package com.plateer.ec1.promotion.dto.request;

import com.plateer.ec1.promotion.dto.Product;
import com.plateer.ec1.promotion.enums.PromotionType;
import java.util.List;
import lombok.Data;

@Data
public class RequestPromotionVo {
    private PromotionType promotionType;
    private String mbrNo;
    private List<Product> productList;
    private Long cpnIssuNo;
}
