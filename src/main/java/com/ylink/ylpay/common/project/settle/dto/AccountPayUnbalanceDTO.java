package com.ylink.ylpay.common.project.settle.dto;

import java.io.Serializable;
import java.util.Date;

public class AccountPayUnbalanceDTO implements Serializable {
    
	private Long id;//主键

    private Long bookId;//记账接口流水ID

    private String payId;//支付订单号

    private String orderId;//交易订单号

    private String optCode;//交易编号

    private String dealCode;//支付编号

    private Long acctAmount;//记账金额
    
    private Long payAmount;//支付金额

    private Date checkTime;//对账时间

    private String checkStatus;//对账状态

    private String remark;//对账不平备注

    private String dealResult;//处理结果

    private String operator;//操作人

    private Date dealTime;//处理时间
    
    private String accountDate;//账务日期
    
    private String reconType;//对账类型
    
    private String batchId;//批次号
    
    private String beginAccountDateStr;
    
    private String endAccountDateStr;
    
    private String endCheckTimeStr;
    
    private String beginCheckTimeStr;
    
    private String beginDealTimeStr;
    
    private String endDealTimeStr;
    
    /**
	 * 账务金额下限
	 */
	private Long acctAmountFrom;
	/**
	 * 账务金额上限
	 */
	private Long acctAmountTo;
	/**
	 * 支付金额下限
	 */
	private Long payAmountFrom;
	/**
	 * 支付金额上限
	 */
	private Long payAmountTo;
	
	private static final long serialVersionUID = 1L;
	
	public String getBeginAccountDateStr() {
		return beginAccountDateStr;
	}

	public void setBeginAccountDateStr(String beginAccountDateStr) {
		this.beginAccountDateStr = beginAccountDateStr;
	}

	public String getEndAccountDateStr() {
		return endAccountDateStr;
	}

	public void setEndAccountDateStr(String endAccountDateStr) {
		this.endAccountDateStr = endAccountDateStr;
	}

	public String getEndCheckTimeStr() {
		return endCheckTimeStr;
	}

	public void setEndCheckTimeStr(String endCheckTimeStr) {
		this.endCheckTimeStr = endCheckTimeStr;
	}

	public String getBeginCheckTimeStr() {
		return beginCheckTimeStr;
	}

	public void setBeginCheckTimeStr(String beginCheckTimeStr) {
		this.beginCheckTimeStr = beginCheckTimeStr;
	}

	public String getBeginDealTimeStr() {
		return beginDealTimeStr;
	}

	public void setBeginDealTimeStr(String beginDealTimeStr) {
		this.beginDealTimeStr = beginDealTimeStr;
	}

	public String getEndDealTimeStr() {
		return endDealTimeStr;
	}

	public void setEndDealTimeStr(String endDealTimeStr) {
		this.endDealTimeStr = endDealTimeStr;
	}

	public Long getAcctAmountFrom() {
		return acctAmountFrom;
	}

	public void setAcctAmountFrom(Long acctAmountFrom) {
		this.acctAmountFrom = acctAmountFrom;
	}

	public Long getAcctAmountTo() {
		return acctAmountTo;
	}

	public void setAcctAmountTo(Long acctAmountTo) {
		this.acctAmountTo = acctAmountTo;
	}

	public Long getPayAmountFrom() {
		return payAmountFrom;
	}

	public void setPayAmountFrom(Long payAmountFrom) {
		this.payAmountFrom = payAmountFrom;
	}

	public Long getPayAmountTo() {
		return payAmountTo;
	}

	public void setPayAmountTo(Long payAmountTo) {
		this.payAmountTo = payAmountTo;
	}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId == null ? null : payId.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
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

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus == null ? null : checkStatus.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getDealResult() {
        return dealResult;
    }

    public void setDealResult(String dealResult) {
        this.dealResult = dealResult == null ? null : dealResult.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

	public String getAccountDate() {
		return accountDate;
	}

	public void setAccountDate(String accountDate) {
		this.accountDate = accountDate;
	}

	public Long getAcctAmount() {
		return acctAmount;
	}

	public void setAcctAmount(Long acctAmount) {
		this.acctAmount = acctAmount;
	}

	public Long getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(Long payAmount) {
		this.payAmount = payAmount;
	}

	public String getReconType() {
		return reconType;
	}

	public void setReconType(String reconType) {
		this.reconType = reconType;
	}

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
    
    
}