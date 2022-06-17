package com.plateer.ec1.claim.enums;

import com.plateer.ec1.claim.creator.ClaimDataCreator;
import com.plateer.ec1.claim.creator.EcouponCancelAcceptDataCreator;
import com.plateer.ec1.claim.creator.EcouponCancelCompleteDataCreator;
import com.plateer.ec1.claim.creator.GeneralCancelDataCreator;
import com.plateer.ec1.claim.processor.AcceptWithdrawalProcessor;
import com.plateer.ec1.claim.processor.ClaimProcessor;
import com.plateer.ec1.claim.processor.CompleteProcessor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

@RequiredArgsConstructor
@Getter
public enum ClaimType {
    GCC(CompleteProcessor::getInstance,         GeneralCancelDataCreator::new, Arrays.asList(), Arrays.asList(), Boolean.TRUE, "C"),
    MCA(AcceptWithdrawalProcessor::getInstance, EcouponCancelAcceptDataCreator::new, Arrays.asList(), Arrays.asList(), Boolean.TRUE, "C"),
    MCC(CompleteProcessor::getInstance,         EcouponCancelCompleteDataCreator::new, Arrays.asList(), Arrays.asList(), Boolean.FALSE, "C"),
    RA(CompleteProcessor::getInstance,          GeneralCancelDataCreator::new, Arrays.asList(), Arrays.asList(), Boolean.TRUE, "R"),
    RC(CompleteProcessor::getInstance,          GeneralCancelDataCreator::new, Arrays.asList(), Arrays.asList(), Boolean.FALSE, "R"),
    RW(CompleteProcessor::getInstance,          GeneralCancelDataCreator::new, Arrays.asList(), Arrays.asList(), Boolean.TRUE, "RC"),
    XA(CompleteProcessor::getInstance,          GeneralCancelDataCreator::new, Arrays.asList(), Arrays.asList(), Boolean.TRUE, "X"),
    XW(CompleteProcessor::getInstance,          GeneralCancelDataCreator::new, Arrays.asList(), Arrays.asList(), Boolean.TRUE, "XC");

    private final Supplier<ClaimProcessor> claimProcess;
    private final Supplier<ClaimDataCreator> creator;
    private final List<String> validStatuses; // 주문진행상태코드
    private final List<String> productTypes; // 상품유형 -> 모바일/일반
    private final Boolean claimNoFlag; // 클레임번호 채번
    private final String claimCode; //주문클레임구분코드

    public static ClaimDataCreator findCreator(String name) {
        return Arrays.stream(ClaimType.values())
                .filter(type -> type.name().equals(name))
                .findFirst()
                .map(claimType -> claimType.getCreator().get())
                .orElseThrow(()-> new IllegalArgumentException("클레임유형 요청이 잘못되었습니다."));
    }

    public static ClaimProcessor findProcessor(String name) {
        return Arrays.stream(ClaimType.values())
                .filter(type -> type.name().equals(name))
                .findFirst()
                .map(claimType -> claimType.getClaimProcess().get())
                .orElseThrow(()-> new IllegalArgumentException("클레임유형 요청이 잘못되었습니다."));
    }

}
