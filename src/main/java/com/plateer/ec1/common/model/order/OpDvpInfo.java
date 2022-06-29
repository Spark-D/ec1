package com.plateer.ec1.common.model.order;

import com.plateer.ec1.common.model.com.BaseModel;
import lombok.Getter;

@Getter
public class OpDvpInfo extends BaseModel {
    private Integer dvGrpNo;
    private String ordNo;
    private Integer dvpSeq;
    private String dvMthdCd;
}
