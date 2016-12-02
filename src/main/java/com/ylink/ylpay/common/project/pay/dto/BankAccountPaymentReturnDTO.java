/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-12-7
 */

package com.ylink.ylpay.common.project.pay.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author YG.HU
 * @date 2012-12-7
 * @description：银行付款返回DTO
 */

public class BankAccountPaymentReturnDTO extends BaseDTO {
    
    private static final long serialVersionUID = 1L;
    
    /**
     * 支付订单号
     */
    private String paymentId;
    /**
     * 提现订单号
     */
    private String withdrawId;
    
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public String getWithdrawId() {
		return withdrawId;
	}
	public void setWithdrawId(String withdrawId) {
		this.withdrawId = withdrawId;
	}
	
    
}
