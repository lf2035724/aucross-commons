/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:yu.han 2013-5-28
 */

/**
 * WithdrawDTO.java
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司-证联融通电子有限公司 
 * 创建:yu.han 2013-5-28
 */
package com.ylink.ylpay.common.project.otcbb.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * 提现数据对外DTO
 * @author yu.han
 * @date 2013-5-28
 * @description：提现数据对外DTO
 */

public class WithdrawDetailDTO extends BaseDTO {
	private static final long serialVersionUID = -2900381688760987287L;
	private String id;
	private String withdrawId;
	private String bizNo;
	/**资金转出请求日期*/
	private String reqDate;
	private String custId;
	private String userNameText;
	private String bankType;
	private Long amount;
	private String cardName;
	private String cardNo;
	private String otcbbAccount;
	private String status;
	private String payOrderNo;
	private Date finishedTime;
	private Date createTime;
	private String description;
	
	private String checkStatus;
	
	/**
	 * 摘要
	 */
	private String summary;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the withdrawId
	 */
	public String getWithdrawId() {
		return withdrawId;
	}

	/**
	 * @param withdrawId the withdrawId to set
	 */
	public void setWithdrawId(String withdrawId) {
		this.withdrawId = withdrawId;
	}

	/**
	 * @return the bizNo
	 */
	public String getBizNo() {
		return bizNo;
	}

	/**
	 * @param bizNo the bizNo to set
	 */
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	/**
	 * @return the reqDate
	 */
	public String getReqDate() {
		return reqDate;
	}

	/**
	 * @param reqDate the reqDate to set
	 */
	public void setReqDate(String reqDate) {
		this.reqDate = reqDate;
	}

	/**
	 * @return the custId
	 */
	public String getCustId() {
		return custId;
	}

	/**
	 * @param custId the custId to set
	 */
	public void setCustId(String custId) {
		this.custId = custId;
	}

	/**
	 * @return the userNameText
	 */
	public String getUserNameText() {
		return userNameText;
	}

	/**
	 * @param userNameText the userNameText to set
	 */
	public void setUserNameText(String userNameText) {
		this.userNameText = userNameText;
	}

	/**
	 * @return the bankType
	 */
	public String getBankType() {
		return bankType;
	}

	/**
	 * @param bankType the bankType to set
	 */
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	/**
	 * @return the amount
	 */
	public Long getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	/**
	 * @return the cardName
	 */
	public String getCardName() {
		return cardName;
	}

	/**
	 * @param cardName the cardName to set
	 */
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	/**
	 * @return the cardNo
	 */
	public String getCardNo() {
		return cardNo;
	}

	/**
	 * @param cardNo the cardNo to set
	 */
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	/**
	 * @return the otcbbAccount
	 */
	public String getOtcbbAccount() {
		return otcbbAccount;
	}

	/**
	 * @param otcbbAccount the otcbbAccount to set
	 */
	public void setOtcbbAccount(String otcbbAccount) {
		this.otcbbAccount = otcbbAccount;
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
	 * @return the payOrderNo
	 */
	public String getPayOrderNo() {
		return payOrderNo;
	}

	/**
	 * @param payOrderNo the payOrderNo to set
	 */
	public void setPayOrderNo(String payOrderNo) {
		this.payOrderNo = payOrderNo;
	}

	/**
	 * @return the finishedTime
	 */
	public Date getFinishedTime() {
		return finishedTime;
	}

	/**
	 * @param finishedTime the finishedTime to set
	 */
	public void setFinishedTime(Date finishedTime) {
		this.finishedTime = finishedTime;
	}

	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the checkStatus
	 */
	public String getCheckStatus() {
		return checkStatus;
	}

	/**
	 * @param checkStatus the checkStatus to set
	 */
	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}
	
}
