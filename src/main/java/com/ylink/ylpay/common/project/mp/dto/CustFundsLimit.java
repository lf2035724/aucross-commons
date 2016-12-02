package com.ylink.ylpay.common.project.mp.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;


/**
 * 客户资金限额DTO.
 * 
 * @author 潘瑞峥
 * @date 2012-11-26
 */
public class CustFundsLimit extends BaseDTO {

	private static final long serialVersionUID = -2290007806366521256L;
	
	//private String identity;

	/** 关联用户T_CUST_USER */
	private String custId;

	/** 关联帐户类型T_ACCOUNT_TYPE */
	private String accType;

	/** 关联交易类型T_BUSINESS_TYPE */
	private String businessId;

	/** 单笔警告额（单位：分） */
	private Long singleWarn;

	/** 每天警告额（单位：分） */
	private Long dayWarn;

	/** 单笔限额（单位：分） */
	private Long singleLimit;

	/** 每天限制（单位：分） */
	private Long dayLimit;

	/** 每月警告额（单位：分） */
	private Long monthWarn;

	/** 每月限制（单位：分） */
	private Long monthLimit;

	public String getCustId() {
		return custId;
	}

	public void setCustId( String custId ) {
		this.custId = custId;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType( String accType ) {
		this.accType = accType;
	}

	public String getBusinessId() {
		return businessId;
	}

	public void setBusinessId( String businessId ) {
		this.businessId = businessId;
	}

	public Long getSingleWarn() {
		return singleWarn;
	}

	public void setSingleWarn( Long singleWarn ) {
		this.singleWarn = singleWarn;
	}

	public Long getDayWarn() {
		return dayWarn;
	}

	public void setDayWarn( Long dayWarn ) {
		this.dayWarn = dayWarn;
	}

	public Long getSingleLimit() {
		return singleLimit;
	}

	public void setSingleLimit( Long singleLimit ) {
		this.singleLimit = singleLimit;
	}

	public Long getDayLimit() {
		return dayLimit;
	}

	public void setDayLimit( Long dayLimit ) {
		this.dayLimit = dayLimit;
	}

	public Long getMonthWarn() {
		return monthWarn;
	}

	public void setMonthWarn( Long monthWarn ) {
		this.monthWarn = monthWarn;
	}

	public Long getMonthLimit() {
		return monthLimit;
	}

	public void setMonthLimit( Long monthLimit ) {
		this.monthLimit = monthLimit;
	}




}