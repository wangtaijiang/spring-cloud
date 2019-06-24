/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

public class SSD1_TAX_ILLEGAL implements Serializable {
	private String SID;
	private String SRC_SEQ_NUM;
	private String ENTNAME ;  
	private String AJXZ;
	private String WFSS;
	private String YJCFQK;
	private String SBRQ;
	private String ZXGXRQ;
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
	public String getAJXZ() {
		return AJXZ;
	}
	public void setAJXZ(String aJXZ) {
		AJXZ = aJXZ;
	}
	public String getWFSS() {
		return WFSS;
	}
	public void setWFSS(String wFSS) {
		WFSS = wFSS;
	}
	public String getYJCFQK() {
		return YJCFQK;
	}
	public void setYJCFQK(String yJCFQK) {
		YJCFQK = yJCFQK;
	}
	public String getSBRQ() {
		return SBRQ;
	}
	public void setSBRQ(String sBRQ) {
		SBRQ = sBRQ;
	}
	public String getZXGXRQ() {
		return ZXGXRQ;
	}
	public void setZXGXRQ(String zXGXRQ) {
		ZXGXRQ = zXGXRQ;
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
		return SID + "|+|" + SRC_SEQ_NUM + "|+|" + ENTNAME + "|+|"
				+ AJXZ +  "|+|"+ WFSS + "|+|" + YJCFQK + "|+|" + SBRQ +"|+|"  + ZXGXRQ
				+"|+|"  + QUERY_SYS +"|+|"  + OPDATE;
	}
	
	

}
