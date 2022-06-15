package com.plateer.ec1.claim.processors;

import com.plateer.ec1.claim.dto.ClaimDto;

public interface ClaimProcessor {
    void doProcess(ClaimDto claimDto);
}
