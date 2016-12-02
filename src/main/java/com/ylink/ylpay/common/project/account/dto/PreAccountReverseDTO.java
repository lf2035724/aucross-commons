/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Iquil 2013-3-3
 */

package com.ylink.ylpay.common.project.account.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * @author Iquil
 * @date 2013-3-3
 * @description：预冲正接口实体类
 */

public class PreAccountReverseDTO extends BaseDTO {

	private static final long serialVersionUID = -4825793479527932668L;


	/**
	 * 原支付订单编号
	 */
	private String orgPayId;

	/**
	 * 冲正金额（必须大于0，否则报错）
	 */
	private long amount;

	public String getOrgPayId() {
		return orgPayId;
	}

	public void setOrgPayId(String orgPayId) {
		this.orgPayId = orgPayId;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}
}
