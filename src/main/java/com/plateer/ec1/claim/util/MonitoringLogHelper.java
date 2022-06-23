package com.plateer.ec1.claim.util;

import com.plateer.ec1.claim.dto.ClaimDto;
import com.plateer.ec1.claim.dto.ClaimProcessDto;
import com.plateer.ec1.order.dto.OrderDto;
import com.plateer.ec1.order.dto.OrderRequest;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class MonitoringLogHelper {

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Long insertLog(ClaimDto dto) {
        System.out.println("로그 인서트");
        return 0L;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void updateLog(Long logkey, ClaimProcessDto regData, ClaimProcessDto modData) {
        System.out.println("로그 업데이트");
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Long insertLog(OrderRequest request) {
        System.out.println("주문 로그 인서트 " + request.toString() );
        return 0L;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void updateLog(Long logKey, OrderDto orderDto) {
        System.out.println("주문 로그 업데이트 "+ logKey);
    }
}
