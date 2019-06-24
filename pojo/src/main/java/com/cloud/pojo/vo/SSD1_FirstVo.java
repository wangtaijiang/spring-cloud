/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

public class SSD1_FirstVo implements Serializable {

    private String msg;
    private String code;
    private SSD1_SecondVo content;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public SSD1_SecondVo getContent() {
		return content;
	}
	public void setContent(SSD1_SecondVo content) {
		this.content = content;
	}
    
}
