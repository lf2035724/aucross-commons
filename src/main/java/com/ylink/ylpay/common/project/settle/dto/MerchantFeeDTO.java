/*******************************************************************************
 * Project   : aucross-common
 * Class Name: com.ylink.ylpay.common.project.settle.dto.MerchantFeeDTO
 * Created By: 杜波 159-9965-3650
 * Created on: 2013-3-26 下午2:49:12
 * Copyright © 2010-2012 证联融通 All rights reserved.
 ******************************************************************************/
package com.ylink.ylpay.common.project.settle.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;
import com.ylink.ylpay.common.project.settle.constant.MerchantFeeStatus;

/**
 * <P>商户计费DTO</P>
 * @author 杜波 159-9965-3650
 * @description：
 */
public class MerchantFeeDTO extends BaseDTO {
	private static final long serialVersionUID = -1629835639830564262L;
	/**
     * 商户计费ID
     */
    private Long id;
    /**
     * 商户ID
     */
    private String custId;
    /**
     * 商户编码
     */
    private String custCode;
    /**
     * 计费开始时间
     */
    private Date tradeBeginDate;
    /**
     * 计费结束时间
     */
    private Date tradeEndDate;
    /**
     * 计费总笔数
     */
    private Long tradeCount;
    /**
     * 计费总金额
     */
    private Long tradeAmount;
    /**
     * 费用
     */
    private Long feeAmount;

    
    
	private String state;
    /**
     * 计费模板ID
     */
    private String feeTemplateId;
    /**
     * 计算时间
     */
    private Date calTime;
    /**
     * 优惠金额
     */
    private Long offAmount;
    /**
     * 实际收取金额
     */
    private Long gatherAmount;
    /**
     * 收取方式,0:线上,1:线下
     */
    private String gatherType;
    /**
     * 收取日期
     */
    private Date gatherDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCustCode() {
		return custCode;
	}

	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}

	public Date getTradeBeginDate() {
        return tradeBeginDate;
    }

    public void setTradeBeginDate(Date tradeBeginDate) {
        this.tradeBeginDate = tradeBeginDate;
    }

    public Date getTradeEndDate() {
        return tradeEndDate;
    }

    public void setTradeEndDate(Date tradeEndDate) {
        this.tradeEndDate = tradeEndDate;
    }

    public Long getTradeCount() {
        return tradeCount;
    }

    public void setTradeCount(Long tradeCount) {
        this.tradeCount = tradeCount;
    }

    public Long getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(Long tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public Long getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(Long feeAmount) {
        this.feeAmount = feeAmount;
    }



	public String getFeeTemplateId() {
        return feeTemplateId;
    }

    public void setFeeTemplateId(String feeTemplateId) {
        this.feeTemplateId = feeTemplateId;
    }

    public Date getCalTime() {
        return calTime;
    }

    public void setCalTime(Date calTime) {
        this.calTime = calTime;
    }

    public Long getOffAmount() {
        return offAmount;
    }

    public void setOffAmount(Long offAmount) {
        this.offAmount = offAmount;
    }

    public Long getGatherAmount() {
        return gatherAmount;
    }

    public void setGatherAmount(Long gatherAmount) {
        this.gatherAmount = gatherAmount;
    }

    public String getGatherType() {
        return gatherType;
    }

    public void setGatherType(String gatherType) {
        this.gatherType = gatherType;
    }

    public Date getGatherDate() {
        return gatherDate;
    }

    public void setGatherDate(Date gatherDate) {
        this.gatherDate = gatherDate;
    }

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
