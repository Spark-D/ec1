package com.plateer.ec1.claim.creator;

import com.plateer.ec1.claim.dto.ClaimDto;
import com.plateer.ec1.claim.enums.ClaimType;
import com.plateer.ec1.common.model.order.OpClmInfo;
import com.plateer.ec1.common.model.order.OpOrdBnfInfo;
import com.plateer.ec1.common.model.order.OpOrdBnfRelInfo;
import com.plateer.ec1.common.model.order.OpOrdCostInfo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EcouponCancelCompleteDataCreator extends ClaimDataCreator{
    @Override
    public ClaimType getType() {
        return ClaimType.MCA;
    }

    @Override
    protected List<OpClmInfo> makeInsertOrderClaim(ClaimDto dto) {

        return null;
    }

    @Override
    protected List<OpOrdCostInfo> makeInsertOrderCost(ClaimDto dto) {
        return null;
    }

    @Override
    protected List<OpOrdBnfRelInfo> makeInsertOrderBenefitRelation(ClaimDto dto) {
        return null;
    }

    @Override
    protected List<OpClmInfo> makeUpdateOrderClaim(ClaimDto dto) {
        System.out.println("이쿠폰 취소완료 데이터 만듬");
        return null;
    }

    @Override
    protected List<OpOrdCostInfo> makeUpdateOrderCost(ClaimDto dto) {
        return null;
    }

    @Override
    protected List<OpOrdBnfInfo> makeUpdateOrderBenefit(ClaimDto dto) {
        return null;
    }
}
