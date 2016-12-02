/**
 * 版权所有(C) 2012 证联融通
 * 创建:HuAJ 2012-11-14
 */

package com.ylink.ylpay.common.project.pay.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * @author HuAJ
 * @date 2012-11-14
 * @description：线下转账回调DTO
 */

public class TransferCallbackDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//	private String paymentId;
	private String tradeId;
//	private String requestSn;

//	private String channelSn;

//	private PaymentOrderStatus paymentOrderStatus;
	// private ReturnCode returnCode;

	/**
	 * 渠道编号
	 */
	private String chnnlId;
	
	/**
	 * 渠道流水
	 */
	private String chnnlNo;
	
	/**
	 * 成功/失败
	 */
	private String returnCode;
	
	/**
	 * 转账失败说明
	 */
	private String remark;

//	public String getChannelSn() {
//		return channelSn;
//	}

	public String getChnnlId() {
		return chnnlId;
	}
	public String getChnnlNo() {
		return chnnlNo;
	}
//	public String getPaymentId() {
//		return paymentId;
//	}

//	public PaymentOrderStatus getPaymentOrderStatus() {
//		return paymentOrderStatus;
//	}

	public String getRemark() {
		return remark;
	}

//	public String getRequestSn() {
//		return requestSn;
//	}

	public String getReturnCode() {
		return returnCode;
	}

	public String getTradeId() {
		return tradeId;
	}

//	public void setChannelSn(String channelSn) {
//		this.channelSn = channelSn;
//	}

	public void setChnnlId(String chnnlId) {
		this.chnnlId = chnnlId;
	}

	public void setChnnlNo(String chnnlNo) {
		this.chnnlNo = chnnlNo;
	}

//	public void setPaymentId(String paymentId) {
//		this.paymentId = paymentId;
//	}

//	public void setPaymentOrderStatus(PaymentOrderStatus paymentOrderStatus) {
//		this.paymentOrderStatus = paymentOrderStatus;
//	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

//	public void setRequestSn(String requestSn) {
//		this.requestSn = requestSn;
//	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	
}
