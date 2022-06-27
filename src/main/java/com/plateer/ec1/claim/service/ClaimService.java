package com.plateer.ec1.claim.service;

import com.plateer.ec1.claim.dao.ClaimDao;
import com.plateer.ec1.claim.dto.ClaimDto;
import com.plateer.ec1.claim.enums.ClaimType;
import com.plateer.ec1.claim.factory.ProcessorFactory;
import com.plateer.ec1.claim.processor.ClaimProcessor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClaimService {

    private final ProcessorFactory factory;
    private final ClaimDao dao;

    public void claim(ClaimDto claimDto){
        ClaimProcessor claimProcessor = factory.getProcessor(claimDto);
        claimProcessor.doProcess(claimDto);
    }

    public void dbTest() {
        dao.selectTest();
    }
}
