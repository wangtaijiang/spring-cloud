/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

public class SSD1_SIGNIIST implements Serializable {
	// 顺序不对，待确定
	private String SID;
	private String SRC_SEQ_NUM;
	private String ENTNAME; 
	private String mac;
	private String zzqdrq;
	private String zwqdrq;
	private String cs;
	private String ip;
	private String dqmc;
	private String latitude;
	private String longitude;
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
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public String getZzqdrq() {
		return zzqdrq;
	}
	public void setZzqdrq(String zzqdrq) {
		this.zzqdrq = zzqdrq;
	}
	public String getZwqdrq() {
		return zwqdrq;
	}
	public void setZwqdrq(String zwqdrq) {
		this.zwqdrq = zwqdrq;
	}
	public String getCs() {
		return cs;
	}
	public void setCs(String cs) {
		this.cs = cs;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getDqmc() {
		return dqmc;
	}
	public void setDqmc(String dqmc) {
		this.dqmc = dqmc;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
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
		return SID + "|+|" + SRC_SEQ_NUM +  "|+|" + ENTNAME +  "|+|" + mac
				+ "|+|"+ zzqdrq +  "|+|" + zwqdrq + "|+|" + cs +  "|+|"+ ip +  "|+|" + dqmc
				+  "|+|" + latitude +  "|+|" + longitude +  "|+|"+ QUERY_SYS +  "|+|"
				+ OPDATE;
	}
	

}
