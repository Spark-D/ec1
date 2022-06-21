package com.plateer.ec1.claim.processor;

import com.plateer.ec1.claim.creator.ClaimDataCreator;
import com.plateer.ec1.claim.dto.ClaimDto;
import com.plateer.ec1.claim.dto.ClaimProcessDto;
import com.plateer.ec1.claim.enums.ClaimType;
import com.plateer.ec1.claim.enums.ProcessorType;
import com.plateer.ec1.claim.factory.CreatorFactory;
import com.plateer.ec1.claim.factory.ValidatorFactory;
import com.plateer.ec1.claim.util.MonitoringLogHelper;
import com.plateer.ec1.claim.validator.ClaimValidator;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
abstract public class ClaimProcessor {

    public abstract ProcessorType getType();
    protected final MonitoringLogHelper monitoringLogHelper;
    private final CreatorFactory creatorFactory;
    private final ValidatorFactory validatorFactory;

    protected ClaimDataCreator getCreator(ClaimDto dto) {
        return creatorFactory.getCreator(ClaimType.findClaimTypeByDto(dto.getClaimCode(), dto.getProductType()));
    }

    protected ClaimValidator getValidator(ClaimDto dto) {
        return validatorFactory.getValidator(ClaimType.findClaimTypeByDto(dto.getClaimCode(), dto.getProductType()).getValidatorType());
    }

    public Long insertLog(ClaimDto dto) {
        return monitoringLogHelper.insertLog(dto);
    }

    public void updateLog(Long logkey, ClaimProcessDto regData, ClaimProcessDto modData) {
        monitoringLogHelper.updateLog(logkey, regData, modData);
    }
    public abstract void doProcess(ClaimDto dto);

    protected void verifyAmount() {
        System.out.println("클레임 공통 금액검증");
    }

}
