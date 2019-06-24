/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

public class SSD1_REPORT implements Serializable {
	private String SID;
	private String SRC_SEQ_NUM;
	private String IXINNUOBM ;
	private String BGSJ  ;    
	private String VERSION ;  
	private String ENTNAME;   
	private String REPORTNAME;
	private String JYLSH;
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
	public String getIXINNUOBM() {
		return IXINNUOBM;
	}
	public void setIXINNUOBM(String iXINNUOBM) {
		IXINNUOBM = iXINNUOBM;
	}
	public String getBGSJ() {
		return BGSJ;
	}
	public void setBGSJ(String bGSJ) {
		BGSJ = bGSJ;
	}
	public String getVERSION() {
		return VERSION;
	}
	public void setVERSION(String vERSION) {
		VERSION = vERSION;
	}
	public String getENTNAME() {
		return ENTNAME;
	}
	public void setENTNAME(String eNTNAME) {
		ENTNAME = eNTNAME;
	}
	public String getREPORTNAME() {
		return REPORTNAME;
	}
	public void setREPORTNAME(String rEPORTNAME) {
		REPORTNAME = rEPORTNAME;
	}
	public String getJYLSH() {
		return JYLSH;
	}
	public void setJYLSH(String jYLSH) {
		JYLSH = jYLSH;
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
		return SID + "|+|" + SRC_SEQ_NUM +"|+|"  + IXINNUOBM + "|+|"
				+ BGSJ +"|+|" + VERSION + "|+|" + ENTNAME + "|+|" + REPORTNAME + "|+|"
				+ JYLSH +"|+|" + QUERY_SYS + "|+|" + OPDATE ;
	}
	
	
}
