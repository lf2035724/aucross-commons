/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Iquil 2012-11-13
 */

package com.ylink.ylpay.common.project.account.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author Iquil
 * @date 2012-11-13
 * @description：记账接口返回实体类
 */

public class AccountBookReturnDTO extends BaseDTO {

	private static final long serialVersionUID = 3420520394908831739L;
	
	/**
	 * 支付订单编号
	 */
	private String payId;

	/**
	 * 付款方账户余额（以分为单位）
	 */
	private long payerAmount;
	
	/**
	 * 收款方账户余额（以分为单位）
	 */
	private long payeeAmount;
	
	/**
	 * 记账日期
	 */
	private String accountDate;
	
	/**
	 * 记账标志
	 */
	private boolean accountFlag;
	
	public String getAccountDate() {
		return accountDate;
	}

	public void setAccountDate(String accountDate) {
		this.accountDate = accountDate;
	}

	public String getPayId() {
		return payId;
	}

	public void setPayId(String payId) {
		this.payId = payId;
	}

	public long getPayerAmount() {
		return payerAmount;
	}

	public void setPayerAmount(long payerAmount) {
		this.payerAmount = payerAmount;
	}

	public long getPayeeAmount() {
		return payeeAmount;
	}

	public void setPayeeAmount(long payeeAmount) {
		this.payeeAmount = payeeAmount;
	}

	public boolean isAccountFlag() {
		return accountFlag;
	}

	public void setAccountFlag(boolean accountFlag) {
		this.accountFlag = accountFlag;
	}

	
}
