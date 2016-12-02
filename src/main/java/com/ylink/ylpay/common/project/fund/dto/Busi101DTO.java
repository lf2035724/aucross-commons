/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-10-20
 */

package com.ylink.ylpay.common.project.fund.dto;

import java.io.Serializable;
import java.lang.reflect.Method;

import com.ylink.ylpay.common.project.utils.ContextUtil;


/** 
 * @author ZhangDM(Mingly)
 * @date 2012-10-20
 * @description：账户开户请求信息DTO
 */

public class Busi101DTO implements Serializable{
	
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
	/***
	 * 用户Id
	 */
	private String userId;
	/**
	 * 门户返回到前置的地址
	 */
	private String reBackUrl;
	/**
	 * 绑卡方式，0：快捷，1：网关
	 */
	private String tiedCardType; 
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
	
	public String getTiedCardType() {
		return tiedCardType;
	}
	public void setTiedCardType(String tiedCardType) {
		this.tiedCardType = tiedCardType;
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
	public String getPgRecvUrl() {
		return pgRecvUrl;
	}
	public void setPgRecvUrl(String pgRecvUrl) {
		this.pgRecvUrl = pgRecvUrl;
	}
	public String getBgRecvUrl() {
		return bgRecvUrl;
	}
	public void setBgRecvUrl(String bgRecvUrl) {
		this.bgRecvUrl = bgRecvUrl;
	}
	public String getResv() {
		return resv;
	}
	public void setResv(String resv) {
		this.resv = resv;
	}
	

	public String getReBackUrl() {
		return reBackUrl;
	}
	public void setReBackUrl(String reBackUrl) {
		this.reBackUrl = reBackUrl;
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
	public static String Buis101DTOToStr(Busi101DTO busi101DTO){
		StringBuffer sBuffer = new StringBuffer(); 
		sBuffer.append("instuId"+ContextUtil.URL_EQUAL_DELIMITER+busi101DTO.getInstuId()+ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("fundDate"+ContextUtil.URL_EQUAL_DELIMITER+busi101DTO.getFundDate()+ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("fundTime"+ContextUtil.URL_EQUAL_DELIMITER+busi101DTO.getFundTime()+ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("fundSeqId"+ContextUtil.URL_EQUAL_DELIMITER+busi101DTO.getFundSeqId()+ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("userNameText"+ContextUtil.URL_EQUAL_DELIMITER+busi101DTO.getUserNameText()+ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("certType"+ContextUtil.URL_EQUAL_DELIMITER+busi101DTO.getCertType()+ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("certId"+ContextUtil.URL_EQUAL_DELIMITER+busi101DTO.getCertId()+ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("bankCode"+ContextUtil.URL_EQUAL_DELIMITER+busi101DTO.getBankCode()+ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("bankProvinceCode"+ContextUtil.URL_EQUAL_DELIMITER+busi101DTO.getBankProvinceCode()+ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("bankRegionCode"+ContextUtil.URL_EQUAL_DELIMITER+busi101DTO.getBankRegionCode()+ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("cardNo"+ContextUtil.URL_EQUAL_DELIMITER+busi101DTO.getCardNo()+ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("pgRecvUrl"+ContextUtil.URL_EQUAL_DELIMITER+busi101DTO.getPgRecvUrl()+ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("bgRecvUrl"+ContextUtil.URL_EQUAL_DELIMITER+busi101DTO.getBgRecvUrl()+ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("resv"+ContextUtil.URL_EQUAL_DELIMITER+busi101DTO.getResv()+ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("userId"+ContextUtil.URL_EQUAL_DELIMITER+busi101DTO.getUserId()+ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("reBackUrl"+ContextUtil.URL_EQUAL_DELIMITER+busi101DTO.getReBackUrl()+ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("tiedCardType"+ContextUtil.URL_EQUAL_DELIMITER+busi101DTO.getTiedCardType()+ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("counterNo"+ContextUtil.URL_EQUAL_DELIMITER+busi101DTO.getCounterNo()+ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("tradeOrigin"+ContextUtil.URL_EQUAL_DELIMITER+busi101DTO.getTradeOrigin()+ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("useType"+ContextUtil.URL_EQUAL_DELIMITER+busi101DTO.getUseType()+ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("phoneNo"+ContextUtil.URL_EQUAL_DELIMITER+busi101DTO.getPhoneNo()+ContextUtil.URL_FIELD_DELIMITER);
		return sBuffer.toString();
	}
	
	public static Busi101DTO strToBusi101DTO(String str)
	{
		String[] params=str.split(ContextUtil.URL_FIELD_DELIMITER);
		Busi101DTO dto=new Busi101DTO();
		for(String param:params)
		{
			String[] keyValue=param.split(ContextUtil.URL_EQUAL_DELIMITER);
			if(keyValue.length==2)
			{
				try {
					Method methodsn =dto.getClass().getMethod("set"+keyValue[0].substring(0, 1).toUpperCase()+keyValue[0].substring(1), String.class);
					methodsn.invoke(dto, keyValue[1]);
				} catch (Exception e) {
					
				}
				
			}
		}
		return dto;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}
