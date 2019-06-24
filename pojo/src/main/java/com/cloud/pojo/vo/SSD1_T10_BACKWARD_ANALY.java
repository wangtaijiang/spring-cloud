/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

public class SSD1_T10_BACKWARD_ANALY implements Serializable {
	private String SID;
	private String SRC_SEQ_NUM;
	private String ENTNAME;   
	private String qysl;
	private String averageJe;
	private String sumJe;
	private String xywdzs;
	private String xywdzsName;
	private String xyjnxs;
	private String xyjzd;
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
	public String getQysl() {
		return qysl;
	}
	public void setQysl(String qysl) {
		this.qysl = qysl;
	}
	public String getAverageJe() {
		return averageJe;
	}
	public void setAverageJe(String averageJe) {
		this.averageJe = averageJe;
	}
	public String getSumJe() {
		return sumJe;
	}
	public void setSumJe(String sumJe) {
		this.sumJe = sumJe;
	}
	public String getXywdzs() {
		return xywdzs;
	}
	public void setXywdzs(String xywdzs) {
		this.xywdzs = xywdzs;
	}
	public String getXywdzsName() {
		return xywdzsName;
	}
	public void setXywdzsName(String xywdzsName) {
		this.xywdzsName = xywdzsName;
	}
	public String getXyjnxs() {
		return xyjnxs;
	}
	public void setXyjnxs(String xyjnxs) {
		this.xyjnxs = xyjnxs;
	}
	public String getXyjzd() {
		return xyjzd;
	}
	public void setXyjzd(String xyjzd) {
		this.xyjzd = xyjzd;
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
		return SID + "|+|" + SRC_SEQ_NUM + "|+|"+ ENTNAME
				+"|+|"  + qysl +"|+|"  + averageJe +"|+|"  + sumJe + "|+|" + xywdzs
				+ "|+|"+ xywdzsName + "|+|" + xyjnxs + "|+|" + xyjzd + "|+|" + QUERY_SYS
				+  "|+|"+ OPDATE;
	}
	
	

}
