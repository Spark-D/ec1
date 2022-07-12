package com.plateer.ec1.payment.service;

import com.plateer.ec1.payment.dto.CancelRequest;
import com.plateer.ec1.payment.dto.NetCancelRequest;
import com.plateer.ec1.payment.dto.PayApproveResponse;
import com.plateer.ec1.payment.dto.PaymentRequest;
import com.plateer.ec1.payment.factory.PaymentProcessorFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PaymentService {
    private final PaymentProcessorFactory factory;

    public List<PayApproveResponse> approve(PaymentRequest paymentRequest){
        List<PayApproveResponse> responseList = new ArrayList<>();
        paymentRequest.getPayInfoList().stream()
                .forEach(pay -> {
                    PayApproveResponse response = factory.getPaymentProcessor(pay.getPaymentType())
                            .approveProcess(paymentRequest.getOrderInfo(), pay);
                    responseList.add(response);
        });
        return responseList;
    }

    public void cancel(CancelRequest cancelRequest){

    }

    public void netCancel(NetCancelRequest netCancelRequest) {

    }
}
