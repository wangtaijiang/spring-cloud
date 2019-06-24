/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

/**
 * @authur wtj
 * @date 2019/5/14    10:37
 */
public class SSD1_GAS_CHARGE implements Serializable {
    private String SID;
    private String SRC_SEQ_NUM;
    private String ENTNAME;
    private String KPRQ;
    private String JSE;
    private String XFMC;
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

    public String getKPRQ() {
        return KPRQ;
    }

    public void setKPRQ(String KPRQ) {
        this.KPRQ = KPRQ;
    }

    public String getJSE() {
        return JSE;
    }

    public void setJSE(String JSE) {
        this.JSE = JSE;
    }

    public String getXFMC() {
        return XFMC;
    }

    public void setXFMC(String XFMC) {
        this.XFMC = XFMC;
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
        return SID + "|+|" + SRC_SEQ_NUM + "|+|"+ ENTNAME +"|+|"+ KPRQ +"|+|" + JSE + "|+|"+ XFMC
                + "|+|"+ QUERY_SYS +"|+|"+ OPDATE ;
    }
}
