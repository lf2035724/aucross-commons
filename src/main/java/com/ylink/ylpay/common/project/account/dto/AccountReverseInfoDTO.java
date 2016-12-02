/**
 * 版权所有(C) 2012 证联融通
 * 创建:HuAJ 2012-12-5
 */

package com.ylink.ylpay.common.project.account.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author HuAJ
 * @date 2012-12-5
 * @description：TODO
 */

public class AccountReverseInfoDTO extends BaseDTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4496779364429877678L;

	/**
	 * 记账冲正流水id
	 */
	private long reverseId;

	/**
	 * 借方科目
	 */
	private String drSubjectNo;

	/**
	 * 借方客户编号
	 */
	private String drCustId;

	/**
	 * 贷方科目
	 */
	private String crSubjectNo;

	/**
	 * 贷方客户编号
	 */
	private String crCustId;

	/**
	 * 冲正金额
	 */
	private long reverseAmount;

	/**
	 * 冲正原因
	 */
	private String reverseDesc;

	/**
	 * 冲正账期，YYYYMMDD
	 */
	private String reverseAccountDate;

	/**
	 * 冲正时间
	 */
	private Date reverseTime;

	/**
	 * 原记账接口流水id
	 */
	private long orgBookId;

	/**
	 * 原支付订单号
	 */
	private String orgPayId;

	/**
	 * 记原记账金额
	 */
	private long orgAmount;

	/**
	 * 原账期，YYYYMMDD
	 */
	private String orgAccountDate;
	
	/**
	 * 起始时间
	 */
	private String dateFrom;
	
	/**
	 * 终止时间
	 */
	private String dateTo;
	
	/**
	 * 支付订单号
	 */
	private String payId;

	public String getPayId() {
		return payId;
	}

	public void setPayId(String payId) {
		this.payId = payId;
	}

	public long getReverseId() {
		return reverseId;
	}

	public void setReverseId(long reverseId) {
		this.reverseId = reverseId;
	}

	public String getDrSubjectNo() {
		return drSubjectNo;
	}

	public void setDrSubjectNo(String drSubjectNo) {
		this.drSubjectNo = drSubjectNo;
	}

	public String getDrCustId() {
		return drCustId;
	}

	public void setDrCustId(String drCustId) {
		this.drCustId = drCustId;
	}

	public String getCrSubjectNo() {
		return crSubjectNo;
	}

	public void setCrSubjectNo(String crSubjectNo) {
		this.crSubjectNo = crSubjectNo;
	}

	public String getCrCustId() {
		return crCustId;
	}

	public void setCrCustId(String crCustId) {
		this.crCustId = crCustId;
	}

	public long getReverseAmount() {
		return reverseAmount;
	}

	public void setReverseAmount(long reverseAmount) {
		this.reverseAmount = reverseAmount;
	}

	public String getReverseDesc() {
		return reverseDesc;
	}

	public void setReverseDesc(String reverseDesc) {
		this.reverseDesc = reverseDesc;
	}

	public String getReverseAccountDate() {
		return reverseAccountDate;
	}

	public void setReverseAccountDate(String reverseAccountDate) {
		this.reverseAccountDate = reverseAccountDate;
	}

	public Date getReverseTime() {
		return reverseTime;
	}

	public void setReverseTime(Date reverseTime) {
		this.reverseTime = reverseTime;
	}

	public long getOrgBookId() {
		return orgBookId;
	}

	public void setOrgBookId(long orgBookId) {
		this.orgBookId = orgBookId;
	}

	public String getOrgPayId() {
		return orgPayId;
	}

	public void setOrgPayId(String orgPayId) {
		this.orgPayId = orgPayId;
	}

	public long getOrgAmount() {
		return orgAmount;
	}

	public void setOrgAmount(long orgAmount) {
		this.orgAmount = orgAmount;
	}

	public String getOrgAccountDate() {
		return orgAccountDate;
	}

	public void setOrgAccountDate(String orgAccountDate) {
		this.orgAccountDate = orgAccountDate;
	}

	public String getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}

	public String getDateTo() {
		return dateTo;
	}

	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}
}
