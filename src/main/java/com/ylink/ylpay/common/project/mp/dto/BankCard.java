package com.ylink.ylpay.common.project.mp.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;
import com.ylink.ylpay.common.project.account.constant.CustSubject;
import com.ylink.ylpay.common.project.mp.constant.AuditStatus;

public class BankCard extends BaseDTO {

	private static final long serialVersionUID = -9183333466778361872L;

	private String id;

	/**
	 * 客户ID
	 */
	private String custId;




	@Override
	public String toString() {
		System.out.println("contactBankNo="+contactBankNo);
		return super.toString();
	}

	/**
	 * 关联帐户类型
	 */
	private CustSubject accountType;

	/**
	 * 银行户名
	 */
	private String cardName;

	/**
	 * 银行卡号
	 */
	private String cardNo;

	/**
	 * 银行卡类型
	 */
	private String cardType;

	/**
	 * 行别
	 */
	private String bankType;

	/**
	 * 创建时间
	 */
	private Date createDate;

	/**
	 * 更新时间
	 */
	private Date updateTime;

	/**
	 * 是否发送监管行
	 */
	private String isSend;

	/**
	 * 状态
	 */
	private String status;

	/**
	 * 签代扣协议
	 */
	private String isProtocol;

	/**
	 * 认证状态
	 */
	private String isCert;

	/**
	 * 授权号
	 */
	private String authNo;

	/**
	 * 创建标志
	 */
	private String createType;

	/** 备注. */
	private String remark;

	/**
	 * 商户
	 */
	private String merchant;

	/** 行名. */
	private String bankName;

	/**
	 * 客户证件类型
	 */
	private String credentialsType;

	/**
	 * 客户证件号码
	 */
	private String identityCardNumber;

	private String bankUrl;

	/**
	 * 调用者
	 */
	private String invoker;

	/** 联行号. */
	private String contactBankNo;

	/** 网店名称. */
	private String branchName;
	
	/**
	 * 审核状态
	 */
	private AuditStatus auditStatus;
	
	/**
	 * 一级地理区域
	 */
	private String firstGeo;
	
	/**
	 * 二级地理区域
	 */
	private String secondGeo;
	
	/**
	 * 绑定来源
	 */
	private String bindSource;
	
	/**
	 * 绑定渠道（银联用）
	 */
	private String bindCanal;
	/**
	 * 原始协议状态
	 */
	private String originalProtocol;
	/**
	 * 原始认证状态
	 */
	private String originalCert;
	
	public String getCredentialsType() {
		return credentialsType;
	}

	public void setCredentialsType( String credentialsType ) {
		this.credentialsType = credentialsType;
	}

	public String getIdentityCardNumber() {
		return identityCardNumber;
	}

	public void setIdentityCardNumber( String identityCardNumber ) {
		this.identityCardNumber = identityCardNumber;
	}

	public String getId() {
		return id;
	}

	public void setId( String id ) {
		this.id = id;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId( String custId ) {
		this.custId = custId;
	}

	public CustSubject getAccountType() {
		return accountType;
	}

	public void setAccountType( CustSubject accountType ) {
		this.accountType = accountType;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName( String cardName ) {
		this.cardName = cardName;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo( String cardNo ) {
		this.cardNo = cardNo;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType( String cardType ) {
		this.cardType = cardType;
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType( String bankType ) {
		this.bankType = bankType;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate( Date createDate ) {
		this.createDate = createDate;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime( Date updateTime ) {
		this.updateTime = updateTime;
	}

	public String getIsSend() {
		return isSend;
	}

	public void setIsSend( String isSend ) {
		this.isSend = isSend;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus( String status ) {
		this.status = status;
	}

	public String getIsProtocol() {
		return isProtocol;
	}

	public void setIsProtocol( String isProtocol ) {
		this.isProtocol = isProtocol;
	}

	public String getIsCert() {
		return isCert;
	}

	public void setIsCert( String isCert ) {
		this.isCert = isCert;
	}

	public String getAuthNo() {
		return authNo;
	}

	public void setAuthNo( String authNo ) {
		this.authNo = authNo;
	}

	public String getCreateType() {
		return createType;
	}

	public void setCreateType( String createType ) {
		this.createType = createType;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark( String remark ) {
		this.remark = remark;
	}

	public String getMerchant() {
		return merchant;
	}

	public void setMerchant( String merchant ) {
		this.merchant = merchant;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName( String bankName ) {
		this.bankName = bankName;
	}

	public String getBankUrl() {
		return bankUrl;
	}

	public void setBankUrl( String bankUrl ) {
		this.bankUrl = bankUrl;
	}

	public String getInvoker() {
		return invoker;
	}

	public void setInvoker( String invoker ) {
		this.invoker = invoker;
	}

	public String getContactBankNo() {
		return contactBankNo;
	}

	public void setContactBankNo( String contactBankNo ) {
		this.contactBankNo = contactBankNo;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName( String branchName ) {
		this.branchName = branchName;
	}

	public AuditStatus getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(AuditStatus auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getFirstGeo() {
		return firstGeo;
	}

	public void setFirstGeo(String firstGeo) {
		this.firstGeo = firstGeo;
	}

	public String getSecondGeo() {
		return secondGeo;
	}

	public void setSecondGeo(String secondGeo) {
		this.secondGeo = secondGeo;
	}

	public String getBindCanal() {
		return bindCanal;
	}

	public void setBindCanal(String bindCanal) {
		this.bindCanal = bindCanal;
	}

	public String getBindSource() {
		return bindSource;
	}

	public void setBindSource(String bindSource) {
		this.bindSource = bindSource;
	}

	public String getOriginalProtocol() {
		return originalProtocol;
	}

	public void setOriginalProtocol(String originalProtocol) {
		this.originalProtocol = originalProtocol;
	}

	public String getOriginalCert() {
		return originalCert;
	}

	public void setOriginalCert(String originalCert) {
		this.originalCert = originalCert;
	}

}