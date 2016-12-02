/**
 * 版权所有(C) 2013 证联融通
 * 创建:jf.zhao 2013-7-31
 */
package com.ylink.ylpay.common.project.settle.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * @author jf.zhao
 * @date 2013-7-31
 * @description：
 */
public class ChannelReconResultDataDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3637675546720096226L;

	/**
	 * 订单号
	 */
	private String orderId;
	/**
	 * 行别
	 */
	private String bankType;
	/**
	 * 金额
	 */
	private String payment;
	/**
	 * 渠道流水号
	 */
	private String channelSn;
	/**
	 * 账务日期
	 */
	private String acctdate;

	/**
	 * 虚拟客户号
	 */
	private String visualCustId;

	/**
	 * 对账类型 参见ChannelReconType枚举
	 */
	private String ReconType;

	/**
	 * 平帐状态 参见ChannelPayReconStatus 枚举
	 */
	private String reconStatus;

	/**
	 * 不平帐原因
	 */
	private String unBalanceReason;

	/**
	 * 是否查询平帐
	 */
	private String isBanlance;
	
	
	/**
	 * 入账或者出账 
	 * 入账 dr
	 * 出账cr
	 */
	private String direction;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getChannelSn() {
		return channelSn;
	}

	public void setChannelSn(String channelSn) {
		this.channelSn = channelSn;
	}

	public String getAcctdate() {
		return acctdate;
	}

	public void setAcctdate(String acctdate) {
		this.acctdate = acctdate;
	}



	public String getReconType() {
		return ReconType;
	}

	public void setReconType(String reconType) {
		ReconType = reconType;
	}

	public String getReconStatus() {
		return reconStatus;
	}

	public void setReconStatus(String reconStatus) {
		this.reconStatus = reconStatus;
	}

	public String getUnBalanceReason() {
		return unBalanceReason;
	}

	public void setUnBalanceReason(String unBalanceReason) {
		this.unBalanceReason = unBalanceReason;
	}

	public String getIsBanlance() {
		return isBanlance;
	}

	public void setIsBanlance(String isBanlance) {
		this.isBanlance = isBanlance;
	}

	public String getVisualCustId() {
		return visualCustId;
	}

	public void setVisualCustId(String visualCustId) {
		this.visualCustId = visualCustId;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

}
