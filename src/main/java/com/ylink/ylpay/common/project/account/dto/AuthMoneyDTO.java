/**
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-10-25
 */

/**
 * AuthMoneyDTO.java
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-10-25
 */
package com.ylink.ylpay.common.project.account.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author feng.li
 * @date 2013-10-25
 * @description：金汇宝授信DTO
 */

/**
 * @author feng.li
 */
public class AuthMoneyDTO extends BaseDTO{
	
	private static final long serialVersionUID = 1902291606105512526L;

	private String id;

	private String custId;

	private Long authMoneyReDem;

	private Long redemUsed;

	private String redemStatus;

	private Long authMoneyPay;

	private Long payUsed;

	private String buyStatus;
	
	private String auditStatus;
	
	private Date createTime;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public Long getAuthMoneyReDem() {
		return authMoneyReDem;
	}

	public void setAuthMoneyReDem(Long authMoneyReDem) {
		this.authMoneyReDem = authMoneyReDem;
	}

	public Long getRedemUsed() {
		return redemUsed;
	}

	public void setRedemUsed(Long redemUsed) {
		this.redemUsed = redemUsed;
	}

	public Long getAuthMoneyPay() {
		return authMoneyPay;
	}

	public void setAuthMoneyPay(Long authMoneyPay) {
		this.authMoneyPay = authMoneyPay;
	}

	public Long getPayUsed() {
		return payUsed;
	}

	public void setPayUsed(Long payUsed) {
		this.payUsed = payUsed;
	}
	
	public String getRedemStatus() {
		return redemStatus;
	}

	public void setRedemStatus(String redemStatus) {
		this.redemStatus = redemStatus;
	}

	public String getBuyStatus() {
		return buyStatus;
	}

	public void setBuyStatus(String buyStatus) {
		this.buyStatus = buyStatus;
	}

	public String getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
}
