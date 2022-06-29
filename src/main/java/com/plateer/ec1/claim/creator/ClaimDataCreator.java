package com.plateer.ec1.claim.creator;

import com.plateer.ec1.claim.dto.ClaimDto;
import com.plateer.ec1.claim.dto.ClaimProcessDto;
import com.plateer.ec1.claim.enums.ClaimType;
import com.plateer.ec1.common.model.order.OpClmInfo;
import com.plateer.ec1.common.model.order.OpOrdBnfInfo;
import com.plateer.ec1.common.model.order.OpOrdBnfRelInfo;
import com.plateer.ec1.common.model.order.OpOrdCostInfo;

import java.util.List;

abstract public class ClaimDataCreator {

    abstract public ClaimType getType();

    public void getClamNo(ClaimDto dto) {
        System.out.println("클레임번호 채번");
//        dto.setClmNo("C202206150001");
    }

    public ClaimProcessDto makeCreateData(ClaimDto dto) {
        List<OpClmInfo> orderClaimList = makeInsertOrderClaim(dto);
        List<OpOrdCostInfo> orderCostList = makeInsertOrderCost(dto);
        List<OpOrdBnfRelInfo> orderBenefitRelationList = makeInsertOrderBenefitRelation(dto);
        return manipulateData(orderClaimList, orderCostList, orderBenefitRelationList, null);
    }

    /**
     * 주문클레임 테이블 insert 대상데이터를 만든다
     * */
    abstract protected List<OpClmInfo> makeInsertOrderClaim(ClaimDto dto);

    /**
     * 주문비용 테이블 insert 대상데이터를 만든다
     * */
    abstract protected List<OpOrdCostInfo> makeInsertOrderCost(ClaimDto dto);

    /**
     * 주문혜택관계 테이블 insert 대상데이터를 만든다
     * */
    abstract protected List<OpOrdBnfRelInfo> makeInsertOrderBenefitRelation(ClaimDto dto);


    public ClaimProcessDto makeUpdateData(ClaimDto dto) {
        List<OpClmInfo> orderClaimList = makeUpdateOrderClaim(dto);
        List<OpOrdCostInfo> orderCostList = makeUpdateOrderCost(dto);
        List<OpOrdBnfInfo> orderBenefitList = makeUpdateOrderBenefit(dto);
        return manipulateData(orderClaimList, orderCostList, null, orderBenefitList);
    }

    /**
     * 주문클레임 테이블 update 대상데이터를 만든다
     * */
    protected abstract List<OpClmInfo> makeUpdateOrderClaim(ClaimDto dto);
    /**
     * 주문비용 테이블 update 대상데이터를 만든다
     * */
    protected abstract List<OpOrdCostInfo> makeUpdateOrderCost(ClaimDto dto);
    /**
     * 주문혜택 테이블 update 대상데이터를 만든다
     * */
    protected abstract List<OpOrdBnfInfo> makeUpdateOrderBenefit(ClaimDto dto);


    private ClaimProcessDto manipulateData(List<OpClmInfo> orderClaimList, List<OpOrdCostInfo> orderCostList, List<OpOrdBnfRelInfo> orderBenefitRelationList, List<OpOrdBnfInfo> orderBenefitList) {
        ClaimProcessDto claimProcessDto = new ClaimProcessDto();
        claimProcessDto.setOrderClaimList(orderClaimList);
        claimProcessDto.setOrderCostList(orderCostList);
        claimProcessDto.setOrderBenefitRelationList(orderBenefitRelationList);
        claimProcessDto.setOrderBenefits(orderBenefitList);
        return claimProcessDto;
    }

    public void saveClaimData(ClaimProcessDto createDataTarget, ClaimProcessDto updateDataTarget){
        insertClaimData(createDataTarget);
        makeUpdateClaimData(updateDataTarget);
    }

    private void makeUpdateClaimData(ClaimProcessDto updateDataTarget) {
        System.out.println("update 수정데이터");
    }

    private void insertClaimData(ClaimProcessDto createDataTarget) {
        System.out.println("insert 생성데이터");
    }

}
