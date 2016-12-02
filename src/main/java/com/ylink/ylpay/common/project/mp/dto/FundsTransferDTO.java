package com.ylink.ylpay.common.project.mp.dto;

import java.io.Serializable;

public class FundsTransferDTO implements Serializable{

	private static final long serialVersionUID = -6414890567096978072L;
	
	private String identity;

	/**
	 * 付款方客户号
	 */
	private String payerCustId;
	/**
	 * 付款方客户名
	 */
	private String payerCustName;
	/**
	 * 收款方客户号
	 */
	private String payeeCustId;
	/**
	 * 收款方客户名
	 */
	private String payeeCustName;
	/**
	 * 收款方卡号
	 */
	private String payeeCardNo;
	/**
	 * 收款方卡名
	 */
	private String payeeCardName;
	/**
	 * 行别
	 */
	private String payeeBankType;
	/**
	 * 行别
	 */
	private String payeeBankTypeName;
	/**
	 * 附件	
	 */
	private byte[] attachment;
	private String attachType;
	
	private String creatDate;
	
	public String getCreatDate() {
		return creatDate;
	}

	public void setCreatDate(String creatDate) {
		this.creatDate = creatDate;
	}

	private Long TAMT;
	private String showTamt;
	private String remark;
	private String upDate;
	
	public String getUpDate() {
		return upDate;
	}

	public void setUpDate(String upDate) {
		this.upDate = upDate;
	}
	
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getShowTamt() {
		return showTamt;
	}

	public void setShowTamt(String showTamt) {
		this.showTamt = showTamt;
	}

	private String status;
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	
	public Long getTAMT() {
		return TAMT;
	}
	public void setTAMT(Long tAMT) {
		TAMT = tAMT;
	}
	public String getPayeeBankTypeName() {
		return payeeBankTypeName;
	}
	public void setPayeeBankTypeName(String payeeBankTypeName) {
		this.payeeBankTypeName = payeeBankTypeName;
	}

	/**
	 * 类型
	 */
	private String transferType;

	/**
	 * 划拨订单号
	 */
	private String paymentOrder;
	/**
	 * 提现订单号
	 */
	private String withdrawOrder;
	/**
	 * 审核结果
	 */
	private String auditRes;
	
	public String getPayerCustId() {
		return payerCustId;
	}

	public void setPayerCustId(String payerCustId) {
		this.payerCustId = payerCustId;
	}

	public String getPayerCustName() {
		return payerCustName;
	}

	public void setPayerCustName(String payerCustName) {
		this.payerCustName = payerCustName;
	}

	public String getPayeeCustId() {
		return payeeCustId;
	}

	public void setPayeeCustId(String payeeCustId) {
		this.payeeCustId = payeeCustId;
	}

	public String getPayeeCustName() {
		return payeeCustName;
	}

	public void setPayeeCustName(String payeeCustName) {
		this.payeeCustName = payeeCustName;
	}

	public String getPayeeCardNo() {
		return payeeCardNo;
	}

	public void setPayeeCardNo(String payeeCardNo) {
		this.payeeCardNo = payeeCardNo;
	}

	public String getPayeeCardName() {
		return payeeCardName;
	}

	public void setPayeeCardName(String payeeCardName) {
		this.payeeCardName = payeeCardName;
	}

	public String getPayeeBankType() {
		return payeeBankType;
	}

	public void setPayeeBankType(String payeeBankType) {
		this.payeeBankType = payeeBankType;
	}

	public String getTransferType() {
		return transferType;
	}

	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}

	public String getPaymentOrder() {
		return paymentOrder;
	}

	public void setPaymentOrder(String paymentOrder) {
		this.paymentOrder = paymentOrder;
	}

	public String getWithdrawOrder() {
		return withdrawOrder;
	}

	public void setWithdrawOrder(String withdrawOrder) {
		this.withdrawOrder = withdrawOrder;
	}
	
	public byte[] getAttachment() {
		return attachment;
	}
	public void setAttachment(byte[] attachment) {
		this.attachment = attachment;
	}
	public String getAttachType() {
		return attachType;
	}

	public void setAttachType(String attachType) {
		this.attachType = attachType;
	}
	public String getAuditRes() {
		return auditRes;
	}

	public void setAuditRes(String auditRes) {
		this.auditRes = auditRes;
	}
}
