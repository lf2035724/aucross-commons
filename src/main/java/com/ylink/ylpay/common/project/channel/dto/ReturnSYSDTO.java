package com.ylink.ylpay.common.project.channel.dto;


public class ReturnSYSDTO extends AbstractDTO{
	/**
	 * userToZL返回信息DTO
	 */
	private static final long serialVersionUID = 5935558070945316368L;
	
	private String orderId;      //订单号      
	private String requestSn;    //请求序列号(渠道编号)  
	private String returnCode;   //响应码      
	private String channelSn;    //渠道流水     
	private String channelId;    //渠道编号   
	private String payOptType;   //支付平台的业务类型（付款，充值==） 
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
	
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
