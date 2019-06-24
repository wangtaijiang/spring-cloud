/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

public class SSD1_AREA_INDUSTRY_RANK implements Serializable {
	private String SID;
	private String SRC_SEQ_NUM;
	private String ENTNAME;   
	private String xxje;
	private String qypm;
	private String hypm;
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
	public String getXxje() {
		return xxje;
	}
	public void setXxje(String xxje) {
		this.xxje = xxje;
	}
	public String getQypm() {
		return qypm;
	}
	public void setQypm(String qypm) {
		this.qypm = qypm;
	}
	public String getHypm() {
		return hypm;
	}
	public void setHypm(String hypm) {
		this.hypm = hypm;
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
				+ "|+|"+ xxje +"|+|" + qypm +"|+|" + hypm + "|+|"+ QUERY_SYS + "|+|"
				+ OPDATE ;
	}

	
}
