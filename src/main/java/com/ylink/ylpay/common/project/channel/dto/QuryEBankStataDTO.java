package com.ylink.ylpay.common.project.channel.dto;


public class QuryEBankStataDTO extends AbstractDTO{
	/**
	 * 网银支付查询状态
	 */
	private static final long serialVersionUID = 5935558070945316368L;
	private String oldOorderId;   //支付系统需要查询的订单号      
	private String oldchannelSn;  //查询渠道的渠道流水
	private String bankType;      //行别    
	private String payType;       //支付账户类型
	private String START;         //起始日期yyyyMMYY
	private String END;           //结束yyyyMMYY
	private String preparation1; //预留字段1    
	private String preparation2; //预留字段2    
	private String preparation3; //预留字段3    
	/**
	 * @return the oldOorderId
	 */
	public String getOldOorderId() {
		return oldOorderId;
	}
	/**
	 * @param oldOorderId the oldOorderId to set
	 */
	public void setOldOorderId(String oldOorderId) {
		this.oldOorderId = oldOorderId;
	}
	/**
	 * @return the oldchannelSn
	 */
	public String getOldchannelSn() {
		return oldchannelSn;
	}
	/**
	 * @param oldchannelSn the oldchannelSn to set
	 */
	public void setOldchannelSn(String oldchannelSn) {
		this.oldchannelSn = oldchannelSn;
	}
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
	 * @return the sTART
	 */
	public String getSTART() {
		return START;
	}
	/**
	 * @param sTART the sTART to set
	 */
	public void setSTART(String sTART) {
		START = sTART;
	}
	/**
	 * @return the eND
	 */
	public String getEND() {
		return END;
	}
	/**
	 * @param eND the eND to set
	 */
	public void setEND(String eND) {
		END = eND;
	}
	/**
	 * @return the preparation1
	 */
	public String getPreparation1() {
		return preparation1;
	}
	/**
	 * @param preparation1 the preparation1 to set
	 */
	public void setPreparation1(String preparation1) {
		this.preparation1 = preparation1;
	}
	/**
	 * @return the preparation2
	 */
	public String getPreparation2() {
		return preparation2;
	}
	/**
	 * @param preparation2 the preparation2 to set
	 */
	public void setPreparation2(String preparation2) {
		this.preparation2 = preparation2;
	}
	/**
	 * @return the preparation3
	 */
	public String getPreparation3() {
		return preparation3;
	}
	/**
	 * @param preparation3 the preparation3 to set
	 */
	public void setPreparation3(String preparation3) {
		this.preparation3 = preparation3;
	}
	
	

	


}
