/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-11-9
 */

package com.ylink.ylpay.common.project.pay.dto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.ylinkpay.core.util.JsonUtils;


/** 
 * @author YG.HU
 * @date 2012-11-9
 * @description：TODO
 */

/**
 * @author Administrator
 *
 */
public class PayOrderDTO extends PaymentInfoDTO {
    private static final long serialVersionUID = 1L;
    
    private String paymentInfoStr;

    private String resultInfoStr;
   
    
    /**
	 * @return the resultInfoStr
	 */
	public String getResultInfoStr() {
		return resultInfoStr;
	}
	/**
	 * @param resultInfoStr the resultInfoStr to set
	 */
	public void setResultInfoStr(String resultInfoStr) {
		this.resultInfoStr = resultInfoStr;
		if(resultInfoStr==null||resultInfoStr.equals("")){
            return;
        }

	}
	/**
     * @return the paymentInfoStr
     */
    public String getPaymentInfoStr() {
                  
        return paymentInfoStr;
    }
    /**
     * @param paymentInfoStr the paymentInfoStr to set
     */
    public void setPaymentInfoStr(String paymentInfoStr) {
        this.paymentInfoStr = paymentInfoStr;
        if(paymentInfoStr==null||paymentInfoStr.equals("")){
            return;
        }
        super.setPaymentInfo((PaymentInfoDTO)JsonUtils.resultObjectFromJson(paymentInfoStr, 
                this.obtainPaymentInfoDTO().getClass()));
    }
    
 
    /**
     * 支付订单号
     */
    private String payId;
    /**
     * 交易订单号
     */
    private String tradeId;
    /**
     * 交易类型
     */
    private String tradeType;
    /**
     * 金额
     */
    private long payAmt;
    private String daxieAmt;
    public String getDaxieAmt() {
		return daxieAmt;
	}
	public void setDaxieAmt(String daxieAmt) {
		this.daxieAmt = daxieAmt;
	}


	private String amt;
    public String getAmt() {
		return amt;
	}
	public void setAmt(String amt) {
		this.amt = amt;
	}
	private String amt1;
    public String getAmt1() {
		return amt1;
	}
	public void setAmt1(String amt1) {
		this.amt1 = amt1;
	}

	/**
     * 支付订单状态
     */
    private String payStatus;
    /**
     * 操作编码
     */
    private String optCode;
    /**
     * 步骤编码
     */
    private String dealCode;
    /**
     * 辅助编码
     */
    private String choiceCode;
    /**
     * 记账编码
     */
    private String accountCode;
    /**
     * 业务类型
     */
    private String productType;
    /**
     * 付款方客户编号
     */
    private String payerCustId;
    /**
     * 记账付款方客户编号
     */
    private String acctPayerCustId;
    /**
     * 收款方客户编号
     */
    private String payeeCustId;
    public String getPayeeCustName() {
		return payeeCustName;
	}
	public void setPayeeCustName(String payeeCustName) {
		this.payeeCustName = payeeCustName;
	}


	/**
     * 收款方客户名
     */
    private String payeeCustName;
    /**
     * 付款方客户名
     */
    private String payerCustName;
    public String getPayerCustName() {
		return payerCustName;
	}
	public void setPayerCustName(String payerCustName) {
		this.payerCustName = payerCustName;
	}


	/**
     * 记账收款方客户编号
     */
    private String acctPayeeCustId;
    /**
     * 渠道流水
     */
    private String chnnlNo;
    /**
     * 备注
     */
    private String remark;
    /**
     * 支付方式
     */
    private String payType;
    /**
     * 渠道编号
     */
    private String chnnlId;
    /**
     * 是否是主支付订单
     */
    private String isMainPay;
    /**
     * 创建时间
     */
    private Date createDate;
    private String cDate;
	public String getcDate() {
		return cDate;
	}
	public void setcDate(String cDate) {
		this.cDate = cDate;
	}


