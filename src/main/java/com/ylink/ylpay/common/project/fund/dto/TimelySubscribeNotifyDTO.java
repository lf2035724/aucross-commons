package com.ylink.ylpay.common.project.fund.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

public class TimelySubscribeNotifyDTO extends BaseDTO {

	private static final long serialVersionUID = -1933023475483529221L;
	
	private String redmeinstuid;//		证联融通分配给商户的机构代码
	private String buyInstuId;//		申购机构商户号
	private String liqDate;//			清算日期
	private String redmeFundSeqId;//	商户系统流水号。需要保证	一个交易日中流水号的唯一性
	private String buyFundSeqId;//		申购流水号
	private String status;//            整笔单子状态
	private String rechargeID;//		充值订单号（对应支付）
//	private String rechargeStatus;//	充值订单状态（对应支付）
	private String redmeTradeId;//		赎回订单号（对应支付）
//	private String redmeTradeStatus;//	赎回订单状态（对应支付）
	private String subsTradeId;//		申购订单号（对应支付）
//	private String subsTradeStatus;//	申购订单状态（对应支付）
	private String respCode;//			错误码
	private String respDesc;//			错误描述
	/**
	 * @return the redmeinstuid
	 */
	public String getRedmeinstuid() {
		return redmeinstuid;
	}
	/**
	 * @param redmeinstuid the redmeinstuid to set
	 */
	public void setRedmeinstuid(String redmeinstuid) {
		this.redmeinstuid = redmeinstuid;
	}
	/**
	 * @return the buyInstuId
	 */
	public String getBuyInstuId() {
		return buyInstuId;
	}
	/**
	 * @param buyInstuId the buyInstuId to set
	 */
	public void setBuyInstuId(String buyInstuId) {
		this.buyInstuId = buyInstuId;
	}
	/**
	 * @return the liqDate
	 */
	public String getLiqDate() {
		return liqDate;
	}
	/**
	 * @param liqDate the liqDate to set
	 */
	public void setLiqDate(String liqDate) {
		this.liqDate = liqDate;
	}
	/**
	 * @return the redmeFundSeqId
	 */
	public String getRedmeFundSeqId() {
		return redmeFundSeqId;
	}
	/**
	 * @param redmeFundSeqId the redmeFundSeqId to set
	 */
	public void setRedmeFundSeqId(String redmeFundSeqId) {
		this.redmeFundSeqId = redmeFundSeqId;
	}
	/**
	 * @return the buyFundSeqId
	 */
	public String getBuyFundSeqId() {
		return buyFundSeqId;
	}
	/**
	 * @param buyFundSeqId the buyFundSeqId to set
	 */
	public void setBuyFundSeqId(String buyFundSeqId) {
		this.buyFundSeqId = buyFundSeqId;
	}
	/**
	 * @return the rechargeID
	 */
	public String getRechargeID() {
		return rechargeID;
	}
	/**
	 * @param rechargeID the rechargeID to set
	 */
	public void setRechargeID(String rechargeID) {
		this.rechargeID = rechargeID;
	}
	
	/**
	 * @return the redmeTradeId
	 */
	public String getRedmeTradeId() {
		return redmeTradeId;
	}
	/**
	 * @param redmeTradeId the redmeTradeId to set
	 */
	public void setRedmeTradeId(String redmeTradeId) {
		this.redmeTradeId = redmeTradeId;
	}
	/**
	 * @return the subsTradeId
	 */
	public String getSubsTradeId() {
		return subsTradeId;
	}
	/**
	 * @param subsTradeId the subsTradeId to set
	 */
	public void setSubsTradeId(String subsTradeId) {
		this.subsTradeId = subsTradeId;
	}
	/**
	 * @return the respCode
	 */
	public String getRespCode() {
		return respCode;
	}
	/**
	 * @param respCode the respCode to set
	 */
	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}
	/**
	 * @return the respDesc
	 */
	public String getRespDesc() {
		return respDesc;
	}
	/**
	 * @param respDesc the respDesc to set
	 */
	public void setRespDesc(String respDesc) {
		this.respDesc = respDesc;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
