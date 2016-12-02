package com.ylink.ylpay.common.project.portal.dto;


/** 
 * 新增银行卡响应信息
 * @author yu.han
 *
 */

public class AddBankCardReturnDTO extends AbstractDTO {
	private static final long serialVersionUID = -1359720942154938822L;
	/**
	 * 客户号
	 */
	private String userId;
	private String pnrDate;
	private String pnrTime;
	private String pnrSeqId;
	private String respCode;
	private String respDesc;
	
	//////////////////////////////////////
	/**
	 * 证联融通分配给商户的机构代码
	 */
	private String instuId;
	/**
	 * 用户类型
	 */
	private String userType;
	/**
	 * 客户的姓名
	 */
	private String userNameText;
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
	 * 省份代码
	 */
	private String bankProvinceCode;
	/**
	 * 地区代码
	 */
	private String bankRegionCode;
	/**
	 * 取现银行卡帐号
	 */
	private String cardNo;
	/**
	 * 绑卡方式，0：快捷，1：网关
	 */
	private String tiedCardType; 
	/**
	 * 门户业务类型
	 */
	private String orderType;
	/**
	 * 柜员号
	 */
	private String counterNo;
	//////////////////////////////////
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
	 * 商户的系统日期
	 */
	private String merchantDate;
	/**
	 * 商户的时间戳
	 */
	private String merchantTime;
	/**
	 * 商户系统流水号
	 */
	private String merchantSeqId;
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
	/**
	 * 手机号
	 */
	private String mobile;
	/**
	 * 资金账户密码(保证金支付使用)
	 */
	private String accountPsw;
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
	 * @return the pnrDate
	 */
	public String getPnrDate() {
		return pnrDate;
	}
	/**
	 * @param pnrDate the pnrDate to set
	 */
	public void setPnrDate(String pnrDate) {
		this.pnrDate = pnrDate;
	}
	/**
	 * @return the pnrTime
	 */
	public String getPnrTime() {
		return pnrTime;
	}
	/**
	 * @param pnrTime the pnrTime to set
	 */
	public void setPnrTime(String pnrTime) {
		this.pnrTime = pnrTime;
	}
	/**
	 * @return the pnrSeqId
	 */
	public String getPnrSeqId() {
		return pnrSeqId;
	}
	/**
	 * @param pnrSeqId the pnrSeqId to set
	 */
	public void setPnrSeqId(String pnrSeqId) {
		this.pnrSeqId = pnrSeqId;
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
	 * @return the userType
	 */
	public String getUserType() {
		return userType;
	}
	/**
	 * @param userType the userType to set
	 */
	public void setUserType(String userType) {
		this.userType = userType;
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
	 * @return the bankProvinceCode
	 */
	public String getBankProvinceCode() {
		return bankProvinceCode;
	}
	/**
	 * @param bankProvinceCode the bankProvinceCode to set
	 */
	public void setBankProvinceCode(String bankProvinceCode) {
		this.bankProvinceCode = bankProvinceCode;
	}
	/**
	 * @return the bankRegionCode
	 */
	public String getBankRegionCode() {
		return bankRegionCode;
	}
	/**
	 * @param bankRegionCode the bankRegionCode to set
	 */
	public void setBankRegionCode(String bankRegionCode) {
		this.bankRegionCode = bankRegionCode;
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
	 * @return the tiedCardType
	 */
	public String getTiedCardType() {
		return tiedCardType;
	}
	/**
	 * @param tiedCardType the tiedCardType to set
	 */
	public void setTiedCardType(String tiedCardType) {
		this.tiedCardType = tiedCardType;
	}
	/**
	 * @return the orderType
	 */
	public String getOrderType() {
		return orderType;
	}
	/**
	 * @param orderType the orderType to set
	 */
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	/**
	 * @return the counterNo
	 */
	public String getCounterNo() {
		return counterNo;
	}
	/**
	 * @param counterNo the counterNo to set
	 */
	public void setCounterNo(String counterNo) {
		this.counterNo = counterNo;
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
	 * @return the merchantDate
	 */
	public String getMerchantDate() {
		return merchantDate;
	}
	/**
	 * @param merchantDate the merchantDate to set
	 */
	public void setMerchantDate(String merchantDate) {
		this.merchantDate = merchantDate;
	}
	/**
	 * @return the merchantTime
	 */
	public String getMerchantTime() {
		return merchantTime;
	}
	/**
	 * @param merchantTime the merchantTime to set
	 */
	public void setMerchantTime(String merchantTime) {
		this.merchantTime = merchantTime;
	}
	/**
	 * @return the merchantSeqId
	 */
	public String getMerchantSeqId() {
		return merchantSeqId;
	}
	/**
	 * @param merchantSeqId the merchantSeqId to set
	 */
	public void setMerchantSeqId(String merchantSeqId) {
		this.merchantSeqId = merchantSeqId;
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
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the accountPsw
	 */
	public String getAccountPsw() {
		return accountPsw;
	}
	/**
	 * @param accountPsw the accountPsw to set
	 */
	public void setAccountPsw(String accountPsw) {
		this.accountPsw = accountPsw;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RegisterReturnDTO [userId=" + userId + ", pnrDate=" + pnrDate + ", pnrTime=" + pnrTime + ", pnrSeqId=" + pnrSeqId + ", respCode=" + respCode
				+ ", respDesc=" + respDesc + ", instuId=" + instuId + ", userType=" + userType + ", userNameText=" + userNameText + ", certType=" + certType
				+ ", certId=" + certId + ", bankCode=" + bankCode + ", bankProvinceCode=" + bankProvinceCode + ", bankRegionCode=" + bankRegionCode
				+ ", cardNo=" + cardNo + ", tiedCardType=" + tiedCardType + ", orderType=" + orderType + ", counterNo=" + counterNo + ", fundDate=" + fundDate
				+ ", fundTime=" + fundTime + ", fundSeqId=" + fundSeqId + ", merchantDate=" + merchantDate + ", merchantTime=" + merchantTime
				+ ", merchantSeqId=" + merchantSeqId + ", pgRecvUrl=" + pgRecvUrl + ", bgRecvUrl=" + bgRecvUrl + ", resv=" + resv + ", mobile=" + mobile
				+ ", accountPsw=" + accountPsw + "]";
	}
}
