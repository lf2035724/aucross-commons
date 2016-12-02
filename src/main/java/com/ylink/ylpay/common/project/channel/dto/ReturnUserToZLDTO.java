package com.ylink.ylpay.common.project.channel.dto;


public class ReturnUserToZLDTO extends AbstractDTO{
	/**
	 * 网银支付回执
	 */
	private static final long serialVersionUID = 5935558070945316368L;
	private String bankType;     //行别       
	private String orderId;      //订单号      
	private String channelSn;    //渠道流水     
	private String requestSn;    //渠道请求流水
	private String channelId;    //渠道编号   
	private String httpStringMAC;//支付的URL 
	private String preparation1; //预留字段1    
	private String preparation2; //预留字段2    
	private String preparation3; //预留字段3    
	
	
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	public String getChannelSn() {
		return channelSn;
	}
	public void setChannelSn(String channelSn) {
		this.channelSn = channelSn;
	}
	
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
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
	
	public String getHttpStringMAC() {
		return httpStringMAC;
	}
	public void setHttpStringMAC(String httpStringMAC) {
		this.httpStringMAC = httpStringMAC;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * @return the requestSn
	 */
	public String getRequestSn() {
		return requestSn;
	}
	/**
	 * @param requestSn the requestSn to set
	 */
	public void setRequestSn(String requestSn) {
		this.requestSn = requestSn;
	}

}
