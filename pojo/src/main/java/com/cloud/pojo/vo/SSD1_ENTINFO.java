/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

public class SSD1_ENTINFO implements Serializable {

	private String SID;
	private String SRC_SEQ_NUM;
	private String ENTNAME;
	private String ZZJGDM;
	private String NSRSBH;
	private String ESTDATE;
	private String UNISCID;
	private String ENTTYPE;
	private String SCJYDZ;
	private String REGSTATE;
	private String REGNO;
	private String OPSCOPE;
	private String REGORG;
	private String REGCAP;
	private String OPTO;
	private String DOM;
	private String APPRDATE;
	private String LEREP;
	private String YBNSRZZ;
	private String OPFROM;
	private String QUERY_SYS;
	private String OPDATE;
	public String getSID() {
		return SID;
	}
	public void setSID(String sID) {
		SID = sID;
	}
	public String getSRC_SEQ_NUM() {
		return SRC_SEQ_NUM;
	}
	public void setSRC_SEQ_NUM(String sRC_SEQ_NUM) {
		SRC_SEQ_NUM = sRC_SEQ_NUM;
	}
	public String getENTNAME() {
		return ENTNAME;
	}
	public void setENTNAME(String eNTNAME) {
		ENTNAME = eNTNAME;
	}
	public String getZZJGDM() {
		return ZZJGDM;
	}
	public void setZZJGDM(String zZJGDM) {
		ZZJGDM = zZJGDM;
	}
	public String getNSRSBH() {
		return NSRSBH;
	}
	public void setNSRSBH(String nSRSBH) {
		NSRSBH = nSRSBH;
	}
	public String getESTDATE() {
		return ESTDATE;
	}
	public void setESTDATE(String eSTDATE) {
		ESTDATE = eSTDATE;
	}
	public String getUNISCID() {
		return UNISCID;
	}
	public void setUNISCID(String uNISCID) {
		UNISCID = uNISCID;
	}
	public String getENTTYPE() {
		return ENTTYPE;
	}
	public void setENTTYPE(String eNTTYPE) {
		ENTTYPE = eNTTYPE;
	}
	public String getSCJYDZ() {
		return SCJYDZ;
	}
	public void setSCJYDZ(String sCJYDZ) {
		SCJYDZ = sCJYDZ;
	}
	public String getREGSTATE() {
		return REGSTATE;
	}
	public void setREGSTATE(String rEGSTATE) {
		REGSTATE = rEGSTATE;
	}
	public String getREGNO() {
		return REGNO;
	}
	public void setREGNO(String rEGNO) {
		REGNO = rEGNO;
	}
	public String getOPSCOPE() {
		return OPSCOPE;
	}
	public void setOPSCOPE(String oPSCOPE) {
		OPSCOPE = oPSCOPE;
	}
	public String getREGORG() {
		return REGORG;
	}
	public void setREGORG(String rEGORG) {
		REGORG = rEGORG;
	}
	public String getREGCAP() {
		return REGCAP;
	}
	public void setREGCAP(String rEGCAP) {
		REGCAP = rEGCAP;
	}
	public String getOPTO() {
		return OPTO;
	}
	public void setOPTO(String oPTO) {
		OPTO = oPTO;
	}
	public String getDOM() {
		return DOM;
	}
	public void setDOM(String dOM) {
		DOM = dOM;
	}
	public String getAPPRDATE() {
		return APPRDATE;
	}
	public void setAPPRDATE(String aPPRDATE) {
		APPRDATE = aPPRDATE;
	}
	public String getLEREP() {
		return LEREP;
	}
	public void setLEREP(String lEREP) {
		LEREP = lEREP;
	}
	public String getYBNSRZZ() {
		return YBNSRZZ;
	}
	public void setYBNSRZZ(String yBNSRZZ) {
		YBNSRZZ = yBNSRZZ;
	}
	public String getOPFROM() {
		return OPFROM;
	}
	public void setOPFROM(String oPFROM) {
		OPFROM = oPFROM;
	}
	public String getQUERY_SYS() {
		return QUERY_SYS;
	}
	public void setQUERY_SYS(String qUERY_SYS) {
		QUERY_SYS = qUERY_SYS;
	}
	public String getOPDATE() {
		return OPDATE;
	}
	public void setOPDATE(String oPDATE) {
		OPDATE = oPDATE;
	}
	@Override
	public String toString() {
		return SID + "|+|" + SRC_SEQ_NUM +"|+|" + ENTNAME + "|+|"
				+ ZZJGDM + "|+|" + NSRSBH + "|+|"+ ESTDATE +"|+|" + UNISCID + "|+|"
				+ ENTTYPE +"|+|"+ SCJYDZ + "|+|"+ REGSTATE +"|+|" + REGNO + "|+|"
				+ OPSCOPE + "|+|" + REGORG + "|+|" + REGCAP + "|+|" + OPTO + "|+|" + DOM
				+ "|+|" + APPRDATE +"|+|"+ LEREP +  "|+|"+ YBNSRZZ + "|+|" + OPFROM
				+ "|+|" + QUERY_SYS + "|+|" + OPDATE ;
	}
	
	
	

}
