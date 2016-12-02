package com.ylink.ylpay.common.project.channel.dto;

import com.ylink.ylpay.common.project.channel.constant.BankType;
import com.ylink.ylpay.common.project.mp.constant.InterBankType;


public class OneZlToUserEBSDTO extends AbstractDTO{
	/**
	 * 快捷付单笔付款
	 */
	private static final long serialVersionUID = -1160491583571297183L;
	private String bankType;     	//行别     
	private String payType;     	//行别     
	private String toUserMode;     	//打款方式  --选择ToUserMode枚举中的值
	private String OrderId;         //订单编号
	private String payBankType;     //付款行行别   
	private String payBankno;     	//付款行联行号   
	private String payAccno;    	//转出帐户号     
	private String payAccName;    	//付款行帐户名称
	private String provinceCode;    //付款行省
	private String cityCode;    	//付款行市
	private String toBankType;     	//收款行行别   
	private String recvUbankno;  	//转入帐户联行号
	private String recvAccno;   	//转入帐户号   
	private String recvAccName;     //转入帐户名称     
	private String recvOpenaccDept; //转入帐户开户机构名称
	private String recvProvinceCode;    //收款行省
	private String recvCityCode;    	//收款行市
	private String useof;           //用途
	private String amount;       	//金额
	private String payOptType;      //支付平台的业务类型（付款，充值==） 
	private String rem1;         	//支付备注1    
	private String rem2;         	//支付备注1    
	private String preparation1; 	//预留字段1    
	private String preparation2; 	//预留字段2    
	private String preparation3; 	//预留字段3    

	private String recvCounterno;  	//转入帐户会计柜台机构号
	private String exchangeNo;  	//转入帐户会计柜台机构号
	/**@see com.ylink.ylpay.common.project.mp.constant.InterBankType*/
	private String isInterBank; //是否跨行
	
	/**对公对私 0:私 1:公*/
	private int publicOrPrivate;
	
