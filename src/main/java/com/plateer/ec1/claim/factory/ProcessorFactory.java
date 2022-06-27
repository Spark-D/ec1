package com.plateer.ec1.claim.factory;

import com.plateer.ec1.claim.dto.ClaimDto;
import com.plateer.ec1.claim.enums.ClaimType;
import com.plateer.ec1.claim.enums.ProcessorType;
import com.plateer.ec1.claim.processor.ClaimProcessor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.List;

@Component
public class ProcessorFactory {

    Map<ProcessorType, ClaimProcessor> processorMap = new LinkedHashMap<>();

    public ProcessorFactory(List<ClaimProcessor> processors) {
        processors.stream()
                .forEach(p -> processorMap.put(p.getType(),  p));
    }

    // 상품유형, 클레임유형에따라 달라짐.
    public ClaimProcessor getProcessor(ClaimDto dto) {
        ProcessorType processorType = ClaimType.findClaimTypeByDto(dto.getClaimCode(), dto.getProductType()).getProcessorType();
        if(!processorMap.containsKey(processorType)) {
            throw new IllegalArgumentException("");
        }
        return processorMap.get(processorType);
    }
}
