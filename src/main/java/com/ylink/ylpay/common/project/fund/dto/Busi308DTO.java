package com.ylink.ylpay.common.project.fund.dto;
/** 
 * @author yu.han
 * @date 201-3-21
 * @description：网关申购请求信息DTO
 */
public class Busi308DTO {
	/**证联融通分配给商户的机构代码*/
	/**  */
	private String instuId; 			
	/** 商户的系统日期，YYYYMMDD */
	private String fundDate; 			 
	/** 商户的时间戳，HHMMSS */
	private String fundTime; 			
	/** 商户系统流水号。需要保证一个交易日中流水号的唯一性 */
	private String fundSeqId; 			
	/** 用户在证联融通平台里的客户号 */
	private String userId; 				
	/** 客户的姓名 */
	private String userNameText; 		
	/** 证件类型，参考附录 */
	private String certType; 			
	/** 证件号码 */
	private String certId; 				
	/** 银行代码 */
	private String bankCode; 				
	/** 银行卡帐号 */
	private String cardNo;				
	/** 业务类型:	认购 0001、申购0002、定投0003 */
	private String busiType;			
	/** 以分为单位，账户充值金额、基金交易金额、基金转换的金额、账户取现金额等业务交易金额的统称 */
	private String transAmt; 			
	/** 交易结算日期，YYYYMMDD；不小于交易日期 */
	private String liqDate; 			
	/** 基金申购、赎回、分红交易中，基金公司发行的基金代码 */
	private String fundCode; 			
	/** 基金类型：	00 -- 股票基金	01 -- 货币基金	02 -- 债券基金 */
	private String fundType; 			
//	private String buyModel; 			//申购模式：	1 -- 普通申购	2 -- 定投申购
	/**交易请求方将交易发给接收方后，交易应答接收的页面地址**/
	private String pgRecvUrl; 			//
	/**交易请求方将交易发给接收方后，交易应答接收后台地址**/
	private String bgRecvUrl; 			//
	/** 保留域，接收方必须原样回送该字段数据 */
	private String resv; 	
	/**门户回调地址*/
	private String reBackUrl;
	private String optCode;
	private String payeeCustName;
	private String fundId;
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
//	public String getTransType() {
//		return transType;
//	}
//	public void setTransType(String transType) {
//		this.transType = transType;
//	}
	
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

	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
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
//	public String getBuyModel() {
//		return buyModel;
//	}
//	public void setBuyModel(String buyModel) {
//		this.buyModel = buyModel;
//	}
//	public String getBgRecvUrl() {
//		return bgRecvUrl;
//	}
//	public void setBgRecvUrl(String bgRecvUrl) {
//		this.bgRecvUrl = bgRecvUrl;
//	}
	public String getResv() {
		return resv;
	}
	public void setResv(String resv) {
		this.resv = resv;
	}
	
	/**
	 * @return the reBackUrl
	 */
	public String getReBackUrl() {
		return reBackUrl;
	}
	/**
	 * @param reBackUrl the reBackUrl to set
	 */
	public void setReBackUrl(String reBackUrl) {
		this.reBackUrl = reBackUrl;
	}
	/**
	 * @return the pgRecvUrl
	 */
	public String getPgRecvUrl() {
		return pgRecvUrl;
	}
	/**
	 * @param pgRecvUrl the pgRecvUrl to set
	 */
	public void setPgRecvUrl(String pgRecvUrl) {
		this.pgRecvUrl = pgRecvUrl;
	}
	/**
	 * @return the bgRecvUrl
	 */
	public String getBgRecvUrl() {
		return bgRecvUrl;
	}
	/**
	 * @param bgRecvUrl the bgRecvUrl to set
	 */
	public void setBgRecvUrl(String bgRecvUrl) {
		this.bgRecvUrl = bgRecvUrl;
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
	 * @return the payeeCustName
	 */
	public String getPayeeCustName() {
		return payeeCustName;
	}
	/**
	 * @param payeeCustName the payeeCustName to set
	 */
	public void setPayeeCustName(String payeeCustName) {
		this.payeeCustName = payeeCustName;
	}
	
	/**
	 * @return the fundId
	 */
	public String getFundId() {
		return fundId;
	}
	/**
	 * @param fundId the fundId to set
	 */
	public void setFundId(String fundId) {
		this.fundId = fundId;
	}
	@Override
	public String toString() {
		return "Busi308DTO [instuId=" + instuId + ", fundDate=" + fundDate
				+ ", fundTime=" + fundTime + ", fundSeqId=" + fundSeqId
				+ ", userId=" + userId + ", userNameText="
				+ userNameText + ", certType=" + certType + ", certId="
				+ certId + ", bankCode=" + bankCode + ", cardNo=" + cardNo
				+ ", busiType=" + busiType + ", transAmt=" + transAmt
				+ ", liqDate=" + liqDate + ", fundCode=" + fundCode
				+ ", pgRecvUrl=" + pgRecvUrl + ", bgRecvUrl=" + bgRecvUrl
				+ ", fundId=" + fundId 
				+ ", fundType=" + fundType + ", resv=" + resv + "]";
	}
	
}
