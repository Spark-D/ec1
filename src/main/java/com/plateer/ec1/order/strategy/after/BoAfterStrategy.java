package com.plateer.ec1.order.strategy.after;

import com.plateer.ec1.order.enums.SystemCode;
import com.plateer.ec1.order.strategy.AfterStrategy;
import org.springframework.stereotype.Component;

@Component
public class BoAfterStrategy implements AfterStrategy {

    @Override
    public String getSystemCode() {
        return SystemCode.BO.name();
    }

    @Override
    public void call() {
        System.out.println("BO 주문 후처리");
    }
}
