/**
 * 版权所有(C) 2012 证联融通
 * 创建:HuAJ 2012-12-12
 */

package com.ylink.ylpay.common.project.settle.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * @author ZhangDM(Mingly)
 * @date 2012-12-12
 * @description：渠道对账监控DTO
 */

public class CheckMonitorDTO extends BaseDTO {

	@Override
	public String toString() {
		return "CheckMonitorDTO [id=" + id + ", accountDate=" + accountDate
				+ ", checkType=" + checkType + ", bankType=" + bankType
				+ ", channelType=" + channelType + ", productType="
				+ productType + ", checkStatus=" + checkStatus
				+ ", dataStatus=" + dataStatus + ", checkTime=" + checkTime
				+ ", dataTime=" + dataTime + ", beginCheckTime="
				+ beginCheckTime + ", endCheckTime=" + endCheckTime
				+ ", beginDataTime=" + beginDataTime + ", endDataTime="
				+ endDataTime + ", beginAccountDate=" + beginAccountDate
				+ ", endAccountDate=" + endAccountDate + ", payType=" + payType
				+ ", virtualCustId=" + virtualCustId + ", batchId=" + batchId
				+ ", balanceFlag=" + balanceFlag + ", sumCount=" + sumCount
				+ ", sumMoney=" + sumMoney + "]";
	}

	private static final long serialVersionUID = 1L;

	private long id;

	/**
	 * 对账日期
	 */
	private String accountDate;

	/**
	 * 对账类型 CheckMonitorCheckType
	 * 
	 */
	private String checkType;

	/**
	 * 行别
	 */
	private String bankType;

	/**
	 * 渠道类型 CheckMonitorChannelType
	 */
	private String channelType;

	/**
	 * 产品类型 ProductType
	 */
	private String productType;

	/**
	 * 对账状态 CheckMonitorCheckStatus
	 */
	private String checkStatus;

	/**
	 * 对账数据状态 CheckMonitorDataStatus
	 */
	private String dataStatus;

	/**
	 * 对账时间
	 */
	private Date checkTime;

	/**
	 * 对账数据处理时间
	 */
	private Date dataTime;

	private Date beginCheckTime;

	private Date endCheckTime;

	private Date beginDataTime;

	private Date endDataTime;

	private Date beginAccountDate;

	private Date endAccountDate;

	private String payType;

	private String virtualCustId;

	private String batchId;

	private String balanceFlag;

	  
    /**
     * 平帐总笔数
     */
    private int sumCount;
    
    /**
     * 平帐总金额
     */
    private Long sumMoney;

	public String getAccountDate() {
		return accountDate;
	}

	public void setAccountDate(String accountDate) {
		this.accountDate = accountDate;
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	public String getChannelType() {
		return channelType;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public String getCheckStatus() {
		return checkStatus;
	}

	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}

	public String getDataStatus() {
		return dataStatus;
	}

	public void setDataStatus(String dataStatus) {
		this.dataStatus = dataStatus;
	}

	public Date getCheckTime() {
		return checkTime;
	}

	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}

	public Date getDataTime() {
		return dataTime;
	}

	public void setDataTime(Date dataTime) {
		this.dataTime = dataTime;
	}

	public Date getBeginCheckTime() {
		return beginCheckTime;
	}

	public void setBeginCheckTime(Date beginCheckTime) {
		this.beginCheckTime = beginCheckTime;
	}

	public Date getEndCheckTime() {
		return endCheckTime;
	}

	public void setEndCheckTime(Date endCheckTime) {
		this.endCheckTime = endCheckTime;
	}

	public Date getBeginDataTime() {
		return beginDataTime;
	}

	public void setBeginDataTime(Date beginDataTime) {
		this.beginDataTime = beginDataTime;
	}

	public Date getEndDataTime() {
		return endDataTime;
	}

	public void setEndDataTime(Date endDataTime) {
		this.endDataTime = endDataTime;
	}

	public Date getBeginAccountDate() {
		return beginAccountDate;
	}

	public void setBeginAccountDate(Date beginAccountDate) {
		this.beginAccountDate = beginAccountDate;
	}

	public Date getEndAccountDate() {
		return endAccountDate;
	}

	public void setEndAccountDate(Date endAccountDate) {
		this.endAccountDate = endAccountDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCheckType() {
		return checkType;
	}

	public void setCheckType(String checkType) {
		this.checkType = checkType;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getVirtualCustId() {
		return virtualCustId;
	}

	public void setVirtualCustId(String virtualCustId) {
		this.virtualCustId = virtualCustId;
	}

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getBalanceFlag() {
		return balanceFlag;
	}

	public void setBalanceFlag(String balanceFlag) {
		this.balanceFlag = balanceFlag;
	}

	public int getSumCount() {
		return sumCount;
	}

	public void setSumCount(int sumCount) {
		this.sumCount = sumCount;
	}

	public Long getSumMoney() {
		return sumMoney;
	}

	public void setSumMoney(Long sumMoney) {
		this.sumMoney = sumMoney;
	}

	

}
