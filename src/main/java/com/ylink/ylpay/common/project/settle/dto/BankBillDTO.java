/**
 * 版权所有(C) 2012 证联融通
 * 创建:HuAJ 2012-12-12
 */

package com.ylink.ylpay.common.project.settle.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author HuAJ
 * @date 2012-12-12
 * @description：TODO
 */

public class BankBillDTO extends BaseDTO {
    /**
     * 渠道流水编号
     */
	private String chnnlNo;

    /**
     * 支付金额
     */
	private long payAmt;

    /**
     * 付款方客户编号（银行卡号）
     */
	private String payerCustId;

	/**
	 * 备注
	 */
    private String remark;

    /**
     * 账务日期
     */
    private String accountDate;

    /**
     * 交易日期
     */
    private String tradeDate;

    /**
     * 银行类别
     */
    private String bankType;

    /**
     * 银行交易状态：1成功，0失败
     */
    private String bankState;

    /**
     * 对账时间
     */
    private Date checkTime;

    /**
     * 对账文件名
     */
    private String checkFile;
    
    /**
     * 渠道ID
     */
    private String chnnlId;
    
    /**
<<<<<<< .mine
     * 是否付款流水：0否（证联融通出钱），1是（证联融通收钱）
=======
     * 是否付款流水：1是，0否
>>>>>>> .r4923
     */
    private String isPayment;

    public String getChnnlId() {
		return chnnlId;
	}

	public void setChnnlId(String chnnlId) {
		this.chnnlId = chnnlId;
	}

	public String getIsPayment() {
		return isPayment;
	}

	public void setIsPayment(String isPayment) {
		this.isPayment = isPayment;
	}

	private static final long serialVersionUID = 1L;

    public String getChnnlNo() {
        return chnnlNo;
    }

    public void setChnnlNo(String chnnlNo) {
        this.chnnlNo = chnnlNo == null ? null : chnnlNo.trim();
    }

    public long getPayAmt() {
        return payAmt;
    }

    public void setPayAmt(long payAmt) {
        this.payAmt = payAmt;
    }

    public String getPayerCustId() {
        return payerCustId;
    }

    public void setPayerCustId(String payerCustId) {
        this.payerCustId = payerCustId == null ? null : payerCustId.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(String accountDate) {
        this.accountDate = accountDate == null ? null : accountDate.trim();
    }

    public String getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate == null ? null : tradeDate.trim();
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType == null ? null : bankType.trim();
    }

    public String getBankState() {
        return bankState;
    }

    public void setBankState(String bankState) {
        this.bankState = bankState == null ? null : bankState.trim();
    }
    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getCheckFile() {
        return checkFile;
    }

    public void setCheckFile(String checkFile) {
        this.checkFile = checkFile == null ? null : checkFile.trim();
    }
}
