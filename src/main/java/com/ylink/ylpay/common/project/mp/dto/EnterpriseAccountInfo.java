/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 */
package com.ylink.ylpay.common.project.mp.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * @author yanghan
 * @date 2013-4-13
 * @description：门户企业客户（对公账户信息）
 */
public class EnterpriseAccountInfo extends BaseDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2027001684939500331L;
	
	/**企业客户编号*/
	private String custId;
	/**客户银行卡ID*/
	private String bankCardId;
	/**户名*/
	private String cardName;
	/**银行卡号*/
	private String cardNo;
	/**银行行别*/
	private String bankType;
	/**联行号*/
	private String contactBankNo;
	/**支行网点名称*/
	private String branchName;
	/**
	 * @return the bankCardId
	 */
	public String getBankCardId() {
		return bankCardId;
	}
	/**
	 * @param bankCardId the bankCardId to set
	 */
	public void setBankCardId(String bankCardId) {
		this.bankCardId = bankCardId;
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
	 * @return the bankType
	 */
	public String getBankType() {
		return bankType;
	}
	/**
	 * @param bankType the bankType to set
	 */
	public void setBankType(String bankType) {
		this.bankType = bankType;
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
	/**
	 * @return the branchName
	 */
	public String getBranchName() {
		return branchName;
	}
	/**
	 * @param branchName the branchName to set
	 */
	public void setBranchName(String branchName) {
		this.branchName = branchName;
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
}
