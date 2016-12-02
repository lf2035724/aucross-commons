/**
 * 版权所有(C) 2014 证联融通电子有限公司
 * 创建:yu.han 2014-10-11
 */

/**
 * CustAccountDetailDTO.java
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
public class CustAccountDetailDTO extends AbstractDTO {
	private Long id;

    private Integer batchId;

    private Long monitorId;
    private String status;
    private String payMerchantAccNo;

    private String payMerchantAccName;

    private String statisticsDate;

    private Long balance;

    private Long drAmt;

    private Long crAmt;

    private String custAccType;

    private String custCertType;

    private String custCertNo;

    private String operationType;

    private Date createdTime;

	/**
	 * 
	 */
	private static final long serialVersionUID = 6766982574473942676L;

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
	 * @return the statisticsDate
	 */
	public String getStatisticsDate() {
		return statisticsDate;
	}

	/**
	 * @param statisticsDate the statisticsDate to set
	 */
	public void setStatisticsDate(String statisticsDate) {
		this.statisticsDate = statisticsDate;
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
	 * @return the custAccType
	 */
	public String getCustAccType() {
		return custAccType;
	}

	/**
	 * @param custAccType the custAccType to set
	 */
	public void setCustAccType(String custAccType) {
		this.custAccType = custAccType;
	}

	/**
	 * @return the custCertType
	 */
	public String getCustCertType() {
		return custCertType;
	}

	/**
	 * @param custCertType the custCertType to set
	 */
	public void setCustCertType(String custCertType) {
		this.custCertType = custCertType;
	}

	/**
	 * @return the custCertNo
	 */
	public String getCustCertNo() {
		return custCertNo;
	}

	/**
	 * @param custCertNo the custCertNo to set
	 */
	public void setCustCertNo(String custCertNo) {
		this.custCertNo = custCertNo;
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
