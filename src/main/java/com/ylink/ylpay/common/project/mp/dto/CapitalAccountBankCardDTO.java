/**
 * 版权所有(C) 2014 证联融通电子有限公司
 * 创建:feng.li 2014-11-21
 */

/**
 * CapitalAccountBankCardDTO.java
 * 版权所有(C) 2014 证联融通电子有限公司
 * 创建:feng.li 2014-11-21
 */
package com.ylink.ylpay.common.project.mp.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author feng.li
 * @date 2014-11-21
 * @description：TODO
 */

public class CapitalAccountBankCardDTO extends BaseDTO{

	private static final long serialVersionUID = -7438453273829139709L;

	private String id; 

	/**
	 * 关联银行卡
	 */
	private BankCard bankCard;

	/**
	 * 资金账户号
	 */
	private String capitalAccountNO;
	
	/**
	 * 创建时间（绑卡时间）
	 */
	private Date createTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BankCard getBankCard() {
		return bankCard;
	}

	public void setBankCard(BankCard bankCard) {
		this.bankCard = bankCard;
	}

	public String getCapitalAccountNO() {
		return capitalAccountNO;
	}

	public void setCapitalAccountNO(String capitalAccountNO) {
		this.capitalAccountNO = capitalAccountNO;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
