package com.ylink.ylpay.common.project.channel.dto;


public class CompareAccountEBSDTO extends AbstractDTO{
	/**
	 * 快捷付对账DTO
	 */
	private static final long serialVersionUID = 5935558070945316368L;
	private String bankType;     //行别       
	private String payment;      //交易金额     
	private String channelSn;    //渠道订单号    
	private String bankStata;    //支付备注1    
	private String dateTime;     //交易日期    
	private String preparation1; //预留字段1    
	private String preparation2; //预留字段2    
	private String preparation3; //预留字段3    
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getChannelSn() {
		return channelSn;
	}
	public void setChannelSn(String channelSn) {
		this.channelSn = channelSn;
	}
	public String getBankStata() {
		return bankStata;
	}
	public void setBankStata(String bankStata) {
		this.bankStata = bankStata;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
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
