/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-10-29
 */

package com.ylink.ylpay.common.project.pay.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author YG.HU
 * @date 2012-10-29
 * @description：线下充值DTO
 */

public class OfflineRechargeDTO extends BaseDTO {
    
    private static final long serialVersionUID = 1L;

    /**
     * 业务流水号
     */
    private String businessSn;   
    /**
     * 操作编码
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
     * 充值客户ID
     */
    private String custId;
    /**
     * 充值客户真实姓名
     */
    private String custName;
    /**
     * 充值银行行别
     */
    private String bankType;
    /**
	 * 付款款方银行虚拟客户Id
	 */
	private String vBankCustId;
    /**
     * 商户号
     */
    private String merchantId; 
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
     * @param optcode the optCode to set
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
     * @return the authid
     */
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
    /**
     * @return the bankType
     */
    public String getBankType() {
        return bankType;
    }
    /**
     * @param bankType the bankType to set
     */
    public void setBankType(String bankType) {
        this.bankType = bankType;
    }
    /**
     * @return the bankCardNo
     */
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
	public String getvBankCustId() {
		return vBankCustId;
	}
	public void setvBankCustId(String vBankCustId) {
		this.vBankCustId = vBankCustId;
	}
    
}
