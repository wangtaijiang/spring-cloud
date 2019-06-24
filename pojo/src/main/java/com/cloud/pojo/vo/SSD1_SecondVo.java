/*
 * Copyright (C) 2019 SuperH, Inc. All Rights Reserved.
 */
package com.cloud.pojo.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @authur wtj
 * @date 2019/5/14    9:26
 */
public class SSD1_SecondVo extends IXNBaseVo implements Serializable {
    
    private SSD1_JUDICIAL_INFO ALL;
    private SSD1_SIGNINFO QDXX;
    private SSD1_SALEPROD_ANALY ZYSPFX;
    private SSD1_ENTINFO JBXX;
    private SSD1_AREA_INDUSTRY_RANK QYHYPM;
    private SSD1_T10_BACKWARD_LIST QSDXYQY;
    private SSD1_T10_ADVAN_LIST QSDSYQY;
    private SSD1_ENT_REMARK  QyxxHz;
    private SSD1_INDEX IXNZS;
    private SSD1_PURCHASEPRO_ANALY CGSPFX;
    private SSD1_REPORT GLOBAL;
    private SSD1_CATEGOR_ANALY SPFLFX;
    private SSD1_AREA_INDUSTRY SSQYHY;
    
    private List<SSD1_ADVAN_TYPE_DISTRI> SYLXFB;
    private List<SSD1_LAWINFO> LAWINFO;
    private List<SSD1_TAX_ARREARS_INFO> QSXX;
    private List<SSD1_T10_NPUR_TAXIDENNUM_CUST> FYBNSR;
    private List<SSD1_STOCK_FREEZE_INFO> FREEZEINFO;
    private List<SSD1_GAS_CHARGE> RQZC;
    private List<SSD1_JUDICIAL_DOC> CPWS;
    private List<SSD1_CHGINFO> CHGINFO;
    private List<SSD1_ININVOICE_ANALY> JXFPSJTJ;
    private List<SSD1_WATER_CHARGE> SFZC;
    private List<SSD1_ENT_ABNOPERA> EXCEINFO;
    private List<SSD1_INTAX_STATISTICS> JXFPSLTJ;
    private List<SSD1_NL_NEGATIVE_INFO> WDHMD;
    private List<SSD1_BACKWARD_AREA_DISTRI>  XYDYFB;
    private List<SSD1_BREAK_FAITH_ANNOUNCE>  SXGG;
    private List<SSD1_PROPERTY_PAY> WYZC;
    private List<SSD1_COLLINVO_STATIC> QYZTXX;
    private List<SSD1_HCOURT_NOTICE> KTGG;
    private List<SSD1_BRANCH>  FZJG;
    private List<SSD1_ELEC_CHARGE>  DFZC;
    private List<SSD1_EXEC_ANNOUNCE>   ZXGG;
    private List<SSD1_BACKWARD_INDUSTRY_DISTRI> XYHYFB;
    private List<SSD1_LEGINFO> LEGINFO;
    private List<SSD1_EQUITY_PLEDG_INFO>  EQUINFO;
    private List<SSD1_THERMAL_CHARGE> RLZC;
    private List<SSD1_ADVAN_AGE_DISTRI> SYNLFB;
    private List<SSD1_BACKWARD_AGE_DISTRI> XYNLFB;
    private List<SSD1_COURT_NOTICE> FYGG;
    private List<SSD1_COUBANK_INFO> YHZH;
    private List<SSD1_SALEINVOICE_RATE> XXFPSLTJ;
    private List<SSD1_ADVAN_INDUSTRY_DISTRI> SYHYFB;
    private List<SSD1_TAX_ILLEGAL> WFWZ;
    private List<SSD1_SALEINVOICE_ANALY> XXFPSJTJ;
    private List<SSD1_TRANSPORT_STORAGE_PAY> YSJCC;
    private List<SSD1_ADVAN_AREA_DISTRI> SYDYFB;
    private List<SSD1_CHATTEL_MORT_INFO> MORTINFO;
    private List<SSD1_CONTACE_INFO> lxrList;
    private List<SSD1_PUNINFO> PUNINFO;
    private List<SSD1_PERINFO> PERINFO;
    private List<SSD1_BACKWARD_TYPE_DISTRI> XYLXFB;
    private List<SSD1_UNNORMAL_USER_INFO>FZCHXX;
    private List<SSD1_CASEFLOW_INFO> AJLC;
    
