/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

public class SSD1_ENT_REMARK implements Serializable {
	private String SID;
	private String SRC_SEQ_NUM;
	private String zz_kprq;
	private String jshj_24;
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
	public String getZz_kprq() {
		return zz_kprq;
	}
	public void setZz_kprq(String zz_kprq) {
		this.zz_kprq = zz_kprq;
	}
	public String getJshj_24() {
		return jshj_24;
	}
	public void setJshj_24(String jshj_24) {
		this.jshj_24 = jshj_24;
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
		return SID + "|+|" + SRC_SEQ_NUM + "|+|"+ zz_kprq + "|+|"
				+ jshj_24 + "|+|" + QUERY_SYS + "|+|" + OPDATE;
	}

	
}
