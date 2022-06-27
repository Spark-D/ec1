package com.plateer.ec1.claim.factory;

import com.plateer.ec1.claim.enums.ValidatorType;
import com.plateer.ec1.claim.validator.ClaimValidator;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Component
public class ValidatorFactory {
    private Map<ValidatorType, ClaimValidator> validatorMap = new LinkedHashMap<>();

    public ValidatorFactory(List<ClaimValidator> validators) {
        validators.stream()
                .forEach(v -> validatorMap.put(v.getType(), v));
    }

    public ClaimValidator getValidator(ValidatorType type) {
        if(!validatorMap.containsKey(type)) throw new IllegalArgumentException("");
        return validatorMap.get(type);
    }
}
