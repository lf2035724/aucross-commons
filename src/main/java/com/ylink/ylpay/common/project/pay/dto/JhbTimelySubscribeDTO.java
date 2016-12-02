package com.ylink.ylpay.common.project.pay.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * @author wanglei
 * @date 2013-11-1
 * @description：金汇宝支付DTO
 */
public class JhbTimelySubscribeDTO extends BaseDTO {

	private static final long serialVersionUID = -1933023475483529221L;

	/**
     * Y申购业务流水号 
     */
    private String subscribeBusinessSn;
    /**
     * Y赎回业务流水号 
     */
    private String redemptionBusinessSn;
    /**
     * N充值业务流水号 (充值时需上送)
     */
    private String rechargeBusinessSn;
    /**
     * 赎回业务流水号2 
     */
    private String redemptionBusinessSn2;
    
    /**
     * 赎回基金数
     */
    private int redemFundCount;
    /**
     * 付款方商户号(赎回2 使用)
     */
    private String payerMerchantId2;
    
    /**
     * 赎回金额2
     */
    private Long redeemAmt2;
    
    /**
     * 赎回支付订单号2
     */
    private String redeemTradeId2;
    /**
     * Y付款方商户号
     */
    private String payerMerchantId;
    /**
     * Y收款方商户号
     */
    private String payeeMerchantId;
    /**
     * Y客户号 
     */
    private String custId;
    /**
     * Y客户名称 
     */
    private String custName;
    /**
     * Y赎回金额 
     */
    private Long redeemAmt;
    /**
     * Y申购金额 
     */
    private Long buyAmt;
    /**
     * 充值金额 (充值时上送)
     */
    private Long rechargeAmt;
    /**
     * Y发起时间 
     */
    private Date businessTime;
    
    /**
     * 充值支付订单号
     */
    private String rechargeTradeId;
    /**
     * 申购支付订单号
     */
    private String subscribeTradeId;
    /**
     * 赎回支付订单号
     */
    private String withdrawTradeId;
    
    /**
     * 赎回支付订单号2
     */
    private String withdrawTradeId2;
    /**
     * 金汇宝支付状态
     */
    private String payStatus;
    private String errorCode;//			错误码
	private String errorDesc;//			错误描述
    /**
     * 授权号(充值时需上送)
     */
    private String authId;
    /**
     * 银行代码(充值时需上送)
     */
    private String bankType;
    /**
     * 卡号(充值时需上送)
     */
    private String bankCardNo;
    /**
     * N手续费(充值时需上送)
     */
    private Long fee;
    /**
     * N计费方式(充值时需上送)
     */
    private String feeType;
    /**
     * 充值类型（网关02/快捷01，必输）
     */
    private String payType;
    /**
     * 支付密码
     */
    private String payPassWord;
    /**
     * 银联-真实行别
     */
    private String actualBankType;
    /**
     * 银行或银联签约方式
     */
    private String bindSource;
    
