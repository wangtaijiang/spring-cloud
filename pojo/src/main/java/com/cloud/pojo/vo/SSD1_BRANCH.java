/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

public class SSD1_BRANCH implements Serializable {
	private String SID;
	private String SRC_SEQ_NUM;
	private String ENTNAME; 
	private String BRNAME;
	private String REGNO;
	private String REGSTATE;
	private String LEREP;
	private String REGORG;
	private String ESTDATE;
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
	public String getBRNAME() {
		return BRNAME;
	}
	public void setBRNAME(String bRNAME) {
		BRNAME = bRNAME;
	}
	public String getREGNO() {
		return REGNO;
	}
	public void setREGNO(String rEGNO) {
		REGNO = rEGNO;
	}
	public String getREGSTATE() {
		return REGSTATE;
	}
	public void setREGSTATE(String rEGSTATE) {
		REGSTATE = rEGSTATE;
	}
	public String getLEREP() {
		return LEREP;
	}
	public void setLEREP(String lEREP) {
		LEREP = lEREP;
	}
	public String getREGORG() {
		return REGORG;
	}
	public void setREGORG(String rEGORG) {
		REGORG = rEGORG;
	}
	public String getESTDATE() {
		return ESTDATE;
	}
	public void setESTDATE(String eSTDATE) {
		ESTDATE = eSTDATE;
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
		return SID +  "|+|"+ SRC_SEQ_NUM +"|+|" + ENTNAME + "|+|"
				+ BRNAME +"|+|"+ REGNO +"|+|" + REGSTATE +"|+|"  + LEREP + "|+|"+ REGORG
				+  "|+|"+ ESTDATE +"|+|" + QUERY_SYS + "|+|" + OPDATE;
	}
	

}
