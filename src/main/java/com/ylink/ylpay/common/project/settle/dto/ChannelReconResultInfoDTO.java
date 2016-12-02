package com.ylink.ylpay.common.project.settle.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/*
 * 
 * @author jf.zhao
 * @date 2013-7-26
 * @description：网银对账统计结果
 */
public class ChannelReconResultInfoDTO extends BaseDTO {

	private static final long serialVersionUID = -7777731712150637959L;

	/**
	 * 对账日期
	 */
	private String accountDate;
	/**
	 * 开始日期
	 */
	private String beginAccountDateStr;
	/**
	 * 结束日期
	 */
	private String endAccountDateStr;

	/**
	 * 产品类型
	 */
	private String productType;

	private String virualCustid;
	/**
	 * 银行行别
	 */
	private String bankType;
	/**
	 * 账号
	 */
	private String bankAccount;

	/**
	 * 三级科目编号
	 */
	private String accountId;
	/**
	 * 应对账入账总笔数
	 */
	private String incomeTotalCount;
	/**
	 * 应对账入账总金额
	 */
	private String incomeTotalMoney;
	/**
	 * 应对账出账总笔数
	 */
	private String outTotalcount;
	/**
	 * 应对账出账总金额
	 */
	private String outTotalMoney;

	/**
	 * 银行应对账入账总笔数
	 */
	private String bankIncomeTotalCount;
	/**
	 * 银行应对账入账总金额
	 */
	private String bankIncomeTotalMoney;
	/**
	 * 银行应对账出账总笔数
	 */
	private String bankOutTotalcount;
	/**
	 * 银行应对账出账总金额
	 */
	private String bankOutTotalMoney;
	/**
	 * 入账平帐总笔数
	 */
	private String incomeBalanceTotalcount;
	/**
	 * 入账平账总金额
	 */
	private String incomeBalnceTotalMoney;
	/**
	 * 入账不平帐总笔数
	 */
	private String incomeUnBalanceTotalcount;
	/**
	 * 入账不平账总金额
	 */
	private String incomeUnBalnceTotalMoney;
	/**
	 * 出账平帐总笔数
	 */
	private String outBalanceTotalcount;
	/**
	 * 出账平账总金额
	 */
	private String outBalnceTotalMoney;
	/**
	 * 出账不平帐总笔数
	 */
	private String outUnBalanceTotalcount;
	/**
	 * 出账不平账总金额
	 */
	private String outUnBalnceTotalMoney;

	/**
	 * 入账未对账总笔数
	 */
	private String incomeUnReconTotalcount;
	/**
	 * 入账未对账总金额
	 */
	private String incomeUnReconTotalMoney;

	/**
	 * 出账未对账总笔数
	 */
	private String outUnReconTotalcount;
	/**
	 * 出账未对账总金额
	 */
	private String outUnReconTotalMoney;

	public String getAccountDate() {
		return accountDate;
	}

	public void setAccountDate(String accountDate) {
		this.accountDate = accountDate;
	}

	public String getBeginAccountDateStr() {
		return beginAccountDateStr;
	}

	public void setBeginAccountDateStr(String beginAccountDateStr) {
		this.beginAccountDateStr = beginAccountDateStr;
	}

	public String getEndAccountDateStr() {
		return endAccountDateStr;
	}

