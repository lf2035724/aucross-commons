/**
 * OfflineRechargeOrderDTO.java
 * 版权所有(C) 2013 证联融通电子有限公司 
 * 创建:LiuQ 2013-12-9
 */
package com.ylink.ylpay.common.project.fund.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * @author LiuQ
 * @date 2013-12-9
 * @description 线下充值对外实体
 */
public class OfflineRechargeOrderDTO extends BaseDTO {

	private static final long serialVersionUID = -532180213796550838L;

	/**
	 * ID
	 */
	private String id;
	
	/**
	 * 商户号
	 */
	private String merchantId;

	/**
	 * 商户流水号
	 */
	private String fundSeqId;

	/**
	 * 商户系统日期(YYYYMMDD)
	 */
	private String fundDate;

	/**
	 * 商户系统时间戳(HHMMSS)
	 */
	private String FundTime;

	/**
	 * 客户编号
	 */
	private String custId;

	/**
	 * 客户名称
	 */
	private String userNameText;

	/**
	 * 证件类型
	 */
	private String certType;

	/**
	 * 证件号码
	 */
	private String certId;

	/**
	 * 充值码
	 */
	private String rechargeCode;

	/**
	 * 银行类别（收款行别）
	 */
	private String rechiBankCode;

	/**
	 * 银行类别（付款行别）
	 */
	private String paymentBankCode;

	/**
	 * 账户名称
	 */
	private String cardName;

	/**
	 * 账号
	 */
	private String cardNo;

	/**
	 * 转入金额（分）
	 */
	private long rechargeAmt;

	/**
	 * 状态
	 * 00：新建
	 * 01：支付处理中
	 * 02：支付成功
	 * 03：支付失败
	 */
	private String status;

	/**
	 * 审核状态
	 * 0：未审核
	 * 1：复审通过
	 * 2：复审拒绝
	 * 3：初审通过
	 * 4：初审拒绝
	 */
	private String auditStatus;

	/**
	 * 审核备注
	 */
	private String auditMsg;

	/**
	 * 支付系统充值订单号
	 */
	private String rechargeNo;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 更新时间
	 */
	private Date updateTime;

	/**
	 * 备注
	 */
	private String description;
	
	/**
	 * 初审审核人员
	 */
	private String firstChecker;
	
	/**
	 * 复审审核人员
	 */
	private String finalChecker;
	
	/**
	 * 对账状态 
	 * 00：成功 
	 * 01：失败
	 */
	private String checkStatus;
	
	/**
	 * 是否发送回执 
	 * 00：未回执 
	 * 01：已回执
	 */
	private String isCallback;
	
	/**
	 * 回执日期
	 */
	private String callBackDate;
	
	/**
	 * 保留域，接收方必须原样回送该字段数据保留域，
	 * 接收方必须原样回送该字段数据
	 */
	private String resv;
	
	private String[] instuidInfo;
	private Date queryBeginLiqDate;
    private Date queryEndLiqDate;
    
	/**
	 * @return the queryBeginLiqDate
	 */
	public Date getQueryBeginLiqDate() {
		return queryBeginLiqDate;
	}

	/**
	 * @param queryBeginLiqDate the queryBeginLiqDate to set
	 */
	public void setQueryBeginLiqDate(Date queryBeginLiqDate) {
		this.queryBeginLiqDate = queryBeginLiqDate;
	}

	/**
	 * @return the queryEndLiqDate
	 */
	public Date getQueryEndLiqDate() {
		return queryEndLiqDate;
	}

	/**
	 * @param queryEndLiqDate the queryEndLiqDate to set
	 */
	public void setQueryEndLiqDate(Date queryEndLiqDate) {
		this.queryEndLiqDate = queryEndLiqDate;
	}

	/**
	 * @return the instuidInfo
	 */
	public String[] getInstuidInfo() {
		return instuidInfo;
	}

