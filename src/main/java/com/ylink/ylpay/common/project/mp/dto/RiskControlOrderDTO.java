package com.ylink.ylpay.common.project.mp.dto;

import java.util.Date;

public class RiskControlOrderDTO
{
  private String payId;
  private String tradeId;
  private String tradeType;
  private long payAmt;
  private String payStatus;
  private String productType;
  private String payerCustId;
  private String acctPayerCustId;
  private String payeeCustId;
  private String acctPayeeCustId;
  private String chnnlNo;
  private String remark;
  private String payType;
  private String chnnlId;
  private Date createDate;
  private Date updateDate;
  private String batchId;
  private long payerAccountCredit;
  private long payeeAccountCredit;

  public String getPayId()
  {
    return this.payId;
  }

  public void setPayId(String payId) {
    this.payId = payId;
  }

  public String getTradeId() {
    return this.tradeId;
  }

  public void setTradeId(String tradeId) {
    this.tradeId = tradeId;
  }

  public String getTradeType() {
    return this.tradeType;
  }

  public void setTradeType(String tradeType) {
    this.tradeType = tradeType;
  }

  public long getPayAmt() {
    return this.payAmt;
  }

  public void setPayAmt(long payAmt) {
    this.payAmt = payAmt;
  }

  public String getPayStatus() {
    return this.payStatus;
  }

  public void setPayStatus(String payStatus) {
    this.payStatus = payStatus;
  }

  public String getProductType() {
    return this.productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public String getPayerCustId() {
    return this.payerCustId;
  }

  public void setPayerCustId(String payerCustId) {
    this.payerCustId = payerCustId;
  }

  public String getAcctPayerCustId() {
    return this.acctPayerCustId;
  }

  public void setAcctPayerCustId(String acctPayerCustId) {
    this.acctPayerCustId = acctPayerCustId;
  }

  public String getPayeeCustId() {
    return this.payeeCustId;
  }

  public void setPayeeCustId(String payeeCustId) {
    this.payeeCustId = payeeCustId;
  }

  public String getAcctPayeeCustId() {
    return this.acctPayeeCustId;
  }

  public void setAcctPayeeCustId(String acctPayeeCustId) {
    this.acctPayeeCustId = acctPayeeCustId;
  }

  public String getChnnlNo() {
    return this.chnnlNo;
  }

  public void setChnnlNo(String chnnlNo) {
    this.chnnlNo = chnnlNo;
  }

  public String getRemark() {
    return this.remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public String getPayType() {
    return this.payType;
  }

  public void setPayType(String payType) {
    this.payType = payType;
  }

  public String getChnnlId() {
    return this.chnnlId;
  }

  public void setChnnlId(String chnnlId) {
    this.chnnlId = chnnlId;
  }

  public Date getCreateDate() {
    return this.createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  public Date getUpdateDate() {
    return this.updateDate;
  }

  public void setUpdateDate(Date updateDate) {
    this.updateDate = updateDate;
  }

  public String getBatchId() {
    return this.batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  public long getPayerAccountCredit() {
    return this.payerAccountCredit;
  }

  public void setPayerAccountCredit(long payerAccountCredit) {
    this.payerAccountCredit = payerAccountCredit;
  }

  public long getPayeeAccountCredit() {
    return this.payeeAccountCredit;
  }

  public void setPayeeAccountCredit(long payeeAccountCredit) {
    this.payeeAccountCredit = payeeAccountCredit;
  }
}