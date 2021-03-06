/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

public class SSD1_ININVOICE_INFO implements Serializable {
	private String SID;
	private String SRC_SEQ_NUM;
	private String ENTNAME;  
	private String fp_qdxx_sum;    
	private String fp_qdxx_count;   
	private String fp_qdxx_sum_rate;
	private String fp_count;        
	private String fp_sum;          
	private String fp_sum_rate;     
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
	public String getFp_qdxx_sum() {
		return fp_qdxx_sum;
	}
	public void setFp_qdxx_sum(String fp_qdxx_sum) {
		this.fp_qdxx_sum = fp_qdxx_sum;
	}
	public String getFp_qdxx_count() {
		return fp_qdxx_count;
	}
	public void setFp_qdxx_count(String fp_qdxx_count) {
		this.fp_qdxx_count = fp_qdxx_count;
	}
	public String getFp_qdxx_sum_rate() {
		return fp_qdxx_sum_rate;
	}
	public void setFp_qdxx_sum_rate(String fp_qdxx_sum_rate) {
		this.fp_qdxx_sum_rate = fp_qdxx_sum_rate;
	}
	public String getFp_count() {
		return fp_count;
	}
	public void setFp_count(String fp_count) {
		this.fp_count = fp_count;
	}
	public String getFp_sum() {
		return fp_sum;
	}
	public void setFp_sum(String fp_sum) {
		this.fp_sum = fp_sum;
	}
	public String getFp_sum_rate() {
		return fp_sum_rate;
	}
	public void setFp_sum_rate(String fp_sum_rate) {
		this.fp_sum_rate = fp_sum_rate;
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
				+ "|+|" + fp_qdxx_sum + "|+|" + fp_qdxx_count + "|+|"
				+ fp_qdxx_sum_rate + "|+|" + fp_count +"|+|" + fp_sum +  "|+|"+ fp_sum_rate
				+"|+|"  + QUERY_SYS + "|+|"+ OPDATE;
	}
	
	

}
