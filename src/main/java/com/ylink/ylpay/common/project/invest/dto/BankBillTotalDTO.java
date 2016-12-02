package com.ylink.ylpay.common.project.invest.dto;

import java.io.Serializable;
import java.util.Date;

public class BankBillTotalDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;

	private String type;

	private String tradecode;

	private String fundcode;

	private String checkdate;

	private String batchid;

	private Long sumCount;

	private Long sumAmt;

	private String auditResult;

	private Long errorCount;

	private String describe;

	private Date createDate;

	private Date updateDate;

	private Long fSumCount;

	private Long fSumAmt;
	private String settlmentDate;
	public String getSettlmentDate() {
		return settlmentDate;
	}

	public void setSettlmentDate(String settlmentDate) {
		this.settlmentDate = settlmentDate;
	}

	public void setFSumCount(Long sumCount) {
		fSumCount = sumCount;
	}

	public void setFSumAmt(Long sumAmt) {
		fSumAmt = sumAmt;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTradecode() {
		return tradecode;
	}

	public void setTradecode(String tradecode) {
		this.tradecode = tradecode;
	}

	public String getFundcode() {
		return fundcode;
	}

	public void setFundcode(String fundcode) {
		this.fundcode = fundcode;
	}

	public String getCheckdate() {
		return checkdate;
	}

	public void setCheckdate(String checkdate) {
		this.checkdate = checkdate;
	}

	public String getBatchid() {
		return batchid;
	}

	public void setBatchid(String batchid) {
		this.batchid = batchid;
	}

	public Long getSumCount() {
		return sumCount;
	}

	public void setSumCount(Long sumCount) {
		this.sumCount = sumCount;
	}

	public Long getSumAmt() {
		return sumAmt;
	}

	public void setSumAmt(Long sumAmt) {
		this.sumAmt = sumAmt;
	}

	public String getAuditResult() {
		return auditResult;
	}

	public void setAuditResult(String auditResult) {
		this.auditResult = auditResult;
	}

	public Long getErrorCount() {
		return errorCount;
	}

	public void setErrorCount(Long errorCount) {
		this.errorCount = errorCount;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Long getfSumCount() {
		return fSumCount;
	}

	public void setfSumCount(Long fSumCount) {
		this.fSumCount = fSumCount;
	}

	public Long getfSumAmt() {
		return fSumAmt;
	}

	public void setfSumAmt(Long fSumAmt) {
		this.fSumAmt = fSumAmt;
	}
	/**
	 * OGNL需要get
	 */
	public Long getFSumCount() {
		return fSumCount;
	}
	public Long getFSumAmt() {
		return fSumAmt;
	}
}