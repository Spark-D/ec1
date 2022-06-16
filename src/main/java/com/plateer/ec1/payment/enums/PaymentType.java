package com.plateer.ec1.payment.enums;

import com.plateer.ec1.payment.processor.InicisProcess;
import com.plateer.ec1.payment.processor.PayProcess;
import com.plateer.ec1.payment.processor.PointProcess;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.function.Supplier;

@RequiredArgsConstructor
@Getter
public enum PaymentType {
    POINT(PointProcess::new),
    INICIS(InicisProcess::new);

    private final Supplier<PayProcess> processor;

}
