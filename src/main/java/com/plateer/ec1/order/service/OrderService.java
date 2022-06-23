package com.plateer.ec1.order.service;

import com.plateer.ec1.claim.util.MonitoringLogHelper;
import com.plateer.ec1.order.context.OrderContext;
import com.plateer.ec1.order.dto.OrderRequest;
import com.plateer.ec1.order.factory.AfterStrategyFactory;
import com.plateer.ec1.order.factory.DataCreatorFactory;
import com.plateer.ec1.order.repository.OrderRepository;
import com.plateer.ec1.order.strategy.AfterStrategy;
import com.plateer.ec1.order.strategy.DataStrategy;
import com.plateer.ec1.payment.service.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderService {
    private final MonitoringLogHelper monitoringLogHelper;
    private final PaymentService paymentService;
    private final OrderRepository orderRepository;
    private final AfterStrategyFactory afterStrategyFactory;
    private final DataCreatorFactory dataCreatorFactory;

    @Transactional
    public void order(OrderRequest orderRequest) {

        OrderContext orderContext = new OrderContext(monitoringLogHelper, paymentService, orderRepository);
        orderContext.execute(getDataStrategy(orderRequest), getAfterStrategy(orderRequest), orderRequest);
    }

    private AfterStrategy getAfterStrategy(OrderRequest orderRequest) {
        return afterStrategyFactory.getAfterStrategy(orderRequest.getSystemCode());
    }

    private DataStrategy getDataStrategy(OrderRequest orderRequest) {
        return dataCreatorFactory.getDataStrategy(orderRequest.getOrderType());
    }
}
