package com.ylink.ylpay.common.project.agent.dto;

import com.ylink.ylpay.common.project.channel.dto.AbstractDTO;

/**
 * @author wanglei
 * @date 2014-5-26
 * @description：缴费支付完成，支付系统回调缴费系统DTO
 */
public class AgentPayCallBackDTO extends AbstractDTO{

	private static final long serialVersionUID = -2396356248189030548L;
	
	/**缴费系统请求支付系统的原流水*/
	private String requestPaySn;
	/**支付状态*/
	private String payStatus;
	/**支付系统订单号*/
	private String tradeId;
	public String getRequestPaySn() {
		return requestPaySn;
	}
	public void setRequestPaySn(String requestPaySn) {
		this.requestPaySn = requestPaySn;
	}
	public String getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	public String getTradeId() {
		return tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
}
