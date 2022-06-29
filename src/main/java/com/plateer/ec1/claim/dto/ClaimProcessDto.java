package com.plateer.ec1.claim.dto;

import com.plateer.ec1.common.model.order.OpClmInfo;
import com.plateer.ec1.common.model.order.OpOrdBnfInfo;
import com.plateer.ec1.common.model.order.OpOrdBnfRelInfo;
import com.plateer.ec1.common.model.order.OpOrdCostInfo;
import lombok.Data;

import java.util.List;

@Data
public class ClaimProcessDto {

    private String clmNo;
    private Long procSeq;

    private List<OpClmInfo> orderClaimList;
    private List<OpOrdCostInfo> orderCostList;
    private List<OpOrdBnfRelInfo> orderBenefitRelationList;
    private List<OpOrdBnfInfo> orderBenefits;

}
