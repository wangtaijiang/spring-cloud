/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

/**
 * @authur wtj
 * @date 2019/5/14    11:01
 */
public class SSD1_SALEPROD_LIST implements Serializable {
    private String SID;
    private String SRC_SEQ_NUM;
    private String ENTNAME;
    private String mc;
    private String xh;
    private String dw;
    private String je;
    private String cs;
    private String ZB;
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

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc;
    }

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    public String getDw() {
        return dw;
    }

    public void setDw(String dw) {
        this.dw = dw;
    }

    public String getJe() {
        return je;
    }

    public void setJe(String je) {
        this.je = je;
    }

    public String getCs() {
        return cs;
    }

    public void setCs(String cs) {
        this.cs = cs;
    }

    public String getZB() {
        return ZB;
    }

    public void setZB(String ZB) {
        this.ZB = ZB;
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
        return SID + "|+|"+ SRC_SEQ_NUM +"|+|"+ ENTNAME +"|+|" + mc +"|+|"+ xh + "|+|" + dw +"|+|" + je +"|+|"+ cs +"|+|" + ZB + "|+|"+ QUERY_SYS +"|+|" + OPDATE ;
    }
}
