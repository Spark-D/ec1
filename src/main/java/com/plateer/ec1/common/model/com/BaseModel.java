package com.plateer.ec1.common.model.com;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class BaseModel {
    private LocalDateTime sysRegDtime;
    private LocalDateTime sysModDtime;
    private String sysRegrId;
    private String sysModrId;
}
