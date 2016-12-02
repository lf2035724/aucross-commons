package com.ylink.ylpay.common.project.channel.dto;


public class CheckAccountDTO extends AbstractDTO{
	/**
	 *  网银验证账户合法性
	 */
	private static final long serialVersionUID = 5935558070945316368L;
	private String bankType;     //行别  
	private String payType;      //消费户或是基金户  
	private String orderId;      //订单号 支付系统ID     
	private String userName;     //客户姓名  
	private String dType;        //证件类型
	private String idNumber;     //证件号码
	private String epayno;       //银行卡号
	private String REMARK1;	     //备注1	CHAR(30)	备注字段
	private String REMARK2;	     //备注2	CHAR(30)	备注字段
	private String preparation1; //预留字段1
	private String preparation2; //预留字段2
	private String preparation3; //预留字段3
	private String bankCardId; //银行卡主键ID--为门户传值
	private String payment;       //金额；
	private String fundOrPayType;//特殊类编；
	private String payOptType;
	private String portOrderId;//门户订单ID
	
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
	public String getEpayno() {
		return epayno;
	}
	public void setEpayno(String epayno) {
		this.epayno = epayno;
	}

	public String getREMARK1() {
		return REMARK1;
	}
	public void setREMARK1(String rEMARK1) {
		REMARK1 = rEMARK1;
	}
	public String getREMARK2() {
		return REMARK2;
	}
	public void setREMARK2(String rEMARK2) {
		REMARK2 = rEMARK2;
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
		public String getFundOrPayType() {
		return fundOrPayType;
	}
	
	public void setFundOrPayType(String fundOrPayType) {
		this.fundOrPayType = fundOrPayType;
	}
	public String getBankCardId() {
		return bankCardId;
	}
	public void setBankCardId(String bankCardId) {
		this.bankCardId = bankCardId;
	}
	public String getPayOptType() {
		return payOptType;
	}
	public void setPayOptType(String payOptType) {
		this.payOptType = payOptType;
	}
	public String getPortOrderId() {
		return portOrderId;
	}
	public void setPortOrderId(String portOrderId) {
		this.portOrderId = portOrderId;
	}
}
 