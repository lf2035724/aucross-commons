/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Leo 2012-12-7
 */

/**
 * CheckResult.java
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Leo 2012-12-7
 */
package com.ylink.ylpay.common.project.fund.dto;

import java.io.Serializable;


/** 
 * @author Leo
 * @date 2012-12-7
 * @description： 
 */

 
public class CheckResultDTO  implements Serializable  {

	private static final long serialVersionUID = 1L;
	
	private String id	;   
	private String instuId	;   	//证联融通分配给商户的机构代码
	private String fundDate;   		//商户的系统日期，YYYYMMDD
	private String fundTime	;   	//商户的时间戳，HHMMSS
	private String liqDate	;   	//交易结算日期，YYYYMMDD；不小于交易日期
	private String fundSeqId	;   //商户系统流水号。需要保证一个交易日中流水号的唯一性
	private String orgFundDate;   	//原始基金申购交易日期，YYYYMMDD
	private String orgFundSeqId	;   //原始基金申购交易流水号
	private String busiType;   		//业务类型
	private String userId;   		//用户在证联融通平台里的客户号
	private String userNameText;   	//客户的姓名
	private String certType;   		//证件类型，参考附录
	private String certId;   		//证件号码
	private String fundCode;   		//基金申购、赎回、分红交易中，基金公司发行的基金代码
	private String transAmt;   		//以分为单位，账户充值金额、基金交易金额、基金转换的金额、账户取现金额等业务交易金额的统称
	private String fundType;   		//基金类型：00 -- 股票基金01 -- 货币基金02 -- 债券基金
	private String pnrDate	;   	//证联融通发起交易的系统日期，YYYYMMDD
	private String pnrTime	;   	//证联融通发给基金的时间戳，HHMMSS
	private String pnrSeqId;   		//证联融通的流水号。需要保证一个交易日中流水号的唯一性
	private String bankType;		//银行类别
	private String bankCard;		//银行卡号
	private String batchNo;			//批次号（对账时时间戳14bit）
	private String flag;			//支付方式
	private String checkStatus;		//对账状态
	private String payId;			//支付查询出来的数据ID
	private String errReason;		//对账失败原因编号
	/** 
	 * 是否通过通过监管行审核 1表示通过,非1表示未审核 
	 * 修改人：hinode 
	 * 修改时间：2013-1-16
	 * 修改原因：用于记录监管行对申购类结算文件审核通过与否
	 * */
	private String isCheck;	
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
	public String getLiqDate() {
		return liqDate;
	}
	public void setLiqDate(String liqDate) {
		this.liqDate = liqDate;
	}
	public String getFundSeqId() {
		return fundSeqId;
	}
	public void setFundSeqId(String fundSeqId) {
		this.fundSeqId = fundSeqId;
	}
	public String getOrgFundDate() {
		return orgFundDate;
	}
	public void setOrgFundDate(String orgFundDate) {
		this.orgFundDate = orgFundDate;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
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
	public String getPnrDate() {
		return pnrDate;
	}
	public void setPnrDate(String pnrDate) {
		this.pnrDate = pnrDate;
	}
	public String getPnrTime() {
		return pnrTime;
	}
	public void setPnrTime(String pnrTime) {
		this.pnrTime = pnrTime;
	}
	public String getPnrSeqId() {
		return pnrSeqId;
	}
	public void setPnrSeqId(String pnrSeqId) {
		this.pnrSeqId = pnrSeqId;
	}
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	public String getBankCard() {
		return bankCard;
	}
	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}
	public String getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getCheckStatus() {
		return checkStatus;
	}
	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}
	public String getPayId() {
		return payId;
	}
	public void setPayId(String payId) {
		this.payId = payId;
	}
	public String getErrReason() {
		return errReason;
	}
	public void setErrReason(String errReason) {
		this.errReason = errReason;
	}
	public String getIsCheck() {
		return isCheck;
	}
	public void setIsCheck(String isCheck) {
		this.isCheck = isCheck;
	}
	@Override
	public String toString() {
		return "CheckResult [id=" + id + ", instuId=" + instuId + ", fundDate="
				+ fundDate + ", fundTime=" + fundTime + ", liqDate=" + liqDate
				+ ", fundSeqId=" + fundSeqId + ", orgFundDate=" + orgFundDate
				+ ", orgFundSeqId=" + orgFundSeqId + ", flag=" + flag
				+ ", busiType=" + busiType + ", userId=" + userId
				+ ", userNameText=" + userNameText + ", certType=" + certType
				+ ", certId=" + certId + ", transAmt=" + transAmt
				+ ", fundCode=" + fundCode + ", fundType=" + fundType
				+ ", pnrDate=" + pnrDate + ", pnrTime=" + pnrTime
				+ ", pnrSeqId=" + pnrSeqId + ", bankType=" + bankType
				+ ", bankCard=" + bankCard + ", batchNo=" + batchNo
				+ ", checkStatus=" + checkStatus + ", payId=" + payId
				+ ", errReason=" + errReason + ", isCheck=" + isCheck + "]";
	}
	
}
