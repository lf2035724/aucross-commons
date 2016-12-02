/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 * 创建:Leo 2013-1-5
 */

/**
 * Subscription.java
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 * 创建:Leo 2013-1-5
 */
package com.ylink.ylpay.common.project.invest.dto;

import java.io.Serializable;
import java.util.Date;

/** 
 * @author Leo
 * @date 2013-1-5
 * @description：申购类数据表
 */

 
public class SubscriptionDTO  implements Serializable {
	
	private static final long serialVersionUID = 7348179091968178637L;
	private String id;
	private String instuId; 			//证联融通分配给商户的机构代码
	private String fundDate; 			//商户的系统日期，YYYYMMDD 
	private String fundTime; 			//商户的时间戳，HHMMSS
	private String fundSeqId; 			//商户系统流水号。需要保证一个交易日中流水号的唯一性
	private String flag; 				//申购方式：	0 用银行卡支付（银行卡为必填）	1 用虚户支付（银行卡为空）
	private String userId; 				//用户在证联融通平台里的客户号
	private String userNameText; 		//客户的姓名
	private String certType; 			//证件类型，参考附录
	private String certId; 				//证件号码
	private String bankCode; 			//银行编码（行别）
	private String cardNo;				//19	不可空	银行卡帐号
	private String busiType;			//4	不可空	业务类型:	认购 0001、申购0002、定投0003
	private String transAmt; 			//以分为单位，账户充值金额、基金交易金额、基金转换的金额、账户取现金额等业务交易金额的统称
	private String liqDate; 			//交易结算日期，YYYYMMDD；不小于交易日期
	private String fundCode; 			//基金申购、赎回、分红交易中，基金公司发行的基金代码
	private String fundType; 			//基金类型：	00 -- 股票基金	01 -- 货币基金	02 -- 债券基金
	private String resv; 				//保留域，接收方必须原样回送该字段数据 
	
	private String paymentid;			//支付系统支付编号
	private String oldOrderId;  	    //原交易订单编号
	private String orgFundDate;			//原始订单交易日期
	private Date createDate;           	//创建时间
	private Date updateDate;           	//修改时间
	private Date settDate;           	//当前日切工作日
	private String resultInfo;          //交易结果信息
	private String batchId;           	//批量批次号
	private String orderStatus;  		//订单状态
	private String checkStatus;         //对账状态
	private String nettingStatus;		//业务（扎差）状态
	
	private String[] instuidInfo;
	
	private Date queryBeginFundDate;
    private Date queryEndFundDate;
    private Date queryBeginLiqDate;
    private Date queryEndLiqDate;
    private Date queryBeginCreateDate;
    private Date queryEndCreateDate;
    private Date queryBeginTransAmt;
    private Date queryEndTransAmt;
	
    
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String[] getInstuidInfo() {
		return instuidInfo;
	}
	public void setInstuidInfo(String[] instuidInfo) {
		this.instuidInfo = instuidInfo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getInstuId() {
		return instuId;
	}
	public void setInstuId(String instuId) {
		this.instuId = instuId;
	}
	public String getFundDate() {
		return fundDate;
	}
	public void setFundDate(String fundDate) {
		this.fundDate = fundDate;
	}
	public String getFundTime() {
		return fundTime;
	}
	public void setFundTime(String fundTime) {
		this.fundTime = fundTime;
	}
	public String getFundSeqId() {
		return fundSeqId;
	}
	public void setFundSeqId(String fundSeqId) {
		this.fundSeqId = fundSeqId;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserNameText() {
		return userNameText;
	}
	public void setUserNameText(String userNameText) {
		this.userNameText = userNameText;
	}
	public String getCertType() {
		return certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}
	public String getCertId() {
		return certId;
	}
	public void setCertId(String certId) {
		this.certId = certId;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getBusiType() {
		return busiType;
	}
	public void setBusiType(String busiType) {
		this.busiType = busiType;
	}
	public String getTransAmt() {
		return transAmt;
	}
	public void setTransAmt(String transAmt) {
		this.transAmt = transAmt;
	}
	public String getLiqDate() {
		return liqDate;
	}
	public void setLiqDate(String liqDate) {
		this.liqDate = liqDate;
	}
	public String getFundCode() {
		return fundCode;
	}
	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}
	public String getFundType() {
		return fundType;
	}
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}
	public String getResv() {
		return resv;
	}
	public void setResv(String resv) {
		this.resv = resv;
	}
	public String getPaymentid() {
		return paymentid;
	}
	public void setPaymentid(String paymentid) {
		this.paymentid = paymentid;
	}
	public String getOldOrderId() {
		return oldOrderId;
	}
	public void setOldOrderId(String oldOrderId) {
		this.oldOrderId = oldOrderId;
	}
	public String getOrgFundDate() {
		return orgFundDate;
	}
	public void setOrgFundDate(String orgFundDate) {
		this.orgFundDate = orgFundDate;
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
	public Date getSettDate() {
		return settDate;
	}
	public void setSettDate(Date settDate) {
		this.settDate = settDate;
	}
	public String getResultInfo() {
		return resultInfo;
	}
	public void setResultInfo(String resultInfo) {
		this.resultInfo = resultInfo;
	}
	public String getBatchId() {
		return batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getCheckStatus() {
		return checkStatus;
	}
	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}
	public String getNettingStatus() {
		return nettingStatus;
	}
	public void setNettingStatus(String nettingStatus) {
		this.nettingStatus = nettingStatus;
	}
	public Date getQueryBeginFundDate() {
		return queryBeginFundDate;
	}
	public void setQueryBeginFundDate(Date queryBeginFundDate) {
		this.queryBeginFundDate = queryBeginFundDate;
	}
	public Date getQueryEndFundDate() {
		return queryEndFundDate;
	}
	public void setQueryEndFundDate(Date queryEndFundDate) {
		this.queryEndFundDate = queryEndFundDate;
	}
	public Date getQueryBeginLiqDate() {
		return queryBeginLiqDate;
	}
	public void setQueryBeginLiqDate(Date queryBeginLiqDate) {
		this.queryBeginLiqDate = queryBeginLiqDate;
	}
	public Date getQueryEndLiqDate() {
		return queryEndLiqDate;
	}
	public void setQueryEndLiqDate(Date queryEndLiqDate) {
		this.queryEndLiqDate = queryEndLiqDate;
	}
	public Date getQueryBeginCreateDate() {
		return queryBeginCreateDate;
	}
	public void setQueryBeginCreateDate(Date queryBeginCreateDate) {
		this.queryBeginCreateDate = queryBeginCreateDate;
	}
	public Date getQueryEndCreateDate() {
		return queryEndCreateDate;
	}
	public void setQueryEndCreateDate(Date queryEndCreateDate) {
		this.queryEndCreateDate = queryEndCreateDate;
	}
	public Date getQueryBeginTransAmt() {
		return queryBeginTransAmt;
	}
	public void setQueryBeginTransAmt(Date queryBeginTransAmt) {
		this.queryBeginTransAmt = queryBeginTransAmt;
	}
	public Date getQueryEndTransAmt() {
		return queryEndTransAmt;
	}
	public void setQueryEndTransAmt(Date queryEndTransAmt) {
		this.queryEndTransAmt = queryEndTransAmt;
	}
	
}
