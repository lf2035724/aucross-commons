package com.ylink.ylpay.common.project.channel.dto;

import java.util.Date;

public class UserToZLEBankDTO extends AbstractDTO{
	/**
	 * 网银支付
	 */
	private static final long serialVersionUID = 5935558070945316368L;
	private String bankType;     //行别       
	private String payType;     //卡别      
	private String orderId;      //订单号      
	private String payment;      //交易金额     
	private String payOptType;   //支付平台的业务类型（付款，充值==） 
	private String optType;      //区分是普通网关，还是前置网关
	private String acctNo;      //银行卡号
	private String rem1;         //支付备注1    
	private String rem2;         //支付备注1    
	private String clientIp;     //客户端IP
	private String reginfo;		 //客户注册信息
	private String proinfo;		 //商品信息
	private String preparation1; //预留字段1    
	private String preparation2; //预留字段2    
	private String preparation3; //预留字段3    
	private String portOrderId; //门户订单ID
	private String cardType;//卡类别
	
	private String userName;      //用户姓名
	private String dType;      //证件类型
	private String idNumber;      //证件号码
	private String bankCardId; //银行卡主键ID--为门户传值
	
	private String requestSn;
	private Date orderTime;   //交易订单时间
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
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	
	public String getPayOptType() {
		return payOptType;
	}
	public void setPayOptType(String payOptType) {
		this.payOptType = payOptType;
	}
	
	public String getOptType() {
		return optType;
	}
	public void setOptType(String optType) {
		this.optType = optType;
	}
	public String getRem1() {
		return rem1;
	}
	public void setRem1(String rem1) {
		this.rem1 = rem1;
	}
	public String getRem2() {
		return rem2;
	}
	public void setRem2(String rem2) {
		this.rem2 = rem2;
	}
	public String getClientIp() {
		return clientIp;
	}
	public void setClientIp(String clientIp) {
		if(null == clientIp){
			clientIp = "";
		}
		this.clientIp = clientIp;
	}
	public String getReginfo() {
		return reginfo;
	}
	public void setReginfo(String reginfo) {
		this.reginfo = reginfo;
	}
	public String getProinfo() {
		return proinfo;
	}
	public void setProinfo(String proinfo) {
		this.proinfo = proinfo;
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
	public String getPortOrderId() {
		return portOrderId;
	}
	public void setPortOrderId(String portOrderId) {
		this.portOrderId = portOrderId;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	/**
	 * @return the acctNo
	 */
	public String getAcctNo() {
		return acctNo;
	}
	/**
	 * @param acctNo the acctNo to set
	 */
	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}
	/**
	 * @return the bankCardId
	 */
	public String getBankCardId() {
		return bankCardId;
	}
	/**
	 * @param bankCardId the bankCardId to set
	 */
	public void setBankCardId(String bankCardId) {
		this.bankCardId = bankCardId;
	}
	
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserToZLEBankDTO [bankType=" + bankType + ", payType=" + payType + ", orderId=" + orderId + ", payment=" + payment + ", payOptType="
				+ payOptType + ", optType=" + optType + ", acctNo=" + acctNo + ", rem1=" + rem1 + ", rem2=" + rem2 + ", clientIp=" + clientIp + ", reginfo="
				+ reginfo + ", proinfo=" + proinfo + ", preparation1=" + preparation1 + ", preparation2=" + preparation2 + ", preparation3=" + preparation3
				+ ", portOrderId=" + portOrderId + ", cardType=" + cardType + ", userName=" + userName + ", dType=" + dType + ", idNumber=" + idNumber
				+ ", bankCardId=" + bankCardId + ", requestSn=" + requestSn + "]";
	}
}
