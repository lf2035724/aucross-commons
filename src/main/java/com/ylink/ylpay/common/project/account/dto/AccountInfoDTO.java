/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Iquil 2012-11-2
 */

package com.ylink.ylpay.common.project.account.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author Iquil
 * @date 2012-11-2
 * @description：给门户使用的账户信息
 */

public class AccountInfoDTO extends BaseDTO {
	
	private static final long serialVersionUID = -529149027902251598L;
	
	/**
	 * 帐户ID
	 */
	private String accountId;
	
	/**
	 * 客户ID
	 */
	private String custId;

	/**
	 * 账户状态：00生效；01冻结；03禁止借记；04禁止贷记
	 */
	private String accountState;

	/**
	 * 账户金额
	 */
	private long cashAmount;
	private String showAmount;
	
	public String getShowAmount() {
		return showAmount;
	}

	public void setShowAmount(String showAmount) {
		this.showAmount = showAmount;
	}

	/**
	 * 创建时间
	 */
	private Date createTime;

	public String getAccountState() {
		return accountState;
	}

	public void setAccountState(String accountState) {
		this.accountState = accountState;
	}

	public long getCashAmount() {
		return cashAmount;
	}

	public void setCashAmount(long cashAmount) {
		this.cashAmount = cashAmount;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
}
