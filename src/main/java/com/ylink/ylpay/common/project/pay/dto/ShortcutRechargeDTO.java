/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-10-29
 */

package com.ylink.ylpay.common.project.pay.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author YG.HU
 * @date 2012-10-29
 * @description：快捷充值DTO
 */

public class ShortcutRechargeDTO extends BaseDTO {
    
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
     * 授权号
     */
    private String authId;
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
     * 快捷银行卡卡号
     */
    private String bankCardNo; 
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
     * 支付密码
     */
    private String payPassWord;
    /**
     * 银联签约-真实行别
     */
    private String actualBankType;
    
    /**
     * 充值描述
     */
    private String rechargeDesc;
    /**
     * 签约方式[PC、MB]
     */
    private String bindSource;
    
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
    public String getAuthId() {
        return authId;
    }
    /**
     * @param authid the authid to set
     */
    public void setAuthId(String authId) {
        this.authId = authId;
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
    public String getBankCardNo() {
        return bankCardNo;
    }
    /**
     * @param bankCardNo the bankCardNo to set
     */
    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
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
	/**
	 * @return the actualBankType
	 */
	public String getActualBankType() {
		return actualBankType;
	}
	/**
	 * @param actualBankType the actualBankType to set
	 */
	public void setActualBankType(String actualBankType) {
		this.actualBankType = actualBankType;
	}
	public String getRechargeDesc() {
		return rechargeDesc;
	}
	public void setRechargeDesc(String rechargeDesc) {
		this.rechargeDesc = rechargeDesc;
	}
	public String getBindSource() {
		return bindSource;
	}
	public void setBindSource(String bindSource) {
		this.bindSource = bindSource;
	}
}
