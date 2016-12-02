package com.ylink.ylpay.common.project.securitydeposit.dto;

import com.ylink.ylpay.common.project.channel.dto.AbstractDTO;

/**
 * @author wanglei
 * @date 2014-4-14
 * @description：保证金提现DTO
 */
public class SecurityDepositWithdrawDTO extends AbstractDTO{

	private static final long serialVersionUID = -5261321501551605378L;
	/**证券公司代码*/
	private String bankCode;
	/**柜台资金账号*/
	private String fundAccount;
	/**商户柜台资金密码*/
	private String fundPassword;
	/**接入商户号*/
	private String merchantNo;
	/**提现订单号*/
	private String withdrawNo;
	/**提现订单日期*/
	private String withdrawDate;
	/**提现订单时间*/
	private String withdrawTime;
	/**提现金额*/
	private String withdrawAmount;
	/**提现描述*/
	private String withdrawDesc;
	/**业务渠道*/
	private String entrustWay;
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
	public String getFundPassword() {
		return fundPassword;
	}
	public void setFundPassword(String fundPassword) {
		this.fundPassword = fundPassword;
	}
	public String getMerchantNo() {
		return merchantNo;
	}
	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}
	public String getWithdrawNo() {
		return withdrawNo;
	}
	public void setWithdrawNo(String withdrawNo) {
		this.withdrawNo = withdrawNo;
	}
	public String getWithdrawDate() {
		return withdrawDate;
	}
	public void setWithdrawDate(String withdrawDate) {
		this.withdrawDate = withdrawDate;
	}
	public String getWithdrawTime() {
		return withdrawTime;
	}
	public void setWithdrawTime(String withdrawTime) {
		this.withdrawTime = withdrawTime;
	}
	public String getWithdrawAmount() {
		return withdrawAmount;
	}
	public void setWithdrawAmount(String withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}
	public String getWithdrawDesc() {
		return withdrawDesc;
	}
	public void setWithdrawDesc(String withdrawDesc) {
		this.withdrawDesc = withdrawDesc;
	}
	public String getEntrustWay() {
		return entrustWay;
	}
	public void setEntrustWay(String entrustWay) {
		this.entrustWay = entrustWay;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
