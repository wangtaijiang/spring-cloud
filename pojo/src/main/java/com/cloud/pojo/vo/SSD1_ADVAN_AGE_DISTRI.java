/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

public class SSD1_ADVAN_AGE_DISTRI implements Serializable {
	private String SID;
	private String SRC_SEQ_NUM;
	private String ENTNAME;   
	private String nlfb_mc;
	private String je;
	private String zb;
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
	public String getNlfb_mc() {
		return nlfb_mc;
	}
	public void setNlfb_mc(String nlfb_mc) {
		this.nlfb_mc = nlfb_mc;
	}
	public String getJe() {
		return je;
	}
	public void setJe(String je) {
		this.je = je;
	}
	public String getZb() {
		return zb;
	}
	public void setZb(String zb) {
		this.zb = zb;
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
		return  SID + "|+|" + SRC_SEQ_NUM +"|+|"  + ENTNAME
				+"|+|" + nlfb_mc +"|+|" + je + "|+|" + zb + "|+|" + QUERY_SYS +"|+|"
				+ OPDATE ;
	}
	
	

}
