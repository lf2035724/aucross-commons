/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-12-27
 */

package com.ylink.ylpay.common.project.fund.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author YG.HU
 * @date 2012-12-27
 * @description：TODO
 */

public class RedemptionTransferConfirmDTO extends BaseDTO{
    
    private static final long serialVersionUID = 1L;
    
    /**
     * 结算日期
     */
    private Date settlementDate;
    
    /**
     * 基金公司编码
     */
    private String fundCode;
    
    /**
     * 到账状态-参照 TransferStatus
     */
    private String transferStatus;
    
    /**
     * 到账日期
     */
    private Date TransferDate ;
    
    /**
     * 到账金额
     */
    private long sumAMT;
    
    /**
     * 到账明细笔数
     */
    private long sumCount;

    /**
     * @return the settlementDate
     */
    public Date getSettlementDate() {
        return settlementDate;
    }

    /**
     * @param settlementDate the settlementDate to set
     */
    public void setSettlementDate(Date settlementDate) {
        this.settlementDate = settlementDate;
    }

    /**
     * @return the fundCode
     */
    public String getFundCode() {
        return fundCode;
    }

    /**
     * @param fundCode the fundCode to set
     */
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
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
     * @return the transferDate
     */
    public Date getTransferDate() {
        return TransferDate;
    }

    /**
     * @param transferDate the transferDate to set
     */
    public void setTransferDate(Date transferDate) {
        TransferDate = transferDate;
    }

    /**
     * @return the sumAMT
     */
    public long getSumAMT() {
        return sumAMT;
    }

    /**
     * @param sumAMT the sumAMT to set
     */
    public void setSumAMT(long sumAMT) {
        this.sumAMT = sumAMT;
    }

    /**
     * @return the sumCount
     */
    public long getSumCount() {
        return sumCount;
    }

    /**
     * @param sumCount the sumCount to set
     */
    public void setSumCount(long sumCount) {
        this.sumCount = sumCount;
    }
   
}
