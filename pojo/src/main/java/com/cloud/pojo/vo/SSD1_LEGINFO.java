/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

public class SSD1_LEGINFO implements Serializable {
	private String SID;
	private String SRC_SEQ_NUM;
	private String ENTNAME;   
	private String INVTYPE;    
	private String INV;
	private String LISUBCONAM;
	private String BLICNO;   
	private String LIACCONAM; 
	private String CONFORM;  
	private String BLICTYPE; 
	private String CGBL;
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
	public String getINVTYPE() {
		return INVTYPE;
	}
	public void setINVTYPE(String iNVTYPE) {
		INVTYPE = iNVTYPE;
	}
	public String getINV() {
		return INV;
	}
	public void setINV(String iNV) {
		INV = iNV;
	}
	public String getLISUBCONAM() {
		return LISUBCONAM;
	}
	public void setLISUBCONAM(String lISUBCONAM) {
		LISUBCONAM = lISUBCONAM;
	}
	public String getBLICNO() {
		return BLICNO;
	}
	public void setBLICNO(String bLICNO) {
		BLICNO = bLICNO;
	}
	public String getLIACCONAM() {
		return LIACCONAM;
	}
	public void setLIACCONAM(String lIACCONAM) {
		LIACCONAM = lIACCONAM;
	}
	public String getCONFORM() {
		return CONFORM;
	}
	public void setCONFORM(String cONFORM) {
		CONFORM = cONFORM;
	}
	public String getBLICTYPE() {
		return BLICTYPE;
	}
	public void setBLICTYPE(String bLICTYPE) {
		BLICTYPE = bLICTYPE;
	}
	public String getCGBL() {
		return CGBL;
	}
	public void setCGBL(String cGBL) {
		CGBL = cGBL;
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
		return SID + "|+|" + SRC_SEQ_NUM +"|+|"  + ENTNAME + "|+|"
				+ INVTYPE + "|+|" + INV +"|+|" + LISUBCONAM +  "|+|"+ BLICNO +"|+|"
				+ LIACCONAM +"|+|"+ CONFORM + "|+|" + BLICTYPE + "|+|" + CGBL + "|+|"
				+ QUERY_SYS +"|+|" + OPDATE ;
	}
	
	

}
