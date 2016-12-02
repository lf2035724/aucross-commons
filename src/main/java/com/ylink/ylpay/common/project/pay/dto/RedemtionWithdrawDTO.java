/**
 * RedemtionWithdrawDTO.java
 * 版权所有(C) 2013 证联融通电子有限公司 
 * 创建:LiuQ 2013-10-29
 */
package com.ylink.ylpay.common.project.pay.dto;

import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * @author LiuQ 实时赎回提现DTO
 * @date 2013-10-29
 * @description 
 */
public class RedemtionWithdrawDTO extends PaymentInfoDTO {

	private static final long serialVersionUID = 4071895061173010343L;

	/**
     * 业务流水号 
     */
    private String businessSn;

    /**
     * 操作代码 
     */
    private String optCode;
    
    /**
     * 订单金额      
     */
    private long orderAmt;
    
    /**
     * 业务类型 
     */
    private String productType;
    
    /**
     * 提现客户id
     */
	private String custId;
	
	/**
     * 提现客户真实姓名
     */
	private String custName;
	
	/**
     * 提现银行行别
     */
//	private String bankType;
	
	/**
     * 提现银行卡号
     */
//	private String bankCardNo;
	
	/**
     * 商户号
     */
	private String merchantId;
	
	/**
     * 计费类型
     */
	private String feeType;
	
	/**
     * 手续费
     */
	private long fee;
	
	/**
     * 业务日期(电商方业务时间如：前置结算日期)
     */
    private Date businessTime;
    
    /**
     *付款方客户编号--无需前置传递                                       
     */
	private String payerCustId;
	
	/**
     *付款方客户真实姓名--无需前置传递
     */
	private String payerCustName;
     
	/**
     *收款方客户编号--无需前置传递
     */
	private String payeeCustId;
     
	/**
     *收款方客户真实姓名--无需前置传递
     */
	private String payeeCustName;
    
	/**
     *付方手续费--无需前置传递
     */
	private long payerFee;
    
	/**
     *收方手续费--无需前置传递
     */
	private long payeeFee;    

	/**
	 * @return the businessSn
	 */
	public String getBusinessSn() {
		return businessSn;
	}

	/**
	 * @param businessSn the businessSn to set
	 */
	public void setBusinessSn(String businessSn) {
		this.businessSn = businessSn;
	}

	/**
	 * @return the optCode
	 */
	public String getOptCode() {
		return optCode;
	}

	/**
	 * @param optCode the optCode to set
	 */
	public void setOptCode(String optCode) {
		this.optCode = optCode;
	}

	/**
	 * @return the orderAmt
	 */
	public long getOrderAmt() {
		return orderAmt;
	}

	/**
	 * @param orderAmt the orderAmt to set
	 */
	public void setOrderAmt(long orderAmt) {
		this.orderAmt = orderAmt;
	}

	/**
	 * @return the productType
	 */
	public String getProductType() {
		return productType;
	}

	/**
	 * @param productType the productType to set
	 */
	public void setProductType(String productType) {
		this.productType = productType;
	}

	/**
	 * @return the custId
	 */
	public String getCustId() {
		return custId;
	}

	/**
	 * @param custId the custId to set
	 */
	public void setCustId(String custId) {
		this.custId = custId;
	}

	/**
	 * @return the custName
	 */
	public String getCustName() {
		return custName;
	}

	/**
	 * @param custName the custName to set
	 */
	public void setCustName(String custName) {
		this.custName = custName;
	}

//	/**
//	 * @return the bankType
//	 */
//	public String getBankType() {
//		return bankType;
//	}
//
//	/**
//	 * @param bankType the bankType to set
//	 */
//	public void setBankType(String bankType) {
//		this.bankType = bankType;
//	}
//
//	/**
//	 * @return the bankCardNo
//	 */
//	public String getBankCardNo() {
//		return bankCardNo;
//	}
//
//	/**
//	 * @param bankCardNo the bankCardNo to set
//	 */
//	public void setBankCardNo(String bankCardNo) {
//		this.bankCardNo = bankCardNo;
//	}

	/**
	 * @return the merchantId
	 */
	public String getMerchantId() {
		return merchantId;
	}

	/**
	 * @param merchantId the merchantId to set
	 */
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	/**
	 * @return the feeType
	 */
	public String getFeeType() {
		return feeType;
	}

	/**
	 * @param feeType the feeType to set
	 */
	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

	/**
	 * @return the fee
	 */
	public long getFee() {
		return fee;
	}

	/**
	 * @param fee the fee to set
	 */
	public void setFee(long fee) {
		this.fee = fee;
	}
	
	/**
	 * @return the businessTime
	 */
	public Date getBusinessTime() {
		return businessTime;
	}

	/**
	 * @param businessTime the businessTime to set
	 */
	public void setBusinessTime(Date businessTime) {
		this.businessTime = businessTime;
	}

	/**
	 * @return the payerCustId
	 */
	public String getPayerCustId() {
		return payerCustId;
	}

	/**
	 * @param payerCustId the payerCustId to set
	 */
	public void setPayerCustId(String payerCustId) {
		this.payerCustId = payerCustId;
	}

	/**
	 * @return the payerCustName
	 */
	public String getPayerCustName() {
		return payerCustName;
	}

	/**
	 * @param payerCustName the payerCustName to set
	 */
	public void setPayerCustName(String payerCustName) {
		this.payerCustName = payerCustName;
	}

	/**
	 * @return the payeeCustId
	 */
	public String getPayeeCustId() {
		return payeeCustId;
	}

	/**
	 * @param payeeCustId the payeeCustId to set
	 */
	public void setPayeeCustId(String payeeCustId) {
		this.payeeCustId = payeeCustId;
	}

	/**
	 * @return the payeeCustName
	 */
	public String getPayeeCustName() {
		return payeeCustName;
	}

	/**
	 * @param payeeCustName the payeeCustName to set
	 */
	public void setPayeeCustName(String payeeCustName) {
		this.payeeCustName = payeeCustName;
	}

	/**
	 * @return the payerFee
	 */
	public long getPayerFee() {
		return payerFee;
	}

	/**
	 * @param payerFee the payerFee to set
	 */
	public void setPayerFee(long payerFee) {
		this.payerFee = payerFee;
	}

	/**
	 * @return the payeeFee
	 */
	public long getPayeeFee() {
		return payeeFee;
	}

	/**
	 * @param payeeFee the payeeFee to set
	 */
	public void setPayeeFee(long payeeFee) {
		this.payeeFee = payeeFee;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString( this, ToStringStyle.MULTI_LINE_STYLE );
	}
}
