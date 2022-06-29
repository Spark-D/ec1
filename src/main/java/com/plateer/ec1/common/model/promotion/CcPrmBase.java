package com.plateer.ec1.common.model.promotion;

import com.plateer.ec1.common.model.com.BaseModel;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CcPrmBase extends BaseModel {
    private Long prmNo;
    private String prmNm;
    private String prmKindCd;
    private String prmPriodCcd;
    private LocalDateTime prmStrtDt;
    private LocalDateTime prmEndDt;
    private Integer prmStdDd;
    private String empYn;
    private String dcCcd;
    private Integer dcVal;
    private Integer minPurAmt;
    private Integer maxDcAmt;
    private String useYn;
    private String rmk;
}
