package com.ylink.ylpay.common.project.agent.dto;

import com.ylink.ylpay.common.project.channel.dto.AbstractDTO;

/**
 * @author wanglei
 * @date 2014-7-23
 * @description：
 */
public class AgentPayDetailDTO extends AbstractDTO{

	private static final long serialVersionUID = 7448327936503933794L;

	private String agentPayDetailSn;
	private String agentPaySnRef;
	private String billKey;
	private String companyId;
	private String requestCebbSn;
	private String billNo;
	private String payAmount;
	private String payDate;
	private String bankBillNo;
	private String agentStatus;
	private String filed1;
	private String filed2;
	private String filed3;
	private String filed4;
	private String cityCode;
	private String projectCode;
	private String agentMsg;
	public String getAgentPayDetailSn() {
		return agentPayDetailSn;
	}
	public void setAgentPayDetailSn(String agentPayDetailSn) {
		this.agentPayDetailSn = agentPayDetailSn;
	}
	public String getAgentPaySnRef() {
		return agentPaySnRef;
	}
	public void setAgentPaySnRef(String agentPaySnRef) {
		this.agentPaySnRef = agentPaySnRef;
	}
	public String getBillKey() {
		return billKey;
	}
	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getRequestCebbSn() {
		return requestCebbSn;
	}
	public void setRequestCebbSn(String requestCebbSn) {
		this.requestCebbSn = requestCebbSn;
	}
	public String getBillNo() {
		return billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}
	public String getPayDate() {
		return payDate;
	}
	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}
	public String getBankBillNo() {
		return bankBillNo;
	}
	public void setBankBillNo(String bankBillNo) {
		this.bankBillNo = bankBillNo;
	}
	public String getAgentStatus() {
		return agentStatus;
	}
	public void setAgentStatus(String agentStatus) {
		this.agentStatus = agentStatus;
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
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getProjectCode() {
		return projectCode;
	}
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	public String getAgentMsg() {
		return agentMsg;
	}
	public void setAgentMsg(String agentMsg) {
		this.agentMsg = agentMsg;
	}
}
