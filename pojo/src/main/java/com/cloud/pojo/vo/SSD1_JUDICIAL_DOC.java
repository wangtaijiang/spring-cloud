/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

/**
 * @authur wtj
 * @date 2019/5/14    12:26
 */
public class SSD1_JUDICIAL_DOC implements Serializable {
    private String SID;
    private String SRC_SEQ_NUM;
    private String  ENTNAME;
    private String TITLE;
    private String BODY;
    private String COURT;
    private String SORTTIME;
    private String  CASENO;
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

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    public String getBODY() {
        return BODY;
    }

    public void setBODY(String BODY) {
        this.BODY = BODY;
    }

    public String getCOURT() {
        return COURT;
    }

    public void setCOURT(String COURT) {
        this.COURT = COURT;
    }

    public String getSORTTIME() {
        return SORTTIME;
    }

    public void setSORTTIME(String SORTTIME) {
        this.SORTTIME = SORTTIME;
    }

    public String getCASENO() {
        return CASENO;
    }

    public void setCASENO(String CASENO) {
        this.CASENO = CASENO;
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
        return SID + "|+|"+ SRC_SEQ_NUM +"|+|" + ENTNAME +"|+|" + TITLE + "|+|" + BODY + "|+|"+ COURT +"|+|"+ SORTTIME +"|+|" + CASENO + "|+|" + QUERY_SYS + "|+|" + OPDATE ;
    }
}
