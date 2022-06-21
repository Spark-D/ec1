package com.plateer.ec1.claim.factory;

import com.plateer.ec1.claim.enums.ClaimType;
import com.plateer.ec1.claim.enums.ProcessorType;
import com.plateer.ec1.claim.enums.ValidatorType;
import com.plateer.ec1.claim.validator.ClaimValidator;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.List;

@Component
public class ValidatorFactory {
    private Map<ValidatorType, ClaimValidator> validatorMap = new LinkedHashMap<>();
    private List<ClaimValidator> validators;

    public ValidatorFactory(List<ClaimValidator> validators) {
        this.validators = validators;
    }

    @PostConstruct
    void init() {
        validators.stream()
                .forEach(v -> validatorMap.put(v.getType(), v));
    }

    public ClaimValidator getValidator(ValidatorType type) {
        if(!validatorMap.containsKey(type)) throw new IllegalArgumentException("");
        return validatorMap.get(type);
    }
}