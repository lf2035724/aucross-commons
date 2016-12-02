package com.ylink.ylpay.common.project.settle.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

public class ChannelReconDetailDTO extends BaseDTO {
    
	private Long id;

    private String accountDate;

    private String bankType;

    /**
     * 监控id
     */
    private Long monitorId;

    /**
     * 银行对账流水
     */
    private String channelNo;

    /**
     * 支付订单编号
     */
    private String payId;

    /**
     * 银行金额
     */
    private Long bankAmount;

    /**
     * 银行状态
     */
    private String bankStatus;

    /**
     * 记账金额
     */
    private Long acctAmount;

    /**
     * 记账状态
     */
    private String acctStatus;

    /**
     * 对账状态 ChannelPayReconStatus
     */
    private String reconStatus;

    /**
     * 不平帐原因 ChannelPayUnbalanceReason
     */
    private String unbalanceReason;

    private Date createTime;

    private Date updateTime;

    /**
     * 调账状态 
     */
    private String adjustStatus;

    /**
     * 对账类型 ChannelReconType
     */
    private String reconType;

    /**
     * 对账批次编号
     */
    private String reconBatchId;

    /**
     * 记账流水编号
     */
    private Long billId;
    
    /**
     * 起始记账日期
     */
    private Date beginAccountDate;
    
    /**
     * 结束记账日期
     */
    private Date endAccountDate;
    
    /**
     * 借贷标记
     */
    private String drCrFlag;
    
    /**
     * 科目编码
     */
    private String accountId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(String accountDate) {
        this.accountDate = accountDate == null ? null : accountDate.trim();
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType == null ? null : bankType.trim();
    }

    public Long getMonitorId() {
        return monitorId;
    }

    public void setMonitorId(Long monitorId) {
        this.monitorId = monitorId;
    }

    public String getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(String channelNo) {
        this.channelNo = channelNo == null ? null : channelNo.trim();
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId == null ? null : payId.trim();
    }

    public Long getBankAmount() {
        return bankAmount;
    }

    public void setBankAmount(Long bankAmount) {
        this.bankAmount = bankAmount;
    }

    public String getBankStatus() {
        return bankStatus;
    }

    public void setBankStatus(String bankStatus) {
        this.bankStatus = bankStatus == null ? null : bankStatus.trim();
    }

    public Long getAcctAmount() {
        return acctAmount;
    }

    public void setAcctAmount(Long acctAmount) {
        this.acctAmount = acctAmount;
    }

    public String getAcctStatus() {
        return acctStatus;
    }

    public void setAcctStatus(String acctStatus) {
        this.acctStatus = acctStatus == null ? null : acctStatus.trim();
    }

    public String getReconStatus() {
        return reconStatus;
    }

    public void setReconStatus(String reconStatus) {
        this.reconStatus = reconStatus == null ? null : reconStatus.trim();
    }

    public String getUnbalanceReason() {
        return unbalanceReason;
    }

    public void setUnbalanceReason(String unbalanceReason) {
        this.unbalanceReason = unbalanceReason == null ? null : unbalanceReason.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getAdjustStatus() {
        return adjustStatus;
    }

    public void setAdjustStatus(String adjustStatus) {
        this.adjustStatus = adjustStatus == null ? null : adjustStatus.trim();
    }

    public String getReconType() {
        return reconType;
    }

    public void setReconType(String reconType) {
        this.reconType = reconType == null ? null : reconType.trim();
    }

    public String getReconBatchId() {
        return reconBatchId;
    }

    public void setReconBatchId(String reconBatchId) {
        this.reconBatchId = reconBatchId == null ? null : reconBatchId.trim();
    }

    public Long getBillId() {
        return billId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
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

	public String getDrCrFlag() {
		return drCrFlag;
	}

	public void setDrCrFlag(String drCrFlag) {
		this.drCrFlag = drCrFlag;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
    
    

}