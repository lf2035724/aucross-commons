/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-12-7
 */

package com.ylink.ylpay.common.project.pay.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author YG.HU
 * @date 2012-12-7
 * @description：现金易支付返回DTO
 */

public class EPayPaymentReturnDTO extends BaseDTO {
    
    private static final long serialVersionUID = 1L;
    
    /**
     * 赎回业务支付系统订单号
     */
    private String redeemPaymentId;
    /**
     * 申购业务支付系统订单号
     */
    private String purchasePaymentId;
    
	public String getRedeemPaymentId() {
		return redeemPaymentId;
	}
	public void setRedeemPaymentId(String redeemPaymentId) {
		this.redeemPaymentId = redeemPaymentId;
	}
	public String getPurchasePaymentId() {
		return purchasePaymentId;
	}
	public void setPurchasePaymentId(String purchasePaymentId) {
		this.purchasePaymentId = purchasePaymentId;
	}
    
    
}
