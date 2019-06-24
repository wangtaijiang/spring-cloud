/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

public class SSD1_BREAK_FAITH_ANNOUNCE implements Serializable {
	private String SID;
	private String SRC_SEQ_NUM;
	private String ENTNAME ;  
	private String COURT;
	private String YJDW;
	private String LXQK;
	private String SORTTIME;
	private String CASENO;
	private String POSTTIME;
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
	public String getCOURT() {
		return COURT;
	}
	public void setCOURT(String cOURT) {
		COURT = cOURT;
	}
	public String getYJDW() {
		return YJDW;
	}
	public void setYJDW(String yJDW) {
		YJDW = yJDW;
	}
	public String getLXQK() {
		return LXQK;
	}
	public void setLXQK(String lXQK) {
		LXQK = lXQK;
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
	public String getPOSTTIME() {
		return POSTTIME;
	}
	public void setPOSTTIME(String pOSTTIME) {
		POSTTIME = pOSTTIME;
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
		return  SID + "|+|" + SRC_SEQ_NUM +"|+|" + ENTNAME
				+ "|+|" + COURT +"|+|" + YJDW + "|+|"+ LXQK +"|+|"+ SORTTIME +
				"|+|"+ CASENO + "|+|"+ POSTTIME + "|+|" + QUERY_SYS + "|+|"+ OPDATE;
	}
	
	

}
