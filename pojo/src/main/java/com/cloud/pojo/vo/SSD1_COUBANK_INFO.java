/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

public class SSD1_COUBANK_INFO implements Serializable {
	private String SID;
	private String SRC_SEQ_NUM;
	private String ENTNAME;   
	private String xxje;   
	private String yhzh ;  
	private String count;  
	private String je_rate;
	private String yhmc ;  
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
	public String getYhzh() {
		return yhzh;
	}
	public void setYhzh(String yhzh) {
		this.yhzh = yhzh;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getJe_rate() {
		return je_rate;
	}
	public void setJe_rate(String je_rate) {
		this.je_rate = je_rate;
	}
	public String getYhmc() {
		return yhmc;
	}
	public void setYhmc(String yhmc) {
		this.yhmc = yhmc;
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
		return  SID + "|+|"+ SRC_SEQ_NUM +"|+|"+ ENTNAME +"|+|"
				+ xxje +"|+|"+ yhzh + "|+|" + count + "|+|" + je_rate +"|+|"+ yhmc
				+ "|+|" + QUERY_SYS +"|+|"+ OPDATE;
	}
	
	

}
