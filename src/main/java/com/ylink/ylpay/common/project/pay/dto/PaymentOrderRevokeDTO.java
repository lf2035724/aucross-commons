/**
 * 版权所有(C) 2012 证联融通
 * 创建:HuAJ 2012-11-16
 */

package com.ylink.ylpay.common.project.pay.dto;

import java.util.Date;

/** 
 * @author HuAJ
 * @date 2012-11-16
 * @description：基金业务撤单DTO
 */

public class PaymentOrderRevokeDTO extends PaymentInfoDTO {
	
    private static final long serialVersionUID = 1L;
    
    /**
     * 原交易订单编号
     */
    private String paymentId;    
    /**
    *业务流水号                                           
    */
    private String businessSn;
    /**
    *操作代码                                             
    */
    private String optCode;
    /**
    *备注                                                 
    */
    private String remark;
    /**
    *计费类型                                             
    */
    private String feeType;
    /**
    *付方手续费                                           
    */
    private long payerFee;
    /**
    *收方手续费                                           
    */
    private long payeeFee;    
    /**
     * 业务日期(电商方业务时间如：前置结算日期)
     */
    private Date businessTime;
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public String getBusinessSn() {
		return businessSn;
	}
	public void setBusinessSn(String businessSn) {
		this.businessSn = businessSn;
	}
	public String getOptCode() {
		return optCode;
	}
	public void setOptCode(String optCode) {
		this.optCode = optCode;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getFeeType() {
		return feeType;
	}
	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}
	public long getPayerFee() {
		return payerFee;
	}
	public void setPayerFee(long payerFee) {
		this.payerFee = payerFee;
	}
	public long getPayeeFee() {
		return payeeFee;
	}
	public void setPayeeFee(long payeeFee) {
		this.payeeFee = payeeFee;
	}
	public Date getBusinessTime() {
		return businessTime;
	}
	public void setBusinessTime(Date businessTime) {
		this.businessTime = businessTime;
	}

}
