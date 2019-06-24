/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;
import java.util.List;

public class SSD1_CATEGOR_ANALY implements Serializable {
	private String SID;
	private String SRC_SEQ_NUM;
	private String ENTNAME;   
	private String qdmx_fpfs;
	private String spfl_fpfs;
	private String spfl_je;
	private String unspfl_je;
	private String unspfl_jerate;
	private String spfl_jerate;
	private String unspfl_fpfs;
	private String QUERY_SYS;
	private String OPDATE;
	private List<SSD1_CATEGOR_LIST> spflList;
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
	public String getQdmx_fpfs() {
		return qdmx_fpfs;
	}
	public void setQdmx_fpfs(String qdmx_fpfs) {
		this.qdmx_fpfs = qdmx_fpfs;
	}
	public String getSpfl_fpfs() {
		return spfl_fpfs;
	}
	public void setSpfl_fpfs(String spfl_fpfs) {
		this.spfl_fpfs = spfl_fpfs;
	}
	public String getSpfl_je() {
		return spfl_je;
	}
	public void setSpfl_je(String spfl_je) {
		this.spfl_je = spfl_je;
	}
	public String getUnspfl_je() {
		return unspfl_je;
	}
	public void setUnspfl_je(String unspfl_je) {
		this.unspfl_je = unspfl_je;
	}
	public String getUnspfl_jerate() {
		return unspfl_jerate;
	}
	public void setUnspfl_jerate(String unspfl_jerate) {
		this.unspfl_jerate = unspfl_jerate;
	}
	public String getSpfl_jerate() {
		return spfl_jerate;
	}
	public void setSpfl_jerate(String spfl_jerate) {
		this.spfl_jerate = spfl_jerate;
	}
	public String getUnspfl_fpfs() {
		return unspfl_fpfs;
	}
	public void setUnspfl_fpfs(String unspfl_fpfs) {
		this.unspfl_fpfs = unspfl_fpfs;
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
	public List<SSD1_CATEGOR_LIST> getSpflList() {
		return spflList;
	}
	public void setSpflList(List<SSD1_CATEGOR_LIST> spflList) {
		this.spflList = spflList;
	}
	@Override
	public String toString() {
		return SID + "|+|" + SRC_SEQ_NUM + "|+|" + ENTNAME
				+  "|+|"+ qdmx_fpfs + "|+|" + spfl_fpfs + "|+|" + spfl_je + "|+|"
				+ unspfl_je + "|+|" + unspfl_jerate +"|+|" + spfl_jerate + "|+|"
				+ unspfl_fpfs +"|+|"+ QUERY_SYS + "|+|" + OPDATE;
	}
	
	

}
