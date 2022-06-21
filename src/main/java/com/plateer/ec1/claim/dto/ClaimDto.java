package com.plateer.ec1.claim.dto;

import lombok.Getter;
import java.util.List;

@Getter
public class ClaimDto {
    private String claimCode;
    private String productType;
    private String odNo;
    private String clmNo;
    private List<ClamItem> clamItemList;
    private String clamRsnCd;
}
