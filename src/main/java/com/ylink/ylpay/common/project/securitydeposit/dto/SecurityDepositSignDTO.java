package com.ylink.ylpay.common.project.securitydeposit.dto;

import com.ylink.ylpay.common.project.channel.dto.AbstractDTO;

/**
 * @author wanglei
 * @date 2014-4-11
 * @description：保证金签约DTO
 */
public class SecurityDepositSignDTO extends AbstractDTO{

	private static final long serialVersionUID = 3327756428426158442L;
	
	/**证券公司代码*/
	private String bankCode;
	/**柜台资金账号*/
	private String fundAccount;
	/**柜台交易密码*/
	private String tradePassword;
	/**接入商户号*/
	private String merchantNo;
	/**证件类别*/
	private String idKind;
	/**证件号码*/
	private String idNo;
	/**姓名/机构名称*/
	private String clientName;
	/**组织机构代码*/
	private String organCode;
	/**备注*/
	private String remark;
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getFundAccount() {
		return fundAccount;
	}
	public void setFundAccount(String fundAccount) {
		this.fundAccount = fundAccount;
	}
	public String getTradePassword() {
		return tradePassword;
	}
	public void setTradePassword(String tradePassword) {
		this.tradePassword = tradePassword;
	}
	public String getMerchantNo() {
		return merchantNo;
	}
	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}
	public String getIdKind() {
		return idKind;
	}
	public void setIdKind(String idKind) {
		this.idKind = idKind;
	}
	public String getIdNo() {
		return idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getOrganCode() {
		return organCode;
	}
	public void setOrganCode(String organCode) {
		this.organCode = organCode;
	}
}
