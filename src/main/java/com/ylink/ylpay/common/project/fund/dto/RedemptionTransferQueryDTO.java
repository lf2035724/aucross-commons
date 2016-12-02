/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2013-1-4
 */

package com.ylink.ylpay.common.project.fund.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author YG.HU
 * @date 2013-1-4
 * @description：TODO
 */

public class RedemptionTransferQueryDTO extends BaseDTO {
    private static final long serialVersionUID = 1L;
    
    private long id;
    
    private String fundcode;

    private Date settlementdate;
    
    private String resule;
    
    private String businesstype;

    private Date createdate;

    private Date updatedate;
    
    private String transferStatus;
    
    private Long transferAMT;
 
    private Long transferCount;
    
    private String resultFinish;
    
    private Date queryBeginSettlementDate;
    private Date queryEndSettlementDate;
    private Date queryBeginCreateDate;
    private Date queryEndCreateDate;
    private Long queryBeginTransferAMT;
    private Long queryEndTransferAMT;
    
    private String transferDate;
    
    private String transferPayFlag;
    
    /**
     * @return the transferPayFlag
     */
    public String getTransferPayFlag() {
        return transferPayFlag;
    }

    /**
     * @param transferPayFlag the transferPayFlag to set
     */
    public void setTransferPayFlag(String transferPayFlag) {
        this.transferPayFlag = transferPayFlag;
    }

    /**
     * @return the resule
     */
    public String getResule() {
        return resule;
    }

    /**
     * @param resule the resule to set
     */
    public void setResule(String resule) {
        this.resule = resule;
    }

    /**
     * @return the businesstype
     */
    public String getBusinesstype() {
        return businesstype;
    }

    /**
     * @param businesstype the businesstype to set
     */
    public void setBusinesstype(String businesstype) {
        this.businesstype = businesstype;
    }

    /**
     * @return the createdate
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * @param createdate the createdate to set
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * @return the updatedate
     */
    public Date getUpdatedate() {
        return updatedate;
    }

    /**
     * @param updatedate the updatedate to set
     */
    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    /**
     * @return the transferStatus
     */
    public String getTransferStatus() {
        return transferStatus;
    }

    /**
     * @param transferStatus the transferStatus to set
     */
    public void setTransferStatus(String transferStatus) {
        this.transferStatus = transferStatus;
    }

    /**
     * @return the transferAMT
     */
    public Long getTransferAMT() {
        return transferAMT;
    }

    /**
     * @param transferAMT the transferAMT to set
     */
    public void setTransferAMT(Long transferAMT) {
        this.transferAMT = transferAMT;
    }

    /**
     * @return the transferCount
     */
    public Long getTransferCount() {
        return transferCount;
    }

    /**
     * @param transferCount the transferCount to set
     */
    public void setTransferCount(Long transferCount) {
        this.transferCount = transferCount;
    }

    /**
     * @return the resultFinish
     */
    public String getResultFinish() {
        return resultFinish;
    }

    /**
     * @param resultFinish the resultFinish to set
     */
    public void setResultFinish(String resultFinish) {
        this.resultFinish = resultFinish;
    }

    /**
     * @return the fundcode
     */
    public String getFundcode() {
        return fundcode;
    }

    /**
     * @param fundcode the fundcode to set
     */
    public void setFundcode(String fundcode) {
        this.fundcode = fundcode;
    }

    /**
     * @return the settlementdate
     */
    public Date getSettlementdate() {
        return settlementdate;
    }

    /**
     * @param settlementdate the settlementdate to set
     */
    public void setSettlementdate(Date settlementdate) {
        this.settlementdate = settlementdate;
    }

    /**
     * @return the queryBeginSettlementDate
     */
    public Date getQueryBeginSettlementDate() {
        return queryBeginSettlementDate;
    }

    /**
     * @param queryBeginSettlementDate the queryBeginSettlementDate to set
     */
    public void setQueryBeginSettlementDate(Date queryBeginSettlementDate) {
        this.queryBeginSettlementDate = queryBeginSettlementDate;
    }

    /**
     * @return the queryEndSettlementDate
     */
    public Date getQueryEndSettlementDate() {
        return queryEndSettlementDate;
    }

    /**
     * @param queryEndSettlementDate the queryEndSettlementDate to set
     */
    public void setQueryEndSettlementDate(Date queryEndSettlementDate) {
        this.queryEndSettlementDate = queryEndSettlementDate;
    }

    /**
     * @return the queryBeginCreateDate
     */
    public Date getQueryBeginCreateDate() {
        return queryBeginCreateDate;
    }

    /**
     * @param queryBeginCreateDate the queryBeginCreateDate to set
     */
    public void setQueryBeginCreateDate(Date queryBeginCreateDate) {
        this.queryBeginCreateDate = queryBeginCreateDate;
    }

    /**
     * @return the queryEndCreateDate
     */
    public Date getQueryEndCreateDate() {
        return queryEndCreateDate;
    }

    /**
     * @param queryEndCreateDate the queryEndCreateDate to set
     */
    public void setQueryEndCreateDate(Date queryEndCreateDate) {
        this.queryEndCreateDate = queryEndCreateDate;
    }

    /**
     * @return the transferDate
     */
    public String getTransferDate() {
        return transferDate;
    }

    /**
     * @param transferDate the transferDate to set
     */
    public void setTransferDate(String transferDate) {
        this.transferDate = transferDate;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

	/**
	 * @return the queryBeginTransferAMT
	 */
	public Long getQueryBeginTransferAMT() {
		return queryBeginTransferAMT;
	}

	/**
	 * @param queryBeginTransferAMT the queryBeginTransferAMT to set
	 */
	public void setQueryBeginTransferAMT(Double queryBeginTransferAMT) {
		if(queryBeginTransferAMT == null)
			this.queryBeginTransferAMT = null;
		queryBeginTransferAMT = queryBeginTransferAMT * 100;
		this.queryBeginTransferAMT = queryBeginTransferAMT.longValue();
	}

	/**
	 * @return the queryEndTransferAMT
	 */
	public Long getQueryEndTransferAMT() {
		return queryEndTransferAMT;
	}

	/**
	 * @param queryEndTransferAMT the queryEndTransferAMT to set
	 */
	public void setQueryEndTransferAMT(Double queryEndTransferAMT) {
		if(queryEndTransferAMT == null)
			this.queryEndTransferAMT = null;
		queryEndTransferAMT = queryEndTransferAMT * 100;
		this.queryEndTransferAMT = queryEndTransferAMT.longValue();
	} 
    
    
}
