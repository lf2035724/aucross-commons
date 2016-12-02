/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Leo 2012-12-12
 */

/**
 * Redemption.java
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Leo 2012-12-12
 */
package com.ylink.ylpay.common.project.fund.dto;

import java.io.Serializable;
import java.util.Date;

/** 
 * @author Leo
 * @date 2012-12-12
 * @description：赎回类数据表
 */

public class RedemptionDTO  implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String instuId; 			//证联融通分配给商户的机构代码
	private String fundDate; 			//商户的系统日期，YYYYMMDD 
	private String fundTime; 			//商户的时间戳，HHMMSS
	private String fundSeqId; 			//商户系统流水号。需要保证一个交易日中流水号的唯一性
	private String flag; 				//赎回方式：	0 赎回到用户银行卡（银行卡为必填）	1 赎回到用户虚户（银行卡为空）
	private String bankType;			//银行类别
	private String cardNo;				//19	不可空	银行卡帐号
	private String fundType;			//2	不可空	基金类型：00 -- 股票基金	01 -- 货币基金	02 -- 债券基金
	private String fundCode;			//基金申购、赎回、分红交易中，基金公司发行的基金代码
	private String userId; 				//用户在证联融通平台里的客户号
	private String userNameText; 		//客户的姓名
	private String certType; 			//证件类型，参考附录
	private String certId; 				//证件号码
	private String transAmt; 			//以分为单位，账户充值金额、基金交易金额、基金转换的金额、账户取现金额等业务交易金额的统称
	private String liqDate;				//交易结算日期，YYYYMMDD；不小于交易日期
	private String orgFundDate; 		//原始基金申购交易日期，YYYYMMDD
	private String orgFundSeqId; 		//原始基金申购交易流水号
	private String busiType; 			//业务类型:	赎回0004、分红 0005、退款0006
	private String creatDate;        	//创建日期
	private String creatTime;        	//创建日期
	private String batchno;             //赎回批次
	private String transferStatus;      //到账状态  空为未到账 1为已到账
	private Date   transferDate;        //到账日期
	private String redemPayMentId;		//赎回支付订单号
	private String withdrawPayMentId;	//提现支付订单号
	private String remark;              //备注
	private String refundRemark;        //退款说明 
	private String accountingState;		//核算状态
	
	private Date queryBeginTransferDate;
    private Date queryEndTransferDate;
    private Date queryBeginLiqDate;
    private Date queryEndLiqDate;
    /**
     * busiTypes数组
     */
    private String[] busiTypes;
    
    private String[] instuidInfo;
    
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
	public String getFundType() {
		return fundType;
	}
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}
	public String getFundCode() {
		return fundCode;
	}
	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
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
	public String getOrgFundDate() {
		return orgFundDate;
	}
	public void setOrgFundDate(String orgFundDate) {
		this.orgFundDate = orgFundDate;
	}
	public String getOrgFundSeqId() {
		return orgFundSeqId;
	}
	public void setOrgFundSeqId(String orgFundSeqId) {
		this.orgFundSeqId = orgFundSeqId;
	}
	public String getBusiType() {
		return busiType;
	}
	public void setBusiType(String busiType) {
		this.busiType = busiType;
	}
	public String getCreatDate() {
		return creatDate;
	}
	public void setCreatDate(String creatDate) {
		this.creatDate = creatDate;
	}
	public String getCreatTime() {
		return creatTime;
	}
	public void setCreatTime(String creatTime) {
		this.creatTime = creatTime;
	}
	public String getBatchno() {
		return batchno;
	}
	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}
	public String getTransferStatus() {
		return transferStatus;
	}
	public void setTransferStatus(String transferStatus) {
		this.transferStatus = transferStatus;
	}
	public Date getTransferDate() {
		return transferDate;
	}
	public void setTransferDate(Date transferDate) {
		this.transferDate = transferDate;
	}
	public String getRedemPayMentId() {
		return redemPayMentId;
	}
	public void setRedemPayMentId(String redemPayMentId) {
		this.redemPayMentId = redemPayMentId;
	}
	public String getWithdrawPayMentId() {
		return withdrawPayMentId;
	}
	public void setWithdrawPayMentId(String withdrawPayMentId) {
		this.withdrawPayMentId = withdrawPayMentId;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRefundRemark() {
		return refundRemark;
	}
	public void setRefundRemark(String refundRemark) {
		this.refundRemark = refundRemark;
	}
	public String getAccountingState() {
		return accountingState;
	}
	public void setAccountingState(String accountingState) {
		this.accountingState = accountingState;
	}
	public Date getQueryBeginTransferDate() {
		return queryBeginTransferDate;
	}
	public void setQueryBeginTransferDate(Date queryBeginTransferDate) {
		this.queryBeginTransferDate = queryBeginTransferDate;
	}
	public Date getQueryEndTransferDate() {
		return queryEndTransferDate;
	}
	public void setQueryEndTransferDate(Date queryEndTransferDate) {
		this.queryEndTransferDate = queryEndTransferDate;
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
    /**
     * @return the busiTypes
     */
    public String[] getBusiTypes() {
        return busiTypes;
    }
    /**
     * @param busiTypes the busiTypes to set
     */
    public void setBusiTypes(String[] busiTypes) {
        this.busiTypes = busiTypes;
    }
	/**
	 * @return the instuidInfo
	 */
	public String[] getInstuidInfo() {
		return instuidInfo;
	}
	/**
	 * @param instuidInfo the instuidInfo to set
	 */
	public void setInstuidInfo(String[] instuidInfo) {
		this.instuidInfo = instuidInfo;
	}

}
