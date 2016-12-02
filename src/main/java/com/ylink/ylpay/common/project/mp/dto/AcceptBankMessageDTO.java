/**
 * 版权所有(C) 2014 证联融通电子有限公司
 * 创建:feng.li 2014-11-12
 */

/**
 * AcceptBankMessageDTO.java
 * 版权所有(C) 2014 证联融通电子有限公司
 * 创建:feng.li 2014-11-12
 */
package com.ylink.ylpay.common.project.mp.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author feng.li
 * @date 2014-11-12
 * @description：扣款行配置
 */

/** 
 * @author feng.li
 */
public class AcceptBankMessageDTO extends BaseDTO{

	private static final long serialVersionUID = -1685069958924786787L;

	private String custType;
	
	private String optType;
	
	private String payOptType;
	
	private String signBank;
	
	private String publishBank;
	
	//签约终端
	private String signTerminal;
	
	private String acceptBank;
	
	private String expiryFlag;
	
	private Long tradeAmount;
	
	private String description;
	
	private String merchantNO;

	public String getAcceptBank() {
		return acceptBank;
	}

	public void setAcceptBank(String acceptBank) {
		this.acceptBank = acceptBank;
	}

	public String getCustType() {
		return custType;
	}

	public void setCustType(String custType) {
		this.custType = custType;
	}

	public String getOptType() {
		return optType;
	}

	public void setOptType(String optType) {
		this.optType = optType;
	}

	public String getPayOptType() {
		return payOptType;
	}

	public void setPayOptType(String payOptType) {
		this.payOptType = payOptType;
	}

	public String getPublishBank() {
		return publishBank;
	}

	public void setPublishBank(String publishBank) {
		this.publishBank = publishBank;
	}

	public String getExpiryFlag() {
		return expiryFlag;
	}

	public void setExpiryFlag(String expiryFlag) {
		this.expiryFlag = expiryFlag;
	}

	public Long getTradeAmount() {
		return tradeAmount;
	}

	public void setTradeAmount(Long tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public String getSignBank() {
		return signBank;
	}

	public void setSignBank(String signBank) {
		this.signBank = signBank;
	}

	public String getSignTerminal() {
		return signTerminal;
	}

	public void setSignTerminal(String signTerminal) {
		this.signTerminal = signTerminal;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMerchantNO() {
		return merchantNO;
	}

	public void setMerchantNO(String merchantNO) {
		this.merchantNO = merchantNO;
	}
}
