package com.plateer.ec1.payment.processor;

import com.plateer.ec1.payment.dto.ApproveResVo;
import com.plateer.ec1.payment.dto.PayInfo;

public class InicisProcess implements PayProcess{
    @Override
    public void validateAuth(PayInfo payInfo) {

    }

    @Override
    public ApproveResVo approvePay(PayInfo payInfo) {
        return null;
    }


    @Override
    public void cancelPay(PayInfo payInfo) {

    }
}
