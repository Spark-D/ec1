package com.plateer.ec1.claim.dto;

import lombok.Data;

@Data
public class ClamItem {

    private Integer ordSeq;
    private Integer procSeq;
    private String ordGoodsNo;
    private String ordItemNo;
    private Integer ordCnt;
    private Integer cnclCnt;
    private Integer rtgsCnt;
}
