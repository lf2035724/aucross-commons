/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Iquil 2012-10-29
 */

package com.ylink.ylpay.common.project.account.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author Iquil
 * @date 2012-10-29
 * @description：记账接口实体类
 */

public class AccountBookDTO extends BaseDTO {

	private static final long serialVersionUID = -4825325578728932668L;

	/**
	 * 记账接口流水ID
	 */
	private long bookId;
	
	/**
	 * 账期，YYYYMMDD
	 */
	private String accountDate;
	
	/**
	 * 交易订单编号
	 */
	private String orderId;
	
	/**
	 * 支付订单编号
	 */
	private String payId;

	/**
	 * 记账金额（必须大于0，否则报错）
	 */
	private long amount;
	
	/**
	 * 交易类型
	 */
	private String optCode;

	/**
	 * 支付编码
	 */
	private String dealCode;
	
	/**
	 * 辅助编码
	 */
	private String choiceCode;
	
	/**
	 * 借方科目
	 */
	private String drSubjectNo;
	
	/**
	 * 记账规则ID
	 */
	private String ruleId;

	/**
	 * 借方客户编号
	 */
	private String drCustId;

	/**
	 * 贷方科目
	 */
	private String crSubjectNo;

	/**
	 * 贷方客户编号
	 */
	private String crCustId;
	
	/**
	 * 付款方客户编号
	 */
	private String payerCustID;
	
	/**
	 * 收款方客户编号
	 */
	private String payeeCustID;
	
	/**
	 * 调用时间
	 */
	private Date bookTime;
	
	/**
	 * 记账状态
	 */
	private String bookState;
	
	/**
	 * 起始时间
	 */
	private String dateFrom;
	
	/**
	 * 终止时间
	 */
	private String dateTo;
	
	/**
	 * 记账来源
	 */
	private String bookSource;
	
	/**
	 * 付款方借贷标志
	 */
	private String payerFlag;
	
	public String getPayerFlag() {
		return payerFlag;
	}

	public void setPayerFlag(String payerFlag) {
		this.payerFlag = payerFlag;
	}

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}	
	
	public String getAccountDate() {
		return accountDate;
	}

	public void setAccountDate(String accountDate) {
		this.accountDate = accountDate;
	}

	public String getDrSubjectNo() {
		return drSubjectNo;
	}

	public void setDrSubjectNo(String drSubjectNo) {
		this.drSubjectNo = drSubjectNo;
	}

	public String getDrCustId() {
		return drCustId;
	}

	public void setDrCustId(String drCustId) {
		this.drCustId = drCustId;
	}

	public String getCrSubjectNo() {
		return crSubjectNo;
	}

	public void setCrSubjectNo(String crSubjectNo) {
		this.crSubjectNo = crSubjectNo;
	}

	public String getCrCustId() {
		return crCustId;
	}

	public void setCrCustId(String crCustId) {
		this.crCustId = crCustId;
	}

	public Date getBookTime() {
		return bookTime;
	}

	public void setBookTime(Date bookTime) {
		this.bookTime = bookTime;
	}

	public String getBookState() {
		return bookState;
	}

	public void setBookState(String bookState) {
		this.bookState = bookState;
	}

	public String getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}

	public String getDateTo() {
		return dateTo;
	}

	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPayId() {
		return payId;
	}

	public void setPayId(String payId) {
		this.payId = payId;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public String getOptCode() {
		return optCode;
	}

	public void setOptCode(String optCode) {
		this.optCode = optCode;
	}

	public String getDealCode() {
		return dealCode;
	}

	public void setDealCode(String dealCode) {
		this.dealCode = dealCode;
	}

	public String getChoiceCode() {
		return choiceCode;
	}

	public void setChoiceCode(String choiceCode) {
		this.choiceCode = choiceCode;
	}

	public String getRuleId() {
		return ruleId;
	}

	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public String getPayerCustID() {
		return payerCustID;
	}

	public void setPayerCustID(String payerCustID) {
		this.payerCustID = payerCustID;
	}

	public String getPayeeCustID() {
		return payeeCustID;
	}

	public void setPayeeCustID(String payeeCustID) {
		this.payeeCustID = payeeCustID;
	}

	public String getBookSource() {
		return bookSource;
	}

	public void setBookSource(String bookSource) {
		this.bookSource = bookSource;
	}
	
}
