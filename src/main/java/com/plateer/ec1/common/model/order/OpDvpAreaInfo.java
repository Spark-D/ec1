package com.plateer.ec1.common.model.order;

import com.plateer.ec1.common.model.com.BaseModel;
import lombok.Getter;

@Getter
public class OpDvpAreaInfo extends BaseModel {
    private String ordNo;
    private Integer dvpSeq;
    private String rmtiNm;
    private String rmtiHpNo;
    private String rmtiAddr;
    private String rmtiAddrDtl;
}
