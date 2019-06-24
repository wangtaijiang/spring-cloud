/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

/**
 * @authur wtj
 * @date 2019/5/14    10:00
 */
public class SSD1_JUDICIAL_INFO implements Serializable {
    private  String SID;
    private  String SRC_SEQ_NUM;
    private  String ENTNAME;
    private  String totalCount;
    private  String ajlcCount;
    private  String zxggCount;
    private  String  wdhmdCount;
    private  String  fyggCount;
    private  String cpwsCount;
    private  String ktggCount;
    private  String sxggCount;
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

    public String getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }

    public String getAjlcCount() {
        return ajlcCount;
    }

    public void setAjlcCount(String ajlcCount) {
        this.ajlcCount = ajlcCount;
    }

    public String getZxggCount() {
        return zxggCount;
    }

    public void setZxggCount(String zxggCount) {
        this.zxggCount = zxggCount;
    }

    public String getWdhmdCount() {
        return wdhmdCount;
    }

    public void setWdhmdCount(String wdhmdCount) {
        this.wdhmdCount = wdhmdCount;
    }

    public String getFyggCount() {
        return fyggCount;
    }

    public void setFyggCount(String fyggCount) {
        this.fyggCount = fyggCount;
    }

    public String getCpwsCount() {
        return cpwsCount;
    }

    public void setCpwsCount(String cpwsCount) {
        this.cpwsCount = cpwsCount;
    }

    public String getKtggCount() {
        return ktggCount;
    }

    public void setKtggCount(String ktggCount) {
        this.ktggCount = ktggCount;
    }

    public String getSxggCount() {
        return sxggCount;
    }

    public void setSxggCount(String sxggCount) {
        this.sxggCount = sxggCount;
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
        return SID + "|+|"+ SRC_SEQ_NUM +"|+|"+ ENTNAME +"|+|"+ totalCount + "|+|"+ ajlcCount + "|+|"+ zxggCount + "|+|" + wdhmdCount + "|+|" + fyggCount +"|+|" + cpwsCount + "|+|" + ktggCount +"|+|"  + sxggCount + "|+|" + QUERY_SYS + "|+|" + OPDATE ;
    }
}
