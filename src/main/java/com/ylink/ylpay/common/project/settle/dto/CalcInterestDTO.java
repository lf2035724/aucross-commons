/**
 * 版权所有(C) 2012 证联融通
 * 创建:HuAJ 2012-12-4
 */

package com.ylink.ylpay.common.project.settle.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author HuAJ
 * @date 2012-12-4
 * @description：TODO
 */

public class CalcInterestDTO extends BaseDTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 591188622064860128L;
	private String subAccountType;
	private String accountId;
	private String interestDate;
	private String forceFlag;
	public String getSubAccountType() {
		return subAccountType;
	}
	public void setSubAccountType(String subAccountType) {
		this.subAccountType = subAccountType;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getInterestDate() {
		return interestDate;
	}
	public void setInterestDate(String interestDate) {
		this.interestDate = interestDate;
	}
	public String getForceFlag() {
		return forceFlag;
	}
	public void setForceFlag(String forceFlag) {
		this.forceFlag = forceFlag;
	}

}
