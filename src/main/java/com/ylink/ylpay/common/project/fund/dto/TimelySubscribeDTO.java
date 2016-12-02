package com.ylink.ylpay.common.project.fund.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * 金汇宝支付（实时申购）
 * @author LiXiPing
 * @date 2013-11-8
 * @description：
 */
public class TimelySubscribeDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String id;//		流水号
	private String instuid;//		证联融通分配给商户的机构代码
	private String fundDate	;//		商户的系统日期，YYYYMMDD
	private String fundTime;//		商户的时间戳，HHMMSS
	private String redeemFundSeqId;//		商户系统流水号。需要保证	一个交易日中流水号的唯一性
	private String userId;//		用户在证联融通平台里的客户号
	private String userNameText;//		客户的姓名
	private String certtype;//		证件类型，参考附录
	private String certId;//		证件号码
	private String redeemFundType;//		赎回基金公司发行的基金代码
	private String redeemFundCode;//		见附录10：基金类型（赎回）
	private String redeemAmt;//		赎回金额
	private String payType;//		支付类型	01 协议支付
	private String payAmt;//		支付金额如无请填写0
	private String bankType;//		银行卡类别
	private String cardNo;//		银行卡号
	private String liqDate;//		清算日期
	private String buyInstuId;//		申购机构商户号
	private String buyAmt;//		申购金额
	private String buyFundSeqId;//		申购流水号
	private String buyFundType;//		申购基金公司发行的基金代码
	private String buyFundCode;//		见附录10：基金类型（申购）
	private String buyBusiType;//		购买业务类型
	private String bgCallBackUrl;//		后台通知结果URL
	private String pgCallBackUrl;//		前台通知结果URL
	private String resv;//		备注
	private String rechargeID;//		充值订单号（对应支付）
	private String rechargeStatus;//		充值订单状态（对应支付）
	private String redemTradeId;//		赎回订单号（对应支付）
	private String redemTradeStatus;//		赎回订单状态（对应支付）
	private String subsTradeId;//		申购订单号（对应支付）
	private String subsTradeStatus;//		申购订单状态（对应支付）
	private String checkStatus;//		对账状态（对应基金）
	private String subscriptionId;//		申购交易号T_SUBSCRIPTION
	private Date createTime;//	创建日期
	private Date updateTimeString;//	更新日期
	private String respCode;//		应答码
	private String respDesc;//		应答描述
	private String gatherId;//	汇总ID
	private String[] instuidInfo;
	private Date queryBeginCreateTime;//创建日期
    private Date queryEndCreateTime;
    
    private Date queryBeginTransferDate;//到账日期
    private Date queryEndTransferDate;
    
    private Date queryBeginLiqDate;//交易结算日期
    private Date queryEndLiqDate;
    
    private Date queryBeginUpdateTime;//更新日期
    private Date queryEndUpdateTime;
	
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
	
	/**
	 * @return the queryBeginCreateTime
	 */
	public Date getQueryBeginCreateTime() {
		return queryBeginCreateTime;
	}
	/**
	 * @param queryBeginCreateTime the queryBeginCreateTime to set
	 */
	public void setQueryBeginCreateTime(Date queryBeginCreateTime) {
		this.queryBeginCreateTime = queryBeginCreateTime;
	}
	/**
	 * @return the queryEndCreateTime
	 */
	public Date getQueryEndCreateTime() {
		return queryEndCreateTime;
	}
	/**
	 * @param queryEndCreateTime the queryEndCreateTime to set
	 */
	public void setQueryEndCreateTime(Date queryEndCreateTime) {
		this.queryEndCreateTime = queryEndCreateTime;
	}
	/**
	 * @return the queryBeginTransferDate
	 */
	public Date getQueryBeginTransferDate() {
		return queryBeginTransferDate;
	}
	/**
	 * @param queryBeginTransferDate the queryBeginTransferDate to set
	 */
	public void setQueryBeginTransferDate(Date queryBeginTransferDate) {
		this.queryBeginTransferDate = queryBeginTransferDate;
	}
	/**
	 * @return the queryEndTransferDate
	 */
	public Date getQueryEndTransferDate() {
		return queryEndTransferDate;
	}
	/**
	 * @param queryEndTransferDate the queryEndTransferDate to set
	 */
	public void setQueryEndTransferDate(Date queryEndTransferDate) {
		this.queryEndTransferDate = queryEndTransferDate;
	}
	/**
	 * @return the queryBeginLiqDate
	 */
	public Date getQueryBeginLiqDate() {
		return queryBeginLiqDate;
	}
	/**
	 * @param queryBeginLiqDate the queryBeginLiqDate to set
	 */
	public void setQueryBeginLiqDate(Date queryBeginLiqDate) {
		this.queryBeginLiqDate = queryBeginLiqDate;
	}
	/**
	 * @return the queryEndLiqDate
	 */
	public Date getQueryEndLiqDate() {
		return queryEndLiqDate;
	}
	/**
	 * @param queryEndLiqDate the queryEndLiqDate to set
	 */
	public void setQueryEndLiqDate(Date queryEndLiqDate) {
		this.queryEndLiqDate = queryEndLiqDate;
	}
	/**
	 * @return the queryBeginUpdateTime
	 */
	public Date getQueryBeginUpdateTime() {
		return queryBeginUpdateTime;
	}
	/**
	 * @param queryBeginUpdateTime the queryBeginUpdateTime to set
	 */
	public void setQueryBeginUpdateTime(Date queryBeginUpdateTime) {
		this.queryBeginUpdateTime = queryBeginUpdateTime;
	}
	/**
	 * @return the queryEndUpdateTime
	 */
	public Date getQueryEndUpdateTime() {
		return queryEndUpdateTime;
	}
	/**
	 * @param queryEndUpdateTime the queryEndUpdateTime to set
	 */
	public void setQueryEndUpdateTime(Date queryEndUpdateTime) {
		this.queryEndUpdateTime = queryEndUpdateTime;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the instuid
	 */
	public String getInstuid() {
		return instuid;
	}
	/**
	 * @param instuid the instuid to set
	 */
	public void setInstuid(String instuid) {
		this.instuid = instuid;
	}
	/**
	 * @return the fundDate
	 */
	public String getFundDate() {
		return fundDate;
	}
	/**
	 * @param fundDate the fundDate to set
	 */
	public void setFundDate(String fundDate) {
		this.fundDate = fundDate;
	}
	/**
	 * @return the fundTime
	 */
	public String getFundTime() {
		return fundTime;
	}
	/**
	 * @param fundTime the fundTime to set
	 */
	public void setFundTime(String fundTime) {
		this.fundTime = fundTime;
	}
	/**
	 * @return the redeemFundSeqId
	 */
	public String getRedeemFundSeqId() {
		return redeemFundSeqId;
	}
	/**
	 * @param redeemFundSeqId the redeemFundSeqId to set
	 */
	public void setRedeemFundSeqId(String redeemFundSeqId) {
		this.redeemFundSeqId = redeemFundSeqId;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the userNameText
	 */
	public String getUserNameText() {
		return userNameText;
	}
	/**
	 * @param userNameText the userNameText to set
	 */
	public void setUserNameText(String userNameText) {
		this.userNameText = userNameText;
	}
	/**
	 * @return the certtype
	 */
	public String getCerttype() {
		return certtype;
	}
	/**
	 * @param certtype the certtype to set
	 */
	public void setCerttype(String certtype) {
		this.certtype = certtype;
	}
	/**
	 * @return the certId
	 */
	public String getCertId() {
		return certId;
	}
	/**
	 * @param certId the certId to set
	 */
	public void setCertId(String certId) {
		this.certId = certId;
	}
	/**
	 * @return the redeemFundType
	 */
	public String getRedeemFundType() {
		return redeemFundType;
	}
	/**
	 * @param redeemFundType the redeemFundType to set
	 */
	public void setRedeemFundType(String redeemFundType) {
		this.redeemFundType = redeemFundType;
	}
	/**
	 * @return the redeemFundCode
	 */
	public String getRedeemFundCode() {
		return redeemFundCode;
	}
	/**
	 * @param redeemFundCode the redeemFundCode to set
	 */
	public void setRedeemFundCode(String redeemFundCode) {
		this.redeemFundCode = redeemFundCode;
	}
	/**
	 * @return the redeemAmt
	 */
	public String getRedeemAmt() {
		return redeemAmt;
	}
	/**
	 * @param redeemAmt the redeemAmt to set
	 */
	public void setRedeemAmt(String redeemAmt) {
		this.redeemAmt = redeemAmt;
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
	 * @return the payAmt
	 */
	public String getPayAmt() {
		return payAmt;
	}
	/**
	 * @param payAmt the payAmt to set
	 */
	public void setPayAmt(String payAmt) {
		this.payAmt = payAmt;
	}
	/**
	 * @return the bankType
	 */
	public String getBankType() {
		return bankType;
	}
	/**
	 * @param bankType the bankType to set
	 */
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	/**
	 * @return the cardNo
	 */
	public String getCardNo() {
		return cardNo;
	}
	/**
	 * @param cardNo the cardNo to set
	 */
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	/**
	 * @return the liqDate
	 */
	public String getLiqDate() {
		return liqDate;
	}
	/**
	 * @param liqDate the liqDate to set
	 */
	public void setLiqDate(String liqDate) {
		this.liqDate = liqDate;
	}
	/**
	 * @return the buyInstuId
	 */
	public String getBuyInstuId() {
		return buyInstuId;
	}
	/**
	 * @param buyInstuId the buyInstuId to set
	 */
	public void setBuyInstuId(String buyInstuId) {
		this.buyInstuId = buyInstuId;
	}
	/**
	 * @return the buyAmt
	 */
	public String getBuyAmt() {
		return buyAmt;
	}
	/**
	 * @param buyAmt the buyAmt to set
	 */
	public void setBuyAmt(String buyAmt) {
		this.buyAmt = buyAmt;
	}
	/**
	 * @return the buyFundSeqId
	 */
	public String getBuyFundSeqId() {
		return buyFundSeqId;
	}
	/**
	 * @param buyFundSeqId the buyFundSeqId to set
	 */
	public void setBuyFundSeqId(String buyFundSeqId) {
		this.buyFundSeqId = buyFundSeqId;
	}
	/**
	 * @return the buyFundType
	 */
	public String getBuyFundType() {
		return buyFundType;
	}
	/**
	 * @param buyFundType the buyFundType to set
	 */
	public void setBuyFundType(String buyFundType) {
		this.buyFundType = buyFundType;
	}
	/**
	 * @return the buyFundCode
	 */
	public String getBuyFundCode() {
		return buyFundCode;
	}
	/**
	 * @param buyFundCode the buyFundCode to set
	 */
	public void setBuyFundCode(String buyFundCode) {
		this.buyFundCode = buyFundCode;
	}
	/**
	 * @return the buyBusiType
	 */
	public String getBuyBusiType() {
		return buyBusiType;
	}
	/**
	 * @param buyBusiType the buyBusiType to set
	 */
	public void setBuyBusiType(String buyBusiType) {
		this.buyBusiType = buyBusiType;
	}
	/**
	 * @return the bgCallBackUrl
	 */
	public String getBgCallBackUrl() {
		return bgCallBackUrl;
	}
	/**
	 * @param bgCallBackUrl the bgCallBackUrl to set
	 */
	public void setBgCallBackUrl(String bgCallBackUrl) {
		this.bgCallBackUrl = bgCallBackUrl;
	}
	/**
	 * @return the pgCallBackUrl
	 */
	public String getPgCallBackUrl() {
		return pgCallBackUrl;
	}
	/**
	 * @param pgCallBackUrl the pgCallBackUrl to set
	 */
	public void setPgCallBackUrl(String pgCallBackUrl) {
		this.pgCallBackUrl = pgCallBackUrl;
	}
	/**
	 * @return the resv
	 */
	public String getResv() {
		return resv;
	}
	/**
	 * @param resv the resv to set
	 */
	public void setResv(String resv) {
		this.resv = resv;
	}
	/**
	 * @return the rechargeID
	 */
	public String getRechargeID() {
		return rechargeID;
	}
	/**
	 * @param rechargeID the rechargeID to set
	 */
	public void setRechargeID(String rechargeID) {
		this.rechargeID = rechargeID;
	}
	/**
	 * @return the rechargeStatus
	 */
	public String getRechargeStatus() {
		return rechargeStatus;
	}
	/**
	 * @param rechargeStatus the rechargeStatus to set
	 */
	public void setRechargeStatus(String rechargeStatus) {
		this.rechargeStatus = rechargeStatus;
	}
	/**
	 * @return the redemTradeId
	 */
	public String getRedemTradeId() {
		return redemTradeId;
	}
	/**
	 * @param redemTradeId the redemTradeId to set
	 */
	public void setRedemTradeId(String redemTradeId) {
		this.redemTradeId = redemTradeId;
	}
	/**
	 * @return the redemTradeStatus
	 */
	public String getRedemTradeStatus() {
		return redemTradeStatus;
	}
	/**
	 * @param redemTradeStatus the redemTradeStatus to set
	 */
	public void setRedemTradeStatus(String redemTradeStatus) {
		this.redemTradeStatus = redemTradeStatus;
	}
	/**
	 * @return the subsTradeId
	 */
	public String getSubsTradeId() {
		return subsTradeId;
	}
	/**
	 * @param subsTradeId the subsTradeId to set
	 */
	public void setSubsTradeId(String subsTradeId) {
		this.subsTradeId = subsTradeId;
	}
	/**
	 * @return the subsTradeStatus
	 */
	public String getSubsTradeStatus() {
		return subsTradeStatus;
	}
	/**
	 * @param subsTradeStatus the subsTradeStatus to set
	 */
	public void setSubsTradeStatus(String subsTradeStatus) {
		this.subsTradeStatus = subsTradeStatus;
	}
	/**
	 * @return the checkStatus
	 */
	public String getCheckStatus() {
		return checkStatus;
	}
	/**
	 * @param checkStatus the checkStatus to set
	 */
	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}
	/**
	 * @return the subscriptionId
	 */
	public String getSubscriptionId() {
		return subscriptionId;
	}
	/**
	 * @param subscriptionId the subscriptionId to set
	 */
	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * @return the updateTimeString
	 */
	public Date getUpdateTimeString() {
		return updateTimeString;
	}
	/**
	 * @param updateTimeString the updateTimeString to set
	 */
	public void setUpdateTimeString(Date updateTimeString) {
		this.updateTimeString = updateTimeString;
	}
	/**
	 * @return the respCode
	 */
	public String getRespCode() {
		return respCode;
	}
	/**
	 * @param respCode the respCode to set
	 */
	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}
	/**
	 * @return the respDesc
	 */
	public String getRespDesc() {
		return respDesc;
	}
	/**
	 * @param respDesc the respDesc to set
	 */
	public void setRespDesc(String respDesc) {
		this.respDesc = respDesc;
	}
	/**
	 * @return the gatherId
	 */
	public String getGatherId() {
		return gatherId;
	}
	/**
	 * @param gatherId the gatherId to set
	 */
	public void setGatherId(String gatherId) {
		this.gatherId = gatherId;
	}
	
}
