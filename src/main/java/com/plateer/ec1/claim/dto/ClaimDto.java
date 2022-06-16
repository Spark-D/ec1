package com.plateer.ec1.claim.dto;

import com.plateer.ec1.claim.enums.ClaimType;
import com.sun.tools.javac.util.List;
import lombok.Getter;

@Getter
public class ClaimDto {
    private String clmNo;
    private ClaimType claimType;
    private List<ClamItem> clamItemList;

}
