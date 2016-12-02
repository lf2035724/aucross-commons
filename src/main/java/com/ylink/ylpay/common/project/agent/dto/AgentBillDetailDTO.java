package com.ylink.ylpay.common.project.agent.dto;

import com.ylink.ylpay.common.project.channel.dto.AbstractDTO;

/**
 * @author wanglei
 * @date 2014-5-9
 * @description：缴费单明细DTO
 */
public class AgentBillDetailDTO extends AbstractDTO{
	private static final long serialVersionUID = -6543486309417465769L;
	/**合同号*/
	private String contractNo;
	/**客户姓名*/
	private String customerName;
	/**余额*/
	private String balance;
	/**应缴金额*/
	private String payAmount;
	/**起始日期*/
	private String beginDate;
	/**截止日期*/
	private String endDate;
	/**账期*/
	private String filed1;
	/**滞纳金*/
	private String filed2;
	/**备用字段*/
	private String filed3;
	/**备用字段*/
	private String filed4;
	/**备用字段*/
	private String filed5;
	public String getContractNo() {
		return contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}
	public String getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getFiled1() {
		return filed1;
	}
	public void setFiled1(String filed1) {
		this.filed1 = filed1;
	}
	public String getFiled2() {
		return filed2;
	}
	public void setFiled2(String filed2) {
		this.filed2 = filed2;
	}
	public String getFiled3() {
		return filed3;
	}
	public void setFiled3(String filed3) {
		this.filed3 = filed3;
	}
	public String getFiled4() {
		return filed4;
	}
	public void setFiled4(String filed4) {
		this.filed4 = filed4;
	}
	public String getFiled5() {
		return filed5;
	}
	public void setFiled5(String filed5) {
		this.filed5 = filed5;
	}
}
