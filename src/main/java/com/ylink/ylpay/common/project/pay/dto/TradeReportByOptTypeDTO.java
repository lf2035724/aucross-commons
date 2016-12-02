/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-11-12
 */

package com.ylink.ylpay.common.project.pay.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author ZhangDM(Mingly)
 * @date 2012-11-12
 * @description：交易报表查询DTO
 */

public class TradeReportByOptTypeDTO extends BaseDTO {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 业务类型
	 */
	private String optCode;
	/**
	 * 总笔数
	 */
	private Integer totalCount;
	/**
	 * 总金额
	 */
	private Long totalAmount;
	/**
	 * 成功笔数
	 */
	private Integer succCount;
	/**
	 * 成功金额
	 */
	private Long succAmount; 
	/**
	 * 失败笔数
	 */
	private Integer failCount;
	/**
	 * 失败金额
	 */
	private Long failAmount;
	public String getOptCode() {
		return optCode;
	}
	public void setOptCode(String optCode) {
		this.optCode = optCode;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
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
	public Integer getFailCount() {
		return failCount;
	}
	public void setFailCount(Integer failCount) {
		this.failCount = failCount;
	}
	public Long getFailAmount() {
		return failAmount;
	}
	public void setFailAmount(Long failAmount) {
		this.failAmount = failAmount;
	}
	
	
}
