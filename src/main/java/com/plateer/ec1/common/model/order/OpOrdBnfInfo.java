package com.plateer.ec1.common.model.order;

import com.plateer.ec1.common.model.com.BaseModel;
import lombok.Getter;

@Getter
public class OpOrdBnfInfo extends BaseModel {
    private String ordBnfNo;
    private Integer ordBnfAmt;
    private Long prmNo;
    private Long cpnIssNo;
    private Integer ordCnclBnfAmt;
    private Integer degrCcd;
    private String cpnKndCd;
}
