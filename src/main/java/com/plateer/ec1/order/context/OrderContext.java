package com.plateer.ec1.order.context;

import com.plateer.ec1.claim.util.MonitoringLogHelper;
import com.plateer.ec1.order.dto.OrderDto;
import com.plateer.ec1.order.dto.OrderRequest;
import com.plateer.ec1.order.dto.OrderValidationDto;
import com.plateer.ec1.order.enums.OrderValidator;
import com.plateer.ec1.order.repository.OrderRepository;
import com.plateer.ec1.order.strategy.AfterStrategy;
import com.plateer.ec1.order.strategy.DataStrategy;
import com.plateer.ec1.payment.dto.OrderInfo;
import com.plateer.ec1.payment.dto.PaymentRequest;
import com.plateer.ec1.payment.service.PaymentService;

import java.util.Arrays;

public class OrderContext {
    private MonitoringLogHelper monitoringLogHelper;
    private PaymentService paymentService;
    private OrderRepository orderRepository;

    public OrderContext(MonitoringLogHelper monitoringLogHelper, PaymentService paymentService, OrderRepository orderRepository) {
        this.monitoringLogHelper = monitoringLogHelper;
        this.paymentService = paymentService;
        this.orderRepository = orderRepository;
    }


    public void execute(DataStrategy dataStrategy, AfterStrategy afterStrategy, OrderRequest request) {
        Long logKey = monitoringLogHelper.insertLog(request);
        OrderDto orderDto = null;
        try {

            OrderValidator.get(request).test(new OrderValidationDto(request, Arrays.asList()));
            orderDto = dataStrategy.create(request);
            orderRepository.insertOrderData(orderDto);
            paymentService.approve(new PaymentRequest());
            amountVerify(request.getOrderNo());
            afterStrategy.call();

        } catch (Exception e) {

        } finally {
            monitoringLogHelper.updateLog(logKey, orderDto);
        }
    }

    private void amountVerify(String orderNo) {
        System.out.println("주문생성 금액검증" + orderNo);
    }


}
