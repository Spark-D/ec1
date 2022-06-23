package com.plateer.ec1.order.strategy;

public interface AfterStrategy {
    String getSystemCode();
    /**
     * 기본결제수단등록, 앱푸시, 알림톡, VOC 등록 등.
     * */
    void call();
}
