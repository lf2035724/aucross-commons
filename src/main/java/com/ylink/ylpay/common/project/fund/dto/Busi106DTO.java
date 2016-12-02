/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建: yu.han 2013-3-21
 */

package com.ylink.ylpay.common.project.fund.dto;


/** 
 * @author yu.han
 * @date 2013-3-21
 * @description：网关充值请求信息DTO
 */

public class Busi106DTO {
	
	/**
	 * 证联融通分配给商户的机构代码
	 */
	private String instuId;
	/**
	 * 商户的系统日期
	 */
	private String fundDate;
	/**
	 * 商户的时间戳
	 */
	private String fundTime;
	/**
	 * 商户系统流水号
	 */
	private String fundSeqId;
	/**
	 * 客户的姓名
	 */
	private String userNameText;
	/**
	 * 用户在证联融通平台里的客户号
	 */
	private String userId;
	/**
	 * 证件类型
	 */
	private String certType;
	/**
	 * 证件号码
	 */
	private String certId;
	/**
	 * 银行代码
	 */
	private String bankCode;
	/**
	 * 取现银行卡帐号
	 */
	private String cardNo;
	/**
	 * 充值金额
	 */
	private String transAmt;
	/**
	 * 交易请求方将交易发给接收方后，交易应答接收的页面地址
	 */
	private String pgRecvUrl;
	/**
	 * 交易请求方将交易发给接收方后，交易应答接收后台地址
	 */
	private String bgRecvUrl;
	/**
	 * 保留域，接收方必须原样回送该字段数据
	 */
	private String resv;
	
	private String reBackUrl;
	public String getReBackUrl() {
		return reBackUrl;
	}


	public void setReBackUrl(String reBackUrl) {
		this.reBackUrl = reBackUrl;
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
	 * @return the fundSeqId
	 */
	public String getFundSeqId() {
		return fundSeqId;
	}


	/**
	 * @param fundSeqId the fundSeqId to set
	 */
	public void setFundSeqId(String fundSeqId) {
		this.fundSeqId = fundSeqId;
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
	 * @return the bankCode
	 */
	public String getBankCode() {
		return bankCode;
	}


	/**
	 * @param bankCode the bankCode to set
	 */
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
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


	@Override
	public String toString() {
		return "Busi106DTO [instuId=" + instuId + ", fundDate=" + fundDate
				+ ", fundTime=" + fundTime + ", fundSeqId=" + fundSeqId
				+ ", userNameText=" + userNameText + ", userId=" + userId
				+ ", certType=" + certType + ", certId=" + certId
				+ ", bankCode=" + bankCode + ", cardNo=" + cardNo
				+ ", transAmt=" + transAmt + ", pgRecvUrl=" + pgRecvUrl  
				+ ", bgRecvUrl=" + bgRecvUrl + ", resv=" + resv + "]";
	}
	
}
