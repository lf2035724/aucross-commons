/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-11-8
 */

/**
 * PaymentOrderDTO.java
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司 
 * 创建:YG.HU 2012-11-8
 */
package com.ylink.ylpay.common.project.pay.dto;

import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.ylinkpay.core.util.JsonUtils;

import com.ylink.ylpay.common.project.channel.constant.BankType;

/** 
 * @author YG.HU
 * @date 2012-11-8
 * @description：支付交易查询对外实体
 */
public class PaymentOrderDTO extends PaymentInfoDTO {

    private static final long serialVersionUID = 1L;
    /**
     * 支付系统订单号
     */
    private String paymentId;

    /**
     * 客户系统流水号
     */
    private String businessSn;

    /**
     * 操作号
     */
    private String optCode;

    /**
     * 业务类型 
     */
    private String productType;

    /**
     * 支付金额
     */
    private long orderAmt;
    
    /**
     * 查询支付金额开始
     */
    private long queryBeginOrderAmt;
    /**
     * 查询支付金额截止
     */
    private long queryEndOrderAmt;

    /**
     * 订单状态
     */
    private String orderStatus;

    /**
     * 付款人id
     */
    private String payerCustId;

    /**
     * 付款人姓名
     */
    private String payerCustName;

    /**
     * 收款人id
     */
    private String payeeCustId;

    /**
     * 收款人姓名
     */
    private String payeeCustName;

    /**
     * 付方手续费
     */
    private long payerFee;

    /**
     * 收方手续费
     */
    private long payeeFee;

    /**
     * 手续费状态
     */
    private String feeStatus;

    /**
     * 手续费类型
     */
    private String feeType;

    /**
     * 关联订单号
     */
    private String oldOrderId;

    /**
     * 交易详情
     */
    private String paymentInfo;

    /**
     * 交易备注 
     */
    private String remark;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 更新日期
     */
    private Date updateDate;
    /**
     * 交易开始时间
     */
    private Date beginTime;
    /**
     * 交易结束时间
     */
    private Date endTime;
    /**
     * 查询创建日期开始 
     */
    private Date queryBeginCreateDate;
    /**
     * 查询创建日期截止
     */
    private Date queryEndCreateDate;
    /**
     * 商户号
     */
    private String merchantId;
    /**
     * 支付类型
     */
    private String paymentType;
    /**
     * 查询方id
     */
    private String querySideId;
    
    /**
     * 查询方商户号
     */
    private String queryMerchantId;
    /**
     * 对方名称
     */
    private String otherSideName;
    /**
     * 业务日期(电商方业务时间如：前置结算日期)
     */
    private Date businessTime;
    /**
     * 查询业务日期起始
     */
    private Date queryBeginBusinessTime;
    /**
     * 查询业务日期终止
     */
    private Date queryEndBusinessTime;
    
    /**
     * 开始结算时间
     */
    private Date beginSettleDate;
    
    /**
     * 结束结算时间
     */
    private Date endSettleDate;
    
    /**
     * optCode数组
     */
    private String[] optCodes;
    
    private String bankTypeName;
    
    /**
     * orderStatusCodes数组
     */
    private String[] orderStatusCodes;
    
    private long queryBeginPayerFee;
    private long queryEndPayerFee;
    private long queryBeginPayeeFee;
    private long queryEndPayeeFee;
    private String batchId;
    private String errorCode;
    private String invokeMode;
    private String settleDate;
    /**
     * @return the paymentId
     */
    public String getPaymentId() {
        return paymentId;
    }
    /**
     * @param paymentId the paymentId to set
     */
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
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
     * @return the queryBeginOrderAmt
     */
    public long getQueryBeginOrderAmt() {
        return queryBeginOrderAmt;
    }
    /**
     * @param queryBeginOrderAmt the queryBeginOrderAmt to set
     */
    public void setQueryBeginOrderAmt(long queryBeginOrderAmt) {
        this.queryBeginOrderAmt = queryBeginOrderAmt;
    }
    /**
     * @return the queryEndOrderAmt
     */
    public long getQueryEndOrderAmt() {
        return queryEndOrderAmt;
    }
    /**
     * @param queryEndOrderAmt the queryEndOrderAmt to set
     */
    public void setQueryEndOrderAmt(long queryEndOrderAmt) {
        this.queryEndOrderAmt = queryEndOrderAmt;
    }
    
