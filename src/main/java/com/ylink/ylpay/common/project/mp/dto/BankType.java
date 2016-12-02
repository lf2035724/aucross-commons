package com.ylink.ylpay.common.project.mp.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

public class BankType extends BaseDTO {
	
	private static final long serialVersionUID = -3165652840176027533L;

	/**
	 * 类别编号
	 */
	private String bankType;
	
	/**
	 * 名称
	 */
	private String bankName;
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	public String getBankType() {
		return bankType;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankName() {
		return bankName;
	}

}
