/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

public class SSD1_INTAX_STATISTICS implements Serializable {
	private String SID;
	private String SRC_SEQ_NUM;
	private String ENTNAME  ; 
	private String kpyf;
	private String d0;
	private String d3;
	private String d5;
	private String d6;
	private String d10;
	private String d11;
	private String d13;
	private String d16;
	private String d17;
	private String dothers;
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
	public String getKpyf() {
		return kpyf;
	}
	public void setKpyf(String kpyf) {
		this.kpyf = kpyf;
	}
	public String getD0() {
		return d0;
	}
	public void setD0(String d0) {
		this.d0 = d0;
	}
	public String getD3() {
		return d3;
	}
	public void setD3(String d3) {
		this.d3 = d3;
	}
	public String getD5() {
		return d5;
	}
	public void setD5(String d5) {
		this.d5 = d5;
	}
	public String getD6() {
		return d6;
	}
	public void setD6(String d6) {
		this.d6 = d6;
	}
	public String getD10() {
		return d10;
	}
	public void setD10(String d10) {
		this.d10 = d10;
	}
	public String getD11() {
		return d11;
	}
	public void setD11(String d11) {
		this.d11 = d11;
	}
	public String getD13() {
		return d13;
	}
	public void setD13(String d13) {
		this.d13 = d13;
	}
	public String getD16() {
		return d16;
	}
	public void setD16(String d16) {
		this.d16 = d16;
	}
	public String getD17() {
		return d17;
	}
	public void setD17(String d17) {
		this.d17 = d17;
	}
	public String getDothers() {
		return dothers;
	}
	public void setDothers(String dothers) {
		this.dothers = dothers;
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
		return SID +"|+|"   + SRC_SEQ_NUM + "|+|"  + ENTNAME + "|+|" 
				+ kpyf +"|+|" + d0 +"|+|"  + d3 +"|+|"  + d5 + "|+|"  + d6 + "|+|" + d10 +"|+|" + d11
				+"|+|"  + d13 +"|+|"   + d16 +  "|+|" + d17 + "|+|"  + dothers +  "|+|" + QUERY_SYS
				+"|+|"  + OPDATE ;
	}
	
	

}