	public String getSubscribeBusinessSn() {
		return subscribeBusinessSn;
	}
	public void setSubscribeBusinessSn(String subscribeBusinessSn) {
		this.subscribeBusinessSn = subscribeBusinessSn;
	}
	public String getRedemptionBusinessSn() {
		return redemptionBusinessSn;
	}
	public void setRedemptionBusinessSn(String redemptionBusinessSn) {
		this.redemptionBusinessSn = redemptionBusinessSn;
	}
	public Long getRedeemAmt() {
		return redeemAmt;
	}
	public void setRedeemAmt(Long redeemAmt) {
		this.redeemAmt = redeemAmt;
	}
	public Long getBuyAmt() {
		return buyAmt;
	}
	public void setBuyAmt(Long buyAmt) {
		this.buyAmt = buyAmt;
	}
	public Date getBusinessTime() {
		return businessTime;
	}
	public void setBusinessTime(Date businessTime) {
		this.businessTime = businessTime;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getPayerMerchantId() {
		return payerMerchantId;
	}
	public void setPayerMerchantId(String payerMerchantId) {
		this.payerMerchantId = payerMerchantId;
	}
	public String getPayeeMerchantId() {
		return payeeMerchantId;
	}
	public void setPayeeMerchantId(String payeeMerchantId) {
		this.payeeMerchantId = payeeMerchantId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getRechargeTradeId() {
		return rechargeTradeId;
	}
	public void setRechargeTradeId(String rechargeTradeId) {
		this.rechargeTradeId = rechargeTradeId;
	}
	public String getSubscribeTradeId() {
		return subscribeTradeId;
	}
	public void setSubscribeTradeId(String subscribeTradeId) {
		this.subscribeTradeId = subscribeTradeId;
	}
	public String getWithdrawTradeId() {
		return withdrawTradeId;
	}
	public void setWithdrawTradeId(String withdrawTradeId) {
		this.withdrawTradeId = withdrawTradeId;
	}
	public String getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	public String getAuthId() {
		return authId;
	}
	public void setAuthId(String authId) {
		this.authId = authId;
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
	public String getRechargeBusinessSn() {
		return rechargeBusinessSn;
	}
	public void setRechargeBusinessSn(String rechargeBusinessSn) {
		this.rechargeBusinessSn = rechargeBusinessSn;
	}
	public Long getFee() {
		return fee;
	}
	public void setFee(Long fee) {
		this.fee = fee;
	}
	public String getFeeType() {
		return feeType;
	}
	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}
	public Long getRechargeAmt() {
		return rechargeAmt;
	}
	public void setRechargeAmt(Long rechargeAmt) {
		this.rechargeAmt = rechargeAmt;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorDesc() {
		return errorDesc;
	}
	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
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
	/**
	 * @return the bindSource
	 */
	public String getBindSource() {
		return bindSource;
	}
	/**
	 * @param bindSource the bindSource to set
	 */
	public void setBindSource(String bindSource) {
		this.bindSource = bindSource;
	}
	/**
	 * @return the redemptionBusinessSn2
	 */
	public String getRedemptionBusinessSn2() {
		return redemptionBusinessSn2;
	}
	/**
	 * @param redemptionBusinessSn2 the redemptionBusinessSn2 to set
	 */
	public void setRedemptionBusinessSn2(String redemptionBusinessSn2) {
		this.redemptionBusinessSn2 = redemptionBusinessSn2;
	}
	/**
	 * @return the payerMerchantId2
	 */
	public String getPayerMerchantId2() {
		return payerMerchantId2;
	}
	/**
	 * @param payerMerchantId2 the payerMerchantId2 to set
	 */
	public void setPayerMerchantId2(String payerMerchantId2) {
		this.payerMerchantId2 = payerMerchantId2;
	}
	/**
	 * @return the redeemAmt2
	 */
	public Long getRedeemAmt2() {
		return redeemAmt2;
	}
	/**
	 * @param redeemAmt2 the redeemAmt2 to set
	 */
	public void setRedeemAmt2(Long redeemAmt2) {
		this.redeemAmt2 = redeemAmt2;
	}
	/**
	 * @return the redeemTradeId2
	 */
	public String getRedeemTradeId2() {
		return redeemTradeId2;
	}
	/**
	 * @param redeemTradeId2 the redeemTradeId2 to set
	 */
	public void setRedeemTradeId2(String redeemTradeId2) {
		this.redeemTradeId2 = redeemTradeId2;
	}
	/**
	 * @return the redemFundCount
	 */
	public int getRedemFundCount() {
		return redemFundCount;
	}
	/**
	 * @param redemFundCount the redemFundCount to set
	 */
	public void setRedemFundCount(int redemFundCount) {
		this.redemFundCount = redemFundCount;
	}
	/**
	 * @return the withdrawTradeId2
	 */
	public String getWithdrawTradeId2() {
		return withdrawTradeId2;
	}
	/**
	 * @param withdrawTradeId2 the withdrawTradeId2 to set
	 */
	public void setWithdrawTradeId2(String withdrawTradeId2) {
		this.withdrawTradeId2 = withdrawTradeId2;
	}
}
