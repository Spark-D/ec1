package com.plateer.ec1.payment.processor;

import com.plateer.ec1.payment.dto.ApproveResVo;
import com.plateer.ec1.payment.dto.PayInfo;

public interface PayProcess {
    //인증
    void validateAuth(PayInfo payInfo);
    //승인
    ApproveResVo approvePay(PayInfo payInfo);
    //취소
    void cancelPay(PayInfo payInfo);
}
