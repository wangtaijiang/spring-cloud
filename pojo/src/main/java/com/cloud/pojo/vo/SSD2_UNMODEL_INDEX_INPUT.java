/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;

public class SSD2_UNMODEL_INDEX_INPUT implements Serializable {
	
		private String SID;
		private String SRC_SEQ_NUM;
		private String ENTNAME; 
		private String SYSTEM_USER_AUTH;
		private String EMP_NO;
		private String QUERY_REASON;
		
		private String CREDIT_CODE;
		private String NSR_ID;
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
		public String getSYSTEM_USER_AUTH() {
			return SYSTEM_USER_AUTH;
		}
		public void setSYSTEM_USER_AUTH(String sYSTEM_USER_AUTH) {
			SYSTEM_USER_AUTH = sYSTEM_USER_AUTH;
		}
		public String getEMP_NO() {
			return EMP_NO;
		}
		public void setEMP_NO(String eMP_NO) {
			EMP_NO = eMP_NO;
		}
		public String getQUERY_REASON() {
			return QUERY_REASON;
		}
		public void setQUERY_REASON(String qUERY_REASON) {
			QUERY_REASON = qUERY_REASON;
		}
		public String getCREDIT_CODE() {
			return CREDIT_CODE;
		}
		public void setCREDIT_CODE(String cREDIT_CODE) {
			CREDIT_CODE = cREDIT_CODE;
		}
		public String getNSR_ID() {
			return NSR_ID;
		}
		public void setNSR_ID(String nSR_ID) {
			NSR_ID = nSR_ID;
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
			return SYSTEM_USER_AUTH +"|+|" + EMP_NO + "|+|" + QUERY_REASON
					+ "|+|" + CREDIT_CODE +"|+|" + NSR_ID  ;
		}
		

	

}
