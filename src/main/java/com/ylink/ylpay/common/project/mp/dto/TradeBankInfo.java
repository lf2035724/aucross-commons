/**
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:yu.han 2013-10-25
 */

/**
 * TradeBankInfo.java
 * 版权所有(C) 2013 证联融通电子有限公司 
 * 创建:yu.han 2013-10-25
 */
package com.ylink.ylpay.common.project.mp.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author yu.han
 * @date 2013-10-25
 */
public class TradeBankInfo extends BaseDTO {
	private static final long serialVersionUID = 7056288430210129842L;
	/** 本异地标志0 – 本地1 – 异地	 */
	public int remoteType;
	/**代办银行行别，为代办银行为异地银行，填写00*/
	public String accBankType;
	/**代办行号，如代办银行为本地银行，只需填写本地行别，本字段可为空*/
	public String accBankNo;
	/**代办账号*/
	public String accNo;
	/**代办户名*/
	public String accName;
	/***客户开户行行号 本地业务可为空 异地业务填写异地开户行行号 不足右补空格*/
	public String acpBankNo;
	/**
	 * @return the remoteType
	 */
	public int getRemoteType() {
		return remoteType;
	}
	/**
	 * @param remoteType the remoteType to set
	 */
	public void setRemoteType(int remoteType) {
		this.remoteType = remoteType;
	}
	/**
	 * @return the accBankType
	 */
	public String getAccBankType() {
		return accBankType;
	}
	/**
	 * @param accBankType the accBankType to set
	 */
	public void setAccBankType(String accBankType) {
		this.accBankType = accBankType;
	}
	/**
	 * @return the accBankNo
	 */
	public String getAccBankNo() {
		return accBankNo;
	}
	/**
	 * @param accBankNo the accBankNo to set
	 */
	public void setAccBankNo(String accBankNo) {
		this.accBankNo = accBankNo;
	}
	/**
	 * @return the accNo
	 */
	public String getAccNo() {
		return accNo;
	}
	/**
	 * @param accNo the accNo to set
	 */
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	/**
	 * @return the accName
	 */
	public String getAccName() {
		return accName;
	}
	/**
	 * @param accName the accName to set
	 */
	public void setAccName(String accName) {
		this.accName = accName;
	}
	/**
	 * @return the acpBankNo
	 */
	public String getAcpBankNo() {
		return acpBankNo;
	}
	/**
	 * @param acpBankNo the acpBankNo to set
	 */
	public void setAcpBankNo(String acpBankNo) {
		this.acpBankNo = acpBankNo;
	}
	
}
