/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-11-13
 */

package com.ylink.ylpay.common.project.pay.dto;

import java.util.Date;

/** 
 * @author ZhangDM(Mingly)
 * @date 2012-11-19
 * @description：银行收款DTO
 */

public class BankAccountCollectionDTO extends PaymentInfoDTO {
    
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
     * 基金公司客户编号
     */
    private String fundCustId;
    /**
     * 基金公司客户名称
     */
    private String fundCustName;
    /**
     * 收款银行虚拟客户号
     */
    private String bankVCustId;
    /**
    * 备注                                                 
    */
    private String remark;
    /**
     * 企业商户号
     */
    private String entMerchantId;
    /**
    * 商户号                                               
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
	public String getBankVCustId() {
		return bankVCustId;
	}
	public void setBankVCustId(String bankVCustId) {
		this.bankVCustId = bankVCustId;
	}
	public String getEntMerchantId() {
		return entMerchantId;
	}
	public void setEntMerchantId(String entMerchantId) {
		this.entMerchantId = entMerchantId;
	}
    
    
    

}
