package com.ylink.ylpay.common.project.channel.dto;


public class ManageFinancesBindDTO extends AbstractDTO{
	/**
	 * 快捷付实名认证授权账号
	 */
	private static final long serialVersionUID = 5935558070945316368L;
	private String bankType;     //行别  
	private String payType;     //行别  
	private String orderId;      //订单号      
	private String epayno;       //授权账号==银行卡号
	private String payment;
	/**
	 * @return the bankType
	 */
	public String getBankType() {
		return bankType;
	}
	/**
	 * @param bankType the bankType to set
	 */
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	/**
	 * @return the payType
	 */
	public String getPayType() {
		return payType;
	}
	/**
	 * @param payType the payType to set
	 */
	public void setPayType(String payType) {
		this.payType = payType;
	}
	/**
	 * @return the orderId
	 */
	public String getOrderId() {
		return orderId;
	}
	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	/**
	 * @return the epayno
	 */
	public String getEpayno() {
		return epayno;
	}
	/**
	 * @param epayno the epayno to set
	 */
	public void setEpayno(String epayno) {
		this.epayno = epayno;
	}
	/**
	 * @return the payment
	 */
	public String getPayment() {
		return payment;
	}
	/**
	 * @param payment the payment to set
	 */
	public void setPayment(String payment) {
		this.payment = payment;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ManageFinancesBindDTO [bankType=" + bankType + ", payType=" + payType + ", orderId=" + orderId + ", epayno=" + epayno + ", payment=" + payment
				+ "]";
	}

}
