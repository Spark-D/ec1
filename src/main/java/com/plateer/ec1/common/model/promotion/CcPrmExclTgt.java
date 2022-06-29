package com.plateer.ec1.common.model.promotion;

import com.plateer.ec1.common.model.com.BaseModel;
import lombok.Getter;

@Getter
public class CcPrmExclTgt extends BaseModel {
    private Long exclTgtSeq;
    private String exclTgtCcd;
    private String exclTgtNo;
    private String useYn;
    private Long prmNo;
}
