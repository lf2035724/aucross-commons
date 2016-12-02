package com.ylink.ylpay.common.project.mp.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;
import com.ylink.ylpay.common.project.mp.constant.CertificationType;
import com.ylink.ylpay.common.project.mp.constant.ProductType;

/**
 * 企业客户
 * @author YangXiojin
 * @date 2013-5-11
 * 
 */
public class CompanyCustomer extends BaseDTO {

	private static final long serialVersionUID = -4729346110004075224L;
	
	/**
	 * 商户号
	 */
	private String merchant;
	
	/**
	 * 客户编号
	 */
	private String custId;
	
	/**
	 * 名称
	 */
	private String name;
	
	/**
	 * 证件类型
	 */
	private CertificationType certType; 
	
	/**
	 * 证件号码
	 */
	private String certNo;
	
	/**
	 * 银行代码
	 */
	private String bankCode;
	
	/**
	 * 省份代码，参见附录
	 */
	private String bankProvinceCode;
	
	/**
	 * 地区代码，参见附录
	 */
	private String bankRegionCode;
	
	/**
	 * 账户名称
	 */
	private String cardName;
	
	/**
	 * 银行账号
	 */
	private String cardNo;
	private ProductType productType;
	
	/**
	 * 银行卡授权号
	 */
	private String authNo;
	
	/**
	 * 组织机构代码
	 */
	private String orgNo;
	
	/**
	 * 银行卡id
	 */
	private String cardId;
	
	/**
	 * 开户网点名称
	 */
	private String branchName;
	
	/**
	 * 资金账户账号
	 */
	private String capitalAccountNO;
	
	/**
	 * 银行卡记录主键ID
	 */
	private String bankCardId;
	
	/**
	 * 联行号
	 */
	private String contactBankNo;
	

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CertificationType getCertType() {
		return certType;
	}

	public void setCertType(CertificationType certType) {
		this.certType = certType;
	}

	public String getCertNo() {
		return certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankProvinceCode() {
		return bankProvinceCode;
	}

	public void setBankProvinceCode(String bankProvinceCode) {
		this.bankProvinceCode = bankProvinceCode;
	}

	public String getBankRegionCode() {
		return bankRegionCode;
	}

	public void setBankRegionCode(String bankRegionCode) {
		this.bankRegionCode = bankRegionCode;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getMerchant() {
		return merchant;
	}

	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}

	/**
	 * @return the productType
	 */
	public ProductType getProductType() {
		return productType;
	}

	/**
	 * @param productType the productType to set
	 */
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CompanyCustomer [merchant=" + merchant + ", custId=" + custId + ", name=" + name + ", certType=" + certType + ", certNo=" + certNo
				+ ", bankCode=" + bankCode + ", bankProvinceCode=" + bankProvinceCode + ", bankRegionCode=" + bankRegionCode + ", cardName=" + cardName
				+ ", cardNo=" + cardNo + ", productType=" + productType + "]";
	}

	public String getOrgNo() {
		return orgNo;
	}

	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}

	public String getAuthNo() {
		return authNo;
	}

	public void setAuthNo(String authNo) {
		this.authNo = authNo;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getCapitalAccountNO() {
		return capitalAccountNO;
	}

	public void setCapitalAccountNO(String capitalAccountNO) {
		this.capitalAccountNO = capitalAccountNO;
	}

	public String getBankCardId() {
		return bankCardId;
	}

	public void setBankCardId(String bankCardId) {
		this.bankCardId = bankCardId;
	}

	public String getContactBankNo() {
		return contactBankNo;
	}

	public void setContactBankNo(String contactBankNo) {
		this.contactBankNo = contactBankNo;
	}

}
