/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;
import java.util.List;

public class SSD1_T10_BACKWARD_LIST implements Serializable {
	private String SID;
	private String SRC_SEQ_NUM;
	private String ENTNAME ;  
	private String cjqj;
	private String QUERY_SYS;
	private String OPDATE;
	private SSD1_T10_BACKWARD_ANALY xyqytj;
	private List<SSD1_T10_BACKWARD_INFO> xysdqy;
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
	public SSD1_T10_BACKWARD_ANALY getXyqytj() {
		return xyqytj;
	}
	public void setXyqytj(SSD1_T10_BACKWARD_ANALY xyqytj) {
		this.xyqytj = xyqytj;
	}
	public List<SSD1_T10_BACKWARD_INFO> getXysdqy() {
		return xysdqy;
	}
	public void setXysdqy(List<SSD1_T10_BACKWARD_INFO> xysdqy) {
		this.xysdqy = xysdqy;
	}
	@Override
	public String toString() {
		return SID + "|+|"+ SRC_SEQ_NUM + "|+|" + ENTNAME
				+"|+|"  + cjqj +"|+|"+ QUERY_SYS + "|+|"+ OPDATE;
	}

}
