/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-11-2
 */

/**
 * GatewayPaymentDTO.java
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司 
 * 创建:YG.HU 2012-11-2
 */
package com.ylink.ylpay.common.project.pay.dto;

import java.util.Date;


/** 
 * @author ZhangDM(Mingly)
 * @date 2012-11-2
 * @description：快捷支付DTO
 */
public class ShortcutPaymentDTO extends PaymentInfoDTO {
    

    private static final long serialVersionUID = 1L;
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
    * 付款方客户编号                                       
    */
    private String payerCustId;
    /**
    * 付款方客户真实姓名                                   
    */
    private String payerCustName;
    /**
    * 收款方客户编号                                       
    */
    private String payeeCustId;
    /**
    * 收款方客户真实姓名                                   
    */
    private String payeeCustName;
    /**
    * 商户号                                               
    */
    private String merchantId;
    /**
    * 计费类型                                             
    */
    private String feeType;
    /**
    * 付方手续费                                           
    */
    private long payerFee;
    /**
    * 收方手续费                                           
    */
    private long payeeFee;
    /**
     * 业务日期(电商方业务时间如：前置结算日期)
     */
    private Date businessTime;
    /**
     * 支付密码
     */
    private String payPassWord;

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
	public long getOrderAmt() {
		return orderAmt;
	}
	public void setOrderAmt(long orderAmt) {
		this.orderAmt = orderAmt;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getPayerCustId() {
		return payerCustId;
	}
	public void setPayerCustId(String payerCustId) {
		this.payerCustId = payerCustId;
	}
	public String getPayerCustName() {
		return payerCustName;
	}
	public void setPayerCustName(String payerCustName) {
		this.payerCustName = payerCustName;
	}
	public String getPayeeCustId() {
		return payeeCustId;
	}
	public void setPayeeCustId(String payeeCustId) {
		this.payeeCustId = payeeCustId;
	}
	public String getPayeeCustName() {
		return payeeCustName;
	}
	public void setPayeeCustName(String payeeCustName) {
		this.payeeCustName = payeeCustName;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
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
	 * @return the payPassWord
	 */
	public String getPayPassWord() {
		return payPassWord;
	}
	/**
	 * @param payPassWord the payPassWord to set
	 */
	public void setPayPassWord(String payPassWord) {
		this.payPassWord = payPassWord;
	}
}