	/**
     * 更新时间
     */
    private Date updateDate;
    /**
     * 批量批次号
     */
    private String batchId;
    /**
     * 渠道对账状态
     */
    private String chnnlReconStatus;
    /**
     * 渠道对账时间
     */
    private Date chnnlReconDate;
    /**
     * 渠道批次号
     */
    private String chnnlReconBatchId;
    /**
     * 账务对账状态
     */
    private String acctReconStatus;
    /**
     * 账务对账时间
     */
    private Date acctReconDate;
    /**
     * 财务对账批次号
     */
    private String acctReconBatchId;
    /**
     * 异常编码
     */
    private String errorCode;
    /**
     * 付方账户余额
     */
    private long payerAccountCredit; 
    private String payerCredit;
    /**
     * 收方账户余额
     */
    private long payeeAccountCredit;
    
    public String getPayerCredit() {
		return payerCredit;
	}
	public void setPayerCredit(String payerCredit) {
		this.payerCredit = payerCredit;
	}

	/**
     * 查询方custID
     */
    private String querySideId;
    /**
     * 查询更新日期起始
     */
    private Date queryBeginUpdateDate;
    /**
     * 查询更新日期终止
     */
    private Date queryEndUpdateDate;
    /**
     * 查询创建日期起始
     */
    private Date queryBeginCreateDate;
    /**
     * 查询创建日期终止
     */
    private Date queryEndCreateDate;
    private long queryBeginPayAmt;
    private long queryEndPayAmt;
    private String accountDate;
    private int fundNetNo;
	private String fundNetDate;
	private String payOrderType;
	private String fundNetBankType;
	
