/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

public class SSD1_ADVAN_INDUSTRY_DISTRI implements Serializable {
	private String SID;
	private String SRC_SEQ_NUM;
	private String ENTNAME;   
	private String HYMC;
	private String GYSJE;
	private String PERCENT;
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
	public String getHYMC() {
		return HYMC;
	}
	public void setHYMC(String hYMC) {
		HYMC = hYMC;
	}
	public String getGYSJE() {
		return GYSJE;
	}
	public void setGYSJE(String gYSJE) {
		GYSJE = gYSJE;
	}
	public String getPERCENT() {
		return PERCENT;
	}
	public void setPERCENT(String pERCENT) {
		PERCENT = pERCENT;
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
		return  SID +"|+|"  + SRC_SEQ_NUM +"|+|" + ENTNAME
				+"|+|"  + HYMC + "|+|"+ GYSJE + "|+|" + PERCENT + "|+|" + QUERY_SYS
				+ "|+|" + OPDATE ;
	}
	

}
