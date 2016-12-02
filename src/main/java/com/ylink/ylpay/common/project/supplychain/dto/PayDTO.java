package com.ylink.ylpay.common.project.supplychain.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;
import com.ylink.ylpay.common.project.supplychain.constant.ContractType;

public class PayDTO extends BaseDTO {

	private static final long serialVersionUID = -8309087184865524516L;
	
	private String contractContentSeq;//协议内容编号
	private String contractSeq;//协议号
	private String payerId;//付款方ID
	private String payeeId;//收款方ID
	private long payAmount;//支付金额 
	private String payStatus;//转让款，清偿款标志T：转让款   C：清偿款  L：放款   R：还款
	private String remark;//付款说明
	private ContractType contractType; //协议类型
	
	public String toString(){
		return "PayDTO=[contractSeq="+contractSeq+";payerId="+payerId+";payeeId="+payeeId+";payAmount="+payAmount+";payStatus="+payStatus+"]";
	}

	public String getContractSeq() {
		return contractSeq;
	}

	public void setContractSeq(String contractSeq) {
		this.contractSeq = contractSeq;
	}

	public String getPayerId() {
		return payerId;
	}

	public void setPayerId(String payerId) {
		this.payerId = payerId;
	}

	public String getPayeeId() {
		return payeeId;
	}

	public void setPayeeId(String payeeId) {
		this.payeeId = payeeId;
	}

	public long getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(long payAmount) {
		this.payAmount = payAmount;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getContractContentSeq() {
		return contractContentSeq;
	}

	public void setContractContentSeq(String contractContentSeq) {
		this.contractContentSeq = contractContentSeq;
	}

	public ContractType getContractType() {
		return contractType;
	}

	public void setContractType(ContractType contractType) {
		this.contractType = contractType;
	}
	
}
