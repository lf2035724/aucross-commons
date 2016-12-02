/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Iquil 2012-11-13
 */

package com.ylink.ylpay.common.project.account.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * @author Iquil
 * @date 2012-11-13
 * @description：冲正接口实体类
 */

public class AccountReverseDTO extends BaseDTO {

	private static final long serialVersionUID = -4825325579527932668L;


	/**
	 * 原支付订单编号
	 */
	private String orgPayId;
	
	/**
	 * 新支付订单（冲正支付订单）编号
	 */
	private String newPayId;	

	/**
	 * 冲正金额（必须大于0，否则报错）
	 */
	private long amount;

	/**
	 * 冲正原因
	 */
	private String reverseDesc;
	
	/**
	 * 起始时间
	 */
	private String dateFrom;
	
	/**
	 * 终止时间
	 */
	private String dateTo;
	
	
	public String getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}

	public String getDateTo() {
		return dateTo;
	}

	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}

	public String getOrgPayId() {
		return orgPayId;
	}

	public void setOrgPayId(String orgPayId) {
		this.orgPayId = orgPayId;
	}

	public String getNewPayId() {
		return newPayId;
	}

	public void setNewPayId(String newPayId) {
		this.newPayId = newPayId;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public String getReverseDesc() {
		return reverseDesc;
	}

	public void setReverseDesc(String reverseDesc) {
		this.reverseDesc = reverseDesc;
	}

}
