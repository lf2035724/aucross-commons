package com.ylink.ylpay.common.project.channel.dto;


public class EBSSignDTO extends AbstractDTO{
	/**
	 * 快捷付实名认证授权账号
	 */
	private static final long serialVersionUID = 5935558070945316368L;
	private String bankType;     //行别  
	private String payType;      //支付类型 
	private String orderId;      //订单号      
	private String userName;     //客户姓名  
	private String dType;        //证件类型
	private String idNumber;     //证件号码
	private String authId;       //授权号
	private String epayno;       //授权账号==银行卡号
	private String payPassWord;  //柜台交易密码
	private String REMARK1;	     //备注1	CHAR(30)	备注字段
	private String REMARK2;	     //备注2	CHAR(30)	备注字段
	private String preparation1; //预留字段1
	private String preparation2; //预留字段2
	private String preparation3; //预留字段3
	private String bankCardId;   //银行卡主键ID
    private String signChannel;  //签约渠道(直连银行签约或通过银联签约)
	private String merchantCode; //交易所属商户
	private String bindSource;   //签约(绑定)来源[移动绑卡、互联网绑卡]
	private String organCode;//组织机构代码
    private String actualBankType;//银联渠道发卡行
	private String phoneNum;//银行卡绑定手机号
    
	public String getMerchantCode() {
		return merchantCode;
	}
	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}
	public String getSignChannel() {
		return signChannel;
	}
	public void setSignChannel(String signChannel) {
		this.signChannel = signChannel;
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
	public String getAuthId() {
		return authId;
	}
	public void setAuthId(String authId) {
		this.authId = authId;
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
	public String getBankCardId() {
		return bankCardId;
	}
	public void setBankCardId(String bankCardId) {
		this.bankCardId = bankCardId;
	}
	public String getPayPassWord() {
		return payPassWord;
	}
	public void setPayPassWord(String payPassWord) {
		this.payPassWord = payPassWord;
	}
	public String getOrganCode() {
		return organCode;
	}
	public void setOrganCode(String organCode) {
		this.organCode = organCode;
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
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
}
