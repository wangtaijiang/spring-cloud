/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

public class SSD1_BACKWARD_AREA_DISTRI implements Serializable {
	private String SID;
	private String SRC_SEQ_NUM;
	private String ENTNAME;
	private String dqmc;
	private String xxje;
	private String percent;
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
	public String getDqmc() {
		return dqmc;
	}
	public void setDqmc(String dqmc) {
		this.dqmc = dqmc;
	}
	public String getXxje() {
		return xxje;
	}
	public void setXxje(String xxje) {
		this.xxje = xxje;
	}
	public String getPercent() {
		return percent;
	}
	public void setPercent(String percent) {
		this.percent = percent;
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
		return SID +"|+|"   + SRC_SEQ_NUM +"|+|"   + ENTNAME
				+ "|+|"  + dqmc + "|+|"  + xxje + "|+|"  + percent +"|+|"  + QUERY_SYS
				+ "|+|" + OPDATE;
	}
	

}
