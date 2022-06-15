package com.plateer.ec1.claim.creators;

import com.plateer.ec1.claim.vo.ClaimModel;
import org.springframework.stereotype.Component;

@Component
abstract public class ClaimDataCreator {
    public ClaimModel getInsertClaimData(){
        return new ClaimModel();
    }
}
