/**
 * 版权所有(C) 2012 证联融通
 * 创建:HuAJ 2012-12-12
 */

package com.ylink.ylpay.common.project.settle.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author ZhangDM(Mingly)
 * @date 2013-2-25
 * @description：记账流水DTO
 */

public class AccountBillDTO extends BaseDTO {
	
	/**
	 * 记账流水
	 */
	private Long billId;

    /**
     * 记账日期
     */
    private String accountDate;

    /**
     * 交易订单号
     */
    private String orderId;

    /**
     * 支付订单号
     */
    private String payId;

    private String optCode;

    private String dealCode;

    /**
     * 借贷标记
     */
    private String drCrFlag;

    /**
     * 金额
     */
    private Long amount;

    /**
     * 科目编码
     */
    private String accountId;
    
    private String[] accountIds;
    
    /**
	 * @return the accountIds
	 */
	public String[] getAccountIds() {
		return accountIds;
	}

	/**
	 * @param accountIds the accountIds to set
	 */
	public void setAccountIds(String[] accountIds) {
		this.accountIds = accountIds;
	}

	/**
     * 科目余额
     */
    private Long accountAmount;

    private Date recordTime;

    /**
     * 对账状态
     */
    private String reconStatus;
    
    /**
     * 起始记账日期
     */
    private Date beginAccountDate;
    
    /**
     * 结束记账日期
     */
    private Date endAccountDate;
    
    /**
     * 流水类型
     */
    private String billType;

    private static final long serialVersionUID = 1L;

    public Long getBillId() {
        return billId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
    }

    public String getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(String accountDate) {
        this.accountDate = accountDate == null ? null : accountDate.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId == null ? null : payId.trim();
    }

    public String getOptCode() {
        return optCode;
    }

    public void setOptCode(String optCode) {
        this.optCode = optCode == null ? null : optCode.trim();
    }

    public String getDealCode() {
        return dealCode;
    }

    public void setDealCode(String dealCode) {
        this.dealCode = dealCode == null ? null : dealCode.trim();
    }

    public String getDrCrFlag() {
        return drCrFlag;
    }

    public void setDrCrFlag(String drCrFlag) {
        this.drCrFlag = drCrFlag == null ? null : drCrFlag.trim();
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    public Long getAccountAmount() {
        return accountAmount;
    }

    public void setAccountAmount(Long accountAmount) {
        this.accountAmount = accountAmount;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public String getReconStatus() {
        return reconStatus;
    }

    public void setReconStatus(String reconStatus) {
        this.reconStatus = reconStatus == null ? null : reconStatus.trim();
    }

	public Date getBeginAccountDate() {
		return beginAccountDate;
	}

	public void setBeginAccountDate(Date beginAccountDate) {
		this.beginAccountDate = beginAccountDate;
	}

	public Date getEndAccountDate() {
		return endAccountDate;
	}

	public void setEndAccountDate(Date endAccountDate) {
		this.endAccountDate = endAccountDate;
	}

	public String getBillType() {
		return billType;
	}

	public void setBillType(String billType) {
		this.billType = billType;
	}
    
    
}
