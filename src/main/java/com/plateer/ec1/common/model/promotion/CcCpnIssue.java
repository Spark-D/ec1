package com.plateer.ec1.common.model.promotion;

import com.plateer.ec1.common.model.com.BaseModel;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CcCpnIssue extends BaseModel {
    private Long cpnIssNo;
    private String mbrNo;
    private LocalDateTime cpnUseDt;
    private Long orgCpnIssNo;
    private String cpnCertNo;
    private String ordNo;
    private Long prmNo;
}
