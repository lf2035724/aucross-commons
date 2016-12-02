package com.ylink.ylpay.common.project.mp.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;
import com.ylink.ylpay.common.project.mp.constant.CertificationType;
import com.ylink.ylpay.common.project.mp.constant.RecoveryAllowType;

/**
 * 客户证件DTO.
 * 
 * @author 潘瑞峥
 * @date 2013-1-16
 */
public class CustCertBean extends BaseDTO {

	private static final long serialVersionUID = 233427299506156267L;

	private String identity;

	/** 客户id. */
	private String custId;

	/** 证件类型. */
	private CertificationType certType;

	/** 证件名称(暂时可不用). */
	private String certName;

	/** 证件号码. */
	private String certNo;

	/** 证件文件. */
	private byte[] certFile;

	/** 文件类型. */
	private RecoveryAllowType certFileType;

	public String getIdentity() {
		return identity;
	}

	public void setIdentity( String identity ) {
		this.identity = identity;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId( String custId ) {
		this.custId = custId;
	}

	public CertificationType getCertType() {
		return certType;
	}

	public void setCertType( CertificationType certType ) {
		this.certType = certType;
	}

	public String getCertName() {
		return certName;
	}

	public void setCertName( String certName ) {
		this.certName = certName;
	}

	public String getCertNo() {
		return certNo;
	}

	public void setCertNo( String certNo ) {
		this.certNo = certNo;
	}

	public byte[] getCertFile() {
		return certFile;
	}

	public void setCertFile( byte[] certFile ) {
		this.certFile = certFile;
	}

	public RecoveryAllowType getCertFileType() {
		return certFileType;
	}

	public void setCertFileType( RecoveryAllowType certFileType ) {
		this.certFileType = certFileType;
	}

}