/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

/**
 * @authur wtj
 * @date 2019/5/14    10:22
 */
public class SSD1_T10_NPUR_TAXIDENNUM_CUST implements Serializable {
    private String SID;
    private String SRC_SEQ_NUM;
    private String ENTNAME;
    private String FYBNSRKH;
    private String JEBL;
    private String FPFS;
    private String JYJE;
    private String ZHJYRQ;
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

    public String getFYBNSRKH() {
        return FYBNSRKH;
    }

    public void setFYBNSRKH(String FYBNSRKH) {
        this.FYBNSRKH = FYBNSRKH;
    }

    public String getJEBL() {
        return JEBL;
    }

    public void setJEBL(String JEBL) {
        this.JEBL = JEBL;
    }

    public String getFPFS() {
        return FPFS;
    }

    public void setFPFS(String FPFS) {
        this.FPFS = FPFS;
    }

    public String getJYJE() {
        return JYJE;
    }

    public void setJYJE(String JYJE) {
        this.JYJE = JYJE;
    }

    public String getZHJYRQ() {
        return ZHJYRQ;
    }

    public void setZHJYRQ(String ZHJYRQ) {
        this.ZHJYRQ = ZHJYRQ;
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
        return SID + "|+|"+ SRC_SEQ_NUM +"|+|"+ ENTNAME +"|+|"+ FYBNSRKH +"|+|"+ JEBL +"|+|"+ FPFS +"|+|"+ JYJE +"|+|" + ZHJYRQ +"|+|"+ QUERY_SYS +"|+|" + OPDATE;
    }
}
