/*******************************************************************************
 * Project   : aucross-common
 * Class Name: com.ylink.ylpay.common.project.settle.dto.FormulaBalanceDTO
 * Created By: 杜波 159-9965-3650
 * Created on: 2013-3-10 下午5:26:24
 * Copyright © 2010-2012 证联融通 All rights reserved.
 ******************************************************************************/
package com.ylink.ylpay.common.project.settle.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;


/**
 * <P>余额试算平衡DTO</P>
 * @author 杜波 159-9965-3650
 * @description：
 */
public class FormulaBalanceDTO extends BaseDTO {

	private static final long serialVersionUID = 8555625323040253192L;


	/**
	 * 余额试算平衡ID
	 */
	private Long id;

	/**
	 * 试算平衡时间
	 */
	private Date calTime;

	/**
	 * 帐期,格式：yyyyMMdd
	 */
	private String accountDate;

	/**
	 * 资产类科目金额
	 */
	private Long zcAmount;

	/**
	 * 负债类科目金额
	 */
	private Long fzAmount;

	/**
	 * 权益类科目金额
	 */
	private Long qyAmount;

	/**
	 * 收入类科目金额
	 */
	private Long srAmount;

	/**
	 * 成本类科目金额
	 */
	private Long cbAmount;

	/**
	 * 平衡标志，0：不平衡，1：平衡
	 */
	private String balanceFlag;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCalTime() {
		return calTime;
	}

	public void setCalTime(Date calTime) {
		this.calTime = calTime;
	}

	public String getAccountDate() {
		return accountDate;
	}

	public void setAccountDate(String accountDate) {
		this.accountDate = accountDate;
	}

	public Long getZcAmount() {
		return zcAmount;
	}

	public void setZcAmount(Long zcAmount) {
		this.zcAmount = zcAmount;
	}

	public Long getFzAmount() {
		return fzAmount;
	}

	public void setFzAmount(Long fzAmount) {
		this.fzAmount = fzAmount;
	}

	public Long getQyAmount() {
		return qyAmount;
	}

	public void setQyAmount(Long qyAmount) {
		this.qyAmount = qyAmount;
	}

	public Long getSrAmount() {
		return srAmount;
	}

	public void setSrAmount(Long srAmount) {
		this.srAmount = srAmount;
	}

	public Long getCbAmount() {
		return cbAmount;
	}

	public void setCbAmount(Long cbAmount) {
		this.cbAmount = cbAmount;
	}

	public String getBalanceFlag() {
		return balanceFlag;
	}

	public void setBalanceFlag(String balanceFlag) {
		this.balanceFlag = balanceFlag;
	}

}
