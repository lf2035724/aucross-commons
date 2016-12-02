package com.ylink.ylpay.common.project.mp.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;
import com.ylink.ylpay.common.project.mp.constant.CertificationType;
import com.ylink.ylpay.common.project.mp.constant.RecoveryAllowType;
import com.ylink.ylpay.common.project.mp.constant.RecoveryStatus;
import com.ylink.ylpay.common.project.mp.constant.RecoveryType;
import com.ylink.ylpay.common.project.mp.constant.WhetherStatus;

/**
 * 人工找回密码dto.
 * 
 * @author 潘瑞峥
 * @date 2013-1-4
 */
public class ManualRecovery extends BaseDTO {

	private static final long serialVersionUID = -3209949981575882375L;

	private String id;

	/** 关联个人客户id. */
	private String custId;

	/** 真实姓名. */
	private String name;

	/** 证件所在地id. */
	private String certGeoId;

	/** 证件类型. */
	private CertificationType certType;

	/** 证件号码. */
	private String certNo;

	/** 证件文件. */
	private byte[] certFile;

	/** 证件文件类型. */
	private RecoveryAllowType certFileType;

	/** 需找回项目. */
	private RecoveryType recoveryType;

	/** 邮箱. */
	private String email;

	/** 是否解绑手机. */
	private WhetherStatus unbindMobile;

	/** 手机. */
	private String mobile;

	/** 状态. */
	private RecoveryStatus status;

	/** 备注. */
	private String remark;

	public String getId() {
		return id;
	}

	public void setId( String id ) {
		this.id = id;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId( String custId ) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName( String name ) {
		this.name = name;
	}

	public String getCertGeoId() {
		return certGeoId;
	}

	public void setCertGeoId( String certGeoId ) {
		this.certGeoId = certGeoId;
	}

	public CertificationType getCertType() {
		return certType;
	}

	public void setCertType( CertificationType certType ) {
		this.certType = certType;
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

	public RecoveryType getRecoveryType() {
		return recoveryType;
	}

	public void setRecoveryType( RecoveryType recoveryType ) {
		this.recoveryType = recoveryType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail( String email ) {
		this.email = email;
	}

	public WhetherStatus getUnbindMobile() {
		return unbindMobile;
	}

	public void setUnbindMobile( WhetherStatus unbindMobile ) {
		this.unbindMobile = unbindMobile;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile( String mobile ) {
		this.mobile = mobile;
	}

	public RecoveryStatus getStatus() {
		return status;
	}

	public void setStatus( RecoveryStatus status ) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark( String remark ) {
		this.remark = remark;
	}

}