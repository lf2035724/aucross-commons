package com.ylink.ylpay.common.project.channel.dto;


public class ManageFinancesSignDTO extends AbstractDTO{
	/**
	 * 快捷付实名认证授权账号
	 */
	private static final long serialVersionUID = 5935558070945316368L;
	private String bankType;     //行别  
	private String payType;     //行别  
	private String orderId;      //订单号      
	private String userName;     //客户姓名  
	private String dType;        //证件类型
	private String idNumber;     //证件号码
//	private String authId;       //授权号
	private String epayno;       //授权账号==银行卡号
//	private String bankCardId; //银行卡主键ID

	
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getdType() {
		return dType;
	}
	public void setdType(String dType) {
		this.dType = dType;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	/**
	 * @return the epayno
	 */
	public String getEpayno() {
		return epayno;
	}
	/**
	 * @param epayno the epayno to set
	 */
	public void setEpayno(String epayno) {
		this.epayno = epayno;
	}

}