	public void setEndAccountDateStr(String endAccountDateStr) {
		this.endAccountDateStr = endAccountDateStr;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getIncomeTotalCount() {
		return incomeTotalCount;
	}

	public void setIncomeTotalCount(String incomeTotalCount) {
		this.incomeTotalCount = incomeTotalCount;
	}

	public String getIncomeTotalMoney() {
		return incomeTotalMoney;
	}

	public void setIncomeTotalMoney(String incomeTotalMoney) {
		this.incomeTotalMoney = incomeTotalMoney;
	}

	public String getOutTotalcount() {
		return outTotalcount;
	}

	public void setOutTotalcount(String outTotalcount) {
		this.outTotalcount = outTotalcount;
	}

	public String getOutTotalMoney() {
		return outTotalMoney;
	}

	public void setOutTotalMoney(String outTotalMoney) {
		this.outTotalMoney = outTotalMoney;
	}

	public String getBankIncomeTotalCount() {
		return bankIncomeTotalCount;
	}

	public void setBankIncomeTotalCount(String bankIncomeTotalCount) {
		this.bankIncomeTotalCount = bankIncomeTotalCount;
	}

	public String getBankIncomeTotalMoney() {
		return bankIncomeTotalMoney;
	}

	public void setBankIncomeTotalMoney(String bankIncomeTotalMoney) {
		this.bankIncomeTotalMoney = bankIncomeTotalMoney;
	}

	public String getBankOutTotalcount() {
		return bankOutTotalcount;
	}

	public void setBankOutTotalcount(String bankOutTotalcount) {
		this.bankOutTotalcount = bankOutTotalcount;
	}

	public String getBankOutTotalMoney() {
		return bankOutTotalMoney;
	}

	public void setBankOutTotalMoney(String bankOutTotalMoney) {
		this.bankOutTotalMoney = bankOutTotalMoney;
	}

	public String getIncomeBalanceTotalcount() {
		return incomeBalanceTotalcount;
	}

	public void setIncomeBalanceTotalcount(String incomeBalanceTotalcount) {
		this.incomeBalanceTotalcount = incomeBalanceTotalcount;
	}

	public String getIncomeBalnceTotalMoney() {
		return incomeBalnceTotalMoney;
	}

	public void setIncomeBalnceTotalMoney(String incomeBalnceTotalMoney) {
		this.incomeBalnceTotalMoney = incomeBalnceTotalMoney;
	}

	public String getIncomeUnBalanceTotalcount() {
		return incomeUnBalanceTotalcount;
	}

	public void setIncomeUnBalanceTotalcount(String incomeUnBalanceTotalcount) {
		this.incomeUnBalanceTotalcount = incomeUnBalanceTotalcount;
	}

	public String getIncomeUnBalnceTotalMoney() {
		return incomeUnBalnceTotalMoney;
	}

	public void setIncomeUnBalnceTotalMoney(String incomeUnBalnceTotalMoney) {
		this.incomeUnBalnceTotalMoney = incomeUnBalnceTotalMoney;
	}

	public String getOutBalanceTotalcount() {
		return outBalanceTotalcount;
	}

	public void setOutBalanceTotalcount(String outBalanceTotalcount) {
		this.outBalanceTotalcount = outBalanceTotalcount;
	}

	public String getOutBalnceTotalMoney() {
		return outBalnceTotalMoney;
	}

	public void setOutBalnceTotalMoney(String outBalnceTotalMoney) {
		this.outBalnceTotalMoney = outBalnceTotalMoney;
	}

	public String getOutUnBalanceTotalcount() {
		return outUnBalanceTotalcount;
	}

	public void setOutUnBalanceTotalcount(String outUnBalanceTotalcount) {
		this.outUnBalanceTotalcount = outUnBalanceTotalcount;
	}

	public String getOutUnBalnceTotalMoney() {
		return outUnBalnceTotalMoney;
	}

	public void setOutUnBalnceTotalMoney(String outUnBalnceTotalMoney) {
		this.outUnBalnceTotalMoney = outUnBalnceTotalMoney;
	}

	public String getIncomeUnReconTotalcount() {
		return incomeUnReconTotalcount;
	}

	public void setIncomeUnReconTotalcount(String incomeUnReconTotalcount) {
		this.incomeUnReconTotalcount = incomeUnReconTotalcount;
	}

	public String getIncomeUnReconTotalMoney() {
		return incomeUnReconTotalMoney;
	}

	public void setIncomeUnReconTotalMoney(String incomeUnReconTotalMoney) {
		this.incomeUnReconTotalMoney = incomeUnReconTotalMoney;
	}

	public String getOutUnReconTotalcount() {
		return outUnReconTotalcount;
	}

	public void setOutUnReconTotalcount(String outUnReconTotalcount) {
		this.outUnReconTotalcount = outUnReconTotalcount;
	}

	public String getOutUnReconTotalMoney() {
		return outUnReconTotalMoney;
	}

	public void setOutUnReconTotalMoney(String outUnReconTotalMoney) {
		this.outUnReconTotalMoney = outUnReconTotalMoney;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	@Override
	public String toString() {
		return "ChannelReconResultInfoDTO [accountDate=" + accountDate
				+ ", beginAccountDateStr=" + beginAccountDateStr
				+ ", endAccountDateStr=" + endAccountDateStr + ", productType="
				+ productType + ", virualCustid=" + virualCustid
				+ ", bankType=" + bankType + ", bankAccount=" + bankAccount
				+ ", accountId=" + accountId + ", incomeTotalCount="
				+ incomeTotalCount + ", incomeTotalMoney=" + incomeTotalMoney
				+ ", outTotalcount=" + outTotalcount + ", outTotalMoney="
				+ outTotalMoney + ", bankIncomeTotalCount="
				+ bankIncomeTotalCount + ", bankIncomeTotalMoney="
				+ bankIncomeTotalMoney + ", bankOutTotalcount="
				+ bankOutTotalcount + ", bankOutTotalMoney="
				+ bankOutTotalMoney + ", incomeBalanceTotalcount="
				+ incomeBalanceTotalcount + ", incomeBalnceTotalMoney="
				+ incomeBalnceTotalMoney + ", incomeUnBalanceTotalcount="
				+ incomeUnBalanceTotalcount + ", incomeUnBalnceTotalMoney="
				+ incomeUnBalnceTotalMoney + ", outBalanceTotalcount="
				+ outBalanceTotalcount + ", outBalnceTotalMoney="
				+ outBalnceTotalMoney + ", outUnBalanceTotalcount="
				+ outUnBalanceTotalcount + ", outUnBalnceTotalMoney="
				+ outUnBalnceTotalMoney + ", incomeUnReconTotalcount="
				+ incomeUnReconTotalcount + ", incomeUnReconTotalMoney="
				+ incomeUnReconTotalMoney + ", outUnReconTotalcount="
				+ outUnReconTotalcount + ", outUnReconTotalMoney="
				+ outUnReconTotalMoney + "]";
	}

	public String getVirualCustid() {
		return virualCustid;
	}

	public void setVirualCustid(String virualCustid) {
		this.virualCustid = virualCustid;
	}

}
