package com.plateer.ec1.common.model.order;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OpClmInfo {
    private String ordNo;
    private String ordGoodsNo;
    private String ordItemNo;
    private Integer ordSeq;
    private Integer procSeq;
    private String ordClmTpCd;
    private String ordPrgsScd;
    private String dvRvtCcd;
    private Long ordAmt;
    private Integer ordCnt;
    private Integer cnclCnt;
    private Integer rtgsCnt;
    private Integer dvGrpNo;
    private LocalDateTime ordClmReqDtime;
    private LocalDateTime ordClmAcptDtime;
    private LocalDateTime ordClmCmtDtime;
    private String clmRsnCd;
    private String clmDtlRsnTt;
    private String clmNo;
    private Integer orgProcSeq;
}
