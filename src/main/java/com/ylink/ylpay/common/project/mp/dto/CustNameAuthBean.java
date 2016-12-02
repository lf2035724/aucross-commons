package com.ylink.ylpay.common.project.mp.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * 个人客户实名认证DTO.
 * 
 * @author 潘瑞峥
 * @date 2013-1-16
 */
public class CustNameAuthBean extends BaseDTO {

	private static final long serialVersionUID = 9172240258859735966L;

	/** 关联个人客户id. */
	private String custId;

	/** 客户证件. */
	private CustCertBean custCertBean;

	public String getCustId() {
		return custId;
	}

	public void setCustId( String custId ) {
		this.custId = custId;
	}

	public CustCertBean getCustCertBean() {
		return custCertBean;
	}

	public void setCustCertBean( CustCertBean custCertBean ) {
		this.custCertBean = custCertBean;
	}

}