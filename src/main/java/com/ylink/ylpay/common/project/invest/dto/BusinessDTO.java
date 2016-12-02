package com.ylink.ylpay.common.project.invest.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ZhangLei
 * @date 2013-01-05
 * @description：BusinessDTO
 */
public class BusinessDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long id;

	private String investCode;

	private Date settlementDate;

	private String downloadInvestFileState;

	private String htDataSaveState;

	private String zlDataSaveState;

	private String resule;

	private String investFtpPath;

	private String investFtpName;

	private String investLocalPath;

	private String investLocalName;

	private String businessType;

	private Date createDate;

	private Date updateDate;

	private String transferStatus;

	private Long transferAMT;

	private Long transferCount;

	private String resultFinish;

	private String transferDate;

	private String transferPayStatus;

	private String batchNo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getInvestCode() {
		return investCode;
	}

	public void setInvestCode(String investCode) {
		this.investCode = investCode;
	}

	public Date getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(Date settlementDate) {
		this.settlementDate = settlementDate;
	}

	public String getDownloadInvestFileState() {
		return downloadInvestFileState;
	}

	public void setDownloadInvestFileState(String downloadInvestFileState) {
		this.downloadInvestFileState = downloadInvestFileState;
	}

	public String getHtDataSaveState() {
		return htDataSaveState;
	}

	public void setHtDataSaveState(String htDataSaveState) {
		this.htDataSaveState = htDataSaveState;
	}

	public String getZlDataSaveState() {
		return zlDataSaveState;
	}

	public void setZlDataSaveState(String zlDataSaveState) {
		this.zlDataSaveState = zlDataSaveState;
	}

	public String getResule() {
		return resule;
	}

	public void setResule(String resule) {
		this.resule = resule;
	}

	public String getInvestFtpPath() {
		return investFtpPath;
	}

	public void setInvestFtpPath(String investFtpPath) {
		this.investFtpPath = investFtpPath;
	}

	public String getInvestFtpName() {
		return investFtpName;
	}

	public void setInvestFtpName(String investFtpName) {
		this.investFtpName = investFtpName;
	}

	public String getInvestLocalPath() {
		return investLocalPath;
	}

	public void setInvestLocalPath(String investLocalPath) {
		this.investLocalPath = investLocalPath;
	}

	public String getInvestLocalName() {
		return investLocalName;
	}

	public void setInvestLocalName(String investLocalName) {
		this.investLocalName = investLocalName;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
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

	public String getTransferStatus() {
		return transferStatus;
	}

	public void setTransferStatus(String transferStatus) {
		this.transferStatus = transferStatus;
	}

	public Long getTransferAMT() {
		return transferAMT;
	}

	public void setTransferAMT(Long transferAMT) {
		this.transferAMT = transferAMT;
	}

	public Long getTransferCount() {
		return transferCount;
	}

	public void setTransferCount(Long transferCount) {
		this.transferCount = transferCount;
	}

	public String getResultFinish() {
		return resultFinish;
	}

	public void setResultFinish(String resultFinish) {
		this.resultFinish = resultFinish;
	}

	public String getTransferDate() {
		return transferDate;
	}

	public void setTransferDate(String transferDate) {
		this.transferDate = transferDate;
	}

	public String getTransferPayStatus() {
		return transferPayStatus;
	}

	public void setTransferPayStatus(String transferPayStatus) {
		this.transferPayStatus = transferPayStatus;
	}

	public String getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

}