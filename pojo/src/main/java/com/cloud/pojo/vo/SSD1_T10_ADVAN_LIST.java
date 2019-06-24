/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @authur wtj
 * @date 2019/5/14    11:15
 */
public class SSD1_T10_ADVAN_LIST implements Serializable {
    private String SID;
    private String SRC_SEQ_NUM;
    private String ENTNAME;
    private String cjqj;
    private String QUERY_SYS;
    private String OPDATE;
    private List<SSD1_T10_ADVAN_INFO> sysdqy;
    private SSD1_T10_ADVAN_ANALY syqytj;

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

    public String getCjqj() {
        return cjqj;
    }

    public void setCjqj(String cjqj) {
        this.cjqj = cjqj;
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

    public List<SSD1_T10_ADVAN_INFO> getSysdqy() {
        return sysdqy;
    }

    public void setSysdqy(List<SSD1_T10_ADVAN_INFO> sysdqy) {
        this.sysdqy = sysdqy;
    }

    public SSD1_T10_ADVAN_ANALY getSyqytj() {
        return syqytj;
    }

    public void setSyqytj(SSD1_T10_ADVAN_ANALY syqytj) {
        this.syqytj = syqytj;
    }

    @Override
    public String toString() {
        return SID + "|+|" + SRC_SEQ_NUM + "|+|"+ ENTNAME +"|+|" + cjqj + "|+|" + QUERY_SYS +"|+|" + OPDATE;
    }
}
