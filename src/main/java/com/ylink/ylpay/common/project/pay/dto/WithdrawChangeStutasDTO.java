/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-11-30
 */

package com.ylink.ylpay.common.project.pay.dto;

import java.util.List;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author YG.HU
 * @date 2012-11-30
 * @description：TODO
 */

public class WithdrawChangeStutasDTO extends BaseDTO {
	
	private static final long serialVersionUID = 1L;
	/**
	 * 管理平台状态起始-参照MPAuditStutas枚举
	 */
	private String mpStatusFrom;
	/**
	 * 管理平台状态终止-参照MPAuditStutas枚举
	 */
	private String mpStatusTo;
	/**
	 * 提现订单组
	 */
	private List<String> withdrawList;
	public String getMpStatusFrom() {
		return mpStatusFrom;
	}
	public void setMpStatusFrom(String mpStatusFrom) {
		this.mpStatusFrom = mpStatusFrom;
	}
	public String getMpStatusTo() {
		return mpStatusTo;
	}
	public void setMpStatusTo(String mpStatusTo) {
		this.mpStatusTo = mpStatusTo;
	}
	public List<String> getWithdrawList() {
		return withdrawList;
	}
	public void setWithdrawList(List<String> withdrawList) {
		this.withdrawList = withdrawList;
	}
}
