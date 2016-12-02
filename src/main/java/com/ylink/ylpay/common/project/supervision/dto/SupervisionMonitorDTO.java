/**
 * 版权所有(C) 2014 证联融通电子有限公司
 * 创建:yu.han 2014-10-11
 */

/**
 * SupervisionMonitorDTO.java
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
public class SupervisionMonitorDTO extends AbstractDTO {
	private Long id;

    private Integer batchId;

    private String accountDate;
    
    private String endFlag;

    private String supervisionType;

    private String monitorStatus;

    private Date updateTime;

    private Date createdTime;
	/**
	 * 
	 */
	private static final long serialVersionUID = -2145717447820278156L;
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
	 * @return the accountDate
	 */
	public String getAccountDate() {
		return accountDate;
	}
	/**
	 * @param accountDate the accountDate to set
	 */
	public void setAccountDate(String accountDate) {
		this.accountDate = accountDate;
	}
	/**
	 * @return the supervisionType
	 */
	public String getSupervisionType() {
		return supervisionType;
	}
	/**
	 * @param supervisionType the supervisionType to set
	 */
	public void setSupervisionType(String supervisionType) {
		this.supervisionType = supervisionType;
	}
	/**
	 * @return the monitorStatus
	 */
	public String getMonitorStatus() {
		return monitorStatus;
	}
	/**
	 * @param monitorStatus the monitorStatus to set
	 */
	public void setMonitorStatus(String monitorStatus) {
		this.monitorStatus = monitorStatus;
	}
	/**
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * @param updateTime the updateTime to set
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
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
	
}
