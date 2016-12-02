package com.ylink.ylpay.common.project.channel.dto;


public class OneZlToUserEBSReturnDTO extends AbstractDTO{
	/**
	 * 快捷付单笔付款
	 */
	private static final long serialVersionUID = -156011086718797347L;
	private String orderId;      //订单号      
	private String requestSn;    //请求序列号(渠道编号)  
	private String returnCode;   //响应码      
	private String channelSn;    //渠道流水     
	private String payOptType;   //支付平台的业务类型（付款，充值==） 
	private String creditNo;     //凭证号
	private String validateCode; //验证码
	private String preparation1; //预留字段1    
	private String preparation2; //预留字段2    
	private String preparation3; //预留字段3
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getRequestSn() {
		return requestSn;
	}
	public void setRequestSn(String requestSn) {
		this.requestSn = requestSn;
	}
	public String getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}
	public String getChannelSn() {
		return channelSn;
	}
	public void setChannelSn(String channelSn) {
		this.channelSn = channelSn;
	}
	public String getPayOptType() {
		return payOptType;
	}
	public void setPayOptType(String payOptType) {
		this.payOptType = payOptType;
	}
	public String getCreditNo() {
		return creditNo;
	}
	public void setCreditNo(String creditNo) {
		this.creditNo = creditNo;
	}
	public String getValidateCode() {
		return validateCode;
	}
	public void setValidateCode(String validateCode) {
		this.validateCode = validateCode;
	}
	public String getPreparation1() {
		return preparation1;
	}
	public void setPreparation1(String preparation1) {
		this.preparation1 = preparation1;
	}
	public String getPreparation2() {
		return preparation2;
	}
	public void setPreparation2(String preparation2) {
		this.preparation2 = preparation2;
	}
	public String getPreparation3() {
		return preparation3;
	}
	public void setPreparation3(String preparation3) {
		this.preparation3 = preparation3;
	}
	
	
}
