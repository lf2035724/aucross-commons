/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-12-7
 */

package com.ylink.ylpay.common.project.pay.dto;

import java.util.Date;

/** 
 * @author YG.HU
 * @date 2012-12-7
 * @description：现金易支付请求DTO
 */

public class EPayPaymentDTO extends PaymentInfoDTO {
    
    private static final long serialVersionUID = 1L;
    
    /**
    *现金易赎回业务流水号                                           
    */
    private String redeemBusinessSn;
    /**
    *现金易赎回操作代码                                             
    */
    private String redeemOptCode;
    /**
     *现金易申购业务流水号                                           
     */
     private String purchaseBusinessSn;
     /**
     *现金易申购操作代码                                             
     */
     private String purchaseOptCode;
    /**
     * 订单金额                                             
     */
    private long orderAmt;
     /**
     * 业务类型                                             
     */
    private String productType;
    /**
     * 基金公司客户编号
     */
    private String fundCustId;
    /**
     * 企业编号
     */
    private String entId;
    /**
     * 企业名称
     */
    private String entName;
    /**
     * 基金公司客户名称
     */
    private String fundCustName;
    /**
     * 客户编号
     */
    private String userCustId;
    /**
     * 客户名称
     */
    private String userCustName;
    /**
    *商户号                                               
    */
    private String merchantId;
    /**
    *赎回计费类型                                             
    */
    private String redeemFeeType;
    /**
    *赎回付方手续费                                           
    */
    private long redeemPayerFee;
    /**
    *赎回收方手续费                                           
    */
    private long redeemPayeeFee;
    /**
     *申购计费类型                                             
     */
     private String purchaseFeeType;
     /**
     *申购付方手续费                                           
     */
     private long purchasePayerFee;
     /**
     *申购收方手续费                                           
     */
     private long purchasePayeeFee;
     /**
      * 基金申购的基金代码
      */
     private String purchaseFundCode;
     /**
      * 申购基金类型
      */
     private String purchaseFundType;
     /**
      * 基金赎回的基金代码
      */
     private String redeemFundCode;
     /**
      * 基金赎回的基金类型
      */
     private String redeemFundType;
     /**
     * 业务日期(电商方业务时间如：前置结算日期)
     */
     private Date businessTime;
    
	public String getRedeemBusinessSn() {
		return redeemBusinessSn;
	}
	public void setRedeemBusinessSn(String redeemBusinessSn) {
		this.redeemBusinessSn = redeemBusinessSn;
	}
	public String getRedeemOptCode() {
		return redeemOptCode;
	}
	public void setRedeemOptCode(String redeemOptCode) {
		this.redeemOptCode = redeemOptCode;
	}
	public String getPurchaseBusinessSn() {
		return purchaseBusinessSn;
	}
	public void setPurchaseBusinessSn(String purchaseBusinessSn) {
		this.purchaseBusinessSn = purchaseBusinessSn;
	}
	public String getPurchaseOptCode() {
		return purchaseOptCode;
	}
	public void setPurchaseOptCode(String purchaseOptCode) {
		this.purchaseOptCode = purchaseOptCode;
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
	public String getFundCustId() {
		return fundCustId;
	}
	public void setFundCustId(String fundCustId) {
		this.fundCustId = fundCustId;
	}
	public String getFundCustName() {
		return fundCustName;
	}
	public void setFundCustName(String fundCustName) {
		this.fundCustName = fundCustName;
	}
	public String getUserCustId() {
		return userCustId;
	}
	public void setUserCustId(String userCustId) {
		this.userCustId = userCustId;
	}
	public String getUserCustName() {
		return userCustName;
	}
	public void setUserCustName(String userCustName) {
		this.userCustName = userCustName;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getRedeemFeeType() {
		return redeemFeeType;
	}
	public void setRedeemFeeType(String redeemFeeType) {
		this.redeemFeeType = redeemFeeType;
	}
	public long getRedeemPayerFee() {
		return redeemPayerFee;
	}
	public void setRedeemPayerFee(long redeemPayerFee) {
		this.redeemPayerFee = redeemPayerFee;
	}
	public long getRedeemPayeeFee() {
		return redeemPayeeFee;
	}
	public void setRedeemPayeeFee(long redeemPayeeFee) {
		this.redeemPayeeFee = redeemPayeeFee;
	}
	public String getPurchaseFeeType() {
		return purchaseFeeType;
	}
	public void setPurchaseFeeType(String purchaseFeeType) {
		this.purchaseFeeType = purchaseFeeType;
	}
	public long getPurchasePayerFee() {
		return purchasePayerFee;
	}
	public void setPurchasePayerFee(long purchasePayerFee) {
		this.purchasePayerFee = purchasePayerFee;
	}
	public long getPurchasePayeeFee() {
		return purchasePayeeFee;
	}
	public void setPurchasePayeeFee(long purchasePayeeFee) {
		this.purchasePayeeFee = purchasePayeeFee;
	}
	public Date getBusinessTime() {
		return businessTime;
	}
	public void setBusinessTime(Date businessTime) {
		this.businessTime = businessTime;
	}
	public String getPurchaseFundCode() {
		return purchaseFundCode;
	}
	public void setPurchaseFundCode(String purchaseFundCode) {
		this.purchaseFundCode = purchaseFundCode;
	}
	public String getPurchaseFundType() {
		return purchaseFundType;
	}
	public void setPurchaseFundType(String purchaseFundType) {
		this.purchaseFundType = purchaseFundType;
	}
	public String getRedeemFundCode() {
		return redeemFundCode;
	}
	public void setRedeemFundCode(String redeemFundCode) {
		this.redeemFundCode = redeemFundCode;
	}
	public String getRedeemFundType() {
		return redeemFundType;
	}
	public void setRedeemFundType(String redeemFundType) {
		this.redeemFundType = redeemFundType;
	}
	public String getEntId() {
		return entId;
	}
	public void setEntId(String entId) {
		this.entId = entId;
	}
	public String getEntName() {
		return entName;
	}
	public void setEntName(String entName) {
		this.entName = entName;
	}
    
    
}
