/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 */

package com.ylink.ylpay.common.project.mp.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;
import com.ylink.ylpay.common.project.mp.constant.MerchantStatus;

/**
 * @author YangXiaojin
 * @date 2012-10-31
 * @description：商户
 */
public class Merchant extends BaseDTO {

	private static final long serialVersionUID = 4098616999122227418L;

	private String id;

	/**
	 * 商户编号
	 */
	private String code;

	/**
	 * 商户名称
	 */
	private String name;

	/**
	 * 商户数字证书
	 */
	private byte[] digitalCertificate;

	/**
	 * 证书更新时间
	 */
	private Date certUpdateTime;

	/**
	 * 商户状态
	 */
	private MerchantStatus status;

	/** 商户. */
	private Enterprise cust;
	
	/** 商户对应机构ID */
	private String agencyId;
	
	/** 机构对应企业ID */
	private String agencyEnterpriseId;
	
	/** 银联mcc码 */
	private String CUPMCCCode;
	
	/** 银联商户号 */
	private String CUPMerchantNO;
	
	/** 商户简称 */
	private String merAbbr;
	
	/** 资金托管商户 */
	private String isFundManage;
	
	/** 商户在银联的备案名称. */
	private String CUPMerchantName;
	
	/** 商户在银联的商户类型（平台商或普通商户）.0普通类，1平台类 */
	private String CUPMerchantType;
	
	
	public String getAgencyEnterpriseId() {
		return agencyEnterpriseId;
	}

	public void setAgencyEnterpriseId(String agencyEnterpriseId) {
		this.agencyEnterpriseId = agencyEnterpriseId;
	}

	public String getAgencyId() {
		return agencyId;
	}

	public void setAgencyId(String agencyId) {
		this.agencyId = agencyId;
	}

	public String getId() {
		return id;
	}

	public void setId( String id ) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode( String code ) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName( String name ) {
		this.name = name;
	}

	public byte[] getDigitalCertificate() {
		return digitalCertificate;
	}

	public void setDigitalCertificate( byte[] digitalCertificate ) {
		this.digitalCertificate = digitalCertificate;
	}

	public Date getCertUpdateTime() {
		return certUpdateTime;
	}

	public void setCertUpdateTime( Date certUpdateTime ) {
		this.certUpdateTime = certUpdateTime;
	}

	public MerchantStatus getStatus() {
		return status;
	}

	public void setStatus( MerchantStatus status ) {
		this.status = status;
	}

	public Enterprise getCust() {
		return cust;
	}

	public void setCust( Enterprise cust ) {
		this.cust = cust;
	}

	public String getCUPMCCCode() {
		return CUPMCCCode;
	}

	public void setCUPMCCCode(String cUPMCCCode) {
		CUPMCCCode = cUPMCCCode;
	}

	public String getCUPMerchantNO() {
		return CUPMerchantNO;
	}

	public void setCUPMerchantNO(String cUPMerchantNO) {
		CUPMerchantNO = cUPMerchantNO;
	}

	public String getMerAbbr() {
		return merAbbr;
	}

	public void setMerAbbr(String merAbbr) {
		this.merAbbr = merAbbr;
	}

	public String getIsFundManage() {
		return isFundManage;
	}

	public void setIsFundManage(String isFundManage) {
		this.isFundManage = isFundManage;
	}

	public String getCUPMerchantName() {
		return CUPMerchantName;
	}

	public void setCUPMerchantName(String cUPMerchantName) {
		CUPMerchantName = cUPMerchantName;
	}

	public String getCUPMerchantType() {
		return CUPMerchantType;
	}

	public void setCUPMerchantType(String cUPMerchantType) {
		CUPMerchantType = cUPMerchantType;
	}

}