	public List<SSD1_LAWINFO> getLAWINFO() {
		return LAWINFO;
	}
	public void setLAWINFO(List<SSD1_LAWINFO> lAWINFO) {
		LAWINFO = lAWINFO;
	}
	public SSD1_JUDICIAL_INFO getALL() {
		return ALL;
	}
	public void setALL(SSD1_JUDICIAL_INFO aLL) {
		ALL = aLL;
	}
	public List<SSD1_ADVAN_TYPE_DISTRI> getSYLXFB() {
		return SYLXFB;
	}
	public void setSYLXFB(List<SSD1_ADVAN_TYPE_DISTRI> sYLXFB) {
		SYLXFB = sYLXFB;
	}
	public List<SSD1_TAX_ARREARS_INFO> getQSXX() {
		return QSXX;
	}
	public void setQSXX(List<SSD1_TAX_ARREARS_INFO> qSXX) {
		QSXX = qSXX;
	}
	public List<SSD1_T10_NPUR_TAXIDENNUM_CUST> getFYBNSR() {
		return FYBNSR;
	}
	public void setFYBNSR(List<SSD1_T10_NPUR_TAXIDENNUM_CUST> fYBNSR) {
		FYBNSR = fYBNSR;
	}
	public List<SSD1_STOCK_FREEZE_INFO> getFREEZEINFO() {
		return FREEZEINFO;
	}
	public void setFREEZEINFO(List<SSD1_STOCK_FREEZE_INFO> fREEZEINFO) {
		FREEZEINFO = fREEZEINFO;
	}
	public List<SSD1_GAS_CHARGE> getRQZC() {
		return RQZC;
	}
	public void setRQZC(List<SSD1_GAS_CHARGE> rQZC) {
		RQZC = rQZC;
	}
	public SSD1_SALEPROD_ANALY getZYSPFX() {
		return ZYSPFX;
	}
	public void setZYSPFX(SSD1_SALEPROD_ANALY zYSPFX) {
		ZYSPFX = zYSPFX;
	}
	public SSD1_T10_ADVAN_LIST getQSDSYQY() {
		return QSDSYQY;
	}
	public void setQSDSYQY(SSD1_T10_ADVAN_LIST qSDSYQY) {
		QSDSYQY = qSDSYQY;
	}
	public List<SSD1_JUDICIAL_DOC> getCPWS() {
		return CPWS;
	}
	public void setCPWS(List<SSD1_JUDICIAL_DOC> cPWS) {
		CPWS = cPWS;
	}
	public List<SSD1_CHGINFO> getCHGINFO() {
		return CHGINFO;
	}
	public void setCHGINFO(List<SSD1_CHGINFO> cHGINFO) {
		CHGINFO = cHGINFO;
	}
	public List<SSD1_ININVOICE_ANALY> getJXFPSJTJ() {
		return JXFPSJTJ;
	}
	public void setJXFPSJTJ(List<SSD1_ININVOICE_ANALY> jXFPSJTJ) {
		JXFPSJTJ = jXFPSJTJ;
	}
	public SSD1_ENTINFO getJBXX() {
		return JBXX;
	}
	public void setJBXX(SSD1_ENTINFO jBXX) {
		JBXX = jBXX;
	}
	public List<SSD1_WATER_CHARGE> getSFZC() {
		return SFZC;
	}
	public void setSFZC(List<SSD1_WATER_CHARGE> sFZC) {
		SFZC = sFZC;
	}
	public List<SSD1_ENT_ABNOPERA> getEXCEINFO() {
		return EXCEINFO;
	}
	public void setEXCEINFO(List<SSD1_ENT_ABNOPERA> eXCEINFO) {
		EXCEINFO = eXCEINFO;
	}
	public List<SSD1_INTAX_STATISTICS> getJXFPSLTJ() {
		return JXFPSLTJ;
	}
	public void setJXFPSLTJ(List<SSD1_INTAX_STATISTICS> jXFPSLTJ) {
		JXFPSLTJ = jXFPSLTJ;
	}
	public List<SSD1_NL_NEGATIVE_INFO> getWDHMD() {
		return WDHMD;
	}
	public void setWDHMD(List<SSD1_NL_NEGATIVE_INFO> wDHMD) {
		WDHMD = wDHMD;
	}
	public List<SSD1_BACKWARD_AREA_DISTRI> getXYDYFB() {
		return XYDYFB;
	}
	public void setXYDYFB(List<SSD1_BACKWARD_AREA_DISTRI> xYDYFB) {
		XYDYFB = xYDYFB;
	}
	public List<SSD1_BREAK_FAITH_ANNOUNCE> getSXGG() {
		return SXGG;
	}
	public void setSXGG(List<SSD1_BREAK_FAITH_ANNOUNCE> sXGG) {
		SXGG = sXGG;
	}
	public List<SSD1_PROPERTY_PAY> getWYZC() {
		return WYZC;
	}
	public void setWYZC(List<SSD1_PROPERTY_PAY> wYZC) {
		WYZC = wYZC;
	}
	public SSD1_T10_BACKWARD_LIST getQSDXYQY() {
		return QSDXYQY;
	}
	public void setQSDXYQY(SSD1_T10_BACKWARD_LIST qSDXYQY) {
		QSDXYQY = qSDXYQY;
	}
	public List<SSD1_COLLINVO_STATIC> getQYZTXX() {
		return QYZTXX;
	}
	public void setQYZTXX(List<SSD1_COLLINVO_STATIC> qYZTXX) {
		QYZTXX = qYZTXX;
	}
	public List<SSD1_HCOURT_NOTICE> getKTGG() {
		return KTGG;
	}
	public void setKTGG(List<SSD1_HCOURT_NOTICE> kTGG) {
		KTGG = kTGG;
	}
	public List<SSD1_BRANCH> getFZJG() {
		return FZJG;
	}
	public void setFZJG(List<SSD1_BRANCH> fZJG) {
		FZJG = fZJG;
	}
	public List<SSD1_ELEC_CHARGE> getDFZC() {
		return DFZC;
	}
	public void setDFZC(List<SSD1_ELEC_CHARGE> dFZC) {
		DFZC = dFZC;
	}
	public List<SSD1_EXEC_ANNOUNCE> getZXGG() {
		return ZXGG;
	}
	public void setZXGG(List<SSD1_EXEC_ANNOUNCE> zXGG) {
		ZXGG = zXGG;
	}
	public SSD1_AREA_INDUSTRY_RANK getQYHYPM() {
		return QYHYPM;
	}
	public void setQYHYPM(SSD1_AREA_INDUSTRY_RANK qYHYPM) {
		QYHYPM = qYHYPM;
	}
	public SSD1_PURCHASEPRO_ANALY getCGSPFX() {
		return CGSPFX;
	}
	public void setCGSPFX(SSD1_PURCHASEPRO_ANALY cGSPFX) {
		CGSPFX = cGSPFX;
	}
	public List<SSD1_BACKWARD_INDUSTRY_DISTRI> getXYHYFB() {
		return XYHYFB;
	}
	public void setXYHYFB(List<SSD1_BACKWARD_INDUSTRY_DISTRI> xYHYFB) {
		XYHYFB = xYHYFB;
	}
	public List<SSD1_LEGINFO> getLEGINFO() {
		return LEGINFO;
	}
	public void setLEGINFO(List<SSD1_LEGINFO> lEGINFO) {
		LEGINFO = lEGINFO;
	}
	public List<SSD1_EQUITY_PLEDG_INFO> getEQUINFO() {
		return EQUINFO;
	}
	public void setEQUINFO(List<SSD1_EQUITY_PLEDG_INFO> eQUINFO) {
		EQUINFO = eQUINFO;
	}
	public SSD1_AREA_INDUSTRY getSSQYHY() {
		return SSQYHY;
	}
	public void setSSQYHY(SSD1_AREA_INDUSTRY sSQYHY) {
		SSQYHY = sSQYHY;
	}
	public List<SSD1_THERMAL_CHARGE> getRLZC() {
		return RLZC;
	}
	public void setRLZC(List<SSD1_THERMAL_CHARGE> rLZC) {
		RLZC = rLZC;
	}
	public List<SSD1_ADVAN_AGE_DISTRI> getSYNLFB() {
		return SYNLFB;
	}
	public void setSYNLFB(List<SSD1_ADVAN_AGE_DISTRI> sYNLFB) {
		SYNLFB = sYNLFB;
	}
	public List<SSD1_BACKWARD_AGE_DISTRI> getXYNLFB() {
		return XYNLFB;
	}
	public void setXYNLFB(List<SSD1_BACKWARD_AGE_DISTRI> xYNLFB) {
		XYNLFB = xYNLFB;
	}
	public List<SSD1_COURT_NOTICE> getFYGG() {
		return FYGG;
	}
	public void setFYGG(List<SSD1_COURT_NOTICE> fYGG) {
		FYGG = fYGG;
	}
	public List<SSD1_COUBANK_INFO> getYHZH() {
		return YHZH;
	}
	public void setYHZH(List<SSD1_COUBANK_INFO> yHZH) {
		YHZH = yHZH;
	}
	public List<SSD1_SALEINVOICE_RATE> getXXFPSLTJ() {
		return XXFPSLTJ;
	}
	public void setXXFPSLTJ(List<SSD1_SALEINVOICE_RATE> xXFPSLTJ) {
		XXFPSLTJ = xXFPSLTJ;
	}
	public SSD1_INDEX getIXNZS() {
		return IXNZS;
	}
	public void setIXNZS(SSD1_INDEX iXNZS) {
		IXNZS = iXNZS;
	}
	public SSD1_REPORT getGLOBAL() {
		return GLOBAL;
	}
	public void setGLOBAL(SSD1_REPORT gLOBAL) {
		GLOBAL = gLOBAL;
	}
	public List<SSD1_ADVAN_INDUSTRY_DISTRI> getSYHYFB() {
		return SYHYFB;
	}
	public void setSYHYFB(List<SSD1_ADVAN_INDUSTRY_DISTRI> sYHYFB) {
		SYHYFB = sYHYFB;
	}
	public List<SSD1_TAX_ILLEGAL> getWFWZ() {
		return WFWZ;
	}
	public void setWFWZ(List<SSD1_TAX_ILLEGAL> wFWZ) {
		WFWZ = wFWZ;
	}
	public List<SSD1_SALEINVOICE_ANALY> getXXFPSJTJ() {
		return XXFPSJTJ;
	}
	public void setXXFPSJTJ(List<SSD1_SALEINVOICE_ANALY> xXFPSJTJ) {
		XXFPSJTJ = xXFPSJTJ;
	}
	public List<SSD1_TRANSPORT_STORAGE_PAY> getYSJCC() {
		return YSJCC;
	}
	public void setYSJCC(List<SSD1_TRANSPORT_STORAGE_PAY> ySJCC) {
		YSJCC = ySJCC;
	}
	public SSD1_CATEGOR_ANALY getSPFLFX() {
		return SPFLFX;
	}
	public void setSPFLFX(SSD1_CATEGOR_ANALY sPFLFX) {
		SPFLFX = sPFLFX;
	}
	public List<SSD1_ADVAN_AREA_DISTRI> getSYDYFB() {
		return SYDYFB;
	}
	public void setSYDYFB(List<SSD1_ADVAN_AREA_DISTRI> sYDYFB) {
		SYDYFB = sYDYFB;
	}
	public SSD1_ENT_REMARK getQyxxHz() {
		return QyxxHz;
	}
	public void setQyxxHz(SSD1_ENT_REMARK qyxxHz) {
		QyxxHz = qyxxHz;
	}
	public List<SSD1_CHATTEL_MORT_INFO> getMORTINFO() {
		return MORTINFO;
	}
	public void setMORTINFO(List<SSD1_CHATTEL_MORT_INFO> mORTINFO) {
		MORTINFO = mORTINFO;
	}
	public List<SSD1_CONTACE_INFO> getLxrList() {
		return lxrList;
	}
	public void setLxrList(List<SSD1_CONTACE_INFO> lxrList) {
		this.lxrList = lxrList;
	}
	public SSD1_SIGNINFO getQDXX() {
		return QDXX;
	}
	public void setQDXX(SSD1_SIGNINFO qDXX) {
		QDXX = qDXX;
	}
	public List<SSD1_PUNINFO> getPUNINFO() {
		return PUNINFO;
	}
	public void setPUNINFO(List<SSD1_PUNINFO> pUNINFO) {
		PUNINFO = pUNINFO;
	}
	public List<SSD1_PERINFO> getPERINFO() {
		return PERINFO;
	}
	public void setPERINFO(List<SSD1_PERINFO> pERINFO) {
		PERINFO = pERINFO;
	}
	public List<SSD1_BACKWARD_TYPE_DISTRI> getXYLXFB() {
		return XYLXFB;
	}
	public void setXYLXFB(List<SSD1_BACKWARD_TYPE_DISTRI> xYLXFB) {
		XYLXFB = xYLXFB;
	}
	public List<SSD1_UNNORMAL_USER_INFO> getFZCHXX() {
		return FZCHXX;
	}
	public void setFZCHXX(List<SSD1_UNNORMAL_USER_INFO> fZCHXX) {
		FZCHXX = fZCHXX;
	}
	public List<SSD1_CASEFLOW_INFO> getAJLC() {
		return AJLC;
	}
	public void setAJLC(List<SSD1_CASEFLOW_INFO> aJLC) {
		AJLC = aJLC;
	}
    
    
    
}
