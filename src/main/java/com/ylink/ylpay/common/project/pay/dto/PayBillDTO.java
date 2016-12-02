/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-11-12
 */

package com.ylink.ylpay.common.project.pay.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author ZhangDM(Mingly)
 * @date 2012-11-12
 * @description：批量支付详细记录DTO
 */

public class PayBillDTO extends BaseDTO {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 支付订单编号
	 */
	private String payId;
	/**
	 * 银行支付状态
	 */
	private String payStatus;
	/**
	 * 渠道流水
	 */
	private String chnnlNo;
	
	public String getPayId() {
		return payId;
	}
	public void setPayId(String payId) {
		this.payId = payId;
	}
	public String getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	public String getChnnlNo() {
		return chnnlNo;
	}
	public void setChnnlNo(String chnnlNo) {
		this.chnnlNo = chnnlNo;
	}

}
