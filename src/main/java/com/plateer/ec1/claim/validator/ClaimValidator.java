package com.plateer.ec1.claim.validator;

import com.plateer.ec1.claim.dto.ClaimDto;
import com.plateer.ec1.claim.enums.ValidatorType;

abstract public class ClaimValidator {

    public abstract ValidatorType getType();

    public void validate(ClaimDto dto) throws Exception {
        System.out.println("common validate");
    };
}
