package com.plateer.ec1.claim.processors;

import com.plateer.ec1.claim.dto.ClaimDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Slf4j
public class CompleteProcessor implements ClaimProcessor {

    public static CompleteProcessor completeProcessor;

    @PostConstruct
    public void initialize() {
        completeProcessor = this;
    }

    public static CompleteProcessor getInstance() {
        return completeProcessor;
    }

    @Override
    public void doProcess(ClaimDto claimDto) {
        System.out.println("complete process");
        try {
            //1. 클레임번호 채번
            //2. 로그 insert
            //3. validate
            //4. data create
            //5. manipulate
            //-----6. IF Call
            //7. verify
        } catch (Exception e) {
            log.error( "CompleteProcessor error occur :: " + e.getMessage());
        } finally {
            //8. log update
        }
    }
}
