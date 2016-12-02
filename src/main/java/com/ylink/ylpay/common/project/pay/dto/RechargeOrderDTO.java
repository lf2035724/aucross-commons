/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-10-29
 */

package com.ylink.ylpay.common.project.pay.dto;

import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.ylinkpay.core.util.JsonUtils;


/** 
 * @author ZhangDM(Mingly)
 * @date 2012-11-8
 * @description：充值订单实体类
 */

public class RechargeOrderDTO extends ResultInfoDTO {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 流水号
	 */
	private String rechargeId;
	/**
     * 操作编码
     */
    private String optCode;
	/**
	 * 产品类型
	 */
	private String productType;
	/**
	 * 金额
	 */
	private long orderAmt;
	/**
	 * 客户Id
	 */
	private String custId;
	/**
	 * 客户名称
	 */
	private String custName;
	/**
	 * 充值银行
	 */
	private String bankType;
	/**
	 * 创建日期
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
	 * 查询起始日期
	 */
	private Date queryBeginDate;
	/**
	 * 查询交易日期
	 */
	private Date queryEndDate;
	
	private String businessSn;
	private long queryOrderAmtBegin;
	private long queryorderAmtEnd;
	private String orderStatus;
	
	private long queryFeeBegin;
	private long queryFeeEnd;
	private long fee;
	
	private String feeType;
	private String feeStatus;
	private String bankCardNo;
	private String rechargeType;
    private String merchantId;
    private String resultInfo;
    private String errorCode;
    private String settleDate;
    
    private long canRollbackAMT;
    private long queryCanRollbackAMTStart;
    private long queryCanRollbackAMTEnd;
    
    private String[] instuidInfo;
    
    private Date beginSettleDate;
	private Date endSettleDate;
    
    public String getRechargeId() {
		return rechargeId;
	}
	public void setRechargeId(String rechargeId) {
		this.rechargeId = rechargeId;
	}
	public long getOrderAmt() {
		return orderAmt;
	}
	public void setOrderAmt(long orderAmt) {
		this.orderAmt = orderAmt;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public Date getQueryBeginDate() {
		return queryBeginDate;
	}
	public void setQueryBeginDate(Date queryBeginDate) {
		this.queryBeginDate = queryBeginDate;
	}
	public Date getQueryEndDate() {
		return queryEndDate;
	}
	public void setQueryEndDate(Date queryEndDate) {
		this.queryEndDate = queryEndDate;
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
     * @return the queryOrderAmtBegin
     */
    public long getQueryOrderAmtBegin() {
        return queryOrderAmtBegin;
    }
    /**
     * @param queryOrderAmtBegin the queryOrderAmtBegin to set
     */
    public void setQueryOrderAmtBegin(long queryOrderAmtBegin) {
        this.queryOrderAmtBegin = queryOrderAmtBegin;
    }
    /**
     * @return the queryorderAmtEnd
     */
    public long getQueryorderAmtEnd() {
        return queryorderAmtEnd;
    }
    /**
     * @param queryorderAmtEnd the queryorderAmtEnd to set
     */
    public void setQueryorderAmtEnd(long queryorderAmtEnd) {
        this.queryorderAmtEnd = queryorderAmtEnd;
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
     * @return the queryFeeBegin
     */
    public long getQueryFeeBegin() {
        return queryFeeBegin;
    }
    /**
     * @param queryFeeBegin the queryFeeBegin to set
     */
    public void setQueryFeeBegin(long queryFeeBegin) {
        this.queryFeeBegin = queryFeeBegin;
    }
    /**
     * @return the queryFeeEnd
     */
    public long getQueryFeeEnd() {
        return queryFeeEnd;
    }
    /**
     * @param queryFeeEnd the queryFeeEnd to set
     */
    public void setQueryFeeEnd(long queryFeeEnd) {
        this.queryFeeEnd = queryFeeEnd;
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
     * @return the rechargeType
     */
    public String getRechargeType() {
        return rechargeType;
    }
    /**
     * @param rechargeType the rechargeType to set
     */
    public void setRechargeType(String rechargeType) {
        this.rechargeType = rechargeType;
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
        if(StringUtils.isNotBlank(resultInfo)){
        	ResultInfoDTO resultInfoDTO =  (ResultInfoDTO) JsonUtils.resultObjectFromJson(resultInfo, ResultInfoDTO.class);
        	this.setResultInfo(resultInfoDTO);
        }
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
     * @return the canRollbackAMT
     */
    public long getCanRollbackAMT() {
        return canRollbackAMT;
    }
    /**
     * @param canRollbackAMT the canRollbackAMT to set
     */
    public void setCanRollbackAMT(long canRollbackAMT) {
        this.canRollbackAMT = canRollbackAMT;
    }
    /**
     * @return the queryCanRollbackAMTStart
     */
    public long getQueryCanRollbackAMTStart() {
        return queryCanRollbackAMTStart;
    }
    /**
     * @param queryCanRollbackAMTStart the queryCanRollbackAMTStart to set
     */
    public void setQueryCanRollbackAMTStart(long queryCanRollbackAMTStart) {
        this.queryCanRollbackAMTStart = queryCanRollbackAMTStart;
    }
    /**
     * @return the queryCanRollbackAMTEnd
     */
    public long getQueryCanRollbackAMTEnd() {
        return queryCanRollbackAMTEnd;
    }
    /**
     * @param queryCanRollbackAMTEnd the queryCanRollbackAMTEnd to set
     */
    public void setQueryCanRollbackAMTEnd(long queryCanRollbackAMTEnd) {
        this.queryCanRollbackAMTEnd = queryCanRollbackAMTEnd;
    }
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getSettleDate() {
		return settleDate;
	}
	public void setSettleDate(String settleDate) {
		this.settleDate = settleDate;
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
	
}
