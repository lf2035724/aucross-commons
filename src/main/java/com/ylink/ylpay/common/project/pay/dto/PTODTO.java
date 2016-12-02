package com.ylink.ylpay.common.project.pay.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * @author wanglei
 * @date 2014-9-24
 * @description：赎回划款DTO
 */
public class PTODTO extends BaseDTO {

	private static final long serialVersionUID = 5371727744797928011L;
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
	 * 备注
	 */
	private String remark;
	/**
	 * 商户号
	 */
	private String merchantId;

	/**
	 * 商户名称
	 */
	private String merchantName;
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
	 * @return the businessTime
	 */
	public Date getBusinessTime() {
		return businessTime;
	}

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

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
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

	public void setBusinessTime(Date businessTime) {
		this.businessTime = businessTime;
	}

	public PaymentInfoDTO obtainPaymentInfoDTO (){
        PaymentInfoDTO mPaymentInfoDTO = new PaymentInfoDTO();
//        mPaymentInfoDTO.setAuthId(authId);
//        mPaymentInfoDTO.setBankCardNo(bankCardNo);
//        mPaymentInfoDTO.setBankType(bankType);
//        mPaymentInfoDTO.setPaymentMsg(paymentMsg);
//        mPaymentInfoDTO.setRechargeAmt(rechargeAmt);
//        mPaymentInfoDTO.setPayerBankType(payerBankType);
//        mPaymentInfoDTO.setPayerBankCardNo(payerBankCardNo);
//        mPaymentInfoDTO.setPayeeBankType(payeeBankType);
//        mPaymentInfoDTO.setPayeeBankCardNo(payeeBankCardNo);
//        mPaymentInfoDTO.setToUserMode(toUserMode);
//        mPaymentInfoDTO.setPayeeAccName(payeeAccName);
//        mPaymentInfoDTO.setPayeeOpenaccDept(payeeOpenaccDept);
//        mPaymentInfoDTO.setPayeeUbankno(payeeUbankno);
//        mPaymentInfoDTO.setChannelSn(channelSn);
//        mPaymentInfoDTO.setRequestSn(requestSn);
//        
//        mPaymentInfoDTO.setF_FundType(f_FundType);
//        mPaymentInfoDTO.setF_FundCode(f_FundCode);
//        mPaymentInfoDTO.setM_Subject(m_Subject);
//        mPaymentInfoDTO.setM_Goods_Details(m_Goods_Details);
//        mPaymentInfoDTO.setM_Show_Url(m_Show_Url);
//        mPaymentInfoDTO.setM_Subject_Type(m_Subject_Type);
//        mPaymentInfoDTO.setM_Price(m_Price);
//        mPaymentInfoDTO.setM_Amount(m_Amount);
//        mPaymentInfoDTO.setM_Transport_Fee(m_Transport_Fee);
//        
//        
//        
//        mPaymentInfoDTO.setSystemParam(systemParam);
//        
//        
//        mPaymentInfoDTO.setFundNetingId(fundNetingId);
//        mPaymentInfoDTO.setSettlementDate(settlementDate);
//        
//
//        mPaymentInfoDTO.setRecvCounterno(recvCounterno);
//        mPaymentInfoDTO.setExchangeNo(exchangeNo);
//        mPaymentInfoDTO.setIsInterBank(isInterBank);
//        
//        mPaymentInfoDTO.setAdditionalRecordId(additionalRecordId);
//        
//        mPaymentInfoDTO.setActualBankType(actualBankType);
//        mPaymentInfoDTO.setBindSource(bindSource);
        return mPaymentInfoDTO;
    }
}
