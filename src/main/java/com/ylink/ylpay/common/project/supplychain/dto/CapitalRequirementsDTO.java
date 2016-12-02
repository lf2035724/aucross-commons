package com.ylink.ylpay.common.project.supplychain.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * 
 * @author wanglei
 * @date 2013-9-15
 * @description：融资需求DTO
 */
public class CapitalRequirementsDTO extends BaseDTO{

	private static final long serialVersionUID = -376073996612219973L;
	private String messageSeq;//消息序号YYYYMMDD+类型（2方还是三方）+SEQ
	private String requirementsCustId;//客户号
	private String requirementsCustName;//客户名称
	private String contactPersonName;//联系人名称
	private String useOfFunds;//资金用途
	private String guaranteeCondition;//担保条件
	private Long amount;//资金额度
	private String limitUnit;//期限单位D:天 M月 S:季度 Y:年
	private String limit;//期限
	private Double rate;//利率
	private String useCycleType;//使用方式1:一次性 2：循环
	private String contactType;//联系方式T:电话  M:邮件
	private String conntactEmail;//联系方式邮件
	private String conntactPhone;//联系方式电话
	private Date publishDate;//发布时间
	private Date auditDate;//审核时间
	private String auditStatus;//审核状态0:未审核 1：审核通过 2：审核拒绝 
	private String reserverTimes;//预约次数
	public String toString(){
		return super.toString();
	}
	public String getMessageSeq() {
		return messageSeq;
	}
	public void setMessageSeq(String messageSeq) {
		this.messageSeq = messageSeq;
	}
	public String getRequirementsCustId() {
		return requirementsCustId;
	}
	public void setRequirementsCustId(String requirementsCustId) {
		this.requirementsCustId = requirementsCustId;
	}
	public String getRequirementsCustName() {
		return requirementsCustName;
	}
	public void setRequirementsCustName(String requirementsCustName) {
		this.requirementsCustName = requirementsCustName;
	}
	public String getContactPersonName() {
		return contactPersonName;
	}
	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}
	public String getUseOfFunds() {
		return useOfFunds;
	}
	public void setUseOfFunds(String useOfFunds) {
		this.useOfFunds = useOfFunds;
	}
	public String getGuaranteeCondition() {
		return guaranteeCondition;
	}
	public void setGuaranteeCondition(String guaranteeCondition) {
		this.guaranteeCondition = guaranteeCondition;
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
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public Date getAuditDate() {
		return auditDate;
	}
	public void setAuditDate(Date auditDate) {
		this.auditDate = auditDate;
	}
	public String getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getReserverTimes() {
		return reserverTimes;
	}
	public void setReserverTimes(String reserverTimes) {
		this.reserverTimes = reserverTimes;
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
