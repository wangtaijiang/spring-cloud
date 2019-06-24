/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

public class SSD1_SALEINVOICE_ANALY implements Serializable {
	private String SID;
	private String SRC_SEQ_NUM;
	private String ENTNAME;   
	private String xfkpyf;
	private String xxje;
	private String yxxxfps;
	private String zffpje;
	private String zffps;
	private String xx_hc;
	private String fs_xx_yxfps;
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
	public String getXfkpyf() {
		return xfkpyf;
	}
	public void setXfkpyf(String xfkpyf) {
		this.xfkpyf = xfkpyf;
	}
	public String getXxje() {
		return xxje;
	}
	public void setXxje(String xxje) {
		this.xxje = xxje;
	}
	public String getYxxxfps() {
		return yxxxfps;
	}
	public void setYxxxfps(String yxxxfps) {
		this.yxxxfps = yxxxfps;
	}
	public String getZffpje() {
		return zffpje;
	}
	public void setZffpje(String zffpje) {
		this.zffpje = zffpje;
	}
	public String getZffps() {
		return zffps;
	}
	public void setZffps(String zffps) {
		this.zffps = zffps;
	}
	public String getXx_hc() {
		return xx_hc;
	}
	public void setXx_hc(String xx_hc) {
		this.xx_hc = xx_hc;
	}
	public String getFs_xx_yxfps() {
		return fs_xx_yxfps;
	}
	public void setFs_xx_yxfps(String fs_xx_yxfps) {
		this.fs_xx_yxfps = fs_xx_yxfps;
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
		return SID + "|+|" + SRC_SEQ_NUM + "|+|" + ENTNAME
				+ "|+|" + xfkpyf + "|+|" + xxje +"|+|"  + yxxxfps +"|+|"  + zffpje + "|+|"
				+ zffps + "|+|" + xx_hc + "|+|" + fs_xx_yxfps +"|+|" + QUERY_SYS +"|+|"
				+ OPDATE ;
	}
	
	
	

}
