/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:yu.han 2013-3-21
 */

package com.ylink.ylpay.common.project.fund.dto;

import java.lang.reflect.Method;

import com.ylink.ylpay.common.project.utils.ContextUtil;



/** 
 * @author yu.han
 * @date 2013-3-21
 * @description：网关充值响应信息DTO
 */

public class Busi206DTO {
	
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
	 * 用户在证联融通平台里的客户号
	 */
	private String userId;
	/**
	 * 客户的姓名
	 */
	private String userNameText;
	/**
	 * 用户在证联融通平台里的客户号
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
	 * 充值金额
	 */
	private String transAmt;
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
	private String bgRecvUrl;
	public String getBgRecvUrl() {
		return bgRecvUrl;
	}

	public void setBgRecvUrl(String bgRecvUrl) {
		this.bgRecvUrl = bgRecvUrl;
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
	public static Busi206DTO strToBusi206DTO(String str)
	{
		Busi206DTO dto=new Busi206DTO();
		String[] params=str.split(ContextUtil.URL_FIELD_DELIMITER_TRANS);
		for(String param:params){
			int index = param.indexOf(ContextUtil.URL_EQUAL_DELIMITER);
//			String[] keyValue=param.split(ContextUtil.URL_EQUAL_DELIMITER);
//			dataMap.put(data.substring(0, i), data.substring(i + 1, data.length()));
			if(index>0)
			{
				String keyValue=param.substring(0,index);
				String val=param.substring(index+1);
				try {
					Method methodsn =dto.getClass().getMethod("set"+keyValue.substring(0, 1).toUpperCase()+keyValue.substring(1), String.class);
					methodsn.invoke(dto, val);
				} catch (Exception e) {
					
				}
				
			}
		}
		return dto;
	}
	@Override
	public String toString() {
		return "Busi206DTO [instuId=" + instuId + ", fundDate=" + fundDate
				+ ", fundTime=" + fundTime + ", fundSeqId=" + fundSeqId
				+ ", userId=" + userId + ", userNameText=" + userNameText
				+ ", certType=" + certType + ", certId=" + certId
				+ ", bankCode=" + bankCode + ", cardNo=" + cardNo
				+ ", pnrDate=" + pnrDate + ", pnrTime=" + pnrTime
				+ ", pnrSeqId=" + pnrSeqId + ", transAmt=" + transAmt
				+ ", respCode=" + respCode + ", respDesc=" + respDesc
				+ ", resv=" + resv + "]";
	}
	
}
