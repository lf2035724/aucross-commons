package com.ylink.ylpay.common.project.settle.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

public class FundNetbalanceDetailDTO extends BaseDTO {
	
	private String fundNetDate;
	
    private String fundNetBankType;

    private String payId;

    private Long payAmt;

    private String optCode;
    
    private int netNo;
    
    private String netBalanceId;
    
    private static final long serialVersionUID = 1L;

	public String getFundNetDate() {
		return fundNetDate;
	}

	public void setFundNetDate(String fundNetDate) {
		this.fundNetDate = fundNetDate;
	}

	public String getFundNetBankType() {
		return fundNetBankType;
	}

	public void setFundNetBankType(String fundNetBankType) {
		this.fundNetBankType = fundNetBankType;
	}

	public String getPayId() {
		return payId;
	}

	public void setPayId(String payId) {
		this.payId = payId;
	}

	public Long getPayAmt() {
		return payAmt;
	}

	public void setPayAmt(Long payAmt) {
		this.payAmt = payAmt;
	}

	public String getOptCode() {
		return optCode;
	}

	public void setOptCode(String optCode) {
		this.optCode = optCode;
	}

	public int getNetNo() {
		return netNo;
	}

	public void setNetNo(int netNo) {
		this.netNo = netNo;
	}

	public String getNetBalanceId() {
		return netBalanceId;
	}

	public void setNetBalanceId(String netBalanceId) {
		this.netBalanceId = netBalanceId;
	}

}