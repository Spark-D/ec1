package com.plateer.ec1.claim.processors;

import com.plateer.ec1.claim.dto.ClaimDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Slf4j
public class AcceptWithdrawalProcessor implements ClaimProcessor {

    private static AcceptWithdrawalProcessor acceptWithdrawalProcessor;

    @PostConstruct
    private void initialize() {
        acceptWithdrawalProcessor = this;
    }

    public static AcceptWithdrawalProcessor getInstance() {
        return acceptWithdrawalProcessor;
    }

    @Override
    public void doProcess(ClaimDto claimDto) {
        try {
            System.out.println("accept-withdrawal process");
            //1. 클레임번호 채번
            //2. 로그 insert
            //3. validate
            //4. data create
            //5. manipulate
            //-----6. IF Call
            //7. verify
        } catch (Exception e) {
            log.error( "Accept withdrawal Processor error occur :: " + e.getMessage());
        } finally {
            //8. log update
        }
    }
}
