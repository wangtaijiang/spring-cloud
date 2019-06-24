/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

public class SSD1_UNNORMAL_USER_INFO implements Serializable {
	private String SID;
	private String SRC_SEQ_NUM;
	private String ENTNAME ;  
	private String RDRQ;
	private String ZGGSJG;
	private String FBRQ;
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
	public String getRDRQ() {
		return RDRQ;
	}
	public void setRDRQ(String rDRQ) {
		RDRQ = rDRQ;
	}
	public String getZGGSJG() {
		return ZGGSJG;
	}
	public void setZGGSJG(String zGGSJG) {
		ZGGSJG = zGGSJG;
	}
	public String getFBRQ() {
		return FBRQ;
	}
	public void setFBRQ(String fBRQ) {
		FBRQ = fBRQ;
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
		return  SID + "|+|"+ SRC_SEQ_NUM + "|+|"+ ENTNAME
				+"|+|" + RDRQ + "|+|" + ZGGSJG +"|+|" + FBRQ + "|+|" + QUERY_SYS +"|+|"
				+ OPDATE ;
	}
	

}
