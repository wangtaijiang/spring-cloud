/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @authur wtj
 * @date 2019/5/14    10:42
 */
public class SSD1_SALEPROD_ANALY implements Serializable {
    private String SID;
    private String SRC_SEQ_NUM;
    private String ENTNAME;
    private String cjqj;
    private String xx_sl;
    private String zysp_jnxs;
    private String jzd;
    private String QUERY_SYS;
    private String OPDATE;
    private SSD1_INVOICE_INFO fpxxVo;
    private List<SSD1_SALEPROD_LIST> xx_spqd;

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

    public String getXx_sl() {
        return xx_sl;
    }

    public void setXx_sl(String xx_sl) {
        this.xx_sl = xx_sl;
    }

    public String getZysp_jnxs() {
        return zysp_jnxs;
    }

    public void setZysp_jnxs(String zysp_jnxs) {
        this.zysp_jnxs = zysp_jnxs;
    }

    public String getJzd() {
        return jzd;
    }

    public void setJzd(String jzd) {
        this.jzd = jzd;
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

    public SSD1_INVOICE_INFO getFpxxVo() {
        return fpxxVo;
    }

    public void setFpxxVo(SSD1_INVOICE_INFO fpxxVo) {
        this.fpxxVo = fpxxVo;
    }

    public List<SSD1_SALEPROD_LIST> getXx_spqd() {
        return xx_spqd;
    }

    public void setXx_spqd(List<SSD1_SALEPROD_LIST> xx_spqd) {
        this.xx_spqd = xx_spqd;
    }

    @Override
    public String toString() {
        return SID +"|+|" + SRC_SEQ_NUM +"|+|"  + ENTNAME +"|+|" + cjqj + "|+|"+ xx_sl + "|+|"+ zysp_jnxs
                +"|+|" + jzd +"|+|"+ QUERY_SYS +"|+|"+ OPDATE ;
    }
}
