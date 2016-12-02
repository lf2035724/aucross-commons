/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-11-4
 */

package com.ylink.ylpay.common.project.pay.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author ZhangDM(Mingly)
 * @date 2012-11-4
 * @description：提现申请DTO
 */

public class WithdrawApplyDTO extends BaseDTO{

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
	private String bankType;
	/**
	 * 提现银行卡号
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
	 * 提现方式 
	 * 
	 * WithdrawType 枚举
	 */
	private String withdrawType;
	
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
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	public String getBankCardNo() {
		return bankCardNo;
	}
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
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
	public long getFee() {
		return fee;
	}
	public void setFee(long fee) {
		this.fee = fee;
	}
	public String getWithdrawType() {
		return withdrawType;
	}
	public void setWithdrawType(String withdrawType) {
		this.withdrawType = withdrawType;
	}
	
	

}
