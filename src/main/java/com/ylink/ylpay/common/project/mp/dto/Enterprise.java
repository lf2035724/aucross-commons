package com.ylink.ylpay.common.project.mp.dto;

import java.util.Date;
import java.util.List;

import com.ylink.ylpay.common.project.mp.constant.AuditStatus;
import com.ylink.ylpay.common.project.mp.constant.AuthApplicantType;
import com.ylink.ylpay.common.project.mp.constant.CertificationType;
import com.ylink.ylpay.common.project.mp.constant.EnterLinkStatus;
import com.ylink.ylpay.common.project.mp.constant.RegisteredType;
import com.ylink.ylpay.common.project.mp.constant.WhetherStatus;

/**
 * 企业客户DTO.
 * 
 * @author 潘瑞峥
 * @date 2013-3-26
 */
public class Enterprise extends Customer {

	private static final long serialVersionUID = -2005133257010217620L;

	/** 企业电子邮箱. */
	private String email;

	/** 手机. */
	private String mobile;

	/** 注册类型. */
	private RegisteredType registeredType;

	/** 审核状态. */
	private AuditStatus auditStatus;

	/** 验证金额(分). */
	private Long moneyVerify;

	/** 验证金额失败次数. */
	private Long moneyFailureCount;

	/** 审核失败描述. */
	private String auditFailureDescription;

	/** 营业执照 - 文件ID. */
	private String licenseId;

	/** 营业执照 - 注册号. */
	private String licenseNo;

	/** 营业执照 - 所在地(!). */
	private String licenseGeoId;

	/** 营业执照 - 所在地所有父节点. */
	private List<String> licenseParentGeoIds;

	/** 营业执照 - 营业期限. */
	private String licenseLegalValidTerm;

	/** 营业执照 - 是否长期. */
	private WhetherStatus licenseIsLongterm;

	/** 营业执照 - 住所. */
	private String licenseResidence;

	/** 联系电话. */
	private String phone;

	/** 组织机构 - 文件ID. */
	private String orgId;

	/** 组织机构 - 代码. */
	private String orgNo;

	/** 地税 - 文件ID. */
	private String landtaxId;

	/** 营业执照 - 经营范围. */
	private String licenseLegalScope;

	/** 营业执照 - 注册资本. */
	private String licenseRegCapital;

	/** 传真. */
	private String fax;

	/** 法人 - 姓名. */
	private String legalpersonName;

	/** 法人 - 归属地(!). */
	private String legalpersonGeoId;

	/** 法人 - 归属地所有父节点. */
	private List<String> legalpersonParentGeoIds;

	/** 法人 - 证件类型. */
	private String legalpersonCertType;

	/** 法人 - 证件号码. */
	private String legalpersonCertNo;

	/** 法人 - 文件ID. */
	private String legalpersonId;

	/** 法人 - 背面文件ID. */
	private String legalpersonBackId;

	/** 法人 - 手机号. */
	private String legalpersonMobile;

	/** 实名认证申请人类型. */
	private AuthApplicantType authApplicantType;

	/** 代理人 - 姓名. */
	private String agentName;

	/** 代理人 - 证件类型. */
	private CertificationType agentCertType;

	/** 代理人 - 证件号码. */
	private String agentCertNo;

	/** 代理人 - 文件ID. */
	private String agentId;

	/** 代理人 - 背面文件ID. */
	private String agentBackId;

	/** 代理人 - 企业委托书文件ID. */
	private String companyPoaId;

	/** 代理人 - 手机号. */
	private String agentMobile;

	/** 代理人 - 归属地(!). */
	private String agentGeoId;

	/** 代理人 - 归属地所有父节点. */
	private List<String> agentParentGeoIds;

	/** 客户银行卡. */
	private BankCard bankCard;

	/** 是否开通企业通 默认为 0：未开通 1：已开通 */
	private String ifOpenEnterLink;

	/** 企业通开通时间 */
	private Date openEnterLinkTime;

	/** 企业通状态 */
	private EnterLinkStatus enterLinkStatus;

	/** 注册地址 */
	private String addrReg;

	/**
	 * 是否供应链企业
	 */
	private String isSupply;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public RegisteredType getRegisteredType() {
		return registeredType;
	}

	public void setRegisteredType(RegisteredType registeredType) {
		this.registeredType = registeredType;
	}

	public AuditStatus getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(AuditStatus auditStatus) {
		this.auditStatus = auditStatus;
	}

	public Long getMoneyVerify() {
		return moneyVerify;
	}

	public void setMoneyVerify(Long moneyVerify) {
		this.moneyVerify = moneyVerify;
	}

	public Long getMoneyFailureCount() {
		return moneyFailureCount;
	}

	public void setMoneyFailureCount(Long moneyFailureCount) {
		this.moneyFailureCount = moneyFailureCount;
	}

	public String getAuditFailureDescription() {
		return auditFailureDescription;
	}

	public void setAuditFailureDescription(String auditFailureDescription) {
		this.auditFailureDescription = auditFailureDescription;
	}

	public String getLicenseId() {
		return licenseId;
	}

