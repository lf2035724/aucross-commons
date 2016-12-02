package com.ylink.ylpay.common.project.mp.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * 客户.
 * 
 * @author 潘瑞峥
 * @date 2012-10-29
 */
public class Customer extends BaseDTO {

	private static final long serialVersionUID = 8760604252159727638L;

	private String id;

	/** 支付密码 */
	private String payPassword;

	/** 姓名（个人/企业） */
	private String name;

	/** 证件类型（个人/企业） */
	private String credentialsType;

	/** 证件号码（个人/企业） */
	private String identityCardNumber;

	/** 冻结状态 */
	private String status;

	/** 认证状态 */
	private String certStatus;

	/**
	 * 创建时间
	 */
	private Date createDate;
	
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	public String getId() {
		return id;
	}

	public void setId( String id ) {
		this.id = id;
	}

	public String getPayPassword() {
		return payPassword;
	}

	public void setPayPassword( String payPassword ) {
		this.payPassword = payPassword;
	}

	public String getName() {
		return name;
	}

	public void setName( String name ) {
		this.name = name;
	}

	public String getCredentialsType() {
		return credentialsType;
	}

	public void setCredentialsType( String credentialsType ) {
		this.credentialsType = credentialsType;
	}

	public String getIdentityCardNumber() {
		return identityCardNumber;
	}

	public void setIdentityCardNumber( String identityCardNumber ) {
		this.identityCardNumber = identityCardNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus( String status ) {
		this.status = status;
	}

	public String getCertStatus() {
		return certStatus;
	}

	public void setCertStatus( String certStatus ) {
		this.certStatus = certStatus;
	}

}