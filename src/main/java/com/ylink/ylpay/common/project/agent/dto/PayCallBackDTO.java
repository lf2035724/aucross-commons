package com.ylink.ylpay.common.project.agent.dto;

import java.util.Date;

import com.ylink.ylpay.common.project.channel.dto.AbstractDTO;

/**
 * @author wanglei
 * @date 2014-5-26
 * @description：支付结束回调缴费系统DTO
 */
public class PayCallBackDTO extends AbstractDTO{

	private static final long serialVersionUID = 1113245870498004870L;
	/**请求支付系统原流水*/
	private String requestPaySn;
	/**支付系统处理流水*/
	private String tradeId;
	/**支付状态*/
	private String payOrderState;
	/**支付系统创建时间*/
	private Date payCreateDate;
	/**支付系统支付时间*/
	private Date payDate;
	public String getRequestPaySn() {
		return requestPaySn;
	}
	public void setRequestPaySn(String requestPaySn) {
		this.requestPaySn = requestPaySn;
	}
	public String getTradeId() {
		return tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	public String getPayOrderState() {
		return payOrderState;
	}
	public void setPayOrderState(String payOrderState) {
		this.payOrderState = payOrderState;
	}
	public Date getPayCreateDate() {
		return payCreateDate;
	}
	public void setPayCreateDate(Date payCreateDate) {
		this.payCreateDate = payCreateDate;
	}
	public Date getPayDate() {
		return payDate;
	}
	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}
	
}