	public void setLicenseId(String licenseId) {
		this.licenseId = licenseId;
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getLicenseGeoId() {
		return licenseGeoId;
	}

	public void setLicenseGeoId(String licenseGeoId) {
		this.licenseGeoId = licenseGeoId;
	}

	public String getLicenseLegalValidTerm() {
		return licenseLegalValidTerm;
	}

	public void setLicenseLegalValidTerm(String licenseLegalValidTerm) {
		this.licenseLegalValidTerm = licenseLegalValidTerm;
	}

	public WhetherStatus getLicenseIsLongterm() {
		return licenseIsLongterm;
	}

	public void setLicenseIsLongterm(WhetherStatus licenseIsLongterm) {
		this.licenseIsLongterm = licenseIsLongterm;
	}

	public String getLicenseResidence() {
		return licenseResidence;
	}

	public void setLicenseResidence(String licenseResidence) {
		this.licenseResidence = licenseResidence;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOrgNo() {
		return orgNo;
	}

	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}

	public String getLandtaxId() {
		return landtaxId;
	}

	public void setLandtaxId(String landtaxId) {
		this.landtaxId = landtaxId;
	}

	public String getLicenseLegalScope() {
		return licenseLegalScope;
	}

	public void setLicenseLegalScope(String licenseLegalScope) {
		this.licenseLegalScope = licenseLegalScope;
	}

	public String getLicenseRegCapital() {
		return licenseRegCapital;
	}

	public void setLicenseRegCapital(String licenseRegCapital) {
		this.licenseRegCapital = licenseRegCapital;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getLegalpersonName() {
		return legalpersonName;
	}

	public void setLegalpersonName(String legalpersonName) {
		this.legalpersonName = legalpersonName;
	}

	public String getLegalpersonGeoId() {
		return legalpersonGeoId;
	}

	public void setLegalpersonGeoId(String legalpersonGeoId) {
		this.legalpersonGeoId = legalpersonGeoId;
	}

	public String getLegalpersonCertType() {
		return legalpersonCertType;
	}

	public void setLegalpersonCertType(String legalpersonCertType) {
		this.legalpersonCertType = legalpersonCertType;
	}

	public String getLegalpersonCertNo() {
		return legalpersonCertNo;
	}

	public void setLegalpersonCertNo(String legalpersonCertNo) {
		this.legalpersonCertNo = legalpersonCertNo;
	}

	public String getLegalpersonId() {
		return legalpersonId;
	}

	public void setLegalpersonId(String legalpersonId) {
		this.legalpersonId = legalpersonId;
	}

	public String getLegalpersonBackId() {
		return legalpersonBackId;
	}

	public void setLegalpersonBackId(String legalpersonBackId) {
		this.legalpersonBackId = legalpersonBackId;
	}

	public String getLegalpersonMobile() {
		return legalpersonMobile;
	}

	public void setLegalpersonMobile(String legalpersonMobile) {
		this.legalpersonMobile = legalpersonMobile;
	}

	public AuthApplicantType getAuthApplicantType() {
		return authApplicantType;
	}

	public void setAuthApplicantType(AuthApplicantType authApplicantType) {
		this.authApplicantType = authApplicantType;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public CertificationType getAgentCertType() {
		return agentCertType;
	}

	public void setAgentCertType(CertificationType agentCertType) {
		this.agentCertType = agentCertType;
	}

	public String getAgentCertNo() {
		return agentCertNo;
	}

	public void setAgentCertNo(String agentCertNo) {
		this.agentCertNo = agentCertNo;
	}

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAgentBackId() {
		return agentBackId;
	}

	public void setAgentBackId(String agentBackId) {
		this.agentBackId = agentBackId;
	}

	public String getCompanyPoaId() {
		return companyPoaId;
	}

	public void setCompanyPoaId(String companyPoaId) {
		this.companyPoaId = companyPoaId;
	}

	public String getAgentMobile() {
		return agentMobile;
	}

	public void setAgentMobile(String agentMobile) {
		this.agentMobile = agentMobile;
	}

	public String getAgentGeoId() {
		return agentGeoId;
	}

	public void setAgentGeoId(String agentGeoId) {
		this.agentGeoId = agentGeoId;
	}

	public BankCard getBankCard() {
		return bankCard;
	}

	public void setBankCard(BankCard bankCard) {
		this.bankCard = bankCard;
	}

	public List<String> getLicenseParentGeoIds() {
		return licenseParentGeoIds;
	}

	public void setLicenseParentGeoIds(List<String> licenseParentGeoIds) {
		this.licenseParentGeoIds = licenseParentGeoIds;
	}

	public List<String> getLegalpersonParentGeoIds() {
		return legalpersonParentGeoIds;
	}

	public void setLegalpersonParentGeoIds(List<String> legalpersonParentGeoIds) {
		this.legalpersonParentGeoIds = legalpersonParentGeoIds;
	}

	public List<String> getAgentParentGeoIds() {
		return agentParentGeoIds;
	}

	public void setAgentParentGeoIds(List<String> agentParentGeoIds) {
		this.agentParentGeoIds = agentParentGeoIds;
	}

	public String getIfOpenEnterLink() {
		return ifOpenEnterLink;
	}

	public void setIfOpenEnterLink(String ifOpenEnterLink) {
		this.ifOpenEnterLink = ifOpenEnterLink;
	}

	public Date getOpenEnterLinkTime() {
		return openEnterLinkTime;
	}

	public void setOpenEnterLinkTime(Date openEnterLinkTime) {
		this.openEnterLinkTime = openEnterLinkTime;
	}

	public EnterLinkStatus getEnterLinkStatus() {
		return enterLinkStatus;
	}

	public void setEnterLinkStatus(EnterLinkStatus enterLinkStatus) {
		this.enterLinkStatus = enterLinkStatus;
	}

	public String getAddrReg() {
		return addrReg;
	}

	public void setAddrReg(String addrReg) {
		this.addrReg = addrReg;
	}

	public String getIsSupply() {
		return isSupply;
	}

	public void setIsSupply(String isSupply) {
		this.isSupply = isSupply;
	}
}