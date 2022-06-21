package com.plateer.ec1.claim.validator;

import com.plateer.ec1.claim.enums.ValidatorType;
import org.springframework.stereotype.Component;

@Component
public class WithdrawalValidator extends ClaimValidator {

    @Override
    public ValidatorType getType() {
        return ValidatorType.WITHDRAWAL;
    }
}
