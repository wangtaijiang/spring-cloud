/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;
import java.util.List;

public class SSD1_PURCHASEPRO_ANALY implements Serializable {
	private String SID;
	private String SRC_SEQ_NUM;
	private String ENTNAME;  
	private String cjqj;
	private String jx_sl;
	private String cgsp_jnxs;
	private String jzd;
	private String QUERY_SYS;
	private String OPDATE;
	private SSD1_ININVOICE_INFO fpxxVo;
	private List<SSD1_PURCHASEPRO_LIST> jx_spqd;
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
	public String getCjqj() {
		return cjqj;
	}
	public void setCjqj(String cjqj) {
		this.cjqj = cjqj;
	}
	public String getJx_sl() {
		return jx_sl;
	}
	public void setJx_sl(String jx_sl) {
		this.jx_sl = jx_sl;
	}
	public String getCgsp_jnxs() {
		return cgsp_jnxs;
	}
	public void setCgsp_jnxs(String cgsp_jnxs) {
		this.cgsp_jnxs = cgsp_jnxs;
	}
	public String getJzd() {
		return jzd;
	}
	public void setJzd(String jzd) {
		this.jzd = jzd;
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
	public SSD1_ININVOICE_INFO getFpxxVo() {
		return fpxxVo;
	}
	public void setFpxxVo(SSD1_ININVOICE_INFO fpxxVo) {
		this.fpxxVo = fpxxVo;
	}
	public List<SSD1_PURCHASEPRO_LIST> getJx_spqd() {
		return jx_spqd;
	}
	public void setJx_spqd(List<SSD1_PURCHASEPRO_LIST> jx_spqd) {
		this.jx_spqd = jx_spqd;
	}
	@Override
	public String toString() {
		return  SID +"|+|" + SRC_SEQ_NUM + "|+|" + ENTNAME
				+ "|+|" + cjqj + "|+|" + jx_sl + "|+|"+ cgsp_jnxs + "|+|"+ jzd + "|+|"
				+ QUERY_SYS +"|+|"  + OPDATE;
	}
	
	

}
