package com.ylink.ylpay.common.project.channel.dto;


public class ReturnQuryEBankStataDTO extends AbstractDTO{
	/**
	 * 网银支付查询状态返回
	 */
	private static final long serialVersionUID = 5935558070945316368L;
	private String oldOrderId;      //原订单号      
	private String oldChannelSn;    //原渠道查询流水
	private String oldRequestSn;    //原渠道请求银行流水
	private String orderIdState;   //订单状态
	private String fileName;   //对账文件名
	private String preparation1; //预留字段1    
	private String preparation2; //预留字段2    
	private String preparation3; //预留字段3    
	
	public String getOldOrderId() {
		return oldOrderId;
	}
	public void setOldOrderId(String oldOrderId) {
		this.oldOrderId = oldOrderId;
	}
	public String getOldChannelSn() {
		return oldChannelSn;
	}
	public void setOldChannelSn(String oldChannelSn) {
		this.oldChannelSn = oldChannelSn;
	}
	public String getOrderIdState() {
		return orderIdState;
	}
	public void setOrderIdState(String orderIdState) {
		this.orderIdState = orderIdState;
	}
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
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
	public String getOldRequestSn() {
		return oldRequestSn;
	}
	public void setOldRequestSn(String oldRequestSn) {
		this.oldRequestSn = oldRequestSn;
	}

}
