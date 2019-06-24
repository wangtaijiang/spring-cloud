/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

public class SSD1_PUNINFO implements Serializable {
	private String SID;
	private String SRC_SEQ_NUM;
	private String ENTNAME;   
	private String PENDECNO;
	private String PENDECISSDATE;
	private String PENAUTH;
	private String PENTYPE;
	private String PENAM;
	private String FORFAM;
	private String LEREP;
	private String REMARK;
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
	public String getPENDECNO() {
		return PENDECNO;
	}
	public void setPENDECNO(String pENDECNO) {
		PENDECNO = pENDECNO;
	}
	public String getPENDECISSDATE() {
		return PENDECISSDATE;
	}
	public void setPENDECISSDATE(String pENDECISSDATE) {
		PENDECISSDATE = pENDECISSDATE;
	}
	public String getPENAUTH() {
		return PENAUTH;
	}
	public void setPENAUTH(String pENAUTH) {
		PENAUTH = pENAUTH;
	}
	public String getPENTYPE() {
		return PENTYPE;
	}
	public void setPENTYPE(String pENTYPE) {
		PENTYPE = pENTYPE;
	}
	public String getPENAM() {
		return PENAM;
	}
	public void setPENAM(String pENAM) {
		PENAM = pENAM;
	}
	public String getFORFAM() {
		return FORFAM;
	}
	public void setFORFAM(String fORFAM) {
		FORFAM = fORFAM;
	}
	public String getLEREP() {
		return LEREP;
	}
	public void setLEREP(String lEREP) {
		LEREP = lEREP;
	}
	public String getREMARK() {
		return REMARK;
	}
	public void setREMARK(String rEMARK) {
		REMARK = rEMARK;
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
		return  SID + "|+|" + SRC_SEQ_NUM +"|+|"+ ENTNAME + "|+|"
				+ PENDECNO +"|+|" + PENDECISSDATE + "|+|" + PENAUTH + "|+|"+ PENTYPE
				+ "|+|"+ PENAM + "|+|"+ FORFAM + "|+|" + LEREP + "|+|" + REMARK + "|+|"
				+ QUERY_SYS + "|+|" + OPDATE;
	}
	
	

}
