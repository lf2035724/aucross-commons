package com.ylink.ylpay.common.project.supplychain.dto;

import java.util.Date;
import com.ylink.ylpay.common.core.dto.BaseDTO;
import com.ylink.ylpay.common.project.supplychain.constant.ContractType;

public class ContractDTO extends BaseDTO implements Comparable<ContractDTO>{

	private static final long serialVersionUID = -5835516610323858010L;
	
	private String contractContentSeq;//
	private String contractSeq;//协议号 20位 8位日期+2位类型（01三方合同协议，02两方协议…）+10位seq
	private String contractType;//协议类型（1：两方  2：三方）
	private String sponsorType;//协议发起人类型(枚举) C:债权人 D:债务人 A:受让方
	private Date startTime;//协议发起时间
	private Date createTime;//协议创建时间
	private String creditorCustId;//债权方客户ID
	private String creditorCustName;//债权方客户名称
	private Date creditorSignTime;//债权方签约时间
	private String creditorLegalPerson;//债权方法人
	private String creditorEmail;//债权人证钱账户
	private String creditorAddrReg;//债权人注册地址及邮编
	private String creditorPhone;//债权人联系电话
	private String creditorSignStatus;//债权人签约状态(枚举表示)0：未签约 1：同意 2：拒绝
	private String creditorSignEncry;//债权人电子签名
	private String debtorCustId;//债务方客户ID
	private String debtorCustName;//债务方客户名称
	private Date debtorSignTime;//债务方签约时间
	private String debtorLegalPerson;//债务方法人
	private String debtorEmail;//债务人证钱账户
	private String debtorAddrReg;//债务人注册地址及邮编
	private String debtorPhone;//债务人联系电话
	private String debtorSignStatus;//债务人签约状态(枚举表示) 0：未签约 1：同意 2：拒绝
	private String debtorSignEncry;//债务人电子签名
	private String acceptorCustId;//受让方方客户ID
	private String acceptorCustName;//受让方客户名称
	private Date acceptorSignTime;//受让方签约时间
	private String acceptorLegalPerson;//受让方法人
	private String acceptorEmail;//受让方证钱账户
	private String acceptorAddrReg;//受让方注册地址及邮编
	private String acceptorPhone;//受让方联系电话
	private String acceptorSignStatus;//受让方签约状态(枚举表示)0：未签约 1：同意 2：拒绝
	private String acceptorSignEncry;//受让方电子签名
	private long transferFeeMoney;//受让金额(单位：分)
	private String contractStatus;//协议状态（枚举）1：草稿 2：协议签署中 3：协议失败 4：协议成功
	private String executeStatus;//执行状态（枚举）1：未执行（初始状态）2：等待付款（协议成功未支付之前）3：转让款已支付 4：清偿款已支付
	private Date tenderCreateDate;//标的产生日期
	private Date tenderRepayDate;//标的偿还日期
	private long tenderPrice;//标的价格(单位：分)
	private String tenderGoodsDesc;//标物的描述
	private long tenderTransferPrice;//标的转让价格(单位:分)
	private Date tenderTransferPayDate;//标的转让支付日期
	private Date tenderTransferPaySucDate;//标的转让支付日期(实际)
	private Date tenderTransferClearDate;//标的转让清偿日期
	private Date tenderTransferClearSucDate;//标的转让清偿日期(实际)
	private String transferPaySn;//转让款支付流水
	private String transferPayTradeId;//转让款支付成功返回的tradeID
	private String clearPaySn;//清偿款支付流水
	private String clearPayTradeId;//清偿款支付成功返回的tradeID
	private long sucTenderPrice;//实际清偿标的价格
	private long sucTenderTransferPrice;//实际支付的转让价格(单位为分)
	
	private Date endTime;//协议截止时间
	private String queryCustId;//查询者客户号
	private long transferFeeMoneyEnd;//截止 受让金额
	

	private String repaymentMethod;//还款方式
	private long repaymentAmount;//还款金额
	
	//两方
	private long contractAmount;
	private long interestRate;
	private Date beginDate;
	private Date endDate;
	private Date createDate;
	private Date updateDate;
	private String repaymentCycleUnit;
	private long repaymentCycle;
	private Date transferDate;
	private long successRepaymentAmount;
	private Date repatmentDate;
	private String loanUse;
	
	
	
