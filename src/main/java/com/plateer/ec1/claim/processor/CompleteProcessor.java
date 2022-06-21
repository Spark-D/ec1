package com.plateer.ec1.claim.processor;

import com.plateer.ec1.claim.creator.ClaimDataCreator;
import com.plateer.ec1.claim.dto.ClaimDto;
import com.plateer.ec1.claim.dto.ClaimProcessDto;
import com.plateer.ec1.claim.enums.ProcessorType;
import com.plateer.ec1.claim.external.IFCallHelper;
import com.plateer.ec1.claim.factory.CreatorFactory;
import com.plateer.ec1.claim.factory.ValidatorFactory;
import com.plateer.ec1.claim.util.MonitoringLogHelper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Slf4j
public class CompleteProcessor extends ClaimProcessor {

    public CompleteProcessor(MonitoringLogHelper monitoringLogHelper, CreatorFactory creatorFactory, ValidatorFactory validatorFactory, IFCallHelper ifCallHelper) {
        super(monitoringLogHelper, creatorFactory, validatorFactory);
        this.ifCallHelper = ifCallHelper;
    }

    @Override
    public ProcessorType getType() {
        return ProcessorType.COMPLETE;
    }

    private final IFCallHelper ifCallHelper;


    @Override
    @Transactional
    public void doProcess(ClaimDto dto) {
        ClaimDataCreator claimDataCreator = getCreator(dto);
        Long logKey = null;
        ClaimProcessDto createDataTarget = null;
        ClaimProcessDto updateDataTarget = null;

        try{
            claimDataCreator.getClamNo(dto);
            logKey = insertLog(dto);
            getValidator(dto).validate(dto);
            updateDataTarget = claimDataCreator.makeUpdateData(dto);
            claimDataCreator.saveClaimData(null, updateDataTarget);
            ifCallHelper.callPaymentIF();
            verifyAmount();
        }catch (Exception e){
            log.error("AcceptWithdrawalProcess error occur  : {}", e);
        }finally {
            updateLog(logKey,createDataTarget,updateDataTarget);
        }
    }
}
