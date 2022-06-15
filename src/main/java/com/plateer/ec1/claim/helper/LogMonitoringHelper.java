package com.plateer.ec1.claim.helper;

import org.springframework.stereotype.Component;

@Component
public class LogMonitoringHelper {

    public Long insertMonitoring() {
        System.out.println("insert monitoring");
        return 1L;
    }

    public void updateMonitoring() {
        System.out.println("update monitoring");
    }


}
