package com.plateer.ec1.claim.enums;

import com.plateer.ec1.claim.dto.ClaimDto;
import com.plateer.ec1.claim.processor.ClaimProcessor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.jni.Proc;

import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
@Getter
public enum ClaimType {
    GCC(ProcessorType.COMPLETE, Arrays.asList("10","20"), Arrays.asList("10"), Boolean.TRUE, "C", ValidatorType.CANCEL),
    MCA(ProcessorType.ACCEPT_WITHDRAWAL, Arrays.asList("20"), Arrays.asList("20"), Boolean.TRUE, "C", ValidatorType.CANCEL),
    RA(ProcessorType.ACCEPT_WITHDRAWAL, Arrays.asList("50"), Arrays.asList("10","20"), Boolean.TRUE, "R", ValidatorType.RETURN_EXCHANGE),
    RW(ProcessorType.COMPLETE, Arrays.asList("60"), Arrays.asList("10","20"), Boolean.FALSE, "RC",ValidatorType.RETURN_EXCHANGE),
    XA(ProcessorType.ACCEPT_WITHDRAWAL, Arrays.asList("50"), Arrays.asList("10","20"), Boolean.TRUE, "X",ValidatorType.WITHDRAWAL);


    private final ProcessorType processorType;
    private final List<String> validStatuses; // 주문진행상태코드
    private final List<String> productTypes; // 상품유형 :모바일/일반
    private final Boolean claimNoFlag; // 클레임번호 채번
    private final String claimCode; //주문클레임구분코드
    private final ValidatorType validatorType;

    public static ClaimType findClaimTypeByDto(String climTypeCode, String productTypeCode){
        return Arrays.stream(ClaimType.values())
                .filter(t -> t.getClaimCode().equals(climTypeCode) && t.getProductTypes().contains(productTypeCode))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(""));
    }

}