	/**
	 * dealcode名称
	 */
	private String dealCodeName;
    /**
     * @return the payId
     */
    public String getPayId() {
        return payId;
    }
    /**
     * @param payId the payId to set
     */
    public void setPayId(String payId) {
        this.payId = payId;
    }
    /**
     * @return the tradeId
     */
    public String getTradeId() {
        return tradeId;
    }
    /**
     * @param tradeId the tradeId to set
     */
    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }
    /**
     * @return the tradeType
     */
    public String getTradeType() {
        return tradeType;
    }
    /**
     * @param tradeType the tradeType to set
     */
    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }
    /**
     * @return the payAmt
     */
    public long getPayAmt() {
        return payAmt;
    }
    /**
     * @param payAmt the payAmt to set
     */
    public void setPayAmt(long payAmt) {
        this.payAmt = payAmt;
    }
    /**
     * @return the payStatus
     */
    public String getPayStatus() {
        return payStatus;
    }
    /**
     * @param payStatus the payStatus to set
     */
    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }
    /**
     * @return the optCode
     */
    public String getOptCode() {
        return optCode;
    }
    /**
     * @param optCode the optCode to set
     */
    public void setOptCode(String optCode) {
        this.optCode = optCode;
    }
    /**
     * @return the dealCode
     */
    public String getDealCode() {
        return dealCode;
    }
    /**
     * @param dealCode the dealCode to set
     */
    public void setDealCode(String dealCode) {
        this.dealCode = dealCode;
    }
    /**
     * @return the choiceCode
     */
    public String getChoiceCode() {
        return choiceCode;
    }
    /**
     * @param choiceCode the choiceCode to set
     */
    public void setChoiceCode(String choiceCode) {
        this.choiceCode = choiceCode;
    }
    /**
     * @return the accountCode
     */
    public String getAccountCode() {
        return accountCode;
    }
    /**
     * @param accountCode the accountCode to set
     */
    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }
    /**
     * @return the productType
     */
    public String getProductType() {
        return productType;
    }
    /**
     * @param productType the productType to set
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }
    /**
     * @return the payerCustId
     */
    public String getPayerCustId() {
        return payerCustId;
    }
    /**
     * @param payerCustId the payerCustId to set
     */
    public void setPayerCustId(String payerCustId) {
        this.payerCustId = payerCustId;
    }
    /**
     * @return the acctPayerCustId
     */
    public String getAcctPayerCustId() {
        return acctPayerCustId;
    }
    /**
     * @param acctPayerCustId the acctPayerCustId to set
     */
    public void setAcctPayerCustId(String acctPayerCustId) {
        this.acctPayerCustId = acctPayerCustId;
    }
    /**
     * @return the payeeCustId
     */
    public String getPayeeCustId() {
        return payeeCustId;
    }
    /**
     * @param payeeCustId the payeeCustId to set
     */
    public void setPayeeCustId(String payeeCustId) {
        this.payeeCustId = payeeCustId;
    }
    /**
     * @return the acctPayeeCustId
     */
    public String getAcctPayeeCustId() {
        return acctPayeeCustId;
    }
    /**
     * @param acctPayeeCustId the acctPayeeCustId to set
     */
    public void setAcctPayeeCustId(String acctPayeeCustId) {
        this.acctPayeeCustId = acctPayeeCustId;
    }
    /**
     * @return the chnnlNo
     */
    public String getChnnlNo() {
        return chnnlNo;
    }
    /**
     * @param chnnlNo the chnnlNo to set
     */
    public void setChnnlNo(String chnnlNo) {
        this.chnnlNo = chnnlNo;
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
     * @return the payType
     */
    public String getPayType() {
        return payType;
    }
    /**
     * @param payType the payType to set
     */
    public void setPayType(String payType) {
        this.payType = payType;
    }
    /**
     * @return the chnnlId
     */
    public String getChnnlId() {
        return chnnlId;
    }
    /**
     * @param chnnlId the chnnlId to set
     */
    public void setChnnlId(String chnnlId) {
        this.chnnlId = chnnlId;
    }
    /**
     * @return the isMainPay
     */
    public String getIsMainPay() {
        return isMainPay;
    }
    /**
     * @param isMainPay the isMainPay to set
     */
    public void setIsMainPay(String isMainPay) {
        this.isMainPay = isMainPay;
    }
    /**
     * @return the createDate
     */
    public Date getCreateDate() {
        return createDate;
    }
    /**
     * @param createDate the createDate to set
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    /**
     * @return the updateDate
     */
    public Date getUpdateDate() {
        return updateDate;
    }
    /**
     * @param updateDate the updateDate to set
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
    /**
     * @return the batchId
     */
    public String getBatchId() {
        return batchId;
    }
    /**
     * @param batchId the batchId to set
     */
    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }
    /**
     * @return the chnnlReconStatus
     */
    public String getChnnlReconStatus() {
        return chnnlReconStatus;
    }
    /**
     * @param chnnlReconStatus the chnnlReconStatus to set
     */
    public void setChnnlReconStatus(String chnnlReconStatus) {
        this.chnnlReconStatus = chnnlReconStatus;
    }
    /**
     * @return the chnnlReconDate
     */
    public Date getChnnlReconDate() {
        return chnnlReconDate;
    }
    /**
     * @param chnnlReconDate the chnnlReconDate to set
     */
    public void setChnnlReconDate(Date chnnlReconDate) {
        this.chnnlReconDate = chnnlReconDate;
    }
    /**
     * @return the chnnlReconBatchId
     */
    public String getChnnlReconBatchId() {
        return chnnlReconBatchId;
    }
    /**
     * @param chnnlReconBatchId the chnnlReconBatchId to set
     */
    public void setChnnlReconBatchId(String chnnlReconBatchId) {
        this.chnnlReconBatchId = chnnlReconBatchId;
    }
    /**
     * @return the acctReconStatus
     */
    public String getAcctReconStatus() {
        return acctReconStatus;
    }
    /**
     * @param acctReconStatus the acctReconStatus to set
     */
    public void setAcctReconStatus(String acctReconStatus) {
        this.acctReconStatus = acctReconStatus;
    }
    /**
     * @return the acctReconDate
     */
    public Date getAcctReconDate() {
        return acctReconDate;
    }
    /**
     * @param acctReconDate the acctReconDate to set
     */
    public void setAcctReconDate(Date acctReconDate) {
        this.acctReconDate = acctReconDate;
    }
    /**
     * @return the acctReconBatchId
     */
    public String getAcctReconBatchId() {
        return acctReconBatchId;
    }
    /**
     * @param acctReconBatchId the acctReconBatchId to set
     */
    public void setAcctReconBatchId(String acctReconBatchId) {
        this.acctReconBatchId = acctReconBatchId;
    }
    /**
     * @return the errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }
    /**
     * @param errorCode the errorCode to set
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
    /**
     * @return the payerAccountCredit
     */
    public long getPayerAccountCredit() {
        return payerAccountCredit;
    }
    /**
     * @param payerAccountCredit the payerAccountCredit to set
     */
    public void setPayerAccountCredit(long payerAccountCredit) {
        this.payerAccountCredit = payerAccountCredit;
    }
    /**
     * @return the payeeAccountCredit
     */
    public long getPayeeAccountCredit() {
        return payeeAccountCredit;
    }
    /**
     * @param payeeAccountCredit the payeeAccountCredit to set
     */
    public void setPayeeAccountCredit(long payeeAccountCredit) {
        this.payeeAccountCredit = payeeAccountCredit;
    }
    /**
     * @return the querySideId
     */
    public String getQuerySideId() {
        return querySideId;
    }
    /**
     * @param querySideId the querySideId to set
     */
    public void setQuerySideId(String querySideId) {
        this.querySideId = querySideId;
    }
    /**
     * @return the queryBeginUpdateDate
     */
    public Date getQueryBeginUpdateDate() {
        return queryBeginUpdateDate;
    }
    /**
     * @param queryBeginUpdateDate the queryBeginUpdateDate to set
     */
    public void setQueryBeginUpdateDate(Date queryBeginUpdateDate) {
        this.queryBeginUpdateDate = queryBeginUpdateDate;
    }
    /**
     * @return the queryEndUpdateDate
     */
    public Date getQueryEndUpdateDate() {
        return queryEndUpdateDate;
    }
    /**
     * @param queryEndUpdateDate the queryEndUpdateDate to set
     */
    public void setQueryEndUpdateDate(Date queryEndUpdateDate) {
        this.queryEndUpdateDate = queryEndUpdateDate;
    }
    /**
     * @return the queryBeginPayAmt
     */
    public long getQueryBeginPayAmt() {
        return queryBeginPayAmt;
    }
    /**
     * @param queryBeginPayAmt the queryBeginPayAmt to set
     */
    public void setQueryBeginPayAmt(long queryBeginPayAmt) {
        this.queryBeginPayAmt = queryBeginPayAmt;
    }
    /**
     * @return the queryEndPayAmt
     */
    public long getQueryEndPayAmt() {
        return queryEndPayAmt;
    }
    /**
     * @param queryEndPayAmt the queryEndPayAmt to set
     */
    public void setQueryEndPayAmt(long queryEndPayAmt) {
        this.queryEndPayAmt = queryEndPayAmt;
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
	public String getAccountDate() {
		return accountDate;
	}
	public void setAccountDate(String accountDate) {
		this.accountDate = accountDate;
	}
	public int getFundNetNo() {
		return fundNetNo;
	}
	public void setFundNetNo(int fundNetNo) {
		this.fundNetNo = fundNetNo;
	}
	public String getFundNetDate() {
		return fundNetDate;
	}
	public void setFundNetDate(String fundNetDate) {
		this.fundNetDate = fundNetDate;
	}
	public String getPayOrderType() {
		return payOrderType;
	}
	public void setPayOrderType(String payOrderType) {
		this.payOrderType = payOrderType;
	}
	public String getFundNetBankType() {
		return fundNetBankType;
	}
	public void setFundNetBankType(String fundNetBankType) {
		this.fundNetBankType = fundNetBankType;
	}
    /**
     * @return the dealCodeName
     */
    public String getDealCodeName() {
        return dealCodeName;
    }
    /**
     * @param dealCodeName the dealCodeName to set
     */
    public void setDealCodeName(String dealCodeName) {
        this.dealCodeName = dealCodeName;
    }
    public static void main(String[] args) {
    	try {
    		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
    		Date date = format.parse("2014-05-06");
    		System.out.println(format.format(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
