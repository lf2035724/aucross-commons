/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-10-20
 */

package com.ylink.ylpay.common.project.fund.dto;

import com.ylink.ylpay.common.project.utils.ContextUtil;


/** 
 * @author ZhangDM(Mingly)
 * @date 2012-10-20
 * @description：取消银行卡请求信息DTO
 */

public class Busi103DTO {
	
	private static final long serialVersionUID = 1L;
	
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
//	/**
//	 * 交易类型
//	 */
//	private String transType;
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
//	/**
//	 * 交易请求方将交易发给接收方后，交易应答接收后台地址
//	 */
//	private String bgRecvUrl;
	/**
	 * 保留域，接收方必须原样回送该字段数据
	 */
	private String resv;
	private String reBackUrl;
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
	public String getBankProvinceCode() {
		return bankProvinceCode;
	}
	public void setBankProvinceCode(String bankProvinceCode) {
		this.bankProvinceCode = bankProvinceCode;
	}
	public String getBankRegionCode() {
		return bankRegionCode;
	}
	public void setBankRegionCode(String bankRegionCode) {
		this.bankRegionCode = bankRegionCode;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
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
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getReBackUrl() {
		return reBackUrl;
	}
	public void setReBackUrl(String reBackUrl) {
		this.reBackUrl = reBackUrl;
	}
	
	
public static String Buis103DTOToStr(Busi103DTO busi103DTO){
		StringBuffer sBuffer = new StringBuffer(); 
		sBuffer.append("instuId="+busi103DTO.getInstuId()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("fundDate="+busi103DTO.getFundDate()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("fundTime="+busi103DTO.getFundTime()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("fundSeqId="+busi103DTO.getFundSeqId()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("userNameText="+busi103DTO.getUserNameText()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("certType="+busi103DTO.getCertType()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("certId="+busi103DTO.getCertId()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("bankCode="+busi103DTO.getBankCode()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("bankProvinceCode="+busi103DTO.getBankProvinceCode()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("bankRegionCode="+busi103DTO.getBankRegionCode()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("cardNo="+busi103DTO.getCardNo()+ ContextUtil.URL_FIELD_DELIMITER);
//		sBuffer.append("pgRecvUrl="+busi103DTO.getPgRecvUrl()+ ContextUtil.URL_FIELD_DELIMITER);
//		sBuffer.append("bgRecvUrl="+busi103DTO.getBgRecvUrl()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("resv="+busi103DTO.getResv()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("reBackUrl="+busi103DTO.getReBackUrl()+ ContextUtil.URL_FIELD_DELIMITER);
		return sBuffer.toString();
	}
}
