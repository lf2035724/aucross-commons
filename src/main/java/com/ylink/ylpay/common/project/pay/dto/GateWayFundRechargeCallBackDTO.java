/**
 * GateWayFundRechargeCallBackDTO.java
 * 版权所有(C) 2014 证联融通电子有限公司 
 * 创建:LiuQ 2014-3-22
 */
package com.ylink.ylpay.common.project.pay.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * @author LiuQ
 * @date 2014-3-22
 * @description 股交所资金转入-网关回调DTO
 */
public class GateWayFundRechargeCallBackDTO extends BaseDTO {

	private static final long serialVersionUID = 6522695973647777649L;

	/**
	 * 支付系统流水号
	 */
	private String tradeId; 
	
	/**
	 * 商户流水
	 */
	private String businessSn;
	
	/**
	 * 商户编号
	 */
	private String merchantId;
	
	/**
	 * 订单状态
	 */
	private String orderStatus;

	/**
	 * @return the tradeId
	 */
	public String getTradeId() {
		return tradeId;
	}

	/**
	 * @param tradeId the tradeId to set
	 */
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	/**
	 * @return the businessSn
	 */
	public String getBusinessSn() {
		return businessSn;
	}

	/**
	 * @param businessSn the businessSn to set
	 */
	public void setBusinessSn(String businessSn) {
		this.businessSn = businessSn;
	}

	/**
	 * @return the merchantId
	 */
	public String getMerchantId() {
		return merchantId;
	}

	/**
	 * @param merchantId the merchantId to set
	 */
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	/**
	 * @return the orderStatus
	 */
	public String getOrderStatus() {
		return orderStatus;
	}

	/**
	 * @param orderStatus the orderStatus to set
	 */
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
}
