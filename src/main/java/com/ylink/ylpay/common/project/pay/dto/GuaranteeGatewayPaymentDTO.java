/**
 * GuaranteeGatewayPaymentDTO.java
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司-证联融通电子有限公司 
 * 创建:LiuQ 2013-3-28
 */
package com.ylink.ylpay.common.project.pay.dto;

/**
 * @author LiuQ
 * @date 2013-3-28
 * @description：担保支付--网关支付DTO
 */
public class GuaranteeGatewayPaymentDTO extends PaymentInfoDTO {

	private static final long serialVersionUID = 1L;

	/**
	 * 业务流水号
	 */
    private String businessSn;
    /**
     * 订单金额
     */
    private long orderAmt;
    /**
     * 备注
     */
    private String remark;
    /**
     * 计费类型
     */
    private String feeType;
    /**
     * 付方手续费
     */
    private long payerFee;
    /**
     * 收方手续费
     */
    private long payeeFee;
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
	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * @return the feeType
	 */
	public String getFeeType() {
		return feeType;
	}
	/**
	 * @param feeType the feeType to set
	 */
	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}
	/**
	 * @return the payerFee
	 */
	public long getPayerFee() {
		return payerFee;
	}
	/**
	 * @param payerFee the payerFee to set
	 */
	public void setPayerFee(long payerFee) {
		this.payerFee = payerFee;
	}
	/**
	 * @return the payeeFee
	 */
	public long getPayeeFee() {
		return payeeFee;
	}
	/**
	 * @param payeeFee the payeeFee to set
	 */
	public void setPayeeFee(long payeeFee) {
		this.payeeFee = payeeFee;
	}
}
