/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-10-20
 */

package com.ylink.ylpay.common.project.fund.dto;

import com.ylink.ylpay.common.project.utils.ContextUtil;


/** 
 * @author ZhangDM(Mingly)
 * @date 2012-10-20
 * @description：账户开户响应信息DTO
 */

public class Busi201DTO  {
	
	
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
	 * 用户在证联融通平台里的客户号
	 */
	private String userId;
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
	 * 开银行卡时所用身份证号类型
	 */
	/**
	 * 证联融通发起交易的系统日期
	 */
	private String pnrDate;
	/**
	 * 证联融通发给基金的时间戳
	 */
	private String pnrTime;
	/**
	 * 证联融通的流水号
	 */
	private String pnrSeqId;
	/**
	 * 应答码
	 */
	private String respCode;
	/**
	 * 业务应答描述
	 */
	private String respDesc;
	/**
	 * 保留域，接收方必须原样回送该字段数据
	 */
	private String resv;
	/**
	 * 柜员号
	 */
	private String counterNo;
	
	/**                                             
	 * 交易来源 0:互联网，1:移动终端                
	 */                                             
	private String tradeOrigin;                     
	/**                                             
	 * 使用方式  0:标准(直连银行)，1:小额(银联)     
	 */                                             
	private String useType;                         
	/**                                             
	 * 客户手机号                                   
	 */                                             
	private String phoneNo;  
	
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
	public String getRespCode() {
		return respCode;
	}
	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}
	public String getRespDesc() {
		return respDesc;
	}
	public void setRespDesc(String respDesc) {
		this.respDesc = respDesc;
	}
	/**
	 * @return the counterNo
	 */
	public String getCounterNo() {
		return counterNo;
	}
	
	public String getTradeOrigin() {
		return tradeOrigin;
	}
	public void setTradeOrigin(String tradeOrigin) {
		this.tradeOrigin = tradeOrigin;
	}
	public String getUseType() {
		return useType;
	}
	public void setUseType(String useType) {
		this.useType = useType;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	/**
	 * @param counterNo the counterNo to set
	 */
	public void setCounterNo(String counterNo) {
		this.counterNo = counterNo;
	}
	public static String Buis201DTOToStr(Busi201DTO busi201DTO){
		StringBuffer sBuffer = new StringBuffer(); 
		sBuffer.append("instuId="+busi201DTO.getInstuId()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("fundDate="+busi201DTO.getFundDate()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("fundTime="+busi201DTO.getFundTime()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("fundSeqId="+busi201DTO.getFundSeqId()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("userNameText="+busi201DTO.getUserNameText()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("certType="+busi201DTO.getCertType()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("certId="+busi201DTO.getCertId()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("bankCode="+busi201DTO.getBankCode()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("bankProvinceCode="+busi201DTO.getBankProvinceCode()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("bankRegionCode="+busi201DTO.getBankRegionCode()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("cardNo="+busi201DTO.getCardNo()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("respCode="+busi201DTO.respCode+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("respDesc="+busi201DTO.respDesc+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("resv="+busi201DTO.getResv()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("counterNo"+ContextUtil.URL_EQUAL_DELIMITER+busi201DTO.getCounterNo()+ContextUtil.URL_FIELD_DELIMITER);
		return sBuffer.toString();
	}
}
