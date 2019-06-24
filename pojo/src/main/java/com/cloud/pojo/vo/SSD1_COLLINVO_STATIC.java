/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

public class SSD1_COLLINVO_STATIC implements Serializable {
	private String SID;
	private String SRC_SEQ_NUM;
	private String ENTNAME;  
	private String nsrmc;
	private String nsrsbh;
	private String zzkprq;
	private String zwkprq;
	private String fpfs;
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
	public String getNsrmc() {
		return nsrmc;
	}
	public void setNsrmc(String nsrmc) {
		this.nsrmc = nsrmc;
	}
	public String getNsrsbh() {
		return nsrsbh;
	}
	public void setNsrsbh(String nsrsbh) {
		this.nsrsbh = nsrsbh;
	}
	public String getZzkprq() {
		return zzkprq;
	}
	public void setZzkprq(String zzkprq) {
		this.zzkprq = zzkprq;
	}
	public String getZwkprq() {
		return zwkprq;
	}
	public void setZwkprq(String zwkprq) {
		this.zwkprq = zwkprq;
	}
	public String getFpfs() {
		return fpfs;
	}
	public void setFpfs(String fpfs) {
		this.fpfs = fpfs;
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
		return SID +"|+|" + SRC_SEQ_NUM +  "|+|"+ ENTNAME + "|+|"
				+ nsrmc + "|+|"+ nsrsbh + "|+|" + zzkprq + "|+|" + zwkprq +"|+|"  + fpfs
				+"|+|" + QUERY_SYS + "|+|" + OPDATE ;
	}
	
	

}
