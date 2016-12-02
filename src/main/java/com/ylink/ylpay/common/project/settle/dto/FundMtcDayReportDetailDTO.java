/**
 * 版权所有(C) 2012 证联融通
 * 创建:HuAJ 2012-12-4
 */

package com.ylink.ylpay.common.project.settle.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author ZhangDM(Mingly)
 * @date 2013-1-10
 * @description：基金运维日统计报表详细
 */

public class FundMtcDayReportDetailDTO extends BaseDTO {

	private Long reportId;

    private String accountDate;
    
    private String tradeType;

    private Integer dealCount;

    private Long dealAmount;

    private Integer succCount;

    private Long succAmount;

    private String countRate;

    private String amountRate;

    private Date createTime;
    
    private Date beginAccountDate;
    
    private Date endAccountDate;
    
    private Date beginCreateTime;
    
    private Date endCreateTime;

    private static final long serialVersionUID = 1L;

    public Long getReportId() {
        return reportId;
    }

    public void setReportId(Long reportId) {
        this.reportId = reportId;
    }

    public String getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(String accountDate) {
        this.accountDate = accountDate == null ? null : accountDate.trim();
    }

    public Integer getDealCount() {
        return dealCount;
    }

    public void setDealCount(Integer dealCount) {
        this.dealCount = dealCount;
    }

    public Long getDealAmount() {
        return dealAmount;
    }

    public void setDealAmount(Long dealAmount) {
        this.dealAmount = dealAmount;
    }

    public Integer getSuccCount() {
        return succCount;
    }

    public void setSuccCount(Integer succCount) {
        this.succCount = succCount;
    }

    public Long getSuccAmount() {
        return succAmount;
    }

    public void setSuccAmount(Long succAmount) {
        this.succAmount = succAmount;
    }

    public String getAmountRate() {
        return amountRate;
    }

    public void setAmountRate(String amountRate) {
        this.amountRate = amountRate == null ? null : amountRate.trim();
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

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getCountRate() {
		return countRate;
	}

	public void setCountRate(String countRate) {
		this.countRate = countRate;
	}
	

}
