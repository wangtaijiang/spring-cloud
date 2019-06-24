/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

public class SSD1_EQUITY_PLEDG_INFO implements Serializable {
	private String SID;
	private String SRC_SEQ_NUM;
	private String ENTNAME  ; 
	private String PLEDGOR;
	private String PLEDNO;
	private String BLICNO;
	private String IMPAM;
	private String IMPORG;
	private String EQUPLEDATE;
	private String TYPE;
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
	public String getPLEDGOR() {
		return PLEDGOR;
	}
	public void setPLEDGOR(String pLEDGOR) {
		PLEDGOR = pLEDGOR;
	}
	public String getPLEDNO() {
		return PLEDNO;
	}
	public void setPLEDNO(String pLEDNO) {
		PLEDNO = pLEDNO;
	}
	public String getBLICNO() {
		return BLICNO;
	}
	public void setBLICNO(String bLICNO) {
		BLICNO = bLICNO;
	}
	public String getIMPAM() {
		return IMPAM;
	}
	public void setIMPAM(String iMPAM) {
		IMPAM = iMPAM;
	}
	public String getIMPORG() {
		return IMPORG;
	}
	public void setIMPORG(String iMPORG) {
		IMPORG = iMPORG;
	}
	public String getEQUPLEDATE() {
		return EQUPLEDATE;
	}
	public void setEQUPLEDATE(String eQUPLEDATE) {
		EQUPLEDATE = eQUPLEDATE;
	}
	public String getTYPE() {
		return TYPE;
	}
	public void setTYPE(String tYPE) {
		TYPE = tYPE;
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
		return  SID +  "|+|"+ SRC_SEQ_NUM +"|+|"  + ENTNAME
				+"|+|"  + PLEDGOR +  "|+|"+ PLEDNO +"|+|"  + BLICNO +  "|+|"+ IMPAM
				+ "|+|" + IMPORG + "|+|" + EQUPLEDATE +"|+|" + TYPE + "|+|" + QUERY_SYS
				+"|+|" + OPDATE;
	}
	

}
