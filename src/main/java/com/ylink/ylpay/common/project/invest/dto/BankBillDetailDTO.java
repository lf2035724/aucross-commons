package com.ylink.ylpay.common.project.invest.dto;

import java.io.Serializable;
import java.util.Date;

public class BankBillDetailDTO implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;

    private String totalId;

    private String checkResult;

    private String orderId;

    private String tradeDate;

    private String busiType;

    private String custId;

    private String custName;

    private String credType;

    private String credNo;

    private String fondCode;

    private String fondType;

    private Long tradeAmt;

    private String bankType;

    private String cardNo;

    private String fOrderId;

    private String fTradeDate;

    private String fBusiType;

    private String fCustId;

    private String fCustName;

    private String fCredType;

    private String fCredNo;

    private String fFondCode;

    private String fFondType;

    private Long fTradeAmt;

    private String fBankType;

    private String fCardNo;

    private Date createDate;

    private Date updateDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTotalId() {
        return totalId;
    }

    public void setTotalId(String totalId) {
        this.totalId = totalId;
    }

    public String getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
    }

    public String getBusiType() {
        return busiType;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType;
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

    public String getCredType() {
        return credType;
    }

    public void setCredType(String credType) {
        this.credType = credType;
    }

    public String getCredNo() {
        return credNo;
    }

    public void setCredNo(String credNo) {
        this.credNo = credNo;
    }

    public String getFondCode() {
        return fondCode;
    }

    public void setFondCode(String fondCode) {
        this.fondCode = fondCode;
    }

    public String getFondType() {
        return fondType;
    }

    public void setFondType(String fondType) {
        this.fondType = fondType;
    }

    public Long getTradeAmt() {
        return tradeAmt;
    }

    public void setTradeAmt(Long tradeAmt) {
        this.tradeAmt = tradeAmt;
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getfOrderId() {
        return fOrderId;
    }

    public void setfOrderId(String fOrderId) {
        this.fOrderId = fOrderId;
    }

    public String getfTradeDate() {
        return fTradeDate;
    }

    public void setfTradeDate(String fTradeDate) {
        this.fTradeDate = fTradeDate;
    }

    public String getfBusiType() {
        return fBusiType;
    }

    public void setfBusiType(String fBusiType) {
        this.fBusiType = fBusiType;
    }

    public String getfCustId() {
        return fCustId;
    }

    public void setfCustId(String fCustId) {
        this.fCustId = fCustId;
    }

    public String getfCustName() {
        return fCustName;
    }

    public void setfCustName(String fCustName) {
        this.fCustName = fCustName;
    }

    public String getfCredType() {
        return fCredType;
    }

    public void setfCredType(String fCredType) {
        this.fCredType = fCredType;
    }

    public String getfCredNo() {
        return fCredNo;
    }

    public void setfCredNo(String fCredNo) {
        this.fCredNo = fCredNo;
    }

    public String getfFondCode() {
        return fFondCode;
    }

    public void setfFondCode(String fFondCode) {
        this.fFondCode = fFondCode;
    }

    public String getfFondType() {
        return fFondType;
    }

    public void setfFondType(String fFondType) {
        this.fFondType = fFondType;
    }

    public Long getfTradeAmt() {
        return fTradeAmt;
    }

    public void setfTradeAmt(Long fTradeAmt) {
        this.fTradeAmt = fTradeAmt;
    }

    public String getfBankType() {
        return fBankType;
    }

    public void setfBankType(String fBankType) {
        this.fBankType = fBankType;
    }

    public String getfCardNo() {
        return fCardNo;
    }

    public void setfCardNo(String fCardNo) {
        this.fCardNo = fCardNo;
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
    
    /**
     * OGNL 需要的get
     */
	public String getFOrderId() {
		return fOrderId;
	}

	public String getFTradeDate() {
		return fTradeDate;
	}

	public String getFBusiType() {
		return fBusiType;
	}

	public String getFCustId() {
		return fCustId;
	}

	public String getFCustName() {
		return fCustName;
	}

	public String getFCredType() {
		return fCredType;
	}

	public String getFCredNo() {
		return fCredNo;
	}

	public String getFFondCode() {
		return fFondCode;
	}

	public String getFFondType() {
		return fFondType;
	}

	public Long getFTradeAmt() {
		return fTradeAmt;
	}

	public String getFBankType() {
		return fBankType;
	}

	public String getFCardNo() {
		return fCardNo;
	}

}