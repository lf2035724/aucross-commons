package com.ylink.ylpay.common.project.channel.dto;

import com.ylink.ylpay.common.project.channel.constant.ReturnCode;


public class SavaPayDataDTO extends AbstractDTO{
	/**
	 * 管理平台对账数据的DTO
	 */
	private static final long serialVersionUID = 593555945316368L;
	
	private String bankType;    //行别 
	private String orderNo;     //订单号
	private String tradeTime;   //交易日期（yyyyMMDD）
	private String accDate;     //记帐日期（yyyyMMDD）
	private Long   amount;      //金额（分单位）  
	private String type;        //支付类型PAY:支付 REFUND:退款 
	private ReturnCode billStatus;  //单据状态FAILURE:失败SUCCESS:成功     
	private String preparation1;//预留字段1    
	private String preparation2;//预留字段2    
	private String preparation3;//预留字段3    
	private boolean synStatus;	//同步状态b
	private String errMsg;		//错误信息
	private String accountingNo;		//凭证号
	private String accountDetailNo;		//账户明细编号
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getTradeTime() {
		return tradeTime;
	}
	public void setTradeTime(String tradeTime) {
		this.tradeTime = tradeTime;
	}
	public String getAccDate() {
		return accDate;
	}
	public void setAccDate(String accDate) {
		this.accDate = accDate;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public ReturnCode getBillStatus() {
		return billStatus;
	}
	public void setBillStatus(ReturnCode billStatus) {
		this.billStatus = billStatus;
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
	public boolean isSynStatus() {
		return synStatus;
	}
	public void setSynStatus(boolean synStatus) {
		this.synStatus = synStatus;
	}
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getAccountingNo() {
		return accountingNo;
	}
	public void setAccountingNo(String accountingNo) {
		this.accountingNo = accountingNo;
	}
	public String getAccountDetailNo() {
		return accountDetailNo;
	}
	public void setAccountDetailNo(String accountDetailNo) {
		this.accountDetailNo = accountDetailNo;
	}
}
