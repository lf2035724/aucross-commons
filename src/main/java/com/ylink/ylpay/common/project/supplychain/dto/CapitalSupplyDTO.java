package com.ylink.ylpay.common.project.supplychain.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * @description 融资供给DTO
 * @author wanglei
 *
 */
public class CapitalSupplyDTO extends BaseDTO{

	private static final long serialVersionUID = 721749296332244121L;
	
	private String messageSeq;//消息序号YYYYMMDD+类型（2方还是三方）+SEQ
	private String supplyCustId;//供给方客户号
	private String supplyCustName;//供给方客户名称
	private String productName;//产品名称
	private String messageType;//消息类型0:两方1:三方
	private String applyCondition;//申请条件
	private Long amount;//资金额度
	private String limitUnit;//期限单D:天 M月 S:季度 Y:年
	private String limit;//期限
	private Double rate;//利率
	private String useCycleType;//使用方式1:一次性 2：循环
	private String contactPersonName;//联系人
	private String contactType;//联系方式T:电话M:邮件
	private String conntactEmail;//联系方式邮件
	private String conntactPhone;//联系方式电话
	private String reserverTimes;//预约次数默认0
	private Date createDate;//发布时间
	private String auditStatus;//审核状态
	private Date auditDate;//审核时间
	public String toString(){
		return super.toString();
	}
	public String getMessageSeq() {
		return messageSeq;
	}
	public void setMessageSeq(String messageSeq) {
		this.messageSeq = messageSeq;
	}
	public String getSupplyCustName() {
		return supplyCustName;
	}
	public void setSupplyCustName(String supplyCustName) {
		this.supplyCustName = supplyCustName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public String getApplyCondition() {
		return applyCondition;
	}
	public void setApplyCondition(String applyCondition) {
		this.applyCondition = applyCondition;
	}
	public String getLimitUnit() {
		return limitUnit;
	}
	public void setLimitUnit(String limitUnit) {
		this.limitUnit = limitUnit;
	}
	public String getLimit() {
		return limit;
	}
	public void setLimit(String limit) {
		this.limit = limit;
	}
	public String getUseCycleType() {
		return useCycleType;
	}
	public void setUseCycleType(String useCycleType) {
		this.useCycleType = useCycleType;
	}
	public String getContactPersonName() {
		return contactPersonName;
	}
	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}
	public String getContactType() {
		return contactType;
	}
	public void setContactType(String contactType) {
		this.contactType = contactType;
	}
	public String getConntactEmail() {
		return conntactEmail;
	}
	public void setConntactEmail(String conntactEmail) {
		this.conntactEmail = conntactEmail;
	}
	public String getConntactPhone() {
		return conntactPhone;
	}
	public void setConntactPhone(String conntactPhone) {
		this.conntactPhone = conntactPhone;
	}
	public String getReserverTimes() {
		return reserverTimes;
	}
	public void setReserverTimes(String reserverTimes) {
		this.reserverTimes = reserverTimes;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getSupplyCustId() {
		return supplyCustId;
	}
	public void setSupplyCustId(String supplyCustId) {
		this.supplyCustId = supplyCustId;
	}
	public Date getAuditDate() {
		return auditDate;
	}
	public void setAuditDate(Date auditDate) {
		this.auditDate = auditDate;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}

}
