/**
 * 版权所有(C) 2014 证联融通电子有限公司
 * 创建:yu.han 2014-10-11
 */

/**
 * TradeDetailDTO.java
 * 版权所有(C) 2014 证联支付有限责任公司
 * 创建:yu.han 2014-10-11
 */
package com.ylink.ylpay.common.project.supervision.dto;

import java.util.Date;


/** 
 * @author yu.han
 * @date 2014-10-11
 * @description：TODO
 */

/**
 * @author yu.han 
 * @date 2014-10-11
 */
public class TradeDetailDTO extends AbstractDTO {
	private Long id;

    private Integer batchId;

    private Long monitorId;

    private String status;

    private String bankCode;

    private String bankSn;

    private String tradeDate;

    private String bankAccount;

    private String payMerchantAccNo;

    private String payMerchantAccName;

    private String accountType;

    private String amt;

    private String tradeType;

    private String tradeSn;

    private String orderId;

    private String remark;

    private String operationType;

    private Date createdTime;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String reconSyncDefect;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the batchId
	 */
	public Integer getBatchId() {
		return batchId;
	}
	/**
	 * @param batchId the batchId to set
	 */
	public void setBatchId(Integer batchId) {
		this.batchId = batchId;
	}
	/**
	 * @return the monitorId
	 */
	public Long getMonitorId() {
		return monitorId;
	}
	/**
	 * @param monitorId the monitorId to set
	 */
	public void setMonitorId(Long monitorId) {
		this.monitorId = monitorId;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the bankCode
	 */
	public String getBankCode() {
		return bankCode;
	}
	/**
	 * @param bankCode the bankCode to set
	 */
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	/**
	 * @return the bankSn
	 */
	public String getBankSn() {
		return bankSn;
	}
	/**
	 * @param bankSn the bankSn to set
	 */
	public void setBankSn(String bankSn) {
		this.bankSn = bankSn;
	}
	/**
	 * @return the tradeDate
	 */
	public String getTradeDate() {
		return tradeDate;
	}
	/**
	 * @param tradeDate the tradeDate to set
	 */
	public void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
	}
	/**
	 * @return the bankAccount
	 */
	public String getBankAccount() {
		return bankAccount;
	}
	/**
	 * @param bankAccount the bankAccount to set
	 */
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	/**
	 * @return the payMerchantAccNo
	 */
	public String getPayMerchantAccNo() {
		return payMerchantAccNo;
	}
	/**
	 * @param payMerchantAccNo the payMerchantAccNo to set
	 */
	public void setPayMerchantAccNo(String payMerchantAccNo) {
		this.payMerchantAccNo = payMerchantAccNo;
	}
	/**
	 * @return the payMerchantAccName
	 */
	public String getPayMerchantAccName() {
		return payMerchantAccName;
	}
	/**
	 * @param payMerchantAccName the payMerchantAccName to set
	 */
	public void setPayMerchantAccName(String payMerchantAccName) {
		this.payMerchantAccName = payMerchantAccName;
	}
	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}
	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	/**
	 * @return the amt
	 */
	public String getAmt() {
		return amt;
	}
	/**
	 * @param amt the amt to set
	 */
	public void setAmt(String amt) {
		this.amt = amt;
	}
	/**
	 * @return the tradeType
	 */
	public String getTradeType() {
		return tradeType;
	}
	/**
	 * @param tradeType the tradeType to set
	 */
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}
	/**
	 * @return the tradeSn
	 */
	public String getTradeSn() {
		return tradeSn;
	}
	/**
	 * @param tradeSn the tradeSn to set
	 */
	public void setTradeSn(String tradeSn) {
		this.tradeSn = tradeSn;
	}
	/**
	 * @return the orderId
	 */
	public String getOrderId() {
		return orderId;
	}
	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * @return the operationType
	 */
	public String getOperationType() {
		return operationType;
	}
	/**
	 * @param operationType the operationType to set
	 */
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}
	/**
	 * @return the createdTime
	 */
	public Date getCreatedTime() {
		return createdTime;
	}
	/**
	 * @param createdTime the createdTime to set
	 */
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * @return the reconSyncDefect
	 */
	public String getReconSyncDefect() {
		return reconSyncDefect;
	}
	/**
	 * @param reconSyncDefect the reconSyncDefect to set
	 */
	public void setReconSyncDefect(String reconSyncDefect) {
		this.reconSyncDefect = reconSyncDefect;
	}
	
}
