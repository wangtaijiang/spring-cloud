/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;
import java.util.List;

public class SSD1_SIGNINFO implements Serializable {
	private String SID;
	private String SRC_SEQ_NUM;
	private String ENTNAME ;  
	private String kpjlx;
	private String fp_kpj_count;
	private String kpj_count;
	private String QUERY_SYS;
	private String OPDATE;
	private List<SSD1_BILL_MACHION_LIST> kpjList;
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
	public String getKpjlx() {
		return kpjlx;
	}
	public void setKpjlx(String kpjlx) {
		this.kpjlx = kpjlx;
	}
	public String getFp_kpj_count() {
		return fp_kpj_count;
	}
	public void setFp_kpj_count(String fp_kpj_count) {
		this.fp_kpj_count = fp_kpj_count;
	}
	public String getKpj_count() {
		return kpj_count;
	}
	public void setKpj_count(String kpj_count) {
		this.kpj_count = kpj_count;
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
	public List<SSD1_BILL_MACHION_LIST> getKpjList() {
		return kpjList;
	}
	public void setKpjList(List<SSD1_BILL_MACHION_LIST> kpjList) {
		this.kpjList = kpjList;
	}
	@Override
	public String toString() {
		return  SID +"|+|" + SRC_SEQ_NUM +"|+|" + ENTNAME + "|+|"
				+ kpjlx +"|+|" + fp_kpj_count + "|+|" + kpj_count + "|+|" + QUERY_SYS
				+ "|+|" + OPDATE;
	}
	

}
