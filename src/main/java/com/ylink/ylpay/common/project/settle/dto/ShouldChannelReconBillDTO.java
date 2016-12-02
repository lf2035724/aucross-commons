/**
 * 版权所有(C) 2013 证联融通
 * 创建:jf.zhao 2013-8-15
 */
package com.ylink.ylpay.common.project.settle.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * @author jf.zhao
 * @date 2013-8-15
 * @description：
 */
public class ShouldChannelReconBillDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8338469933612102449L;

	/**
	 * 交易订单号
	 */
	private String payId;
	/**
	 * 支付订单号
	 */
	private String orderId;

	/**
	 * 借贷方向 参考 DrCrFlag枚举
	 */
	private String drCrFlag;
	
	/**
	 * 金额
	 */
	private String amount;
	
	/**
	 * 渠道流水
	 */
	private String channelNo;
	
	/**
	 * 账务日期
	 */
	private String acctdate;
	
	/**
	 * 帐号
	 */
	private String accountId;

	public String getPayId() {
		return payId;
	}

	public void setPayId(String payId) {
		this.payId = payId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getChannelNo() {
		return channelNo;
	}

	public void setChannelNo(String channelNo) {
		this.channelNo = channelNo;
	}



	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getDrCrFlag() {
		return drCrFlag;
	}

	public void setDrCrFlag(String drCrFlag) {
		this.drCrFlag = drCrFlag;
	}

	public String getAcctdate() {
		return acctdate;
	}

	public void setAcctdate(String acctdate) {
		this.acctdate = acctdate;
	}



}
