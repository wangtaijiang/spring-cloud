/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

public class SSD1_ENT_ABNOPERA implements Serializable {
	private String SID;
	private String SRC_SEQ_NUM;
	private String ENTNAME;   
	private String SPECAUSE;
	private String ABNTIME;
	private String DECORG;
	private String REMEXCPRES;
	private String REMDATE;
	private String YCORG;
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
	public String getSPECAUSE() {
		return SPECAUSE;
	}
	public void setSPECAUSE(String sPECAUSE) {
		SPECAUSE = sPECAUSE;
	}
	public String getABNTIME() {
		return ABNTIME;
	}
	public void setABNTIME(String aBNTIME) {
		ABNTIME = aBNTIME;
	}
	public String getDECORG() {
		return DECORG;
	}
	public void setDECORG(String dECORG) {
		DECORG = dECORG;
	}
	public String getREMEXCPRES() {
		return REMEXCPRES;
	}
	public void setREMEXCPRES(String rEMEXCPRES) {
		REMEXCPRES = rEMEXCPRES;
	}
	public String getREMDATE() {
		return REMDATE;
	}
	public void setREMDATE(String rEMDATE) {
		REMDATE = rEMDATE;
	}
	public String getYCORG() {
		return YCORG;
	}
	public void setYCORG(String yCORG) {
		YCORG = yCORG;
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
				+ SPECAUSE + "|+|" + ABNTIME +"|+|"  + DECORG + "|+|" + REMEXCPRES + "|+|"
				+ REMDATE + "|+|" + YCORG + "|+|"+ QUERY_SYS +"|+|" + OPDATE;
	}
	
	

}
