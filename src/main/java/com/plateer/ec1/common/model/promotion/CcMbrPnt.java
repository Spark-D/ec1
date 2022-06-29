package com.plateer.ec1.common.model.promotion;

import com.plateer.ec1.common.model.com.BaseModel;
import lombok.Getter;

@Getter
public class CcMbrPnt extends BaseModel {
    private Long aplyTgtSeq;
    private String aplyTgtCcd;
    private String aplyTgtNo;
    private String useYn;
    private Long prmNo;
}