	/**
	 * @param instuidInfo the instuidInfo to set
	 */
	public void setInstuidInfo(String[] instuidInfo) {
		this.instuidInfo = instuidInfo;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the merchantId
	 */
	public String getMerchantId() {
		return merchantId;
	}

	/**
	 * @param merchantId the merchantId to set
	 */
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	/**
	 * @return the fundSeqId
	 */
	public String getFundSeqId() {
		return fundSeqId;
	}

	/**
	 * @param fundSeqId the fundSeqId to set
	 */
	public void setFundSeqId(String fundSeqId) {
		this.fundSeqId = fundSeqId;
	}

	/**
	 * @return the fundDate
	 */
	public String getFundDate() {
		return fundDate;
	}

	/**
	 * @param fundDate the fundDate to set
	 */
	public void setFundDate(String fundDate) {
		this.fundDate = fundDate;
	}

	/**
	 * @return the fundTime
	 */
	public String getFundTime() {
		return FundTime;
	}

	/**
	 * @param fundTime the fundTime to set
	 */
	public void setFundTime(String fundTime) {
		FundTime = fundTime;
	}

	/**
	 * @return the custId
	 */
	public String getCustId() {
		return custId;
	}

	/**
	 * @param custId the custId to set
	 */
	public void setCustId(String custId) {
		this.custId = custId;
	}

	/**
	 * @return the userNameText
	 */
	public String getUserNameText() {
		return userNameText;
	}

	/**
	 * @param userNameText the userNameText to set
	 */
	public void setUserNameText(String userNameText) {
		this.userNameText = userNameText;
	}

	/**
	 * @return the certType
	 */
	public String getCertType() {
		return certType;
	}

	/**
	 * @param certType the certType to set
	 */
	public void setCertType(String certType) {
		this.certType = certType;
	}

	/**
	 * @return the certId
	 */
	public String getCertId() {
		return certId;
	}

	/**
	 * @param certId the certId to set
	 */
	public void setCertId(String certId) {
		this.certId = certId;
	}

	/**
	 * @return the rechargeCode
	 */
	public String getRechargeCode() {
		return rechargeCode;
	}

	/**
	 * @param rechargeCode the rechargeCode to set
	 */
	public void setRechargeCode(String rechargeCode) {
		this.rechargeCode = rechargeCode;
	}

	/**
	 * @return the rechiBankCode
	 */
	public String getRechiBankCode() {
		return rechiBankCode;
	}

	/**
	 * @param rechiBankCode the rechiBankCode to set
	 */
	public void setRechiBankCode(String rechiBankCode) {
		this.rechiBankCode = rechiBankCode;
	}

	/**
	 * @return the paymentBankCode
	 */
	public String getPaymentBankCode() {
		return paymentBankCode;
	}

	/**
	 * @param paymentBankCode the paymentBankCode to set
	 */
	public void setPaymentBankCode(String paymentBankCode) {
		this.paymentBankCode = paymentBankCode;
	}

	/**
	 * @return the cardName
	 */
	public String getCardName() {
		return cardName;
	}

	/**
	 * @param cardName the cardName to set
	 */
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	/**
	 * @return the cardNo
	 */
	public String getCardNo() {
		return cardNo;
	}

	/**
	 * @param cardNo the cardNo to set
	 */
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	/**
	 * @return the rechargeAmt
	 */
	public long getRechargeAmt() {
		return rechargeAmt;
	}

	/**
	 * @param rechargeAmt the rechargeAmt to set
	 */
	public void setRechargeAmt(long rechargeAmt) {
		this.rechargeAmt = rechargeAmt;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the auditStatus
	 */
	public String getAuditStatus() {
		return auditStatus;
	}

	/**
	 * @param auditStatus the auditStatus to set
	 */
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	/**
	 * @return the auditMsg
	 */
	public String getAuditMsg() {
		return auditMsg;
	}

	/**
	 * @param auditMsg the auditMsg to set
	 */
	public void setAuditMsg(String auditMsg) {
		this.auditMsg = auditMsg;
	}

	/**
	 * @return the rechargeNo
	 */
	public String getRechargeNo() {
		return rechargeNo;
	}

	/**
	 * @param rechargeNo the rechargeNo to set
	 */
	public void setRechargeNo(String rechargeNo) {
		this.rechargeNo = rechargeNo;
	}

	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * @param updateTime the updateTime to set
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the firstChecker
	 */
	public String getFirstChecker() {
		return firstChecker;
	}

	/**
	 * @param firstChecker the firstChecker to set
	 */
	public void setFirstChecker(String firstChecker) {
		this.firstChecker = firstChecker;
	}

	/**
	 * @return the finalChecker
	 */
	public String getFinalChecker() {
		return finalChecker;
	}

	/**
	 * @param finalChecker the finalChecker to set
	 */
	public void setFinalChecker(String finalChecker) {
		this.finalChecker = finalChecker;
	}

	/**
	 * @return the checkStatus
	 */
	public String getCheckStatus() {
		return checkStatus;
	}

	/**
	 * @param checkStatus the checkStatus to set
	 */
	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}

	/**
	 * @return the isCallback
	 */
	public String getIsCallback() {
		return isCallback;
	}

	/**
	 * @param isCallback the isCallback to set
	 */
	public void setIsCallback(String isCallback) {
		this.isCallback = isCallback;
	}

	/**
	 * @return the callBackDate
	 */
	public String getCallBackDate() {
		return callBackDate;
	}

	/**
	 * @param callBackDate the callBackDate to set
	 */
	public void setCallBackDate(String callBackDate) {
		this.callBackDate = callBackDate;
	}

	/**
	 * @return the resv
	 */
	public String getResv() {
		return resv;
	}

	/**
	 * @param resv the resv to set
	 */
	public void setResv(String resv) {
		this.resv = resv;
	}
}
