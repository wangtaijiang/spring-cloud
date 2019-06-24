/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;


import java.io.Serializable;

/**
 * QSXX	F_ASN_QSXX	欠税信息	SID	唯一编码	VARCHAR(50)
 * QSXX	F_ASN_QSXX	欠税信息	SRC_SEQ_NUM	源系统流水号	VARCHAR(50)
 * QSXX	F_ASN_QSXX	欠税信息	ENTNAME   	企业名称	VARCHAR(200)
 * QSXX	F_ASN_QSXX	欠税信息	OW_REMAIN	欠税余额	VARCHAR(50)
 * QSXX	F_ASN_QSXX	欠税信息	PUB_DATE	发布日期	VARCHAR(30)
 * QSXX	F_ASN_QSXX	欠税信息	TAX_AUTHORITY	税务机关	VARCHAR(200)
 * QSXX	F_ASN_QSXX	欠税信息	TYPE	欠税税种	VARCHAR(50)
 * QSXX	F_ASN_QSXX	欠税信息	NSRSBH	纳税人识别号	VARCHAR(50)
 * QSXX	F_ASN_QSXX	欠税信息	OW_AMOUNT	当前发生的欠税额	VARCHAR(50)
 * QSXX	F_ASN_QSXX	欠税信息	QUERY_SYS	查询系统	VARCHAR(20)
 * QSXX	F_ASN_QSXX	欠税信息	OPDATE	写出时间戳(带时分秒)	VARCHAR(30)
 */
public class SSD1_TAX_ARREARS_INFO implements Serializable {

    private String SID;
    private String SRC_SEQ_NUM;
    private String ENTNAME;
    private String OW_REMAIN;
    private String PUB_DATE;
    private String TAX_AUTHORITY;
    private String TYPE;
    private String NSRSBH;
    private String OW_AMOUNT;
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

    public String getOW_REMAIN() {
        return OW_REMAIN;
    }

    public void setOW_REMAIN(String OW_REMAIN) {
        this.OW_REMAIN = OW_REMAIN;
    }

    public String getPUB_DATE() {
        return PUB_DATE;
    }

    public void setPUB_DATE(String PUB_DATE) {
        this.PUB_DATE = PUB_DATE;
    }

    public String getTAX_AUTHORITY() {
        return TAX_AUTHORITY;
    }

    public void setTAX_AUTHORITY(String TAX_AUTHORITY) {
        this.TAX_AUTHORITY = TAX_AUTHORITY;
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public String getNSRSBH() {
        return NSRSBH;
    }

    public void setNSRSBH(String NSRSBH) {
        this.NSRSBH = NSRSBH;
    }

    public String getOW_AMOUNT() {
        return OW_AMOUNT;
    }

    public void setOW_AMOUNT(String OW_AMOUNT) {
        this.OW_AMOUNT = OW_AMOUNT;
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
        return  SID + "|+|" + SRC_SEQ_NUM + "|+|"+ ENTNAME + "|+|"+ OW_REMAIN + "|+|"+ PUB_DATE +"|+|"+ TAX_AUTHORITY + "|+|" + TYPE +"|+|"  + NSRSBH +"|+|" + OW_AMOUNT +"|+|" + QUERY_SYS +"|+|"+ OPDATE;
    }
}
