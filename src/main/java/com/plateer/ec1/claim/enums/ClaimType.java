package com.plateer.ec1.claim.enums;

import com.plateer.ec1.claim.dto.ClaimDto;
import com.plateer.ec1.claim.processors.AcceptWithdrawalProcessor;
import com.plateer.ec1.claim.processors.ClaimProcessor;
import com.plateer.ec1.claim.processors.CompleteProcessor;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
public enum ClaimType {

    GCC(CompleteProcessor.getInstance(), Arrays.asList(), Arrays.asList(), Boolean.TRUE, "", "", Arrays.asList()),
    MCA(AcceptWithdrawalProcessor.getInstance(), Arrays.asList(), Arrays.asList(), Boolean.TRUE, "", "", Arrays.asList()),
    MCC(CompleteProcessor.getInstance(), Arrays.asList(), Arrays.asList(), Boolean.TRUE, "", "", Arrays.asList()),
    RA(AcceptWithdrawalProcessor.getInstance(), Arrays.asList(), Arrays.asList(), Boolean.TRUE, "", "", Arrays.asList()),
    RC(CompleteProcessor.getInstance(), Arrays.asList(), Arrays.asList(), Boolean.TRUE, "", "", Arrays.asList()),
    RW(AcceptWithdrawalProcessor.getInstance(), Arrays.asList(), Arrays.asList(), Boolean.TRUE, "", "", Arrays.asList()),
    EA(AcceptWithdrawalProcessor.getInstance(), Arrays.asList(), Arrays.asList(), Boolean.TRUE, "", "", Arrays.asList()),
    EW(AcceptWithdrawalProcessor.getInstance(), Arrays.asList(), Arrays.asList(), Boolean.TRUE, "", "", Arrays.asList());

    private final ClaimProcessor claimProcessor;
    private final List<String> validStatuses;
    private final List<String> productTypes;
    private final Boolean claimNoFlag;
    private final String claimCode;
    private final String orderStateCode;
    private final List<String> deliveryCodes;

    public static void execute(ClaimDto claimDto) {
        Arrays.stream(values())
                .filter(claimType -> claimDto.getClaimType().name().equals(claimType.name()) )
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("해당 클레임타입이 없습니다"))
                .claimProcessor
                .doProcess(claimDto);
    }

}
