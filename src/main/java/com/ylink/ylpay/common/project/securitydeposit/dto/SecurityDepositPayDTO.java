package com.ylink.ylpay.common.project.securitydeposit.dto;

import com.ylink.ylpay.common.project.channel.dto.AbstractDTO;

/**
 * @author wanglei
 * @date 2014-4-14
 * @description：保证金支付DTO
 */
public class SecurityDepositPayDTO extends AbstractDTO{

	private static final long serialVersionUID = -8678115115870227136L;
	/**证券公司代码*/
	private String bankCode;
	/**柜台资金账号*/
	private String fundAccount;
	/**柜台资金密码*/
	private String fundPassword;
	/**接入商户号*/
	private String merchantNo;
	/**订单号*/
	private String orderNo;
	/**订单日期*/
	private String orderDate;
	/**订单时间*/
	private String orderTime;
	/**订单金额*/
	private String orderAmount;
	/**订单描述*/
	private String orderDesc;
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
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	public String getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getOrderDesc() {
		return orderDesc;
	}
	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
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
	public String getMerchantNo() {
		return merchantNo;
	}
	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}
}
