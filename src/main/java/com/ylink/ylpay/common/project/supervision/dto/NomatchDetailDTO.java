/**
 * 版权所有(C) 2014 证联融通电子有限公司
 * 创建:yu.han 2014-10-11
 */

/**
 * TradeDetailDTO.java
 * 版权所有(C) 2014 证联支付有限责任公司
 * 创建:yu.han 2014-10-11
 */
package com.ylink.ylpay.common.project.supervision.dto;

import java.util.Date;


/** 
 * @author yu.han
 * @date 2014-10-11
 * @description：TODO
 */

/**
 * @author yu.han 
 * @date 2014-10-11
 */
public class NomatchDetailDTO extends AbstractDTO {
	private String id;

    private String detailType;

    private Integer batchId;

    private Long monitorId;

    private String bankSn;

    private String bankType;

    private String bankName;

    private String cshrsAccNo;

    private String cshrsAccName;

    private String txDate;

    private String custId;

    private String accountType;

    private Long amt;

    private String txTpcd;

    private String orderNo;

    private Long drAmt;

    private Long crAmt;

    private String cntprName;

    private String cntprAcc;

    private String desc;

    private Date createdTime;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the detailType
	 */
	public String getDetailType() {
		return detailType;
	}

	/**
	 * @param detailType the detailType to set
	 */
	public void setDetailType(String detailType) {
		this.detailType = detailType;
	}

	/**
	 * @return the batchId
	 */
	public Integer getBatchId() {
		return batchId;
	}

	/**
	 * @param batchId the batchId to set
	 */
	public void setBatchId(Integer batchId) {
		this.batchId = batchId;
	}

	/**
	 * @return the monitorId
	 */
	public Long getMonitorId() {
		return monitorId;
	}

	/**
	 * @param monitorId the monitorId to set
	 */
	public void setMonitorId(Long monitorId) {
		this.monitorId = monitorId;
	}

	/**
	 * @return the bankSn
	 */
	public String getBankSn() {
		return bankSn;
	}

	/**
	 * @param bankSn the bankSn to set
	 */
	public void setBankSn(String bankSn) {
		this.bankSn = bankSn;
	}

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
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**
	 * @return the cshrsAccNo
	 */
	public String getCshrsAccNo() {
		return cshrsAccNo;
	}

	/**
	 * @param cshrsAccNo the cshrsAccNo to set
	 */
	public void setCshrsAccNo(String cshrsAccNo) {
		this.cshrsAccNo = cshrsAccNo;
	}

	/**
	 * @return the cshrsAccName
	 */
	public String getCshrsAccName() {
		return cshrsAccName;
	}

	/**
	 * @param cshrsAccName the cshrsAccName to set
	 */
	public void setCshrsAccName(String cshrsAccName) {
		this.cshrsAccName = cshrsAccName;
	}

	/**
	 * @return the txDate
	 */
	public String getTxDate() {
		return txDate;
	}

	/**
	 * @param txDate the txDate to set
	 */
	public void setTxDate(String txDate) {
		this.txDate = txDate;
	}

	/**
	 * @return the custId
	 */
	public String getCustId() {
		return custId;
	}

	/**
	 * @param custId the custId to set
	 */
	public void setCustId(String custId) {
		this.custId = custId;
	}

	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/**
	 * @return the amt
	 */
	public Long getAmt() {
		return amt;
	}

	/**
	 * @param amt the amt to set
	 */
	public void setAmt(Long amt) {
		this.amt = amt;
	}

	/**
	 * @return the txTpcd
	 */
	public String getTxTpcd() {
		return txTpcd;
	}

	/**
	 * @param txTpcd the txTpcd to set
	 */
	public void setTxTpcd(String txTpcd) {
		this.txTpcd = txTpcd;
	}

	/**
	 * @return the orderNo
	 */
	public String getOrderNo() {
		return orderNo;
	}

	/**
	 * @param orderNo the orderNo to set
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	/**
	 * @return the drAmt
	 */
	public Long getDrAmt() {
		return drAmt;
	}

	/**
	 * @param drAmt the drAmt to set
	 */
	public void setDrAmt(Long drAmt) {
		this.drAmt = drAmt;
	}

	/**
	 * @return the crAmt
	 */
	public Long getCrAmt() {
		return crAmt;
	}

	/**
	 * @param crAmt the crAmt to set
	 */
	public void setCrAmt(Long crAmt) {
		this.crAmt = crAmt;
	}

	/**
	 * @return the cntprName
	 */
	public String getCntprName() {
		return cntprName;
	}

	/**
	 * @param cntprName the cntprName to set
	 */
	public void setCntprName(String cntprName) {
		this.cntprName = cntprName;
	}

	/**
	 * @return the cntprAcc
	 */
	public String getCntprAcc() {
		return cntprAcc;
	}

	/**
	 * @param cntprAcc the cntprAcc to set
	 */
	public void setCntprAcc(String cntprAcc) {
		this.cntprAcc = cntprAcc;
	}

	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * @return the createdTime
	 */
	public Date getCreatedTime() {
		return createdTime;
	}

	/**
	 * @param createdTime the createdTime to set
	 */
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	
}