	public String getRepaymentMethod() {
		return repaymentMethod;
	}
	public void setRepaymentMethod(String repaymentMethod) {
		this.repaymentMethod = repaymentMethod;
	}
	public long getRepaymentAmount() {
		return repaymentAmount;
	}
	public void setRepaymentAmount(long repaymentAmount) {
		this.repaymentAmount = repaymentAmount;
	}
	public String getQueryCustId() {
		return queryCustId;
	}
	public void setQueryCustId(String queryCustId) {
		this.queryCustId = queryCustId;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getContractSeq() {
		return contractSeq;
	}
	public void setContractSeq(String contractSeq) {
		this.contractSeq = contractSeq;
	}
	public String getSponsorType() {
		return sponsorType;
	}
	public void setSponsorType(String sponsorType) {
		this.sponsorType = sponsorType;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getCreditorCustId() {
		return creditorCustId;
	}
	public void setCreditorCustId(String creditorCustId) {
		this.creditorCustId = creditorCustId;
	}
	public String getCreditorCustName() {
		return creditorCustName;
	}
	public void setCreditorCustName(String creditorCustName) {
		this.creditorCustName = creditorCustName;
	}
	public Date getCreditorSignTime() {
		return creditorSignTime;
	}
	public void setCreditorSignTime(Date creditorSignTime) {
		this.creditorSignTime = creditorSignTime;
	}
	public String getCreditorLegalPerson() {
		return creditorLegalPerson;
	}
	public void setCreditorLegalPerson(String creditorLegalPerson) {
		this.creditorLegalPerson = creditorLegalPerson;
	}
	public String getCreditorEmail() {
		return creditorEmail;
	}
	public void setCreditorEmail(String creditorEmail) {
		this.creditorEmail = creditorEmail;
	}
	public String getCreditorSignStatus() {
		return creditorSignStatus;
	}
	public void setCreditorSignStatus(String creditorSignStatus) {
		this.creditorSignStatus = creditorSignStatus;
	}
	public String getCreditorSignEncry() {
		return creditorSignEncry;
	}
	public void setCreditorSignEncry(String creditorSignEncry) {
		this.creditorSignEncry = creditorSignEncry;
	}
	public String getDebtorCustId() {
		return debtorCustId;
	}
	public void setDebtorCustId(String debtorCustId) {
		this.debtorCustId = debtorCustId;
	}
	public String getDebtorCustName() {
		return debtorCustName;
	}
	public void setDebtorCustName(String debtorCustName) {
		this.debtorCustName = debtorCustName;
	}
	public Date getDebtorSignTime() {
		return debtorSignTime;
	}
	public void setDebtorSignTime(Date debtorSignTime) {
		this.debtorSignTime = debtorSignTime;
	}
	public String getDebtorLegalPerson() {
		return debtorLegalPerson;
	}
	public void setDebtorLegalPerson(String debtorLegalPerson) {
		this.debtorLegalPerson = debtorLegalPerson;
	}
	public String getDebtorEmail() {
		return debtorEmail;
	}
	public void setDebtorEmail(String debtorEmail) {
		this.debtorEmail = debtorEmail;
	}
	public String getDebtorSignStatus() {
		return debtorSignStatus;
	}
	public void setDebtorSignStatus(String debtorSignStatus) {
		this.debtorSignStatus = debtorSignStatus;
	}
	public String getDebtorSignEncry() {
		return debtorSignEncry;
	}
	public void setDebtorSignEncry(String debtorSignEncry) {
		this.debtorSignEncry = debtorSignEncry;
	}
	public String getAcceptorCustId() {
		return acceptorCustId;
	}
	public void setAcceptorCustId(String acceptorCustId) {
		this.acceptorCustId = acceptorCustId;
	}
	public String getAcceptorCustName() {
		return acceptorCustName;
	}
	public void setAcceptorCustName(String acceptorCustName) {
		this.acceptorCustName = acceptorCustName;
	}
	public Date getAcceptorSignTime() {
		return acceptorSignTime;
	}
	public void setAcceptorSignTime(Date acceptorSignTime) {
		this.acceptorSignTime = acceptorSignTime;
	}
	public String getAcceptorLegalPerson() {
		return acceptorLegalPerson;
	}
	public void setAcceptorLegalPerson(String acceptorLegalPerson) {
		this.acceptorLegalPerson = acceptorLegalPerson;
	}
	public String getAcceptorEmail() {
		return acceptorEmail;
	}
	public void setAcceptorEmail(String acceptorEmail) {
		this.acceptorEmail = acceptorEmail;
	}
	public String getAcceptorSignStatus() {
		return acceptorSignStatus;
	}
	public void setAcceptorSignStatus(String acceptorSignStatus) {
		this.acceptorSignStatus = acceptorSignStatus;
	}
	public String getAcceptorSignEncry() {
		return acceptorSignEncry;
	}
	public void setAcceptorSignEncry(String acceptorSignEncry) {
		this.acceptorSignEncry = acceptorSignEncry;
	}
	public long getTransferFeeMoney() {
		return transferFeeMoney;
	}
	public void setTransferFeeMoney(long transferFeeMoney) {
		this.transferFeeMoney = transferFeeMoney;
	}
	public String getContractStatus() {
		return contractStatus;
	}
	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}
	public String getExecuteStatus() {
		return executeStatus;
	}
	public void setExecuteStatus(String executeStatus) {
		this.executeStatus = executeStatus;
	}
	public Date getTenderCreateDate() {
		return tenderCreateDate;
	}
	public void setTenderCreateDate(Date tenderCreateDate) {
		this.tenderCreateDate = tenderCreateDate;
	}
	public Date getTenderRepayDate() {
		return tenderRepayDate;
	}
	public void setTenderRepayDate(Date tenderRepayDate) {
		this.tenderRepayDate = tenderRepayDate;
	}
	
	public String getTenderGoodsDesc() {
		return tenderGoodsDesc;
	}
	public void setTenderGoodsDesc(String tenderGoodsDesc) {
		this.tenderGoodsDesc = tenderGoodsDesc;
	}
	
	public Date getTenderTransferPayDate() {
		return tenderTransferPayDate;
	}
	public void setTenderTransferPayDate(Date tenderTransferPayDate) {
		this.tenderTransferPayDate = tenderTransferPayDate;
	}
	public Date getTenderTransferPaySucDate() {
		return tenderTransferPaySucDate;
	}
	public void setTenderTransferPaySucDate(Date tenderTransferPaySucDate) {
		this.tenderTransferPaySucDate = tenderTransferPaySucDate;
	}
	public Date getTenderTransferClearDate() {
		return tenderTransferClearDate;
	}
	public void setTenderTransferClearDate(Date tenderTransferClearDate) {
		this.tenderTransferClearDate = tenderTransferClearDate;
	}
	public Date getTenderTransferClearSucDate() {
		return tenderTransferClearSucDate;
	}
	public void setTenderTransferClearSucDate(Date tenderTransferClearSucDate) {
		this.tenderTransferClearSucDate = tenderTransferClearSucDate;
	}
	public String getTransferPaySn() {
		return transferPaySn;
	}
	public void setTransferPaySn(String transferPaySn) {
		this.transferPaySn = transferPaySn;
	}
	public String getTransferPayTradeId() {
		return transferPayTradeId;
	}
	public void setTransferPayTradeId(String transferPayTradeId) {
		this.transferPayTradeId = transferPayTradeId;
	}
	public String getClearPaySn() {
		return clearPaySn;
	}
	public void setClearPaySn(String clearPaySn) {
		this.clearPaySn = clearPaySn;
	}
	public String getClearPayTradeId() {
		return clearPayTradeId;
	}
	public void setClearPayTradeId(String clearPayTradeId) {
		this.clearPayTradeId = clearPayTradeId;
	}
	
	@Override
	public String toString(){
		return "ContractDTO=[contractSeq="+contractSeq+";contractType="+contractType+";sponsorType="+sponsorType+";startTime="+startTime+
				";createTime="+createTime+";creditorCustId="+creditorCustId+";creditorCustName="+creditorCustName+
				";creditorSignTime="+creditorSignTime+";creditorLegalPerson="+creditorLegalPerson+
				";creditorEmail="+creditorEmail+";creditorAddrReg="+creditorAddrReg+";creditorPhone="+creditorPhone+";creditorSignStatus="+creditorSignStatus+";creditorSignEncry="+creditorSignEncry+
				";debtorCustId="+debtorCustId+";debtorCustName="+debtorCustName+";debtorSignTime="+debtorSignTime+
				";debtorLegalPerson="+debtorLegalPerson+";debtorEmail="+debtorEmail+";debtorAddrReg="+debtorAddrReg+";debtorPhone="+debtorPhone+";debtorSignStatus="+debtorSignStatus+
				";debtorSignEncry="+debtorSignEncry+";acceptorCustId="+acceptorCustId+";acceptorCustName="+acceptorCustName+
				";acceptorSignTime="+acceptorSignTime+";acceptorLegalPerson="+acceptorLegalPerson+";acceptorEmail="+acceptorEmail+";acceptorAddrReg="+acceptorAddrReg+";acceptorPhone="+acceptorPhone+
				";acceptorSignStatus="+acceptorSignStatus+";acceptorSignEncry="+acceptorSignEncry+";transferFeeMoney="+transferFeeMoney+
				";contractStatus="+contractStatus+";executeStatus="+executeStatus+";tenderCreateDate="+tenderCreateDate+";tenderRepayDate="+tenderRepayDate+
				";tenderPrice="+tenderPrice+";tenderGoodsDesc="+tenderGoodsDesc+";tenderTransferPrice="+tenderTransferPrice+
				";tenderTransferPayDate="+tenderTransferPayDate+";tenderTransferPaySucDate="+tenderTransferPaySucDate+
				";tenderTransferClearDate="+tenderTransferClearDate+";tenderTransferClearSucDate="+tenderTransferClearSucDate+
				";transferPaySn="+transferPaySn+";transferPayTradeId="+transferPayTradeId+";clearPaySn="+clearPaySn+";clearPayTradeId="+clearPayTradeId+"]";
	}
	public String getContractType() {
		return contractType;
	}
	public void setContractType(String contractType) {
		this.contractType = contractType;
	}
	public String getCreditorAddrReg() {
		return creditorAddrReg;
	}
	public void setCreditorAddrReg(String creditorAddrReg) {
		this.creditorAddrReg = creditorAddrReg;
	}
	public String getCreditorPhone() {
		return creditorPhone;
	}
	public void setCreditorPhone(String creditorPhone) {
		this.creditorPhone = creditorPhone;
	}
	public String getDebtorAddrReg() {
		return debtorAddrReg;
	}
	public void setDebtorAddrReg(String debtorAddrReg) {
		this.debtorAddrReg = debtorAddrReg;
	}
	public String getDebtorPhone() {
		return debtorPhone;
	}
	public void setDebtorPhone(String debtorPhone) {
		this.debtorPhone = debtorPhone;
	}
	public String getAcceptorAddrReg() {
		return acceptorAddrReg;
	}
	public void setAcceptorAddrReg(String acceptorAddrReg) {
		this.acceptorAddrReg = acceptorAddrReg;
	}
	public String getAcceptorPhone() {
		return acceptorPhone;
	}
	public void setAcceptorPhone(String acceptorPhone) {
		this.acceptorPhone = acceptorPhone;
	}
	public long getTenderPrice() {
		return tenderPrice;
	}
	public void setTenderPrice(long tenderPrice) {
		this.tenderPrice = tenderPrice;
	}
	public long getTenderTransferPrice() {
		return tenderTransferPrice;
	}
	public void setTenderTransferPrice(long tenderTransferPrice) {
		this.tenderTransferPrice = tenderTransferPrice;
	}
	public long getTransferFeeMoneyEnd() {
		return transferFeeMoneyEnd;
	}
	public void setTransferFeeMoneyEnd(long transferFeeMoneyEnd) {
		this.transferFeeMoneyEnd = transferFeeMoneyEnd;
	}
	public String getContractContentSeq() {
		return contractContentSeq;
	}
	public void setContractContentSeq(String contractContentSeq) {
		this.contractContentSeq = contractContentSeq;
	}
	public long getSucTenderPrice() {
		return sucTenderPrice;
	}
	public void setSucTenderPrice(long sucTenderPrice) {
		this.sucTenderPrice = sucTenderPrice;
	}
	public long getSucTenderTransferPrice() {
		return sucTenderTransferPrice;
	}
	public void setSucTenderTransferPrice(long sucTenderTransferPrice) {
		this.sucTenderTransferPrice = sucTenderTransferPrice;
	}
	public long getContractAmount() {
		return contractAmount;
	}
	public void setContractAmount(long contractAmount) {
		this.contractAmount = contractAmount;
	}
	public long getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(long interestRate) {
		this.interestRate = interestRate;
	}
	public Date getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getRepaymentCycleUnit() {
		return repaymentCycleUnit;
	}
	public void setRepaymentCycleUnit(String repaymentCycleUnit) {
		this.repaymentCycleUnit = repaymentCycleUnit;
	}
	public long getRepaymentCycle() {
		return repaymentCycle;
	}
	public void setRepaymentCycle(long repaymentCycle) {
		this.repaymentCycle = repaymentCycle;
	}
	public Date getTransferDate() {
		return transferDate;
	}
	public void setTransferDate(Date transferDate) {
		this.transferDate = transferDate;
	}
	public long getSuccessRepaymentAmount() {
		return successRepaymentAmount;
	}
	public void setSuccessRepaymentAmount(long successRepaymentAmount) {
		this.successRepaymentAmount = successRepaymentAmount;
	}
	public Date getRepatmentDate() {
		return repatmentDate;
	}
	public void setRepatmentDate(Date repatmentDate) {
		this.repatmentDate = repatmentDate;
	}
	public String getLoanUse() {
		return loanUse;
	}
	public void setLoanUse(String loanUse) {
		this.loanUse = loanUse;
	}
	
	@Override
	public int compareTo(ContractDTO o) {
		if(o == null) return -1;
		return this.getCreateTime().after(o.getCreateTime()) ? 1 : -1;
	}
}
