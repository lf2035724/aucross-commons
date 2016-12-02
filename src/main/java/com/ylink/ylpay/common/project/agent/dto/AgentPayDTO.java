package com.ylink.ylpay.common.project.agent.dto;

import java.util.Date;

import com.ylink.ylpay.common.project.channel.dto.AbstractDTO;

/**
 * @author wanglei
 * @date 2014-7-23
 * @description：
 */
public class AgentPayDTO extends AbstractDTO{

	private static final long serialVersionUID = -4758585487563500528L;

	/** 主键 */
	private String agentPaySn;
	/** 请求支付流水号 */
	private String requestPaySn;
	/** 请求商户ID */
	private String instuId;
	/** 请求流水 */
	private String requestSn;
	/** 请求时间 */
	private String requestDate;
	/** 支付金额 */
	private String amount;
	/** 支付方式 */
	private String payType;
	/** 支付银行代码 */
	private String payBankCode;
	/** 支付银行卡类别0：储蓄卡；1：贷记卡 */
	private String cardType;
	/** 支付状态00：待支付；01：支付成功；02：支付失败 */
	private String payStatus;
	/** 支付系统订单号 */
	private String tradeId;
	/** 支付完成时间 */
	private Date paySucDate;
	/** 后台通知URL */
	private String notifyUrl;
	/** 后台通知状态 */
	private String notifyStatus;
	/** 页面通知URL */
	private String callbackUrl;
	/** 页面通知状态 */
	private String callbackStatus;
	private String extraCommonParam;
	/** 创建时间 */
	private Date createTime;
	/** 结算商户ID */
	private String settleInstuId;
	public String getAgentPaySn() {
		return agentPaySn;
	}
	public void setAgentPaySn(String agentPaySn) {
		this.agentPaySn = agentPaySn;
	}
	public String getRequestPaySn() {
		return requestPaySn;
	}
	public void setRequestPaySn(String requestPaySn) {
		this.requestPaySn = requestPaySn;
	}
	public String getInstuId() {
		return instuId;
	}
	public void setInstuId(String instuId) {
		this.instuId = instuId;
	}
	public String getRequestSn() {
		return requestSn;
	}
	public void setRequestSn(String requestSn) {
		this.requestSn = requestSn;
	}
	public String getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getPayBankCode() {
		return payBankCode;
	}
	public void setPayBankCode(String payBankCode) {
		this.payBankCode = payBankCode;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	public String getTradeId() {
		return tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	public Date getPaySucDate() {
		return paySucDate;
	}
	public void setPaySucDate(Date paySucDate) {
		this.paySucDate = paySucDate;
	}
	public String getNotifyUrl() {
		return notifyUrl;
	}
	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}
	public String getNotifyStatus() {
		return notifyStatus;
	}
	public void setNotifyStatus(String notifyStatus) {
		this.notifyStatus = notifyStatus;
	}
	public String getCallbackUrl() {
		return callbackUrl;
	}
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}
	public String getCallbackStatus() {
		return callbackStatus;
	}
	public void setCallbackStatus(String callbackStatus) {
		this.callbackStatus = callbackStatus;
	}
	public String getExtraCommonParam() {
		return extraCommonParam;
	}
	public void setExtraCommonParam(String extraCommonParam) {
		this.extraCommonParam = extraCommonParam;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getSettleInstuId() {
		return settleInstuId;
	}
	public void setSettleInstuId(String settleInstuId) {
		this.settleInstuId = settleInstuId;
	}
}
