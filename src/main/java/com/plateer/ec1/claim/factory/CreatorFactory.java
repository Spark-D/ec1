package com.plateer.ec1.claim.factory;

import com.plateer.ec1.claim.creator.ClaimDataCreator;
import com.plateer.ec1.claim.enums.ClaimType;
import com.plateer.ec1.claim.enums.ProcessorType;
import com.plateer.ec1.claim.processor.ClaimProcessor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Component
public class CreatorFactory {
    Map<ClaimType, ClaimDataCreator> creatorMap = new LinkedHashMap<>();
    List<ClaimDataCreator> creators;

    public CreatorFactory(List<ClaimDataCreator> creators) {
        this.creators = creators;
    }

    @PostConstruct
    void init() {
        creators.stream()
                .forEach(c -> creatorMap.put(c.getType(), c));
    }

    public ClaimDataCreator getCreator(ClaimType type){
        if(!creatorMap.containsKey(type)) { throw new IllegalArgumentException(""); }
        return creatorMap.get(type);
    }
}
