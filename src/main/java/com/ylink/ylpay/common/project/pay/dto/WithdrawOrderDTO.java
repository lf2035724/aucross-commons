/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-11-9
 */

package com.ylink.ylpay.common.project.pay.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author YG.HU
 * @date 2012-11-9
 * @description：TODO
 */

public class WithdrawOrderDTO extends BaseDTO {
    
    private static final long serialVersionUID = 1L;

    /**
     * 提现订单编号
     */
    private String withdrawId;

    /**
     * 业务流水号
     */
    private String businessSn;

    /**
     * 操作编码
     */
    private String optCode;

    /**
     * 业务类型
     */
    private String productType;

    /**
     * 订单金额
     */
    private long orderAmt;

    /**
     * 订单状态
     */
    private String orderStatus;

    /**
     * 提现客户编号
     */
    private String custId;

    /**
     * 提现客户名称
     */
    private String custName;

    /**
     * 手续费
     */
    private long fee;

    /**
     * 计费状态
     */
    private String feeStatus;

    /**
     * 计费方式
     */
    private String feeType;

    /**
     * 交易开始时间
     */
    private Date beginTime;

    /**
     * 交易结束时间
     */
    private Date endTime;

    /**
     * 提现银行行别
     */
    private String bankType;

    /**
     * 提现银行卡卡号
     */
    private String bankCardNo;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 更新时间
     */
    private Date updateDate;
    /**
     * 商户编号
     */
    private String merchantId;

    /**
     * 交易结果信息
     */
    private String resultInfo;

    /**
     * 异常编码
     */
    private String errorCode;
    
    /**
     * 审核状态
     */
    private String checkStatus;
    
    /**
     * 批次号
     */
    private String batchId;
    
    /**
     * 查询创建时间起始
     */
    private Date queryBeginCreateDate;
    
    private String isSuccss;
    
    /**
     * 查询创建时间终止
     */
    private Date queryEndCreateDate;

    private long queryBeginOrderAmt;
    private long queryEndOrderAmt;
    private long queryBeginFee;
    private long queryEndFee;
       
    private Date beginSettleDate;
	/**
	 * 结算结束日期
	 */
	private Date endSettleDate;
	
    private String rechargeId;
    
    private String invokeMode;
    
    private String mpStatus;
    private String settleDate;
    private Date mpCheckDate;
    /**
     * 查询审核通过时间起始
     */
    private Date beginMpCheckDate;
    
    /**
     * 查询审核通过终止
     */
    private Date endMpCheckDate;
    /**
     * optCode数组
     */
    private String[] optCodes;
    
    private String[] instuidInfo;
    
    private String[] orderStatusinfo;
    
    /**
	 * @return the beginSettleDate
	 */
	public Date getBeginSettleDate() {
		return beginSettleDate;
	}

	/**
	 * @param beginSettleDate the beginSettleDate to set
	 */
	public void setBeginSettleDate(Date beginSettleDate) {
		this.beginSettleDate = beginSettleDate;
	}

	/**
	 * @return the endSettleDate
	 */
	public Date getEndSettleDate() {
		return endSettleDate;
	}

	/**
	 * @param endSettleDate the endSettleDate to set
	 */
	public void setEndSettleDate(Date endSettleDate) {
		this.endSettleDate = endSettleDate;
	}

	/**
	 * @return the instuidInfo
	 */
	public String[] getInstuidInfo() {
		return instuidInfo;
	}

	/**
	 * @param instuidInfo the instuidInfo to set
	 */
	public void setInstuidInfo(String[] instuidInfo) {
		this.instuidInfo = instuidInfo;
	}

	/**
     * @return the withdrawId
     */
    public String getWithdrawId() {
        return withdrawId;
    }

    /**
     * @param withdrawId the withdrawId to set
     */
    public void setWithdrawId(String withdrawId) {
        this.withdrawId = withdrawId;
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
     * @return the orderStatus
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * @param orderStatus the orderStatus to set
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
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
     * @return the resultInfo
     */
    public String getResultInfo() {
        return resultInfo;
    }

    /**
     * @param resultInfo the resultInfo to set
     */
    public void setResultInfo(String resultInfo) {
        this.resultInfo = resultInfo;
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
     * @return the checkStatus
     */
    public String getCheckStatus() {
        return checkStatus;
    }

    /**
     * @param checkStatus the checkStatus to set
     */
    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus;
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

    /**
     * @return the queryBeginFee
     */
    public long getQueryBeginFee() {
        return queryBeginFee;
    }

    /**
     * @param queryBeginFee the queryBeginFee to set
     */
    public void setQueryBeginFee(long queryBeginFee) {
        this.queryBeginFee = queryBeginFee;
    }

    /**
     * @return the queryEndFee
     */
    public long getQueryEndFee() {
        return queryEndFee;
    }

    /**
     * @param queryEndFee the queryEndFee to set
     */
    public void setQueryEndFee(long queryEndFee) {
        this.queryEndFee = queryEndFee;
    }


	public String getRechargeId() {
		return rechargeId;
	}

	public void setRechargeId(String rechargeId) {
		this.rechargeId = rechargeId;
	}

	public String getInvokeMode() {
		return invokeMode;
	}

	public void setInvokeMode(String invokeMode) {
		this.invokeMode = invokeMode;
	}

	public String getMpStatus() {
		return mpStatus;
	}

	public void setMpStatus(String mpStatus) {
		this.mpStatus = mpStatus;
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

	public String getSettleDate() {
		return settleDate;
	}

	public void setSettleDate(String settleDate) {
		this.settleDate = settleDate;
	}

	public Date getMpCheckDate() {
		return mpCheckDate;
	}

	public void setMpCheckDate(Date mpCheckDate) {
		this.mpCheckDate = mpCheckDate;
	}

	public Date getBeginMpCheckDate() {
		return beginMpCheckDate;
	}

	public void setBeginMpCheckDate(Date beginMpCheckDate) {
		this.beginMpCheckDate = beginMpCheckDate;
	}

	public Date getEndMpCheckDate() {
		return endMpCheckDate;
	}

	public void setEndMpCheckDate(Date endMpCheckDate) {
		this.endMpCheckDate = endMpCheckDate;
	}

	/**
	 * @return the isSuccss
	 */
	public String getIsSuccss() {
		return isSuccss;
	}

	/**
	 * @param isSuccss the isSuccss to set
	 */
	public void setIsSuccss(String isSuccss) {
		this.isSuccss = isSuccss;
	}

	public String[] getOrderStatusinfo() {
		return orderStatusinfo;
	}

	public void setOrderStatusinfo(String[] orderStatusinfo) {
		this.orderStatusinfo = orderStatusinfo;
	}
}
