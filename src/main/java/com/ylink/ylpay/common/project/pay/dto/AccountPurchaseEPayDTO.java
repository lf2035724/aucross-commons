/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-12-7
 */

package com.ylink.ylpay.common.project.pay.dto;

import java.util.Date;

/** 
 * @author YG.HU
 * @date 2012-12-7
 * @description：TODO
 */

public class AccountPurchaseEPayDTO extends PaymentInfoDTO {
    
    private static final long serialVersionUID = 1L;
    
    /**
    *业务流水号                                           
    */
    private String businessSn;
    /**
    *操作代码                                             
    */
    private String optCode;
    /**
    *保留余额                                 
    */
    private long retAmt;
    /**
     *最低金额
     */
    private long minAmt;
    /**
     * 业务类型
     */
    private String productType;
    /**
    *付款方客户编号                                       
    */
    private String payerCustId;
    /**
    *付款方客户真实姓名                                   
    */
    private String payerCustName;
    /**
    *收款方客户编号                                       
    */
    private String payeeCustId;
    /**
    *收款方客户真实姓名                                   
    */
    private String payeeCustName;
    /**
    *备注                                                 
    */
    private String remark;
    /**
    *商户号                                               
    */
    private String merchantId;
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
     * @return the retAmt
     */
    public long getRetAmt() {
        return retAmt;
    }
    /**
     * @param retAmt the retAmt to set
     */
    public void setRetAmt(long retAmt) {
        this.retAmt = retAmt;
    }
    /**
     * @return the minAmt
     */
    public long getMinAmt() {
        return minAmt;
    }
    /**
     * @param minAmt the minAmt to set
     */
    public void setMinAmt(long minAmt) {
        this.minAmt = minAmt;
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
     * @return the remark
     */
    public String getRemark() {
        return remark;
    }
    /**
     * @param remark the remark to set
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
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
    
    
}
