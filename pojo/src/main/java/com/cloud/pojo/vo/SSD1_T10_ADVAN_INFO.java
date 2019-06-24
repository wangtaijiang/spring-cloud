/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

/**
 * @authur wtj
 * @date 2019/5/14    11:18
 */
public class SSD1_T10_ADVAN_INFO implements Serializable {
    private String SID;
    private String SRC_SEQ_NUM;
    private String ENTNAME;
    private String nsrsbh;
    private String qymc;
    private String dy;
    private String zcsj;
    private String djzclx;
    private String zczb;
    private String hy;
    private String nsxydj;
    private String  pjnd;
    private String jebl;
    private String fpfs;
    private String jyje;
    private String  zhjyrq;
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

    public String getNsrsbh() {
        return nsrsbh;
    }

    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
    }

    public String getQymc() {
        return qymc;
    }

    public void setQymc(String qymc) {
        this.qymc = qymc;
    }

    public String getDy() {
        return dy;
    }

    public void setDy(String dy) {
        this.dy = dy;
    }

    public String getZcsj() {
        return zcsj;
    }

    public void setZcsj(String zcsj) {
        this.zcsj = zcsj;
    }

    public String getDjzclx() {
        return djzclx;
    }

    public void setDjzclx(String djzclx) {
        this.djzclx = djzclx;
    }

    public String getZczb() {
        return zczb;
    }

    public void setZczb(String zczb) {
        this.zczb = zczb;
    }

    public String getHy() {
        return hy;
    }

    public void setHy(String hy) {
        this.hy = hy;
    }

    public String getNsxydj() {
        return nsxydj;
    }

    public void setNsxydj(String nsxydj) {
        this.nsxydj = nsxydj;
    }

    public String getPjnd() {
        return pjnd;
    }

    public void setPjnd(String pjnd) {
        this.pjnd = pjnd;
    }

    public String getJebl() {
        return jebl;
    }

    public void setJebl(String jebl) {
        this.jebl = jebl;
    }

    public String getFpfs() {
        return fpfs;
    }

    public void setFpfs(String fpfs) {
        this.fpfs = fpfs;
    }

    public String getJyje() {
        return jyje;
    }

    public void setJyje(String jyje) {
        this.jyje = jyje;
    }

    public String getZhjyrq() {
        return zhjyrq;
    }

    public void setZhjyrq(String zhjyrq) {
        this.zhjyrq = zhjyrq;
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
        return SID + "|+|" + SRC_SEQ_NUM +"|+|"+ ENTNAME +"|+|"+ nsrsbh +"|+|"+ qymc +"|+|" + dy
            +"|+|"+ zcsj + "|+|" + djzclx +"|+|" + zczb + "|+|" + hy +"|+|"+ nsxydj +"|+|"+ pjnd +"|+|"+ jebl
            + "|+|"+ fpfs +"|+|"+ jyje + "|+|" + zhjyrq +"|+|" + QUERY_SYS +"|+|"+ OPDATE ;
    }
}
