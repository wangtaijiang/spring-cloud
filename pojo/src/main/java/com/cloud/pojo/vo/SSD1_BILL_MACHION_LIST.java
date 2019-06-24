/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;
import java.util.List;

public class SSD1_BILL_MACHION_LIST implements Serializable {
	private String SID;
	private String SRC_SEQ_NUM;
	private String ENTNAME  ; 
	private String bgcsSum;
	private String qdcsSum;
	private String zfjh;
	private String rzsj;
	private String fxsj;
	private String kpjh;
	private String sblx;
	private String kpxe;
	private String QUERY_SYS;
	private String OPDATE;
	
	private List<SSD1_SIGNIIST> qdxxList;

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

	public String getBgcsSum() {
		return bgcsSum;
	}

	public void setBgcsSum(String bgcsSum) {
		this.bgcsSum = bgcsSum;
	}

	public String getQdcsSum() {
		return qdcsSum;
	}

	public void setQdcsSum(String qdcsSum) {
		this.qdcsSum = qdcsSum;
	}

	public String getZfjh() {
		return zfjh;
	}

	public void setZfjh(String zfjh) {
		this.zfjh = zfjh;
	}

	public String getRzsj() {
		return rzsj;
	}

	public void setRzsj(String rzsj) {
		this.rzsj = rzsj;
	}

	public String getFxsj() {
		return fxsj;
	}

	public void setFxsj(String fxsj) {
		this.fxsj = fxsj;
	}

	public String getKpjh() {
		return kpjh;
	}

	public void setKpjh(String kpjh) {
		this.kpjh = kpjh;
	}

	public String getSblx() {
		return sblx;
	}

	public void setSblx(String sblx) {
		this.sblx = sblx;
	}

	public String getKpxe() {
		return kpxe;
	}

	public void setKpxe(String kpxe) {
		this.kpxe = kpxe;
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

	public List<SSD1_SIGNIIST> getQdxxList() {
		return qdxxList;
	}

	public void setQdxxList(List<SSD1_SIGNIIST> qdxxList) {
		this.qdxxList = qdxxList;
	}

	@Override
	public String toString() {
		return  SID + "|+|" + SRC_SEQ_NUM + "|+|" + ENTNAME
				+"|+|" + bgcsSum +"|+|" + qdcsSum + "|+|" + zfjh + "|+|"+ rzsj + "|+|"
				+ fxsj +"|+|" + kpjh + "|+|" + sblx +"|+|" + kpxe + "|+|" + QUERY_SYS
				+"|+|" + OPDATE;
	}

	
}
