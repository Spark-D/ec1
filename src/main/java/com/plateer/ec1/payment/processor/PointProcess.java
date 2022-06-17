package com.plateer.ec1.payment.processor;

import com.plateer.ec1.payment.dto.ApproveResVo;
import com.plateer.ec1.payment.dto.PayInfo;

public class PointProcess implements PayProcess{
    @Override
    public void validateAuth(PayInfo payInfo) {

    }

    @Override
    public ApproveResVo approvePay(PayInfo payInfo) {
        System.out.println("point");
        return null;
    }

    @Override
    public void cancelPay(PayInfo payInfo) {

    }
}
