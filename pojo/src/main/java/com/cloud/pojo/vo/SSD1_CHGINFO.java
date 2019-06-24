/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

/**
 * @authur wtj
 * @date 2019/5/14    12:30
 */
public class SSD1_CHGINFO implements Serializable {
    private String SID;
    private String SRC_SEQ_NUM;
    private String ENTNAME;
    private String ALTITEM;
    private String ALTBE;
    private String ALTAF;
    private String ALTDATE;
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

    public String getALTITEM() {
        return ALTITEM;
    }

    public void setALTITEM(String ALTITEM) {
        this.ALTITEM = ALTITEM;
    }

    public String getALTBE() {
        return ALTBE;
    }

    public void setALTBE(String ALTBE) {
        this.ALTBE = ALTBE;
    }

    public String getALTAF() {
        return ALTAF;
    }

    public void setALTAF(String ALTAF) {
        this.ALTAF = ALTAF;
    }

    public String getALTDATE() {
        return ALTDATE;
    }

    public void setALTDATE(String ALTDATE) {
        this.ALTDATE = ALTDATE;
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
        return SID +"|+|" + SRC_SEQ_NUM +"|+|"+ ENTNAME + "|+|" + ALTITEM + "|+|" + ALTBE +"|+|" + ALTAF + "|+|"+ ALTDATE +  "|+|"+ QUERY_SYS + "|+|" + OPDATE ;
    }
}
