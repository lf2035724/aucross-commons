/**
 * 版权所有(C) 2014 证联融通电子有限公司
 * 创建:yu.han 2014-10-11
 */

/**
 * CapitalDetailDTO.java
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
public class CapitalDetailDTO extends AbstractDTO {
	private Long id;

    private Integer batchId;

    private Long monitorId;
    private String status;

    private String bankCode;

    private String bankSn;

    private String endFlag;

    private Long bankSeq;

    private String tradeDate;

    private String bankAccNo;

    private String bankAccName;

    private String accountType;

    private Long drAmt;

    private Long crAmt;

    private Long balance;

    private String remark;

    private String counterpartyAccNo;

    private String counterpartyAccName;

    private String operationType;

    private Date createdTime;

	private static final long serialVersionUID = -2678941516119063000L;

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
	 * @return the endFlag
	 */
	public String getEndFlag() {
		return endFlag;
	}

	/**
	 * @param endFlag the endFlag to set
	 */
	public void setEndFlag(String endFlag) {
		this.endFlag = endFlag;
	}

	/**
	 * @return the bankSeq
	 */
	public Long getBankSeq() {
		return bankSeq;
	}

	/**
	 * @param bankSeq the bankSeq to set
	 */
	public void setBankSeq(Long bankSeq) {
		this.bankSeq = bankSeq;
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
	 * @return the bankAccNo
	 */
	public String getBankAccNo() {
		return bankAccNo;
	}

	/**
	 * @param bankAccNo the bankAccNo to set
	 */
	public void setBankAccNo(String bankAccNo) {
		this.bankAccNo = bankAccNo;
	}

	/**
	 * @return the bankAccName
	 */
	public String getBankAccName() {
		return bankAccName;
	}

	/**
	 * @param bankAccName the bankAccName to set
	 */
	public void setBankAccName(String bankAccName) {
		this.bankAccName = bankAccName;
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
	 * @return the drAmt
	 */
	public Long getDrAmt() {
		return drAmt;
	}

	/**
	 * @param drAmt the drAmt to set
	 */
	public void setDrAmt(Long drAmt) {
		this.drAmt = drAmt;
	}

	/**
	 * @return the crAmt
	 */
	public Long getCrAmt() {
		return crAmt;
	}

	/**
	 * @param crAmt the crAmt to set
	 */
	public void setCrAmt(Long crAmt) {
		this.crAmt = crAmt;
	}

	/**
	 * @return the balance
	 */
	public Long getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(Long balance) {
		this.balance = balance;
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
	 * @return the counterpartyAccNo
	 */
	public String getCounterpartyAccNo() {
		return counterpartyAccNo;
	}

	/**
	 * @param counterpartyAccNo the counterpartyAccNo to set
	 */
	public void setCounterpartyAccNo(String counterpartyAccNo) {
		this.counterpartyAccNo = counterpartyAccNo;
	}

	/**
	 * @return the counterpartyAccName
	 */
	public String getCounterpartyAccName() {
		return counterpartyAccName;
	}

	/**
	 * @param counterpartyAccName the counterpartyAccName to set
	 */
	public void setCounterpartyAccName(String counterpartyAccName) {
		this.counterpartyAccName = counterpartyAccName;
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
	
}
