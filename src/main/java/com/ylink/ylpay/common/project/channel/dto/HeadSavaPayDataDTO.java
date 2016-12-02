package com.ylink.ylpay.common.project.channel.dto;


public class HeadSavaPayDataDTO extends AbstractDTO{
	/**
	 * 管理平台对账数据的DTO
	 */
	private static final long serialVersionUID = 593555945316368L;
	
	private String ID;          //对账表ID
	private String bankType;    //行别 
	private String accDate;     //对账日期（yyyyMMDD）
	private String type;        //支付类型PAY:支付 REFUND:退款 
	
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	public String getAccDate() {
		return accDate;
	}
	public void setAccDate(String accDate) {
		this.accDate = accDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
