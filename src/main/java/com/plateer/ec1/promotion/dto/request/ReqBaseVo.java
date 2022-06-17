package com.plateer.ec1.promotion.dto.request;

import com.plateer.ec1.promotion.dto.Product;
import com.sun.tools.javac.util.List;
import lombok.Data;

@Data
public class ReqBaseVo {

    private String memberNo;
    private List<Product> productList;
    private Long couponIssuNo;
}
