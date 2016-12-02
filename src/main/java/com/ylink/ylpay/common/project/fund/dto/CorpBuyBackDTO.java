package com.ylink.ylpay.common.project.fund.dto;

import java.io.Serializable;
import java.util.Date;

public class CorpBuyBackDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;//流水号
	private String instuId;//证联融通分配给商户的机构代码
	private String liqDate;//清算日期
	private String fundDate;//商户的系统日期，YYYYMMDD
	private String fundTime;//商户的时间戳，HHMMSS
	private String buyFundSeqId	;//做市商申购的流水号，需要保证流水号的唯一性， 
	private String corpUserId;//做市商客户号
	private String corpUserNameText;//做市商客户的姓名
	private String corpCertType;//做市商证件类型，参考附录
	private String corpCertId;//做市商证件号码
	private String fundType;//基金类型
	private String fundCode;//基金代码
	private String transAmt;//回购金额
	private String redeeemFundSeqId;//客户赎回的流水号，需要保证流水号的唯一性， 
	private String userId;//客户号
	private String userNameText;//客户姓名
	private String certType;//证件类型，参考附录
	private String certId;//证件号码
	private String flag;//到账标志	0：备付金	1：银行卡
	private String bankType;//银行卡类别
	private String cardNo;//银行卡号
	private String subscription_id;//申购交易号(关联申购表+)T_SUBSCRIPTION
	private String subs_trade_id;//申购订单号（对应支付）
	private String subs_trade_status;//申购订单状态（对应支付）
	private String redem_trade_id;//赎回订单号（对应支付）
	private String redem_trade_status;//赎回订单状态（对应支付）
	private String gather_id;//汇总ID
	private String resp_code;//应答码
	private String resp_desc;//应答描述
	private Date create_time;//创建日期
	private Date update_time;//更新日期
	private String checkStatus;//对账状态（对应基金）
	
	private Date queryBeginLiqDate; //清算日期
	private Date queryEndLiqDate;
	
	private Date queryBeginCreateTime;//创建日期
    private Date queryEndCreateTime;
	
    private Date queryBeginUpdateTime;//更新日期
    private Date queryEndUpdateTime;

	private String[] instuidInfo;
    
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
	 * @return the instuId
	 */
	public String getInstuId() {
		return instuId;
	}
	/**
	 * @param instuId the instuId to set
	 */
	public void setInstuId(String instuId) {
		this.instuId = instuId;
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
	 * @return the corpUserId
	 */
	public String getCorpUserId() {
		return corpUserId;
	}
	/**
	 * @param corpUserId the corpUserId to set
	 */
	public void setCorpUserId(String corpUserId) {
		this.corpUserId = corpUserId;
	}
	/**
	 * @return the corpUserNameText
	 */
	public String getCorpUserNameText() {
		return corpUserNameText;
	}
	/**
	 * @param corpUserNameText the corpUserNameText to set
	 */
	public void setCorpUserNameText(String corpUserNameText) {
		this.corpUserNameText = corpUserNameText;
	}
	/**
	 * @return the corpCertType
	 */
	public String getCorpCertType() {
		return corpCertType;
	}
	/**
	 * @param corpCertType the corpCertType to set
	 */
	public void setCorpCertType(String corpCertType) {
		this.corpCertType = corpCertType;
	}
	/**
	 * @return the corpCertId
	 */
	public String getCorpCertId() {
		return corpCertId;
	}
	/**
	 * @param corpCertId the corpCertId to set
	 */
	public void setCorpCertId(String corpCertId) {
		this.corpCertId = corpCertId;
	}
	/**
	 * @return the fundType
	 */
	public String getFundType() {
		return fundType;
	}
	/**
	 * @param fundType the fundType to set
	 */
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}
	/**
	 * @return the fundCode
	 */
	public String getFundCode() {
		return fundCode;
	}
	/**
	 * @param fundCode the fundCode to set
	 */
	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}
	/**
	 * @return the transAmt
	 */
	public String getTransAmt() {
		return transAmt;
	}
	/**
	 * @param transAmt the transAmt to set
	 */
	public void setTransAmt(String transAmt) {
		this.transAmt = transAmt;
	}
	/**
	 * @return the redeeemFundSeqId
	 */
	public String getRedeeemFundSeqId() {
		return redeeemFundSeqId;
	}
	/**
	 * @param redeeemFundSeqId the redeeemFundSeqId to set
	 */
	public void setRedeeemFundSeqId(String redeeemFundSeqId) {
		this.redeeemFundSeqId = redeeemFundSeqId;
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
	 * @return the certType
	 */
	public String getCertType() {
		return certType;
	}
	/**
	 * @param certType the certType to set
	 */
	public void setCertType(String certType) {
		this.certType = certType;
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
	 * @return the flag
	 */
	public String getFlag() {
		return flag;
	}
	/**
	 * @param flag the flag to set
	 */
	public void setFlag(String flag) {
		this.flag = flag;
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
	 * @return the subscription_id
	 */
	public String getSubscription_id() {
		return subscription_id;
	}
	/**
	 * @param subscription_id the subscription_id to set
	 */
	public void setSubscription_id(String subscription_id) {
		this.subscription_id = subscription_id;
	}
	/**
	 * @return the subs_trade_id
	 */
	public String getSubs_trade_id() {
		return subs_trade_id;
	}
	/**
	 * @param subs_trade_id the subs_trade_id to set
	 */
	public void setSubs_trade_id(String subs_trade_id) {
		this.subs_trade_id = subs_trade_id;
	}
	/**
	 * @return the subs_trade_status
	 */
	public String getSubs_trade_status() {
		return subs_trade_status;
	}
	/**
	 * @param subs_trade_status the subs_trade_status to set
	 */
	public void setSubs_trade_status(String subs_trade_status) {
		this.subs_trade_status = subs_trade_status;
	}
	/**
	 * @return the redem_trade_id
	 */
	public String getRedem_trade_id() {
		return redem_trade_id;
	}
	/**
	 * @param redem_trade_id the redem_trade_id to set
	 */
	public void setRedem_trade_id(String redem_trade_id) {
		this.redem_trade_id = redem_trade_id;
	}
	/**
	 * @return the redem_trade_status
	 */
	public String getRedem_trade_status() {
		return redem_trade_status;
	}
	/**
	 * @param redem_trade_status the redem_trade_status to set
	 */
	public void setRedem_trade_status(String redem_trade_status) {
		this.redem_trade_status = redem_trade_status;
	}
	/**
	 * @return the gather_id
	 */
	public String getGather_id() {
		return gather_id;
	}
	/**
	 * @param gather_id the gather_id to set
	 */
	public void setGather_id(String gather_id) {
		this.gather_id = gather_id;
	}
	/**
	 * @return the resp_code
	 */
	public String getResp_code() {
		return resp_code;
	}
	/**
	 * @param resp_code the resp_code to set
	 */
	public void setResp_code(String resp_code) {
		this.resp_code = resp_code;
	}
	/**
	 * @return the resp_desc
	 */
	public String getResp_desc() {
		return resp_desc;
	}
	/**
	 * @param resp_desc the resp_desc to set
	 */
	public void setResp_desc(String resp_desc) {
		this.resp_desc = resp_desc;
	}
	
	/**
	 * @return the create_time
	 */
	public Date getCreate_time() {
		return create_time;
	}
	/**
	 * @param create_time the create_time to set
	 */
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	/**
	 * @return the update_time
	 */
	public Date getUpdate_time() {
		return update_time;
	}
	/**
	 * @param update_time the update_time to set
	 */
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
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
