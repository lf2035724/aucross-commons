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

public class WithdrawDTO extends BaseDTO {
	private static final long serialVersionUID = -2900381688760987287L;
	private String id;
	private String merchantId;
	private String bizNo;
	private String bizType;
	private Long sumCount;
	private Long sumAmount;
	private Long successSumCount;
	private Long successSumAmount;
	private String status;
	private String[] statuses;
	private String isCallback;
	private Integer callbackTimes;
	private String callbackDate;
	private Date createTime;
	private String description;
	private String checkStatus;
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
	 * @return the merchantId
	 */
	public String getMerchantId() {
		return merchantId;
	}
	/**
	 * @param merchantId the merchantId to set
	 */
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
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
	 * @return the bizType
	 */
	public String getBizType() {
		return bizType;
	}
	/**
	 * @param bizType the bizType to set
	 */
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	/**
	 * @return the sumCount
	 */
	public Long getSumCount() {
		return sumCount;
	}
	/**
	 * @param sumCount the sumCount to set
	 */
	public void setSumCount(Long sumCount) {
		this.sumCount = sumCount;
	}
	/**
	 * @return the sumAmount
	 */
	public Long getSumAmount() {
		return sumAmount;
	}
	/**
	 * @param sumAmount the sumAmount to set
	 */
	public void setSumAmount(Long sumAmount) {
		this.sumAmount = sumAmount;
	}
	/**
	 * @return the successSumCount
	 */
	public Long getSuccessSumCount() {
		return successSumCount;
	}
	/**
	 * @param successSumCount the successSumCount to set
	 */
	public void setSuccessSumCount(Long successSumCount) {
		this.successSumCount = successSumCount;
	}
	/**
	 * @return the successSumAmount
	 */
	public Long getSuccessSumAmount() {
		return successSumAmount;
	}
	/**
	 * @param successSumAmount the successSumAmount to set
	 */
	public void setSuccessSumAmount(Long successSumAmount) {
		this.successSumAmount = successSumAmount;
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
	 * @return the statuses
	 */
	public String[] getStatuses() {
		return statuses;
	}
	/**
	 * @param statuses the statuses to set
	 */
	public void setStatuses(String[] statuses) {
		this.statuses = statuses;
	}
	/**
	 * @return the isCallback
	 */
	public String getIsCallback() {
		return isCallback;
	}
	/**
	 * @param isCallback the isCallback to set
	 */
	public void setIsCallback(String isCallback) {
		this.isCallback = isCallback;
	}
	/**
	 * @return the callbackTimes
	 */
	public Integer getCallbackTimes() {
		return callbackTimes;
	}
	/**
	 * @param callbackTimes the callbackTimes to set
	 */
	public void setCallbackTimes(Integer callbackTimes) {
		this.callbackTimes = callbackTimes;
	}
	/**
	 * @return the callbackDate
	 */
	public String getCallbackDate() {
		return callbackDate;
	}
	/**
	 * @param callbackDate the callbackDate to set
	 */
	public void setCallbackDate(String callbackDate) {
		this.callbackDate = callbackDate;
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
	
}
