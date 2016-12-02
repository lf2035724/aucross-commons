/*******************************************************************************
 * Project   : aucross-common
 * Class Name: com.ylink.ylpay.common.project.settle.dto.AccountCapitalBillReportDTO
 * Created By: 杜波 159-9965-3650
 * Created on: 2013-4-2 下午4:54:33
 * Copyright © 2010-2012 证联融通 All rights reserved.
 ******************************************************************************/
package com.ylink.ylpay.common.project.settle.dto;
import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * <P>商户资金往来流水日报DTO</P>
 * @author 杜波 159-9965-3650
 * @description：
 */
public class AccountCapitalBillReportDTO extends BaseDTO {

	private static final long serialVersionUID = 751780933313895945L;
	/**
	 * 帐务日期
	 */
	private String accountDate;
	/**
	 * 业务编码
	 */
	private String businessCode;
	/**
	 * 银行类别
	 */
	private String bankType;
	/**
	 * 银行名称
	 */
	private String bankName;
	/**
	 * 前一天金额
	 */
	private Long lastAmount;
	/**
	 * 当日金额
	 */
	private Long nowAmount;
	/**
	 * 收入
	 */
	private Long incomeAmount;
	/**
	 * 支出
	 */
	private Long payAmount;
	/**
	 * 金额
	 */
	private Long amount;
	public String getAccountDate() {
		return accountDate;
	}
	public void setAccountDate(String accountDate) {
		this.accountDate = accountDate;
	}
	public String getBusinessCode() {
		return businessCode;
	}
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public Long getLastAmount() {
		return lastAmount;
	}
	public void setLastAmount(Long lastAmount) {
		this.lastAmount = lastAmount;
	}
	public Long getNowAmount() {
		return nowAmount;
	}
	public void setNowAmount(Long nowAmount) {
		this.nowAmount = nowAmount;
	}
	public Long getIncomeAmount() {
		return incomeAmount;
	}
	public void setIncomeAmount(Long incomeAmount) {
		this.incomeAmount = incomeAmount;
	}
	public Long getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(Long payAmount) {
		this.payAmount = payAmount;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
}
