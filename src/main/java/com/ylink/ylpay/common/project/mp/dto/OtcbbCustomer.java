package com.ylink.ylpay.common.project.mp.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;
import com.ylink.ylpay.common.project.mp.constant.CertificationType;

/**
 *  
 * @author YangXiojin
 * @date 2013-5-11
 * 
 */
public class OtcbbCustomer extends BaseDTO {

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
	
	/**
	 * 开户网点名称
	 */
	private String branchName;
	
	/**
	 * 联行号
	 */
	private String contactBankNo;
	
	/**
	 * 资金账户账号
	 */
	private String capitalAccountNO;
	
	/**
	 * 银行卡记录主键ID
	 */
	private String bankCardId;

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

	/**
	 * @return the contactBankNo
	 */
	public String getContactBankNo() {
		return contactBankNo;
	}

	/**
	 * @param contactBankNo the contactBankNo to set
	 */
	public void setContactBankNo(String contactBankNo) {
		this.contactBankNo = contactBankNo;
	}

}
