package com.ylink.ylpay.common.project.mall.dto;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

public class PayNoticeDTO extends BaseDTO {

	private static final long serialVersionUID = -5575077870289459820L;
	
	/**
	 * 成功标识
	 */
	
	private String isSuccess;
	
	/**
	 * 支付状态
	 */
	private String payStatus;
	
	/**
	 * 交易订单ID(支付系统)
	 */
	private String tradeId;
	
	/**
	 * 前置系统交易流水号
	 */
	private String seriNo;
	
	/**
	 * 支付完成时间
	 */
	private Date payDate;
	
	/**
	 * 买家ID
	 */
	private String buyerId;
	
	/**
	 * 支付创建时间
	 */
	private Date payCreatedTime;
	
	/**
	 * 支付系统退款编号
	 */
	private String refundId;
	
	/**
	 * 公用消息
	 */
	private String message;
	
	private String callBackUrl;
	
	private String notifyUrl;
	
	/**
	 * 前置退款流水号
	 */
	private String refundSeriNo;
	
	
	public String getRefundSeriNo() {
		return refundSeriNo;
	}
	public void setRefundSeriNo(String refundSeriNo) {
		this.refundSeriNo = refundSeriNo;
	}
	public String getCallBackUrl() {
		return callBackUrl;
	}
	public void setCallBackUrl(String callbackUrl) {
		this.callBackUrl = callbackUrl;
	}
	public String getNotifyUrl() {
		return notifyUrl;
	}
	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}
	public String getIsSuccess() {
		return isSuccess;
	}
	public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	public String getTradeId() {
		return tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	public String getSeriNo() {
		return seriNo;
	}
	public void setSeriNo(String seriNo) {
		this.seriNo = seriNo;
	}
	public String getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public Date getPayDate() {
		return payDate;
	}
	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}
	public Date getPayCreatedTime() {
		return payCreatedTime;
	}
	public void setPayCreatedTime(Date payCreatedTime) {
		this.payCreatedTime = payCreatedTime;
	}
	
	public String getRefundId() {
		return refundId;
	}
	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public static PayNoticeDTO strToObject(String str)
	{
		String[] params=str.split("&");
		PayNoticeDTO dto=new PayNoticeDTO();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		for(String param:params)
		{
			String[] keyValue=param.split("=");
			if(keyValue.length==2)
			{
				try {
					if(keyValue[0].equals("payDate")||keyValue[0].equals("payCreatedTime")){
						Method methodsn =dto.getClass().getMethod("set"+keyValue[0].substring(0, 1).toUpperCase()+keyValue[0].substring(1), Date.class);
						methodsn.invoke(dto, sdf.parse(keyValue[1]));
					}else{
						Method methodsn =dto.getClass().getMethod("set"+keyValue[0].substring(0, 1).toUpperCase()+keyValue[0].substring(1), String.class);
						methodsn.invoke(dto, keyValue[1]);
					}
				} catch (Exception e) {
					
				}
				
			}
		}
		return dto;
	}


	public static PayNoticeDTO strToPayNoticeDTO(String str)
	{
		String[] params=str.split("&");
		PayNoticeDTO dto=new PayNoticeDTO();
		for(String param:params)
		{
			String[] keyValue=param.split("=");
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
	
}
