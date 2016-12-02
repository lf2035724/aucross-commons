/**
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-10-25
 */

/**
 * AuthMoneyDTO.java
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-10-25
 */
package com.ylink.ylpay.common.project.mp.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;
import com.ylink.ylpay.common.project.mp.constant.AuthMoneyStatus;

/** 
 * @author feng.li
 * @date 2013-10-25
 * @description：金汇宝授信DTO
 */

/**
 * @author feng.li
 */
public class AuthMoneyDTO extends BaseDTO{
	
	private static final long serialVersionUID = 9030406801349564958L;

	private String identity;

	private String custId;

	private Long authMoneyReDem;

	private Long redemUsed;

	private AuthMoneyStatus redemStatus;

	private Long authMoneyPay;

	private Long payUsed;

	private AuthMoneyStatus buyStatus;
	
	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}
	
	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public long getAuthMoneyReDem() {
		return authMoneyReDem;
	}

	public void setAuthMoneyReDem(long authMoneyReDem) {
		this.authMoneyReDem = authMoneyReDem;
	}

	public long getRedemUsed() {
		return redemUsed;
	}

	public void setRedemUsed(long redemUsed) {
		this.redemUsed = redemUsed;
	}

	public AuthMoneyStatus getRedemStatus() {
		return redemStatus;
	}

	public void setRedemStatus(AuthMoneyStatus redemStatus) {
		this.redemStatus = redemStatus;
	}

	public long getAuthMoneyPay() {
		return authMoneyPay;
	}

	public void setAuthMoneyPay(long authMoneyPay) {
		this.authMoneyPay = authMoneyPay;
	}

	public long getPayUsed() {
		return payUsed;
	}

	public void setPayUsed(long payUsed) {
		this.payUsed = payUsed;
	}

	public AuthMoneyStatus getBuyStatus() {
		return buyStatus;
	}

	public void setBuyStatus(AuthMoneyStatus buyStatus) {
		this.buyStatus = buyStatus;
	}
}
