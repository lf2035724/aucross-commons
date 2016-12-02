/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-10-29
 */

package com.ylink.ylpay.common.project.pay.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author ZhangDM(Mingly)
 * @date 2013-3-21
 * @description：交易汇总信息DTO
 */

public class TradeCollectInfoDTO extends BaseDTO {
    
    private static final long serialVersionUID = 1L;

    /**
     * 操作编码
     */
    private String optCode;
    /**
     * 交易付款方客户或商户ID
     */
    private String payerCustId;
    /**
     * 交易收款方客户或商户ID
     */
    private String payeeCustId;
    /**
     * 总金额
     */
    private Long totalAmt;
    /**
     * 总笔数
     */
    private Long totalCount;
    /**
     * 交易起始时间
     */
    private Date queryBeginDate;
    /**
     * 交易结束时间
     */
    private Date queryEndDate;
    
	public String getOptCode() {
		return optCode;
	}
	public void setOptCode(String optCode) {
		this.optCode = optCode;
	}
	public Long getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(Long totalAmt) {
		this.totalAmt = totalAmt;
	}
	public Long getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
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
	public String getPayerCustId() {
		return payerCustId;
	}
	public void setPayerCustId(String payerCustId) {
		this.payerCustId = payerCustId;
	}
	public String getPayeeCustId() {
		return payeeCustId;
	}
	public void setPayeeCustId(String payeeCustId) {
		this.payeeCustId = payeeCustId;
	}
	
    
    
}
