/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

/**
 * @authur wtj
 * @date 2019/5/14    9:40
 */
public class SSD1_LAWINFO implements Serializable {
    private  String SID;
    private  String SRC_SEQ_NUM;
    private  String ENTNAME;
    private  String SERILLREA;
    private  String ABNTIME;
    private  String DECORG;
    private  String REMEXCPRES;
    private  String REMDATE;
    private  String QUERY_SYS;
    private  String OPDATE;

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

    public String getSERILLREA() {
        return SERILLREA;
    }

    public void setSERILLREA(String SERILLREA) {
        this.SERILLREA = SERILLREA;
    }

    public String getABNTIME() {
        return ABNTIME;
    }

    public void setABNTIME(String ABNTIME) {
        this.ABNTIME = ABNTIME;
    }

    public String getDECORG() {
        return DECORG;
    }

    public void setDECORG(String DECORG) {
        this.DECORG = DECORG;
    }

    public String getREMEXCPRES() {
        return REMEXCPRES;
    }

    public void setREMEXCPRES(String REMEXCPRES) {
        this.REMEXCPRES = REMEXCPRES;
    }

    public String getREMDATE() {
        return REMDATE;
    }

    public void setREMDATE(String REMDATE) {
        this.REMDATE = REMDATE;
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
        return SID + "|+|" + SRC_SEQ_NUM + "|+|" + ENTNAME + "|+|" + SERILLREA +"|+|" + ABNTIME + "|+|"  + DECORG +"|+|"  + REMEXCPRES + "|+|" + REMDATE + "|+|" + QUERY_SYS +"|+|" + OPDATE;
    }
}
