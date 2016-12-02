package com.ylink.ylpay.common.project.channel.dto;


public class PayBillDTO extends AbstractDTO{
	/**
	 * 快捷付批量付DTO
	 */
	private static final long serialVersionUID = -2013557445949123825L;
	private String orderId;//订单号                                
	private String payType;//支付类行 消费/基金        
	private String payment;//金额                                                                                                       
	private String payeeNo;//收款人账号                                                                                                 
	private String payeeName;//收款人姓名                                                                                                 
	private String payeeBankName;//收款银行名称                                                                                               
	private String reMark;//摘要                                                                                                       
	private String remark1;//预留1                                                                                                      
	private String remark2;//预留2                                                                                                      
	private String remark3;//预留3                                                                                                      
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getPayeeNo() {
		return payeeNo;
	}
	public void setPayeeNo(String payeeNo) {
		this.payeeNo = payeeNo;
	}

	public String getPayeeName() {
		return payeeName;
	}
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}
	public String getPayeeBankName() {
		return payeeBankName;
	}
	public void setPayeeBankName(String payeeBankName) {
		this.payeeBankName = payeeBankName;
	}
	public String getReMark() {
		return reMark;
	}
	public void setReMark(String reMark) {
		this.reMark = reMark;
	}
	public String getRemark1() {
		return remark1;
	}
	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}
	public String getRemark2() {
		return remark2;
	}
	public void setRemark2(String remark2) {
		this.remark2 = remark2;
	}
	public String getRemark3() {
		return remark3;
	}
	public void setRemark3(String remark3) {
		this.remark3 = remark3;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	
}
