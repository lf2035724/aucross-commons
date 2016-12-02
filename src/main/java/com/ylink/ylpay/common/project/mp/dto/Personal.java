package com.ylink.ylpay.common.project.mp.dto;

import java.util.Date;
import java.util.List;

/**
 * 个人客户
 * 
 * @author YangXiaojin
 */
public class Personal extends Customer {

	private static final long serialVersionUID = -1838995414320770988L;
	
	/**
	 * 客户绑定的银行卡
	 */
	private List<BankCard> bankCardList;

	/**
	 * 注册类型
	 */
	private String registeredType;

	/**
	 * 证件有效期
	 */
	private Date certExpiryDate;

	/**
	 * 别名
	 */
	private String nickName;

	/**
	 * 性别
	 */
	private String gender;

	/**
	 * 生日
	 */
	private Date birthday;

	/**
	 * 婚姻状态
	 */
	private String maritalStatus;

	/**
	 * 民族
	 */
	private String ethnicGroup;

	/**
	 * 政治面貌
	 */
	private String partyAffiliation;

	/**
	 * 血型
	 */
	private String bloodType;

	/**
	 * 身高
	 */
	private Integer height;

	/**
	 * 体重
	 */
	private Float weight;

	/**
	 * 职业
	 */
	private String profession;

	/**
	 * 证券投资经验
	 */
	private String investmentExp;

	/**
	 * 年收入
	 */
	private String annualIncome;

	/** 国籍. */
	private String countryId;

	/** 二级地理区域. */
	private String secondaryGeoId;

	/** 三级地理区域. */
	private String thirdGeoId;

	/** 四级地理区域. */
	private String fourthGeoId;

	/** 联系地址. */
	private String addr;

	/** 邮政编码. */
	private String zipcode;

	/** 办公电话. */
	private String officePhone;

	/** 家庭电话. */
	private String homePhone;

	/** 服务定制. */
	private String serviceType;

	/** 对账单寄送方式. */
	private String sendWay;

	/** 对账单寄送频率. */
	private String sendFrequency;

	/** 学历. */
	private String degree;

	/** 开启交易方式. */
	private String[] tradeType;

	/** 上传的证件文件. */
	private byte[] credentialsFile;
	
	private Boolean isInsert;
	
	private String mobile;

	public String getRegisteredType() {
		return registeredType;
	}

	public void setRegisteredType( String registeredType ) {
		this.registeredType = registeredType;
	}

	public Date getCertExpiryDate() {
		return certExpiryDate;
	}

	public void setCertExpiryDate( Date certExpiryDate ) {
		this.certExpiryDate = certExpiryDate;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName( String nickName ) {
		this.nickName = nickName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender( String gender ) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday( Date birthday ) {
		this.birthday = birthday;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus( String maritalStatus ) {
		this.maritalStatus = maritalStatus;
	}

	public String getEthnicGroup() {
		return ethnicGroup;
	}

	public void setEthnicGroup( String ethnicGroup ) {
		this.ethnicGroup = ethnicGroup;
	}

	public String getPartyAffiliation() {
		return partyAffiliation;
	}

	public void setPartyAffiliation( String partyAffiliation ) {
		this.partyAffiliation = partyAffiliation;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType( String bloodType ) {
		this.bloodType = bloodType;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight( Integer height ) {
		this.height = height;
	}

	public Float getWeight() {
		return weight;
	}

	public void setWeight( Float weight ) {
		this.weight = weight;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession( String profession ) {
		this.profession = profession;
	}

	public String getInvestmentExp() {
		return investmentExp;
	}

	public void setInvestmentExp( String investmentExp ) {
		this.investmentExp = investmentExp;
	}

	public String getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome( String annualIncome ) {
		this.annualIncome = annualIncome;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId( String countryId ) {
		this.countryId = countryId;
	}

	public String getSecondaryGeoId() {
		return secondaryGeoId;
	}

	public void setSecondaryGeoId( String secondaryGeoId ) {
		this.secondaryGeoId = secondaryGeoId;
	}

	public String getThirdGeoId() {
		return thirdGeoId;
	}

	public void setThirdGeoId( String thirdGeoId ) {
		this.thirdGeoId = thirdGeoId;
	}

	public String getFourthGeoId() {
		return fourthGeoId;
	}

	public void setFourthGeoId( String fourthGeoId ) {
		this.fourthGeoId = fourthGeoId;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr( String addr ) {
		this.addr = addr;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode( String zipcode ) {
		this.zipcode = zipcode;
	}

	public String getOfficePhone() {
		return officePhone;
	}

	public void setOfficePhone( String officePhone ) {
		this.officePhone = officePhone;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone( String homePhone ) {
		this.homePhone = homePhone;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType( String serviceType ) {
		this.serviceType = serviceType;
	}

	public String getSendWay() {
		return sendWay;
	}

	public void setSendWay( String sendWay ) {
		this.sendWay = sendWay;
	}

	public String getSendFrequency() {
		return sendFrequency;
	}

	public void setSendFrequency( String sendFrequency ) {
		this.sendFrequency = sendFrequency;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree( String degree ) {
		this.degree = degree;
	}

	public String[] getTradeType() {
		return tradeType;
	}

	public void setTradeType( String[] tradeType ) {
		this.tradeType = tradeType;
	}

	public byte[] getCredentialsFile() {
		return credentialsFile;
	}

	public void setCredentialsFile( byte[] credentialsFile ) {
		this.credentialsFile = credentialsFile;
	}

	public List<BankCard> getBankCardList() {
		return bankCardList;
	}

	public void setBankCardList(List<BankCard> bankCardList) {
		this.bankCardList = bankCardList;
	}

	public Boolean getIsInsert() {
		return isInsert;
	}

	public void setIsInsert(Boolean isInsert) {
		this.isInsert = isInsert;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}