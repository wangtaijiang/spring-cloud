/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

public class SSD2_FirstVo implements Serializable {
	private String errNum;
	private String errMsg;
	private String timeStamps;   
	private SSD2_UNMODEL_INDEX_CONTENT retData;
	private SSD2_UNMODEL_INDEX_INPUT INPUT;
	public String getErrNum() {
		return errNum;
	}
	public void setErrNum(String errNum) {
		this.errNum = errNum;
	}
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public String getTimeStamps() {
		return timeStamps;
	}
	public void setTimeStamps(String timeStamps) {
		this.timeStamps = timeStamps;
	}
	public SSD2_UNMODEL_INDEX_CONTENT getRetData() {
		return retData;
	}
	public void setRetData(SSD2_UNMODEL_INDEX_CONTENT retData) {
		this.retData = retData;
	}
	public SSD2_UNMODEL_INDEX_INPUT getINPUT() {
		return INPUT;
	}
	public void setINPUT(SSD2_UNMODEL_INDEX_INPUT iNPUT) {
		INPUT = iNPUT;
	}
	
	
}
