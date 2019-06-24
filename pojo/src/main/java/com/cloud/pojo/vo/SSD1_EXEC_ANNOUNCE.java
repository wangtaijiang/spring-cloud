/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

public class SSD1_EXEC_ANNOUNCE implements Serializable {
	private String SID;
	private String SRC_SEQ_NUM;
	private String ENTNAME;   
	private String TITLE;
	private String BODY;
	private String COURT;
	private String SORTTIME;
	private String CASENO;
	private String CASESTATE;
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
	public String getTITLE() {
		return TITLE;
	}
	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}
	public String getBODY() {
		return BODY;
	}
	public void setBODY(String bODY) {
		BODY = bODY;
	}
	public String getCOURT() {
		return COURT;
	}
	public void setCOURT(String cOURT) {
		COURT = cOURT;
	}
	public String getSORTTIME() {
		return SORTTIME;
	}
	public void setSORTTIME(String sORTTIME) {
		SORTTIME = sORTTIME;
	}
	public String getCASENO() {
		return CASENO;
	}
	public void setCASENO(String cASENO) {
		CASENO = cASENO;
	}
	public String getCASESTATE() {
		return CASESTATE;
	}
	public void setCASESTATE(String cASESTATE) {
		CASESTATE = cASESTATE;
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
		return SID + "|+|"+ SRC_SEQ_NUM + "|+|" + ENTNAME + "|+|"
				+ TITLE + "|+|"+ BODY +  "|+|"+ COURT +"|+|" + SORTTIME + "|+|" + CASENO
				+ "|+|"+ CASESTATE + "|+|" + QUERY_SYS + "|+|" + OPDATE;
	}
	
	

}
