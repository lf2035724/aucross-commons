/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-11-6
 */

package com.ylink.ylpay.common.project.pay.dto;

import java.util.List;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author ZhangDM(Mingly)
 * @date 2012-11-6
 * @description：提现拒绝DTO
 */

public class WithdrawRefuseDTO extends BaseDTO {

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
	 * 拒绝原因
	 */
	private String refuseMsg;
	/**
	 *  提现订单号组
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
	public String getRefuseMsg() {
		return refuseMsg;
	}
	public void setRefuseMsg(String refuseMsg) {
		this.refuseMsg = refuseMsg;
	}
	public List<String> getWithdrawList() {
		return withdrawList;
	}
	public void setWithdrawList(List<String> withdrawList) {
		this.withdrawList = withdrawList;
	}

}
