package com.ylink.ylpay.common.project.channel.dto;


public class ManageFinancesNoBindDTO extends AbstractDTO{
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
	private String epayno;       //授权账号==银行卡号
	private String payment;
	/**
	 * @return the bankType
	 */
	public String getBankType() {
		return bankType;
	}
	/**
	 * @param bankType the bankType to set
	 */
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	/**
	 * @return the payType
	 */
	public String getPayType() {
		return payType;
	}
	/**
	 * @param payType the payType to set
	 */
	public void setPayType(String payType) {
		this.payType = payType;
	}
	/**
	 * @return the orderId
	 */
	public String getOrderId() {
		return orderId;
	}
	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the dType
	 */
	public String getdType() {
		return dType;
	}
	/**
	 * @param dType the dType to set
	 */
	public void setdType(String dType) {
		this.dType = dType;
	}
	/**
	 * @return the idNumber
	 */
	public String getIdNumber() {
		return idNumber;
	}
	/**
	 * @param idNumber the idNumber to set
	 */
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
	/**
	 * @return the payment
	 */
	public String getPayment() {
		return payment;
	}
	/**
	 * @param payment the payment to set
	 */
	public void setPayment(String payment) {
		this.payment = payment;
	}


}
