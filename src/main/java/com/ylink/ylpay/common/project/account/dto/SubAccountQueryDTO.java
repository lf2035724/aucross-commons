/**
 * 版权所有(C) 2012 证联融通
 * 创建:HuAJ 2012-11-17
 */

package com.ylink.ylpay.common.project.account.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * @author HuAJ
 * @date 2012-11-17
 * @description：TODO
 */

public class SubAccountQueryDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6290474927931701409L;

	/**
	 * 账户ID
	 */
	private String accountId;

	/**
	 * 账户名称
	 */
	private String accountName;

	/**
	 * 客户ID
	 */
	private String custId;

	/**
	 * 所属二级科目
	 */
	private String subjectNo2;

	/**
	 * 科目类型：1资产；2负债3；权益；4损益-收入；5损益-支出
	 */
	private String subjectType;

	/**
	 * 账户状态：00生效；01冻结；03禁止借记；04禁止贷记
	 */
	private String accountState;

	/**
	 * 账户金额
	 */
	private long cashAmount;

	/**
	 * 账户金额范围1，字符型，单位为分
	 */
	private String cashAmountFrom;

	/**
	 * 账户金额范围2，字符型，单位为分
	 */
	private String cashAmountTo;

	/**
	 * 借贷方向：借DR ；贷CR
	 */
	private String drCrFlag;

	private Date createTime;

	private Date updateTime;

	/**
	 * 科目名称
	 */
	public String getSubjectTypeName() {
		if ("1".equals(this.getSubjectType())) {
			return "资产";
		} else if ("2".equals(this.getSubjectType())) {
			return "负债";
		} else if ("3".equals(this.getSubjectType())) {
			return "权益";
		} else if ("4".equals(this.getSubjectType())) {
			return "损益-收入";
		} else if ("5".equals(this.getSubjectType())) {
			return "损益-支出";
		} else
			return "--";
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getSubjectNo2() {
		return subjectNo2;
	}

	public void setSubjectNo2(String subjectNo2) {
		this.subjectNo2 = subjectNo2;
	}

	public String getSubjectType() {
		return subjectType;
	}

	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}

	public String getAccountState() {
		return accountState;
	}

	public void setAccountState(String accountState) {
		this.accountState = accountState;
	}

	public String getDrCrFlag() {
		return drCrFlag;
	}

	public void setDrCrFlag(String drCrFlag) {
		this.drCrFlag = drCrFlag;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public long getCashAmount() {
		return cashAmount;
	}

	public void setCashAmount(long cashAmount) {
		this.cashAmount = cashAmount;
	}

	public String getCashAmountFrom() {
		return cashAmountFrom;
	}

	public void setCashAmountFrom(String cashAmountFrom) {
		this.cashAmountFrom = cashAmountFrom;
	}

	public String getCashAmountTo() {
		return cashAmountTo;
	}

	public void setCashAmountTo(String cashAmountTo) {
		this.cashAmountTo = cashAmountTo;
	}

}
