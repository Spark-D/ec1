package com.plateer.ec1.common.model.promotion;

import com.plateer.ec1.common.model.com.BaseModel;
import lombok.Getter;

@Getter
public class CcCpnBase extends BaseModel {
    private Long prmNo;
    private String cpnKindCd;
    private String degrCcd;
    private String dcSvCcd;
    private String mdaGb;
    private String entChnGb;
    private String dwlPriodCcd;
    private String dwlAvlStrtDd;
    private String dwlAvlEndDd;
    private Integer dwlStdDd;
    private Integer dwlPsbCnt;
    private Integer psnDwlPsbCnt;
    private String dwlAvlPlc;
    private String issWayCcd;
    private String certCd;
    private Double ourChrgRt;
    private Double entrChrgRt;
}
