package com.plateer.ec1.common.model.order;

import com.plateer.ec1.common.model.com.BaseModel;
import lombok.Getter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Getter
public class OpOrdBase extends BaseModel {
    private String ordNo;
    private String mbrNo;
    private String ordTpCd;
    private String ordSysCcd;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime ordReqDtime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime ordCmtDtime;

    private String ordNm;
    private String ordSellNo;
    private String ordAddr;
    private String ordAddrDtl;
    private String rfndBnkCk;
    private String rfndAcctNo;
    private String rfndAcctOwnNm;
}
