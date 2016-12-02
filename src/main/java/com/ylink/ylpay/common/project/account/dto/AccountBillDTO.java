/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Iquil 2012-10-29
 */

package com.ylink.ylpay.common.project.account.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Iquil
 * @date 2012-10-29
 * @description：t_account_bill表的实体类
 */

public class AccountBillDTO implements Serializable {

	private static final long serialVersionUID = 3358531331284564303L;

	/**
	 * 记账流水ID
	 */
	private long billId;

	/**
	 * 账期，YYYYMMDD
	 */
	private String accountDate;

	/**
	 * 交易订单号
	 */
	private String orderId;

	/**
	 * 支付订单号
	 */
	private String payId;

	/**
	 * 交易编号
	 */
	private String optCode;

	/**
	 * 支付编号
	 */
	private String dealCode;

	/**
	 * 借DR ；贷CR
	 */
	private String drCrFlag;

	/**
	 * 借贷金额
	 */
	private long amount;

	/**
	 * 账户编号
	 */
	private String accountId;

	/**
	 * 当前账户余额
	 */
	private long accountAmount;

	/**
	 * 记录时间
	 */
	private Date recordTime;
	
	/**
	 * 记录时间-开始
	 */
	private Date recordTimeFrom;
	
	/**
	 * 记录时间-截止
	 */
	private Date recordTimeTo;	
	
	/**
	 * 起始时间
	 */
	private String dateFrom;
	
	/**
	 * 终止时间
	 */
	private String dateTo;
	/**
	 * 金额下限
	 */
	private long amountForm;
	/**
	 * 金额上限
	 */
	private long amountTo;
	
	/**
	 * 对账状态
	 */
	private String reconStatus;
	
	/**
	 * 流水类型
	 */
	private String billType;
	
	/**
	 * 客户编号
	 */
	private String custId;
	
	/**
	 * 客户名称
	 */
	private String custName;
	
	
	public String getBillType() {
		return billType;
	}

	public void setBillType(String billType) {
		this.billType = billType;
	}	
	
	public String getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}

	public String getDateTo() {
		return dateTo;
	}

	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}

	public long getBillId() {
		return billId;
	}

	public long getAmountForm() {
		return amountForm;
	}

	public void setAmountForm(long amountForm) {
		this.amountForm = amountForm;
	}

	public long getAmountTo() {
		return amountTo;
	}

	public void setAmountTo(long amountTo) {
		this.amountTo = amountTo;
	}

	public void setBillId(long billId) {
		this.billId = billId;
	}

	public String getAccountDate() {
		return accountDate;
	}

	public void setAccountDate(String accountDate) {
		this.accountDate = accountDate;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPayId() {
		return payId;
	}

	public void setPayId(String payId) {
		this.payId = payId;
	}

	public String getOptCode() {
		return optCode;
	}

	public void setOptCode(String optCode) {
		this.optCode = optCode;
	}

	public String getDealCode() {
		return dealCode;
	}

	public void setDealCode(String dealCode) {
		this.dealCode = dealCode;
	}

	public String getDrCrFlag() {
		return drCrFlag;
	}

	public void setDrCrFlag(String drCrFlag) {
		this.drCrFlag = drCrFlag;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public long getAccountAmount() {
		return accountAmount;
	}

	public void setAccountAmount(long accountAmount) {
		this.accountAmount = accountAmount;
	}

	public Date getRecordTime() {
		return recordTime;
	}

	public void setRecordTime(Date recordTime) {
		this.recordTime = recordTime;
	}

	public Date getRecordTimeFrom() {
		return recordTimeFrom;
	}

	public void setRecordTimeFrom(Date recordTimeFrom) {
		this.recordTimeFrom = recordTimeFrom;
	}

	public Date getRecordTimeTo() {
		return recordTimeTo;
	}

	public void setRecordTimeTo(Date recordTimeTo) {
		this.recordTimeTo = recordTimeTo;
	}

	public String getReconStatus() {
		return reconStatus;
	}

	public void setReconStatus(String reconStatus) {
		this.reconStatus = reconStatus;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

}
