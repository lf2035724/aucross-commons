/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 * 创建:neven.Yang 2013-4-3
 */

/**
 * yhhy.java
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 * 创建:neven.Yang 2013-4-3
 */
package com.ylink.ylpay.common.project.channel.dto;

/** 
 * @author neven.Yang
 * @date 2013-4-3
 * @description：TODO
 */

/**
 * @author neven.Yang
 *
 */
public class RefundEBankDTO{
	
	private String refundAmount; //退款金额
	private String orderNo; //商户订单号
	private String payType; //交易类型
	private String bankType;//行别
	
	
	public String getRefundAmount() {
		return refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	
}

