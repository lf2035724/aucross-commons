package com.ylink.ylpay.common.project.settle.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

public class FundNetbalanceDTO extends BaseDTO {
	
    private Long netbalanceId;

    private String accountDate;

    private Integer netNo;

    private String bankType;

    private String bankAcctNo;

    private Integer totalCount;

    private Integer incomeCount;

    private Integer payoutCount;

    private Long netAmount;

    private Long incomeAmount;

    private Long payoutAmount;

    private String netType;

    private Date createTime;
    
    private Date beginAccountDate;
    
    private Date endAccountDate;
    
    private Date beginCreateTime;
    
    private Date endCreateTime;
    
    /***************扩展轧差功能   2014-03-05**********************/
    private String taskId;//任务号
    private String netbalanceType;//轧差状态
    private String detailType;//报备状态
    private String allotType;//调拨状态
    private String payType;//支付状态
    private String nbType;//轧差类型

    private static final long serialVersionUID = 1L;

    public Long getNetbalanceId() {
        return netbalanceId;
    }

    public void setNetbalanceId(Long netbalanceId) {
        this.netbalanceId = netbalanceId;
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

    public String getBankAcctNo() {
        return bankAcctNo;
    }

    public void setBankAcctNo(String bankAcctNo) {
        this.bankAcctNo = bankAcctNo == null ? null : bankAcctNo.trim();
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getIncomeCount() {
        return incomeCount;
    }

    public void setIncomeCount(Integer incomeCount) {
        this.incomeCount = incomeCount;
    }

    public Integer getPayoutCount() {
        return payoutCount;
    }

    public void setPayoutCount(Integer payoutCount) {
        this.payoutCount = payoutCount;
    }

    public Long getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(Long netAmount) {
        this.netAmount = netAmount;
    }

    public Long getIncomeAmount() {
        return incomeAmount;
    }

    public void setIncomeAmount(Long incomeAmount) {
        this.incomeAmount = incomeAmount;
    }

    public Long getPayoutAmount() {
        return payoutAmount;
    }

    public void setPayoutAmount(Long payoutAmount) {
        this.payoutAmount = payoutAmount;
    }

    public String getNetType() {
        return netType;
    }

    public void setNetType(String netType) {
        this.netType = netType == null ? null : netType.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

	public Date getBeginCreateTime() {
		return beginCreateTime;
	}

	public void setBeginCreateTime(Date beginCreateTime) {
		this.beginCreateTime = beginCreateTime;
	}

	public Date getEndCreateTime() {
		return endCreateTime;
	}

	public void setEndCreateTime(Date endCreateTime) {
		this.endCreateTime = endCreateTime;
	}

	public Integer getNetNo() {
		return netNo;
	}

	public void setNetNo(Integer netNo) {
		this.netNo = netNo;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getNetbalanceType() {
		return netbalanceType;
	}

	public void setNetbalanceType(String netbalanceType) {
		this.netbalanceType = netbalanceType;
	}

	public String getDetailType() {
		return detailType;
	}

	public void setDetailType(String detailType) {
		this.detailType = detailType;
	}

	public String getAllotType() {
		return allotType;
	}

	public void setAllotType(String allotType) {
		this.allotType = allotType;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getNbType() {
		return nbType;
	}

	public void setNbType(String nbType) {
		this.nbType = nbType;
	}

}