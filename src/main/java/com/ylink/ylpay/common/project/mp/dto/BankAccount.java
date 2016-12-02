/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 */

package com.ylink.ylpay.common.project.mp.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;
import com.ylink.ylpay.common.project.channel.constant.ChannelType;
import com.ylink.ylpay.common.project.mp.constant.BankAccountType;
import com.ylink.ylpay.common.project.mp.constant.ProductType;

/** 
 * @author YangXiaojin
 * @date 2013-1-7
 * @description：TODO
 */

public class BankAccount extends BaseDTO {
	
	private static final long serialVersionUID = 4934014365183939428L;
	/**
	 * 只读
	 */
	private Boolean readOnly;
	/**
	 * 银行代码
	 */
	private String bankType;
	
	/**
	 * 银行名称
	 */
	private String bankName;
	
	/**
	 * 业务系统
	 */
	private ProductType productType;
	
	/**
	 * 渠道类型：001网银；002快捷支付
	 */
	private ChannelType channelType;
	
	/**
	 * 户名
	 */
	private String bankAcountName;
	
	/**
	 * 账号
	 */
	private String bankAcountNo;
	
	/**
	 * 对应虚拟客户号
	 */
	private String virtualCustid;
	/**
	 * 联行号
	 */
	private String ubankNo;
	/**
	 * 联行名称
	 */
	private String ubankName;
	
	/**
	 * 类型 BankAccountType
	 */
	private String type;
	
	/**
	 * 支付类型 PayType
	 */
	private String payType;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 科目
	 */
	private String subject;
	/**
	 * 省份编码
	 */
	private String provinceCode;
	/**
	 * 城市编码
	 */
	private String cityCode;
	/**
	 * 虚拟账户ID
	 */
	private String virBankCardId;
	/**
	 * 虚拟账户的真实账户ID
	 */
	private String virRefBankCardId;
	/**
	 * 真实行别
	 */
	private String realBankType;
	/**
	 * 是否基金总帐户
	 */
	public boolean isFundTotal(){
		return BankAccountType.FUND_TOTAL.getValue().equals(this.type);
	}
	/**
	 * 
	 * @description 是否交易所总账户 
	 * @return  
	 * @author fly.zhao
	 * @date 2014-8-21
	 */
	public boolean isOtcbbTotal(){
		return BankAccountType.OTCBB_TOTAL.getValue().equals(this.type);
	}
	/**
	 * 
	 * @description  是否消费总账户
	 * @return  
	 * @author fly.zhao
	 * @date 2014-8-21
	 */
	public boolean isGeneralTotal(){
		return BankAccountType.GENERAL_TOTAL.getValue().equals(this.type);
	}

	/**
	 * 是否基金总帐户
	 */
	public boolean isFundMiddle(){
		return BankAccountType.FUND_VIR.getValue().equals(this.type);
	}
	
	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public ChannelType getChannelType() {
		return channelType;
	}

	public void setChannelType(ChannelType channelType) {
		this.channelType = channelType;
	}

	public String getBankAcountName() {
		return bankAcountName;
	}

	public void setBankAcountName(String bankAcountName) {
		this.bankAcountName = bankAcountName;
	}

	public String getBankAcountNo() {
		return bankAcountNo;
	}

	public void setBankAcountNo(String bankAcountNo) {
		this.bankAcountNo = bankAcountNo;
	}

	public String getVirtualCustid() {
		return virtualCustid;
	}

	public void setVirtualCustid(String virtualCustid) {
		this.virtualCustid = virtualCustid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public Boolean getReadOnly() {
		return readOnly;
	}

	public void setReadOnly(Boolean readOnly) {
		this.readOnly = readOnly;
	}

	public String getUbankNo() {
		return ubankNo;
	}

	public void setUbankNo(String ubankNo) {
		this.ubankNo = ubankNo;
	}

	public String getUbankName() {
		return ubankName;
	}

	public void setUbankName(String ubankName) {
		this.ubankName = ubankName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getVirBankCardId() {
		return virBankCardId;
	}

	public void setVirBankCardId(String virBankCardId) {
		this.virBankCardId = virBankCardId;
	}

	public String getVirRefBankCardId() {
		return virRefBankCardId;
	}

	public void setVirRefBankCardId(String virRefBankCardId) {
		this.virRefBankCardId = virRefBankCardId;
	}

	public String getRealBankType() {
		return realBankType;
	}

	public void setRealBankType(String realBankType) {
		this.realBankType = realBankType;
	}

}
