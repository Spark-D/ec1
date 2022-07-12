package com.plateer.ec1.payment.processor;

import com.plateer.ec1.payment.dto.OrderInfo;
import com.plateer.ec1.payment.dto.PayApproveResponse;
import com.plateer.ec1.payment.dto.PayInfo;
import com.plateer.ec1.payment.enums.PaymentType;

abstract public class PaymentProcessor {

    public abstract PaymentType getType();

    public PayApproveResponse approveProcess(OrderInfo orderInfo, PayInfo payInfo) {

        //인증값 확인
        validation();
        //승인요청
        approve();
        //주문결제 테이블 저장
        savePayData();

        return new PayApproveResponse();
    }

    protected abstract void validation();

    protected abstract void approve();

    protected abstract void savePayData();


}
