/*******************************************************************************
 * Project   : aucross-common
 * Class Name: com.ylink.ylpay.common.project.settle.dto.AccountBillBalanceDTO
 * Created By: 杜波 159-9965-3650
 * Created on: 2013-3-10 下午5:24:27
 * Copyright © 2010-2012 证联融通  All rights reserved.
 ******************************************************************************/
package com.ylink.ylpay.common.project.settle.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;


/**
 * <P>发生额试算平衡DTO</P>
 * @author 杜波 159-9965-3650
 * @description：
 */
public class AccountBillBalanceDTO extends BaseDTO {

	private static final long serialVersionUID = -5496954984049009537L;

	/**
	 * 发生额试算平衡ID
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
	 * 借方金额
	 */
	private Long drAmount;

	/**
	 * 贷方金额
	 */
	private Long crAmount;

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

	public Long getDrAmount() {
		return drAmount;
	}

	public void setDrAmount(Long drAmount) {
		this.drAmount = drAmount;
	}

	public Long getCrAmount() {
		return crAmount;
	}

	public void setCrAmount(Long crAmount) {
		this.crAmount = crAmount;
	}

	public String getBalanceFlag() {
		return balanceFlag;
	}

	public void setBalanceFlag(String balanceFlag) {
		this.balanceFlag = balanceFlag;
	}

}
