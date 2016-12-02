/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-11-13
 */

package com.ylink.ylpay.common.project.pay.dto;

import java.util.Date;

/** 
 * @author ZhangDM(Mingly)
 * @date 2012-11-19
 * @description：银行付款DTO
 */

public class BankAccountPaymentDTO extends PaymentInfoDTO {
    
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
     * 企业客户编号
     */
    private String entCustId;
    /**
     * 企业客户名称
     */
    private String entCustName;
    /**
	 * 企业银行行别
	 */
	private String entBankType;
	/**
	 * 企业银行卡号
	 */
	private String entBankCardNo;
	/**
	 * 计费类型
	 */
	private String feeType;
	/**
	 * 手续费
	 */
	private long fee;
    /**
    * 备注                                                 
    */
    private String remark;
    /**
     * 企业商户号
     */
    private String entMerchantId;
    /**
    * 商户号(默认参数)                                               
    */
    private String merchantId;
    /**
     * 业务日期(电商方业务时间如：前置结算日期)
     */
    private Date businessTime;
    
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
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public Date getBusinessTime() {
		return businessTime;
	}
	public void setBusinessTime(Date businessTime) {
		this.businessTime = businessTime;
	}
	public String getFeeType() {
		return feeType;
	}
	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}
	public long getFee() {
		return fee;
	}
	public void setFee(long fee) {
		this.fee = fee;
	}
	public String getEntCustId() {
		return entCustId;
	}
	public void setEntCustId(String entCustId) {
		this.entCustId = entCustId;
	}
	public String getEntCustName() {
		return entCustName;
	}
	public void setEntCustName(String entCustName) {
		this.entCustName = entCustName;
	}
	public String getEntBankType() {
		return entBankType;
	}
	public void setEntBankType(String entBankType) {
		this.entBankType = entBankType;
	}
	public String getEntBankCardNo() {
		return entBankCardNo;
	}
	public void setEntBankCardNo(String entBankCardNo) {
		this.entBankCardNo = entBankCardNo;
	}
	public String getEntMerchantId() {
		return entMerchantId;
	}
	public void setEntMerchantId(String entMerchantId) {
		this.entMerchantId = entMerchantId;
	}
    
    

}
