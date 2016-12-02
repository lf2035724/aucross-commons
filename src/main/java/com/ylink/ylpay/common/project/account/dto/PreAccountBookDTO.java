/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Iquil 2013-3-3
 */

package com.ylink.ylpay.common.project.account.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author Iquil
 * @date 2013-3-3
 * @description：预记账接口实体类
 */

public class PreAccountBookDTO extends BaseDTO {

	private static final long serialVersionUID = -4825325578728932964L;

	/**
	 * 记账金额（必须大于0，否则报错）
	 */
	private long amount;
	
	/**
	 * 辅助编码
	 */
	private String choiceCode;
	
	/**
	 * 记账规则ID
	 */
	private String ruleId;
	
	/**
	 * 付款方客户编号
	 */
	private String payerCustID;
	
	/**
	 * 收款方客户编号
	 */
	private String payeeCustID;

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public String getChoiceCode() {
		return choiceCode;
	}

	public void setChoiceCode(String choiceCode) {
		this.choiceCode = choiceCode;
	}

	public String getRuleId() {
		return ruleId;
	}

	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public String getPayerCustID() {
		return payerCustID;
	}

	public void setPayerCustID(String payerCustID) {
		this.payerCustID = payerCustID;
	}

	public String getPayeeCustID() {
		return payeeCustID;
	}

	public void setPayeeCustID(String payeeCustID) {
		this.payeeCustID = payeeCustID;
	}
	
}
