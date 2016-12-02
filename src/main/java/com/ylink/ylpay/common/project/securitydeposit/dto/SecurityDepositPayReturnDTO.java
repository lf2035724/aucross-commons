package com.ylink.ylpay.common.project.securitydeposit.dto;

import com.ylink.ylpay.common.project.channel.dto.AbstractDTO;

/**
 * @author wanglei
 * @date 2014-4-14
 * @description：保证金支付返回DTO
 */
public class SecurityDepositPayReturnDTO extends AbstractDTO{

	private static final long serialVersionUID = -2789452223162676491L;
	/**错误序号*/
	private String errorNo;
	/**错误信息*/
	private String errorInfo;
	/**订单号*/
	private String orderNo;
	/**订单金额*/
	private String orderAmount;
	/**消费记录号，资金支付平台生成*/
	private String batchNo;
	/**交易凭证号，华创柜台生成*/
	private String voucherNo;
	public String getErrorNo() {
		return errorNo;
	}
	public void setErrorNo(String errorNo) {
		this.errorNo = errorNo;
	}
	public String getErrorInfo() {
		return errorInfo;
	}
	public void setErrorInfo(String errorInfo) {
		this.errorInfo = errorInfo;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getVoucherNo() {
		return voucherNo;
	}
	public void setVoucherNo(String voucherNo) {
		this.voucherNo = voucherNo;
	}
}
