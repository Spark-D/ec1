package com.plateer.ec1.claim.dto;

import com.plateer.ec1.claim.enums.ClaimType;
import lombok.Getter;
import java.util.List;

@Getter
public class ClaimDto {
    private String clmNo;
    private ClaimType claimType;
    private List<ClamItem> clamItemList;

}