	public OneZlToUserEBSDTO() {
		super();
		this.payBankType = "0";
		this.payBankno = "0";
		this.payAccno = "0";
		this.payAccName = "0";
		this.recvUbankno = "0";
		this.recvAccno = "0";
		this.recvAccName = "0";
		this.recvOpenaccDept = "0";
		this.useof = "转账";
		this.isInterBank = InterBankType.INTERNAL.getValue();
		this.publicOrPrivate = 0;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getToUserMode() {
		return toUserMode;
	}
	public String getOrderId() {
		return OrderId;
	}
	public void setOrderId(String orderId) {
		OrderId = orderId;
	}
	public void setToUserMode(String toUserMode) {
		this.toUserMode = toUserMode;
	}
	public String getToBankType() {
		return toBankType;
	}
	public void setToBankType(String toBankType) {
		this.toBankType = toBankType;
	}
	public String getPayAccno() {
		return payAccno;
	}
	public void setPayAccno(String payAccno) {
		this.payAccno = payAccno;
	}
	public String getRecvAccno() {
		return recvAccno;
	}
	public void setRecvAccno(String recvAccno) {
		this.recvAccno = recvAccno;
	}
	public String getRecvAccName() {
		return recvAccName;
	}
	public void setRecvAccName(String recvAccName) {
		this.recvAccName = recvAccName;
	}
	public String getRecvOpenaccDept() {
		return recvOpenaccDept;
	}
	public void setRecvOpenaccDept(String recvOpenaccDept) {
		this.recvOpenaccDept = recvOpenaccDept;
	}
	public String getRecvUbankno() {
		return recvUbankno;
	}
	public void setRecvUbankno(String recvUbankno) {
		this.recvUbankno = recvUbankno;
	}
	public String getUseof() {
		return useof;
	}
	public void setUseof(String useof) {
		this.useof = useof;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
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
	public String getPayOptType() {
		return payOptType;
	}
	public void setPayOptType(String payOptType) {
		this.payOptType = payOptType;
	}
	
	public String getRecvCounterno() {
		return recvCounterno;
	}
	public void setRecvCounterno(String recvCounterno) {
		this.recvCounterno = recvCounterno;
	}
	
	public String getExchangeNo() {
		return exchangeNo;
	}
	public void setExchangeNo(String exchangeNo) {
		this.exchangeNo = exchangeNo;
	}
	
	public String getIsInterBank() {
		return isInterBank;
	}
	
	public void setIsInterBank(String isInterBank) {
		this.isInterBank = isInterBank;
	}
	/**
	 * @return the payBankType
	 */
	public String getPayBankType() {
		return payBankType;
	}
	/**
	 * @param payBankType the payBankType to set
	 */
	public void setPayBankType(String payBankType) {
		this.payBankType = payBankType;
	}
	/**
	 * @return the payBankno
	 */
	public String getPayBankno() {
		return payBankno;
	}
	/**
	 * @param payBankno the payBankno to set
	 */
	public void setPayBankno(String payBankno) {
		this.payBankno = payBankno;
	}
	
	/**
	 * @return the payAccName
	 */
	public String getPayAccName() {
		return payAccName;
	}
	/**
	 * @param payAccName the payAccName to set
	 */
	public void setPayAccName(String payAccName) {
		this.payAccName = payAccName;
	}
	/**
	 * @return the provinceCode
	 */
	public String getProvinceCode() {
		return provinceCode;
	}
	/**
	 * @param provinceCode the provinceCode to set
	 */
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	/**
	 * @return the cityCode
	 */
	public String getCityCode() {
		return cityCode;
	}
	/**
	 * @param cityCode the cityCode to set
	 */
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	/**
	 * @return the recvProvinceCode
	 */
	public String getRecvProvinceCode() {
		return recvProvinceCode;
	}
	/**
	 * @param recvProvinceCode the recvProvinceCode to set
	 */
	public void setRecvProvinceCode(String recvProvinceCode) {
		this.recvProvinceCode = recvProvinceCode;
	}
	/**
	 * @return the recvCityCode
	 */
	public String getRecvCityCode() {
		return recvCityCode;
	}
	/**
	 * @param recvCityCode the recvCityCode to set
	 */
	public void setRecvCityCode(String recvCityCode) {
		this.recvCityCode = recvCityCode;
	}
	/**
	 * @return the publicOrPrivate
	 */
	public int getPublicOrPrivate() {
		return publicOrPrivate;
	}
	/**
	 * @param publicOrPrivate the publicOrPrivate to set
	 */
	public void setPublicOrPrivate(int publicOrPrivate) {
		this.publicOrPrivate = publicOrPrivate;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OneZlToUserEBSDTO [bankType=" + bankType + ", payType=" + payType + ", toUserMode=" + toUserMode + ", OrderId=" + OrderId + ", payBankType="
				+ payBankType + ", payBankno=" + payBankno + ", payAccno=" + payAccno + ", payAccName=" + payAccName + ", provinceCode=" + provinceCode
				+ ", cityCode=" + cityCode + ", toBankType=" + toBankType + ", recvUbankno=" + recvUbankno + ", recvAccno=" + recvAccno + ", recvAccName="
				+ recvAccName + ", recvOpenaccDept=" + recvOpenaccDept + ", recvProvinceCode=" + recvProvinceCode + ", recvCityCode=" + recvCityCode
				+ ", useof=" + useof + ", amount=" + amount + ", payOptType=" + payOptType + ", rem1=" + rem1 + ", rem2=" + rem2 + ", preparation1="
				+ preparation1 + ", preparation2=" + preparation2 + ", preparation3=" + preparation3 + ", recvCounterno=" + recvCounterno + ", exchangeNo="
				+ exchangeNo + ", isInterBank=" + isInterBank + ", publicOrPrivate=" + publicOrPrivate + "]";
	}

}
