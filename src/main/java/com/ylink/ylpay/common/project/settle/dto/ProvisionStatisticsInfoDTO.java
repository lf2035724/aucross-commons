/*******************************************************************************
 * Project   : aucross-common
 * Class Name: com.ylink.ylpay.common.project.settle.dto.ProvisionStatisticsInfoDTO
 * Created By: 杜波 159-9965-3650
 * Created on: 2013-4-2 下午3:36:48
 * Copyright © 2010-2012 证联融通 All rights reserved.
 ******************************************************************************/
package com.ylink.ylpay.common.project.settle.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * <P>备付金统计信息DTO</P>
 * @author 杜波 159-9965-3650
 * @description：
 */
public class ProvisionStatisticsInfoDTO extends BaseDTO {

	private static final long serialVersionUID = -9211929511739279307L;
	/**
	 * 帐务日期
	 */
    private String accountDate;
	/**
	 * 二级科目编号
	 */
    private String subjectNo2;
	/**
	 * 二级科目名称
	 */
    private String subjectName;
	/**
	 * 总金额
	 */
    private Long cashAmount;
	/**
	 * 二级科目总数
	 */
    private int subjectNo2Count;
    
    
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getAccountDate() {
		return accountDate;
	}
	public void setAccountDate(String accountDate) {
		this.accountDate = accountDate;
	}
	public String getSubjectNo2() {
		return subjectNo2;
	}
	public void setSubjectNo2(String subjectNo2) {
		this.subjectNo2 = subjectNo2;
	}
	public int getSubjectNo2Count() {
		return subjectNo2Count;
	}
	public void setSubjectNo2Count(int subjectNo2Count) {
		this.subjectNo2Count = subjectNo2Count;
	}
	public Long getCashAmount() {
		return cashAmount;
	}
	public void setCashAmount(Long cashAmount) {
		this.cashAmount = cashAmount;
	}
}
