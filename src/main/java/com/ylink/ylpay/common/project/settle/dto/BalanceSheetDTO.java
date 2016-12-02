/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Iquil 2013-4-2
 */

package com.ylink.ylpay.common.project.settle.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * @author Iquil
 * @date 2013-4-2
 * @description：资产负债表的实体类
 */

public class BalanceSheetDTO extends BaseDTO {

	private static final long serialVersionUID = 3312556959349729597L;

	/**
	 * 科目编号
	 */
	private String subjectNo;

	/**
	 * 科目名称
	 */
	private String subjectName;

	/**
	 * 科目类型：1资产；2负债3；权益；4损益-收入；5损益-支出
	 */
	private String subjectType;

	/**
	 * 借贷方向：借DR ；贷CR
	 */
	private String drCrFlag;

	/**
	 * 1一级科目；2二级科目
	 */
	private String subjectLevel;

	/**
	 * 本期金额
	 */
	private long cashAmount;
	
	/**
	 * 上期金额
	 */
	private long lastCashAmount;

	/**
	 * 本期所取账务日期
	 */
	private String accountDate;
	
	/**
	 * 上期所取账务日期
	 */
	private String lastAccountDate;

	public String getSubjectNo() {
		return subjectNo;
	}

	public void setSubjectNo(String subjectNo) {
		this.subjectNo = subjectNo;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectType() {
		return subjectType;
	}

	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}

	public String getDrCrFlag() {
		return drCrFlag;
	}

	public void setDrCrFlag(String drCrFlag) {
		this.drCrFlag = drCrFlag;
	}

	public String getSubjectLevel() {
		return subjectLevel;
	}

	public void setSubjectLevel(String subjectLevel) {
		this.subjectLevel = subjectLevel;
	}

	public long getCashAmount() {
		return cashAmount;
	}

	public void setCashAmount(long cashAmount) {
		this.cashAmount = cashAmount;
	}

	public long getLastCashAmount() {
		return lastCashAmount;
	}

	public void setLastCashAmount(long lastCashAmount) {
		this.lastCashAmount = lastCashAmount;
	}

	public String getAccountDate() {
		return accountDate;
	}

	public void setAccountDate(String accountDate) {
		this.accountDate = accountDate;
	}

	public String getLastAccountDate() {
		return lastAccountDate;
	}

	public void setLastAccountDate(String lastAccountDate) {
		this.lastAccountDate = lastAccountDate;
	}
}
