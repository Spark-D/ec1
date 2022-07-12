package com.plateer.ec1.payment;

import com.plateer.ec1.payment.dto.OrderInfo;
import com.plateer.ec1.payment.dto.PayInfo;
import com.plateer.ec1.payment.dto.PaymentRequest;
import com.plateer.ec1.payment.enums.PaymentType;
import com.plateer.ec1.payment.service.PaymentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class PaymentTest {
    @Autowired
    PaymentService service;

    @Test
    public void approveTest() {

        OrderInfo orderInfo = new OrderInfo();
        List<PayInfo> payInfoList = new ArrayList<>(Arrays.asList(new PayInfo(PaymentType.INICIS)));
        PaymentRequest paymentRequest = new PaymentRequest();
        paymentRequest.setPayInfoList(payInfoList);
        paymentRequest.setOrderInfo(orderInfo);

        service.approve(paymentRequest);
    }
}
