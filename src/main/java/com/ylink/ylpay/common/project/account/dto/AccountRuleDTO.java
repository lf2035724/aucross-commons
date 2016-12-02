/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Iquil 2012-10-29
 */

package com.ylink.ylpay.common.project.account.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author Iquil
 * @date 2012-10-29
 * @description：记账规则实体类
 */

public class AccountRuleDTO extends BaseDTO {
	
	private static final long serialVersionUID = -6090066380138262735L;

	/**
	 * 记账规则ID
	 */
	private String ruleId;

	/**
	 * 支付编号
	 */
	private String dealCode;
	
	/**
	 * 记账类型
	 */
	private String accountType;
	
	/**
	 * 计费对象类型0：无（默认）1：付方收费2：收方收费
	 */
	private String feeTargetType;
	
	/**
	 * 付款方科目
	 */
	private String payerSubjectNo;
	
	/**
	 * 付款方是否借贷：借DR ；贷CR
	 */
	private String payerFlag;
	
	/**
	 * 收款方科目
	 */
	private String payeeSubjectNo;
	
	/**
	 * 收款方是否借贷：借DR ；贷CR
	 */
	private String payeeFlag;
	
	private Date updateTime;
	
	private String remark;

	public String getRuleId() {
		return ruleId;
	}

	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public String getDealCode() {
		return dealCode;
	}

	public void setDealCode(String dealCode) {
		this.dealCode = dealCode;
	}

	public String getFeeTargetType() {
		return feeTargetType;
	}

	public void setFeeTargetType(String feeTargetType) {
		this.feeTargetType = feeTargetType;
	}

	public String getPayerSubjectNo() {
		return payerSubjectNo;
	}

	public void setPayerSubjectNo(String payerSubjectNo) {
		this.payerSubjectNo = payerSubjectNo;
	}

	public String getPayerFlag() {
		return payerFlag;
	}

	public void setPayerFlag(String payerFlag) {
		this.payerFlag = payerFlag;
	}

	public String getPayeeSubjectNo() {
		return payeeSubjectNo;
	}

	public void setPayeeSubjectNo(String payeeSubjectNo) {
		this.payeeSubjectNo = payeeSubjectNo;
	}

	public String getPayeeFlag() {
		return payeeFlag;
	}

	public void setPayeeFlag(String payeeFlag) {
		this.payeeFlag = payeeFlag;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

}
