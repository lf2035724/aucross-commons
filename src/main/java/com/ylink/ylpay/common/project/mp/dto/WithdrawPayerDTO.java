/**
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-11-7
 */

/**
 * WithdrawPayerDTO.java
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-11-7
 */
package com.ylink.ylpay.common.project.mp.dto;

import java.util.Calendar;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author feng.li
 * @date 2013-11-7
 * @description：TODO
 */

/**
 * @author feng.li
 */
public class WithdrawPayerDTO extends BaseDTO{

	private static final long serialVersionUID = -4056721820146042300L;

	/**
	 * 提现订单号
	 */
	private String widthdrawId;
	
	/**
	 * 调用类型
	 */
	private String type;
	
	/**
	 * 支付类型
	 */
	private String payType;
	
	/**
	 * 支付类型
	 */
	private String virtualCustid;
	
	/**
	 * 渠道接口
	 */
	private String channelInterface;
	
	/**
	 * 付款方行别
	 */
	private String payerBankType;
	
	/**
	 * 付款方账号名
	 */
	private String payerAccountName;
	
	/**
	 * 付款方账号
	 */
	private String payerAccountNo;
	
	/**
	 * 最的更新时间
	 */
	private Calendar lastUpdateTime;
	
	private String _route;

	public String getWidthdrawId() {
		return widthdrawId;
	}

	public void setWidthdrawId(String widthdrawId) {
		this.widthdrawId = widthdrawId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getVirtualCustid() {
		return virtualCustid;
	}

	public void setVirtualCustid(String virtualCustid) {
		this.virtualCustid = virtualCustid;
	}

	public String getChannelInterface() {
		return channelInterface;
	}

	public void setChannelInterface(String channelInterface) {
		this.channelInterface = channelInterface;
	}

	public String getPayerBankType() {
		return payerBankType;
	}

	public void setPayerBankType(String payerBankType) {
		this.payerBankType = payerBankType;
	}

	public String getPayerAccountName() {
		return payerAccountName;
	}

	public void setPayerAccountName(String payerAccountName) {
		this.payerAccountName = payerAccountName;
	}

	public String getPayerAccountNo() {
		return payerAccountNo;
	}

	public void setPayerAccountNo(String payerAccountNo) {
		this.payerAccountNo = payerAccountNo;
	}

	public Calendar getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Calendar lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public String get_route() {
		return _route;
	}

	public void set_route(String _route) {
		this._route = _route;
	}
}
