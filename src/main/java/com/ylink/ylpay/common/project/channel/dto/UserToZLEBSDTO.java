package com.ylink.ylpay.common.project.channel.dto;


public class UserToZLEBSDTO extends AbstractDTO{
	/**
	 * 快捷付
	 */
	private static final long serialVersionUID = 5935558070945316368L;
	private String bankType;     //行别       
	private String payType;     //支付方式（基金或是消费）      
	private String authId;       //授权号      
	private String orderId;      //订单号      
	private String payment;      //交易金额     
	private String payOptType;   //支付平台的业务类型（付款，充值==） 
	/**用户姓名*/
	private String userName;   
	private String idNumber; 
	/**银行卡号*/
	private String bankCard;
	private String payPassWord;  //柜台交易密码
	private String rem1;         //支付备注1    
	private String rem2;         //支付备注1    
	private String preparation1; //预留字段1    
	private String preparation2; //预留字段2    
	private String preparation3; //预留字段3(现定为基金代码)    
	private String merchantCode; //商户号[交易所属商户]
	private String bindSource;   //互联网、移动
	private String actualBankType;//银行卡发卡行
	
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
	public String getAuthId() {
		return authId;
	}
	public void setAuthId(String authId) {
		this.authId = authId;
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
	 * @return the bankCard
	 */
	public String getBankCard() {
		return bankCard;
	}
	/**
	 * @param bankCard the bankCard to set
	 */
	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserToZLEBSDTO [bankType=" + bankType + ", payType=" + payType + ", authId=" + authId + ", orderId=" + orderId + ", payment=" + payment
				+ ", payOptType=" + payOptType + ", userName=" + userName + ", idNumber=" + idNumber + ", bankCard=" + bankCard + ", payPassWord=" + payPassWord + ", rem1=" + rem1 + ", rem2="
				+ rem2 + ", preparation1=" + preparation1 + ", preparation2=" + preparation2 + ", preparation3=" + preparation3 + ", merchantCode=" + merchantCode + ", bindSource=" + bindSource + "]";
	}
	public String getMerchantCode() {
		return merchantCode;
	}
	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}
	public String getPayPassWord() {
		return payPassWord;
	}
	public void setPayPassWord(String payPassWord) {
		this.payPassWord = payPassWord;
	}
	public String getBindSource() {
		return bindSource;
	}
	public void setBindSource(String bindSource) {
		this.bindSource = bindSource;
	}
	public String getActualBankType() {
		return actualBankType;
	}
	public void setActualBankType(String actualBankType) {
		this.actualBankType = actualBankType;
	}
}
