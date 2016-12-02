package com.ylink.ylpay.common.project.settle.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

public class InvestorTransferDTO extends BaseDTO {
    private Long id;

    private String accountDate;

    private Integer incomeCount;

    private Integer payoutCount;

    private Long incomeAmount;

    private Long payoutAmount;

    private Date createTime;

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}