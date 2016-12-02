/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-11-6
 */

package com.ylink.ylpay.common.project.pay.dto;

import java.util.List;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author ZhangDM(Mingly)
 * @date 2012-11-6
 * @description：提现确认DTO
 */

public class WithdrawConfirmDTO extends BaseDTO {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 确认订单号
	 */
	private List<String> withdrawIdList;
	
	/**
	 * 付款款方银行虚拟客户Id
	 */
	private String vPayerBankCustId;
	/**
	 * 付款款方银行虚拟客户名称
	 */
	private String vPayerBankCustName;
	/**
	 * 付款方银行卡号
	 */
	private String payerBankCardNo;
	/**
	 * 付款方银行行别
	 */
	private String payerBankType;
	/**
	 * 支付类型，参照枚举 WithdrawPaymentType
	 */
	private String paymentType;
	
	public List<String> getWithdrawIdList() {
		return withdrawIdList;
	}
	public void setWithdrawIdList(List<String> withdrawIdList) {
		this.withdrawIdList = withdrawIdList;
	}
	public String getvPayerBankCustId() {
		return vPayerBankCustId;
	}
	public void setvPayerBankCustId(String vPayerBankCustId) {
		this.vPayerBankCustId = vPayerBankCustId;
	}
	public String getvPayerBankCustName() {
		return vPayerBankCustName;
	}
	public void setvPayerBankCustName(String vPayerBankCustName) {
		this.vPayerBankCustName = vPayerBankCustName;
	}
	public String getPayerBankCardNo() {
		return payerBankCardNo;
	}
	public void setPayerBankCardNo(String payerBankCardNo) {
		this.payerBankCardNo = payerBankCardNo;
	}
	public String getPayerBankType() {
		return payerBankType;
	}
	public void setPayerBankType(String payerBankType) {
		this.payerBankType = payerBankType;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	
	
}
