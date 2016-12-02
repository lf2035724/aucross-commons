package com.ylink.ylpay.common.project.settle.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

public class InterestAccountSettleDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3124409282448858563L;

	private Long amount;

	private String settleStatus;

	private Date createTime;

	private Date updateTime;

	private String businessSn;

	private String paymentId;
	private Long settleId;

	private String custId;
	private String custName;

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getSettleStatus() {
		return settleStatus;
	}

	public void setSettleStatus(String settleStatus) {
		this.settleStatus = settleStatus;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getBusinessSn() {
		return businessSn;
	}

	public void setBusinessSn(String businessSn) {
		this.businessSn = businessSn;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public Long getSettleId() {
		return settleId;
	}

	public void setSettleId(Long settleId) {
		this.settleId = settleId;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

}
