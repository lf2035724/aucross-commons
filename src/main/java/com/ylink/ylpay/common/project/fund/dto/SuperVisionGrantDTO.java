/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2013-1-16
 */

package com.ylink.ylpay.common.project.fund.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author YG.HU
 * @date 2013-1-16
 * @description：TODO
 */

public class SuperVisionGrantDTO extends BaseDTO {
    private static final long serialVersionUID = 1L;
    
    /**
     * 付款方户名
     */
    private String payerCustName;
    /**
     * 付款方卡号
     */
    private String payerAcc;
    /**
     * 收款方行别
     */
    private String payeeBankType;
    /**
     * 收款方户名
     */
    private String payeeCustName;
    /**
     * 收款方卡号
     */
    private String payeeAcc;
    /**
     * 金额
     */
    private Long amount;
    /**
     * 用途代码
     */
    private String purposeType;
    /**
     * 结算日期
     */
    private String settlementDate;
    /**
     * 备注
     */
    private String remark;
    /**
     * @return the payerCustNam
     */
    public String getPayerCustName() {
        return payerCustName;
    }
    /**
     * @param payerCustNam the payerCustNam to set
     */
    public void setPayerCustName(String payerCustName) {
        this.payerCustName = payerCustName;
    }
    /**
     * @return the payerAcc
     */
    public String getPayerAcc() {
        return payerAcc;
    }
    /**
     * @param payerAcc the payerAcc to set
     */
    public void setPayerAcc(String payerAcc) {
        this.payerAcc = payerAcc;
    }
    /**
     * @return the payeeBankType
     */
    public String getPayeeBankType() {
        return payeeBankType;
    }
    /**
     * @param payeeBankType the payeeBankType to set
     */
    public void setPayeeBankType(String payeeBankType) {
        this.payeeBankType = payeeBankType;
    }
    /**
     * @return the payeeCustName
     */
    public String getPayeeCustName() {
        return payeeCustName;
    }
    /**
     * @param payeeCustName the payeeCustName to set
     */
    public void setPayeeCustName(String payeeCustName) {
        this.payeeCustName = payeeCustName;
    }
    /**
     * @return the payeeAcc
     */
    public String getPayeeAcc() {
        return payeeAcc;
    }
    /**
     * @param payeeAcc the payeeAcc to set
     */
    public void setPayeeAcc(String payeeAcc) {
        this.payeeAcc = payeeAcc;
    }
    /**
     * @return the amount
     */
    public Long getAmount() {
        return amount;
    }
    /**
     * @param amount the amount to set
     */
    public void setAmount(Long amount) {
        this.amount = amount;
    }
    /**
     * @return the purposeType
     */
    public String getPurposeType() {
        return purposeType;
    }
    /**
     * @param purposeType the purposeType to set
     */
    public void setPurposeType(String purposeType) {
        this.purposeType = purposeType;
    }
    /**
     * @return the remark
     */
    public String getRemark() {
        return remark;
    }
    /**
     * @param remark the remark to set
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
    /**
     * @return the settlementDate
     */
    public String getSettlementDate() {
        return settlementDate;
    }
    /**
     * @param settlementDate the settlementDate to set
     */
    public void setSettlementDate(String settlementDate) {
        this.settlementDate = settlementDate;
    }
    
    
    
    
}
