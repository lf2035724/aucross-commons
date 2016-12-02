/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-11-12
 */

package com.ylink.ylpay.common.project.pay.dto;

import java.util.List;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author ZhangDM(Mingly)
 * @date 2012-11-12
 * @description：批量支付回执DTO
 */

public class BatchPayCallbackDTO extends BaseDTO {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 渠道批次号
	 */
	private String batchId;
	/**
	 * 支付系统接口类型
	 */
	private String payOptType;
	/**
	 * 渠道编号
	 */
	private String chnnlId;
	/**
	 * 支付明细记录
	 */
	List<PayBillDTO> payBillList;
	
	public String getBatchId() {
		return batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	public String getPayOptType() {
		return payOptType;
	}
	public void setPayOptType(String payOptType) {
		this.payOptType = payOptType;
	}
	public List<PayBillDTO> getPayBillList() {
		return payBillList;
	}
	public void setPayBillList(List<PayBillDTO> payBillList) {
		this.payBillList = payBillList;
	}
	public String getChnnlId() {
		return chnnlId;
	}
	public void setChnnlId(String chnnlId) {
		this.chnnlId = chnnlId;
	}
	
	
}
