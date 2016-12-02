/**
 * 版权所有(C) 2012 证联融通
 * 创建:HuAJ 2012-12-12
 */

package com.ylink.ylpay.common.project.settle.dto;

import java.util.List;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author ZhangDM(Mingly)
 * @date 2013-2-25
 * @description：记账流水DTO
 */

public class BatchBillDTO extends BaseDTO {
	
	private static final long serialVersionUID = 1L;

	/**
	 * 批次号
	 */
	private Long batchId;
	
	/**
	 * 批次类型 BatchBillType
	 */
	private String batchBillType;
	
	/**
	 * 关连的记账流水
	 */
	private List<Long> billList;
	
	/**
	 * 银行行别
	 */
	private String bankType;
	
	/**
	 * 不平帐原因  ChannelPayUnbalanceReason
	 */
	private String unbalanceReason;

	public Long getBatchId() {
		return batchId;
	}

	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}

	public List<Long> getBillList() {
		return billList;
	}

	public void setBillList(List<Long> billList) {
		this.billList = billList;
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	public String getBatchBillType() {
		return batchBillType;
	}

	public void setBatchBillType(String batchBillType) {
		this.batchBillType = batchBillType;
	}

	public String getUnbalanceReason() {
		return unbalanceReason;
	}

	public void setUnbalanceReason(String unbalanceReason) {
		this.unbalanceReason = unbalanceReason;
	}

    
	
}
