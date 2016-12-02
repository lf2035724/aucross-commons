/**
 * 版权所有(C) 2012 证联融通
 * 创建:HuAJ 2012-12-12
 */

package com.ylink.ylpay.common.project.settle.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author ZhangDM(Mingly)
 * @date 2013-1-5
 * @description：账户余额信息DTO
 */

public class AccountBalanceInfoDTO extends BaseDTO {
	
	private static final long serialVersionUID = 1L;
	
	private String custId;
	
	private String custName;
	
	private String credentialsType;
	
	private String identityCardNumber;
	
	private long balance;

    private long lastBalance;

    private long drAmount;//借方发生总额

    private long crAmount;//贷方发生总额

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCredentialsType() {
		return credentialsType;
	}

	public void setCredentialsType(String credentialsType) {
		this.credentialsType = credentialsType;
	}

	public String getIdentityCardNumber() {
		return identityCardNumber;
	}

	public void setIdentityCardNumber(String identityCardNumber) {
		this.identityCardNumber = identityCardNumber;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public long getLastBalance() {
		return lastBalance;
	}

	public void setLastBalance(long lastBalance) {
		this.lastBalance = lastBalance;
	}

	public long getDrAmount() {
		return drAmount;
	}

	public void setDrAmount(long drAmount) {
		this.drAmount = drAmount;
	}

	public long getCrAmount() {
		return crAmount;
	}

	public void setCrAmount(long crAmount) {
		this.crAmount = crAmount;
	}
    
    
    
}
