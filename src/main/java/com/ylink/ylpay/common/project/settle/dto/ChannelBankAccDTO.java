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
public class ChannelBankAccDTO extends BaseDTO{

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
	 *   0为进账  1为出账
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

	

	public String getVisualCustId() {
		return visualCustId;
	}

	public void setVisualCustId(String visualCustId) {
		this.visualCustId = visualCustId;
	}

	@Override
	public String toString() {
		return "ChannelBankAccDTO [orderId=" + orderId + ", bankType="
				+ bankType + ", payment=" + payment + ", channelSn="
				+ channelSn + ", acctdate=" + acctdate + ", vCustId=" + visualCustId
				+ "]";
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

}
