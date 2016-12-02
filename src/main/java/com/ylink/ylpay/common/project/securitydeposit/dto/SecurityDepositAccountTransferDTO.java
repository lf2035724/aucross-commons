package com.ylink.ylpay.common.project.securitydeposit.dto;

import com.ylink.ylpay.common.project.channel.dto.AbstractDTO;

/**
 * @author wanglei
 * @date 2014-4-23
 * @description：保证金银证转账DTO
 */
public class SecurityDepositAccountTransferDTO extends AbstractDTO{

	private static final long serialVersionUID = 7326070609729864375L;
	/**证券公司代码*/
	private String bankCode;
	/**柜台资金账号*/
	private String fundAccount;
	/**柜台交易密码*/
	private String tradePassword;
	/**接入商户号*/
	private String merchantNo;
	/**柜台资金密码*/
	private String fundPassword;
	/**柜台银行密码*/
	private String bankPassword;
	/**币种*/
	private String moneyType;
	/**银行代码*/
	private String bankNo;
	/**转账业务类型，1-银行转证券 2-证券转银行*/
	private String transferDirection;
	/**发生金额*/
	private String amount;
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
	public String getFundPassword() {
		return fundPassword;
	}
	public void setFundPassword(String fundPassword) {
		this.fundPassword = fundPassword;
	}
	public String getBankPassword() {
		return bankPassword;
	}
	public void setBankPassword(String bankPassword) {
		this.bankPassword = bankPassword;
	}
	public String getMoneyType() {
		return moneyType;
	}
	public void setMoneyType(String moneyType) {
		this.moneyType = moneyType;
	}
	public String getBankNo() {
		return bankNo;
	}
	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}
	public String getTransferDirection() {
		return transferDirection;
	}
	public void setTransferDirection(String transferDirection) {
		this.transferDirection = transferDirection;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
}
