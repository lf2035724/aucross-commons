/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-11-16
 */

package com.ylink.ylpay.common.project.pay.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author ZhangDM(Mingly)
 * @date 2012-11-16
 * @description：网关返回信息DTO
 */

public class GatewayReturnInfoDTO extends BaseDTO {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 银行网关url
	 */
	private String bankUrl;
	/**
	 * 订单编号
	 */
	private String tradeId;
	
	
	
	public String getBankUrl() {
		return bankUrl;
	}
	public void setBankUrl(String bankUrl) {
		this.bankUrl = bankUrl;
	}
	public String getTradeId() {
		return tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	
	
}
