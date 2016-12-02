/*******************************************************************************
 * Project   : aucross-common
 * Class Name: com.ylink.ylpay.common.project.settle.dto.PayStatusStatisticsDTO
 * Created By: 杜波 159-9965-3650
 * Created on: 2013-4-2 上午11:20:18
 * Copyright © 2010-2012 证联融通 All rights reserved.
 ******************************************************************************/
package com.ylink.ylpay.common.project.settle.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * <P>交易统计信息DTO</P>
 * @author 杜波 159-9965-3650
 * @description：
 */
public class PayStatusStatisticsDTO extends BaseDTO {

	private static final long serialVersionUID = -4159324147276542077L;

	/**
     * 统计ID
     */
    private Long statisticsId;

    /**
     * 交易类型
     */
    private String transType;

    /**
     * 交易日期
     */
    private Date transDate;

    /**
     * 交易总笔数
     */
    private Long totalCount;

    /**
     * 交易总金额
     */
    private Long totalAmount;

    /**
     * 交易成功笔数
     */
    private Long successCount;

    /**
     * 交易成功金额
     */
    private Long successAmount;

    /**
     * 失败总笔数
     */
    private Long failureCount;

    /**
     * 失败总金额
     */
    private Long failureAmount;

    /**
     * 成功率
     */
    private Long successRate;

    /**
     * 失败率
     */
    private Long failureRate;


    public Long getStatisticsId() {
        return statisticsId;
    }

    public void setStatisticsId(Long statisticsId) {
        this.statisticsId = statisticsId;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Long getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Long successCount) {
        this.successCount = successCount;
    }

    public Long getSuccessAmount() {
        return successAmount;
    }

    public void setSuccessAmount(Long successAmount) {
        this.successAmount = successAmount;
    }

    public Long getFailureCount() {
        return failureCount;
    }

    public void setFailureCount(Long failureCount) {
        this.failureCount = failureCount;
    }

    public Long getFailureAmount() {
        return failureAmount;
    }

    public void setFailureAmount(Long failureAmount) {
        this.failureAmount = failureAmount;
    }

    public Long getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(Long successRate) {
        this.successRate = successRate;
    }

    public Long getFailureRate() {
        return failureRate;
    }

    public void setFailureRate(Long failureRate) {
        this.failureRate = failureRate;
    }
}
