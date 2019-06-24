/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

/**
 * @authur wtj
 * @date 2019/5/14    10:33
 */
public class SSD1_STOCK_FREEZE_INFO implements Serializable {
    private String SID;
    private String SRC_SEQ_NUM;
    private String ENTNAME;
    private String BEEXECUTED;
    private String EXECUTEDAM;
    private String COURTDEPT;
    private String REFERENCENUM;
    private String PUBDATE;
    private String FREEZEFROM;
    private String FREEZETO;
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

    public String getBEEXECUTED() {
        return BEEXECUTED;
    }

    public void setBEEXECUTED(String BEEXECUTED) {
        this.BEEXECUTED = BEEXECUTED;
    }

    public String getEXECUTEDAM() {
        return EXECUTEDAM;
    }

    public void setEXECUTEDAM(String EXECUTEDAM) {
        this.EXECUTEDAM = EXECUTEDAM;
    }

    public String getCOURTDEPT() {
        return COURTDEPT;
    }

    public void setCOURTDEPT(String COURTDEPT) {
        this.COURTDEPT = COURTDEPT;
    }

    public String getREFERENCENUM() {
        return REFERENCENUM;
    }

    public void setREFERENCENUM(String REFERENCENUM) {
        this.REFERENCENUM = REFERENCENUM;
    }

    public String getPUBDATE() {
        return PUBDATE;
    }

    public void setPUBDATE(String PUBDATE) {
        this.PUBDATE = PUBDATE;
    }

    public String getFREEZEFROM() {
        return FREEZEFROM;
    }

    public void setFREEZEFROM(String FREEZEFROM) {
        this.FREEZEFROM = FREEZEFROM;
    }

    public String getFREEZETO() {
        return FREEZETO;
    }

    public void setFREEZETO(String FREEZETO) {
        this.FREEZETO = FREEZETO;
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
        return SID +"|+|" + SRC_SEQ_NUM +"|+|"+ ENTNAME +"|+|"+ BEEXECUTED +"|+|"+ EXECUTEDAM + "|+|"+ COURTDEPT +"|+|" + REFERENCENUM +"|+|" + PUBDATE +"|+|"+ FREEZEFROM
            +"|+|"+ FREEZETO + "|+|"+ QUERY_SYS +"|+|"+ OPDATE ;
    }
}
