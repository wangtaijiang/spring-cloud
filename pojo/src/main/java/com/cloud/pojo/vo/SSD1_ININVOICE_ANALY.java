/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

/**
 * @authur wtj
 * @date 2019/5/14    12:35
 */
public class SSD1_ININVOICE_ANALY implements Serializable {
    private String SID;
    private String  SRC_SEQ_NUM;
    private String  ENTNAME;
    private String  JXFPS;
    private String JXJE;
    private String  GFKPYF;
    private String YXPPFPS;
    private String YXPPJE;
    private String YXZPFPS;
    private String YXZPJE;
    private String QUERY_SYS;
    private String  OPDATE;

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

    public String getJXFPS() {
        return JXFPS;
    }

    public void setJXFPS(String JXFPS) {
        this.JXFPS = JXFPS;
    }

    public String getJXJE() {
        return JXJE;
    }

    public void setJXJE(String JXJE) {
        this.JXJE = JXJE;
    }

    public String getGFKPYF() {
        return GFKPYF;
    }

    public void setGFKPYF(String GFKPYF) {
        this.GFKPYF = GFKPYF;
    }

    public String getYXPPFPS() {
        return YXPPFPS;
    }

    public void setYXPPFPS(String YXPPFPS) {
        this.YXPPFPS = YXPPFPS;
    }

    public String getYXPPJE() {
        return YXPPJE;
    }

    public void setYXPPJE(String YXPPJE) {
        this.YXPPJE = YXPPJE;
    }

    public String getYXZPFPS() {
        return YXZPFPS;
    }

    public void setYXZPFPS(String YXZPFPS) {
        this.YXZPFPS = YXZPFPS;
    }

    public String getYXZPJE() {
        return YXZPJE;
    }

    public void setYXZPJE(String YXZPJE) {
        this.YXZPJE = YXZPJE;
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
        return SID +"|+|"+ SRC_SEQ_NUM + "|+|"+ ENTNAME + "|+|"+ JXFPS + "|+|"+ JXJE + "|+|" + GFKPYF +"|+|"+ YXPPFPS
            + "|+|" + YXPPJE +"|+|" + YXZPFPS + "|+|"+ YXZPJE +"|+|" + QUERY_SYS +"|+|"+ OPDATE;
    }
}
