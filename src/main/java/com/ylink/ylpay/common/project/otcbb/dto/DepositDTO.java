/**
 * 版权所有(C) 2013 証联融通电子有限公司
 * 创建:wanglei 2013-05-11
 */
package com.ylink.ylpay.common.project.otcbb.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * 
 * @author wanglei
 * @date 2013-05-11
 * @description：资金转入通知明细数据
 */
public class DepositDTO extends  BaseDTO{
	
	private static final long serialVersionUID = -5055363715210113349L;
	
	private String id;
	private String merchantId;
	private String bizNo;
	private String bizType;
	private String workDate;
	private String custId;
	private String bankType;
	private String paymentBankType;//付款方行别
	private String receiBankType;//收款方行别
	private String cardName;
	private String cardNo;
	private Long amount;
	private String status;
	private String auditStatus;
	private String auditMsg;
	private String payOrderNo;
	private String payMsg;
	private String checkStatus;
	private String isCallback;
	private Long callbackTimes;
	private String callbackDate;
	private Date createdTime;
	private String description;
	private String otcbbAccount;
	private String userNameText;
	private String vBankCustId;
	
	private Date queryBeginDate;
	private Date queryEndDate;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getBizNo() {
		return bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizType() {
		return bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getWorkDate() {
		return workDate;
	}
	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	public String getPaymentBankType() {
		return paymentBankType;
	}
	public void setPaymentBankType(String paymentBankType) {
		this.paymentBankType = paymentBankType;
	}
	public String getReceiBankType() {
		return receiBankType;
	}
	public void setReceiBankType(String receiBankType) {
		this.receiBankType = receiBankType;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getAuditMsg() {
		return auditMsg;
	}
	public void setAuditMsg(String auditMsg) {
		this.auditMsg = auditMsg;
	}
	public String getPayOrderNo() {
		return payOrderNo;
	}
	public void setPayOrderNo(String payOrderNo) {
		this.payOrderNo = payOrderNo;
	}
	public String getPayMsg() {
		return payMsg;
	}
	public void setPayMsg(String payMsg) {
		this.payMsg = payMsg;
	}
	public String getCheckStatus() {
		return checkStatus;
	}
	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}
	public String getIsCallback() {
		return isCallback;
	}
	public void setIsCallback(String isCallback) {
		this.isCallback = isCallback;
	}
	public String getCallbackDate() {
		return callbackDate;
	}
	public void setCallbackDate(String callbackDate) {
		this.callbackDate = callbackDate;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public Long getCallbackTimes() {
		return callbackTimes;
	}
	public void setCallbackTimes(Long callbackTimes) {
		this.callbackTimes = callbackTimes;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	public String getOtcbbAccount() {
		return otcbbAccount;
	}
	public void setOtcbbAccount(String otcbbAccount) {
		this.otcbbAccount = otcbbAccount;
	}
	public String getUserNameText() {
		return userNameText;
	}
	public void setUserNameText(String userNameText) {
		this.userNameText = userNameText;
	}
	public String getvBankCustId() {
		return vBankCustId;
	}
	public void setvBankCustId(String vBankCustId) {
		this.vBankCustId = vBankCustId;
	}
	public Date getQueryBeginDate() {
		return queryBeginDate;
	}
	public void setQueryBeginDate(Date queryBeginDate) {
		this.queryBeginDate = queryBeginDate;
	}
	public Date getQueryEndDate() {
		return queryEndDate;
	}
	public void setQueryEndDate(Date queryEndDate) {
		this.queryEndDate = queryEndDate;
	}
	
}
