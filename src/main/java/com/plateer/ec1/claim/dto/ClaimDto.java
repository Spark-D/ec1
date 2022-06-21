package com.plateer.ec1.claim.dto;

import lombok.Getter;
import java.util.List;

@Getter
public class ClaimDto {
    private String claimCode; //클레임구분코드
    private String productType; //상품유형
    private String odNo; //주문번호
    private String clmNo; //클레임번호
    private List<ClamItem> clamItemList; //클레임대상상품목록
    private String clamRsnCd; //클레임귀책사유구분코드
}
