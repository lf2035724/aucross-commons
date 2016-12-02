/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Leo 2012-12-7
 */

/**
 * CheckResult.java
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Leo 2012-12-7
 */
package com.ylink.ylpay.common.project.invest.dto;

import java.io.Serializable;


/** 
 * @author Leo
 * @date 2012-12-7
 * @description： 
 */

 
public class CheckResultDTO  implements Serializable  {

	private static final long serialVersionUID = 1L;
	
	private String id;   
	private String instuId;   	//证联融通分配给商户的机构代码
	private String investDate;   		//商户的系统日期，YYYYMMDD
	private String investTime;   	//商户的时间戳，HHMMSS
	private String liqDate;   	//交易结算日期，YYYYMMDD；不小于交易日期
	private String investSeqId;   //商户系统流水号。需要保证一个交易日中流水号的唯一性
	private String orgInvestDate;   	//原始基金申购交易日期，YYYYMMDD
	private String orgInvestSeqId;   //原始基金申购交易流水号
	private String busiType;   		//业务类型
	private String userId;   		//用户在证联融通平台里的客户号
	private String userNameText;   	//客户的姓名
	private String certType;   		//证件类型，参考附录
	private String certId;   		//证件号码
	private String investCode;   		//基金申购、赎回、分红交易中，基金公司发行的基金代码
	private String transAmt;   		//以分为单位，账户充值金额、基金交易金额、基金转换的金额、账户取现金额等业务交易金额的统称
	private String investType;   		//基金类型：00 -- 股票基金01 -- 货币基金02 -- 债券基金
	private String pnrDate;   	//证联融通发起交易的系统日期，YYYYMMDD
	private String pnrTime;   	//证联融通发给基金的时间戳，HHMMSS
	private String pnrSeqId;   		//证联融通的流水号。需要保证一个交易日中流水号的唯一性
	private String bankType;		//银行类别
	private String bankCard;		//银行卡号
	private String batchNo;			//批次号（对账时时间戳14bit）
	private String flag;			//支付方式
	private String checkStatus;		//对账状态
	private String payId;			//支付查询出来的数据ID
	private String errReason;		//对账失败原因编号
	private String dataType;		//数据类型(0:日终  1:核算)
	private String refId;   		//外键(对应T_BUSINESS或T_DAY_CUT的ID)		
	/** 
	 * 是否通过通过监管行审核 1表示通过,非1表示未审核 
	 * 修改人：hinode 
	 * 修改时间：2013-1-16
	 * 修改原因：用于记录监管行对申购类结算文件审核通过与否
	 * lc mod 1通过，0 未通过，-1未审核
	 * */
	private String isCheck;	
	
	/** 
	 * 数据来源 商户号
	 * 修改人：lc 
	 * 修改时间：2014-9-9
	 * */
	private String dataSources;

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

	public String getInvestDate() {
		return investDate;
	}

	public void setInvestDate(String investDate) {
		this.investDate = investDate;
	}

	public String getInvestTime() {
		return investTime;
	}

	public void setInvestTime(String investTime) {
		this.investTime = investTime;
	}

	public String getLiqDate() {
		return liqDate;
	}

	public void setLiqDate(String liqDate) {
		this.liqDate = liqDate;
	}

	public String getInvestSeqId() {
		return investSeqId;
	}

	public void setInvestSeqId(String investSeqId) {
		this.investSeqId = investSeqId;
	}

	public String getOrgInvestDate() {
		return orgInvestDate;
	}

	public void setOrgInvestDate(String orgInvestDate) {
		this.orgInvestDate = orgInvestDate;
	}

	public String getOrgInvestSeqId() {
		return orgInvestSeqId;
	}

	public void setOrgInvestSeqId(String orgInvestSeqId) {
		this.orgInvestSeqId = orgInvestSeqId;
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

	public String getInvestCode() {
		return investCode;
	}

	public void setInvestCode(String investCode) {
		this.investCode = investCode;
	}

	public String getTransAmt() {
		return transAmt;
	}

	public void setTransAmt(String transAmt) {
		this.transAmt = transAmt;
	}

	public String getInvestType() {
		return investType;
	}

	public void setInvestType(String investType) {
		this.investType = investType;
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

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
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

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getRefId() {
		return refId;
	}

	public void setRefId(String refId) {
		this.refId = refId;
	}

	public String getIsCheck() {
		return isCheck;
	}

	public void setIsCheck(String isCheck) {
		this.isCheck = isCheck;
	}

	public String getDataSources() {
		return dataSources;
	}

	public void setDataSources(String dataSources) {
		this.dataSources = dataSources;
	}	
	
}
