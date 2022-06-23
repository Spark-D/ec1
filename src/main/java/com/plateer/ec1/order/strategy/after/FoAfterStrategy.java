package com.plateer.ec1.order.strategy.after;

import com.plateer.ec1.order.enums.SystemCode;
import com.plateer.ec1.order.strategy.AfterStrategy;
import org.springframework.stereotype.Component;

@Component
public class FoAfterStrategy implements AfterStrategy {
    @Override
    public String getSystemCode() {
        return SystemCode.FO.name();
    }

    @Override
    public void call() {
        System.out.println("FO 주문 후처리");
    }
}
