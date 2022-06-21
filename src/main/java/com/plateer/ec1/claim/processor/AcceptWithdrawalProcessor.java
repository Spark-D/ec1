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
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Slf4j
public class AcceptWithdrawalProcessor extends ClaimProcessor {

    public AcceptWithdrawalProcessor(MonitoringLogHelper monitoringLogHelper, CreatorFactory creatorFactory, ValidatorFactory validatorFactory) {
        super(monitoringLogHelper, creatorFactory, validatorFactory);
    }

    @Override
    public ProcessorType getType() {
        return ProcessorType.ACCEPT_WITHDRAWAL;
    }

    @Override
    public void doProcess(ClaimDto dto) {
        ClaimDataCreator claimDataCreator = getCreator(dto);
        Long logKey = null;
        ClaimProcessDto createDataTarget = null;
        ClaimProcessDto updateDataTarget = null;

        try{
            claimDataCreator.getClamNo(dto);
            logKey = insertLog(dto);
            getValidator(dto).validate(dto);
            createDataTarget = claimDataCreator.makeCreateData(dto);
            updateDataTarget = claimDataCreator.makeUpdateData(dto);
            claimDataCreator.saveClaimData(createDataTarget, updateDataTarget);
            verifyAmount();
        }catch (Exception e){
             log.error("AcceptWithdrawalProcess error occur  : {}", e);
        }finally {
            updateLog(logKey,createDataTarget,updateDataTarget);
        }
    }
}
