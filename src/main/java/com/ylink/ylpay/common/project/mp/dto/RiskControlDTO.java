/**
 * 版权所有(C) 2014 证联融通电子有限公司
 * 创建:feng.li 2014-11-13
 */

/**
 * RiskControlDTO.java
 * 版权所有(C) 2014 证联融通电子有限公司
 * 创建:feng.li 2014-11-13
 */
package com.ylink.ylpay.common.project.mp.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;
import com.ylink.ylpay.common.project.mp.constant.OptType;

/** 
 * @author feng.li
 * @date 2014-11-13
 * @description：TODO
 */

/**
 * @author feng.li
 *
 */
public class RiskControlDTO extends BaseDTO{

	private static final long serialVersionUID = -5151295292072828054L;

	private String custId;
	
	private OptType optType;
	
	private Long   amount;
	
	private String bankCardNO;
	
	private String bankType;
	
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public OptType getOptType() {
		return optType;
	}
	public void setOptType(OptType optType) {
		this.optType = optType;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public String getBankCardNO() {
		return bankCardNO;
	}
	public void setBankCardNO(String bankCardNO) {
		this.bankCardNO = bankCardNO;
	}
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RiskControlDTO [custId=").append(custId)
				.append(", optType=").append(optType).append(", amount=")
				.append(amount).append(", bankCardNO=").append(bankCardNO)
				.append(", bankType=").append(bankType).append("]");
		return builder.toString();
	}
}
