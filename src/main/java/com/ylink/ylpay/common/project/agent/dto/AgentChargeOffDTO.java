package com.ylink.ylpay.common.project.agent.dto;

import com.ylink.ylpay.common.project.channel.dto.AbstractDTO;

/**
 * @author wanglei
 * @date 2014-5-26
 * @description：缴费单销帐DTO
 */
public class AgentChargeOffDTO extends AbstractDTO{

	private static final long serialVersionUID = -6103711386534824722L;
	/**请求流水*/
	private String requestSn;
	/**请求时间*/
	private String requestDate;
	/**缴费号码*/
	private String agentNo;
	/**支付金额*/
	private String amount;
	/**后台通知URL*/
	private String notifyUrl;
	/**页面通知URL*/
	private String callBackUrl;
	/** 城市代码（销帐时通过此字段查询收费单位标识） */
	private String cityCode;
	/** 缴费项目代码（销帐时通过此字段查询收费单位标识） */
	private String projectCode;
	public String getRequestSn() {
		return requestSn;
	}
	public void setRequestSn(String requestSn) {
		this.requestSn = requestSn;
	}
	public String getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getNotifyUrl() {
		return notifyUrl;
	}
	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}
	public String getCallBackUrl() {
		return callBackUrl;
	}
	public void setCallBackUrl(String callBackUrl) {
		this.callBackUrl = callBackUrl;
	}
	public String getAgentNo() {
		return agentNo;
	}
	public void setAgentNo(String agentNo) {
		this.agentNo = agentNo;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getProjectCode() {
		return projectCode;
	}
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	
	
}
