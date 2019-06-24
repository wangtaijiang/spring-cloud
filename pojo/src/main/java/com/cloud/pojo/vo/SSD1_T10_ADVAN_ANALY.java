/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

/**
 * @authur wtj
 * @date 2019/5/14    11:24
 */
public class SSD1_T10_ADVAN_ANALY implements Serializable {
    private String SID;
    private String SRC_SEQ_NUM;
    private String ENTNAME;
    private String qysl;
    private String averageJe;
    private String syjzd;
    private String syjnxs;
    private String sumJe;
    private String QUERY_SYS;
    private String OPDATE;

    public String getSID() {
        return SID;
    }

    public void setSID(String SID) {
        this.SID = SID;
    }

    public String getSRC_SEQ_NUM() {
        return SRC_SEQ_NUM;
    }

    public void setSRC_SEQ_NUM(String SRC_SEQ_NUM) {
        this.SRC_SEQ_NUM = SRC_SEQ_NUM;
    }

    public String getENTNAME() {
        return ENTNAME;
    }

    public void setENTNAME(String ENTNAME) {
        this.ENTNAME = ENTNAME;
    }

    public String getQysl() {
        return qysl;
    }

    public void setQysl(String qysl) {
        this.qysl = qysl;
    }

    public String getAverageJe() {
        return averageJe;
    }

    public void setAverageJe(String averageJe) {
        this.averageJe = averageJe;
    }

    public String getSyjzd() {
        return syjzd;
    }

    public void setSyjzd(String syjzd) {
        this.syjzd = syjzd;
    }

    public String getSyjnxs() {
        return syjnxs;
    }

    public void setSyjnxs(String syjnxs) {
        this.syjnxs = syjnxs;
    }

    public String getSumJe() {
        return sumJe;
    }

    public void setSumJe(String sumJe) {
        this.sumJe = sumJe;
    }

    public String getQUERY_SYS() {
        return QUERY_SYS;
    }

    public void setQUERY_SYS(String QUERY_SYS) {
        this.QUERY_SYS = QUERY_SYS;
    }

    public String getOPDATE() {
        return OPDATE;
    }

    public void setOPDATE(String OPDATE) {
        this.OPDATE = OPDATE;
    }

    @Override
    public String toString() {
        return SID + "|+|" + SRC_SEQ_NUM + "|+|"+ ENTNAME + "|+|"+ qysl + "|+|"+ averageJe +"|+|"+ syjzd
                +"|+|"+ syjnxs +"|+|"+ sumJe + "|+|"+ QUERY_SYS + "|+|" + OPDATE ;
    }
}
