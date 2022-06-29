package com.plateer.ec1.common.model.order;

import com.plateer.ec1.common.model.com.BaseModel;
import lombok.Getter;

@Getter
public class OpOrdBnfRelInfo extends BaseModel {
    private String ordNo;
    private Integer ordSeq;
    private Integer procSeq;
    private String ordBnfNo;
    private String aplyCnclCcd;
    private Long aplyAmt;
    private String clmNo;
}
