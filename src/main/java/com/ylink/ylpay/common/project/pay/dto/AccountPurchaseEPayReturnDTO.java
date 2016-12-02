/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-12-7
 */

package com.ylink.ylpay.common.project.pay.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author YG.HU
 * @date 2012-12-7
 * @description：现金易申购返回DTO
 */

public class AccountPurchaseEPayReturnDTO extends BaseDTO {
    
    private static final long serialVersionUID = 1L;
    
    /**
     * 支付系统订单号
     */
    private String paymentId;
    /**
     * 支付金额
     */
    private long orderAmt;
    /**
     * @return the paymentId
     */
    public String getPaymentId() {
        return paymentId;
    }
    /**
     * @param paymentId the paymentId to set
     */
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
    /**
     * @return the orderAmt
     */
    public long getOrderAmt() {
        return orderAmt;
    }
    /**
     * @param orderAmt the orderAmt to set
     */
    public void setOrderAmt(long orderAmt) {
        this.orderAmt = orderAmt;
    }
}