    public String getOrderStatus() {
        return orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
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
     * @return the feeStatus
     */
    public String getFeeStatus() {
        return feeStatus;
    }
    /**
     * @param feeStatus the feeStatus to set
     */
    public void setFeeStatus(String feeStatus) {
        this.feeStatus = feeStatus;
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
     * @return the oldOrderId
     */
    public String getOldOrderId() {
        return oldOrderId;
    }
    /**
     * @param oldOrderId the oldOrderId to set
     */
    public void setOldOrderId(String oldOrderId) {
        this.oldOrderId = oldOrderId;
    }
    /**
     * @return the paymentInfo
     */
    public String getPaymentInfo() {
        return paymentInfo;
    }
    /**
     * @param paymentInfo the paymentInfo to set
     */
    public void setPaymentInfo(String paymentInfo) {
        this.paymentInfo = paymentInfo;
        if(paymentInfo == null || paymentInfo.equals("")){
            return;
        }
        super.setPaymentInfo((PaymentInfoDTO)JsonUtils.resultObjectFromJson(paymentInfo, 
                this.obtainPaymentInfoDTO().getClass()));
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
     * @return the createDate
     */
    public Date getCreateDate() {
        return createDate;
    }
    /**
     * @param createDate the createDate to set
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    /**
     * @return the queryBeginCreateDate
     */
    public Date getQueryBeginCreateDate() {
        return queryBeginCreateDate;
    }
    /**
     * @param queryBeginCreateDate the queryBeginCreateDate to set
     */
    public void setQueryBeginCreateDate(Date queryBeginCreateDate) {
        this.queryBeginCreateDate = queryBeginCreateDate;
    }
    /**
     * @return the queryEndCreateDate
     */
    public Date getQueryEndCreateDate() {
        return queryEndCreateDate;
    }
    /**
     * @param queryEndCreateDate the queryEndCreateDate to set
     */
    public void setQueryEndCreateDate(Date queryEndCreateDate) {
        this.queryEndCreateDate = queryEndCreateDate;
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
     * @return the paymentType
     */
    public String getPaymentType() {
        return paymentType;
    }
    /**
     * @param paymentType the paymentType to set
     */
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
    /**
     * @return the querySideId
     */
    public String getQuerySideId() {
        return querySideId;
    }
    /**
     * @param querySideId the querySideId to set
     */
    public void setQuerySideId(String querySideId) {
        this.querySideId = querySideId;
    }
    
    
    public String getQueryMerchantId() {
		return queryMerchantId;
	}
	public void setQueryMerchantId(String queryMerchantId) {
		this.queryMerchantId = queryMerchantId;
	}
	/**
     * @return the otherSideName
     */
    public String getOtherSideName() {
        return otherSideName;
    }
    /**
     * @param otherSideName the otherSideName to set
     */
    public void setOtherSideName(String otherSideName) {
        this.otherSideName = otherSideName;
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
     * @return the queryBeginBusinessTime
     */
    public Date getQueryBeginBusinessTime() {
        return queryBeginBusinessTime;
    }
    /**
     * @param queryBeginBusinessTime the queryBeginBusinessTime to set
     */
    public void setQueryBeginBusinessTime(Date queryBeginBusinessTime) {
        this.queryBeginBusinessTime = queryBeginBusinessTime;
    }
    /**
     * @return the queryEndBusinessTime
     */
    public Date getQueryEndBusinessTime() {
        return queryEndBusinessTime;
    }
    /**
     * @param queryEndBusinessTime the queryEndBusinessTime to set
     */
    public void setQueryEndBusinessTime(Date queryEndBusinessTime) {
        this.queryEndBusinessTime = queryEndBusinessTime;
    }
    /**
     * @return the optCodes
     */
    public String[] getOptCodes() {
        return optCodes;
    }
    /**
     * @param optCodes the optCodes to set
     */
    public void setOptCodes(String[] optCodes) {
        this.optCodes = optCodes;
    }
    /**
     * @return the updateDate
     */
    public Date getUpdateDate() {
        return updateDate;
    }
    /**
     * @param updateDate the updateDate to set
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
    /**
     * @return the beginTime
     */
    public Date getBeginTime() {
        return beginTime;
    }
    /**
     * @param beginTime the beginTime to set
     */
    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }
    /**
     * @return the endTime
     */
    public Date getEndTime() {
        return endTime;
    }
    /**
     * @param endTime the endTime to set
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    /**
     * @return the queryBeginPayerFee
     */
    public long getQueryBeginPayerFee() {
        return queryBeginPayerFee;
    }
    /**
     * @param queryBeginPayerFee the queryBeginPayerFee to set
     */
    public void setQueryBeginPayerFee(long queryBeginPayerFee) {
        this.queryBeginPayerFee = queryBeginPayerFee;
    }
    /**
     * @return the queryEndPayerFee
     */
    public long getQueryEndPayerFee() {
        return queryEndPayerFee;
    }
    /**
     * @param queryEndPayerFee the queryEndPayerFee to set
     */
    public void setQueryEndPayerFee(long queryEndPayerFee) {
        this.queryEndPayerFee = queryEndPayerFee;
    }
    /**
     * @return the queryBeginPayeeFee
     */
    public long getQueryBeginPayeeFee() {
        return queryBeginPayeeFee;
    }
    /**
     * @param queryBeginPayeeFee the queryBeginPayeeFee to set
     */
    public void setQueryBeginPayeeFee(long queryBeginPayeeFee) {
        this.queryBeginPayeeFee = queryBeginPayeeFee;
    }
    /**
     * @return the queryEndPayeeFee
     */
    public long getQueryEndPayeeFee() {
        return queryEndPayeeFee;
    }
    /**
     * @param queryEndPayeeFee the queryEndPayeeFee to set
     */
    public void setQueryEndPayeeFee(long queryEndPayeeFee) {
        this.queryEndPayeeFee = queryEndPayeeFee;
    }
    /**
     * @return the batchId
     */
    public String getBatchId() {
        return batchId;
    }
    /**
     * @param batchId the batchId to set
     */
    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }
    /**
     * @return the errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }
    /**
     * @param errorCode the errorCode to set
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
    /**
     * @return the invokeMode
     */
    public String getInvokeMode() {
        return invokeMode;
    }
    /**
     * @param invokeMode the invokeMode to set
     */
    public void setInvokeMode(String invokeMode) {
        this.invokeMode = invokeMode;
    }
	public String getSettleDate() {
		return settleDate;
	}
	public void setSettleDate(String settleDate) {
		this.settleDate = settleDate;
	}
	public Date getBeginSettleDate() {
		return beginSettleDate;
	}
	public void setBeginSettleDate(Date beginSettleDate) {
		this.beginSettleDate = beginSettleDate;
	}
	public Date getEndSettleDate() {
		return endSettleDate;
	}
	public void setEndSettleDate(Date endSettleDate) {
		this.endSettleDate = endSettleDate;
	}
	public String[] getOrderStatusCodes() {
		return orderStatusCodes;
	}
	public void setOrderStatusCodes(String[] orderStatusCodes) {
		this.orderStatusCodes = orderStatusCodes;
	}
	/**
	 * @return the bankTypeName
	 */
	public String getBankTypeName() {
		String displayName = "";
		if(StringUtils.isNotBlank(super.getBankType())){
			displayName = BankType.parseOf(super.getBankType()).getDisplayName();
		}
		return displayName;
	}
	/**
	 * @param bankTypeName the bankTypeName to set
	 */
	public void setBankTypeName(String bankTypeName) {
		if(super.getBankType()!=null&&!super.getBankType().equals(""))
		{
			this.bankTypeName = BankType.parseOf(super.getBankType()).getDisplayName();
		}
	}
	
}

