/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

/**
 * @authur wtj
 * @date 2019/5/14    10:10
 */
public class SSD1_ADVAN_TYPE_DISTRI implements Serializable {
    private String SID;
    private String SRC_SEQ_NUM;
    private String ENTNAME;
    private String qylx_mc;
    private String je;
    private String zb;
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

    public String getQylx_mc() {
        return qylx_mc;
    }

    public void setQylx_mc(String qylx_mc) {
        this.qylx_mc = qylx_mc;
    }

    public String getJe() {
        return je;
    }

    public void setJe(String je) {
        this.je = je;
    }

    public String getZb() {
        return zb;
    }

    public void setZb(String zb) {
        this.zb = zb;
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
        return SID + "|+|" + SRC_SEQ_NUM +"|+|" + ENTNAME +"|+|" + qylx_mc + "|+|"+ je +"|+|"+ zb +  "|+|"+ QUERY_SYS +"|+|"+ OPDATE ;
    }

}
