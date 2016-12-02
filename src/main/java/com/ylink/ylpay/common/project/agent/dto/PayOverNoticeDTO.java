package com.ylink.ylpay.common.project.agent.dto;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * @author wanglei
 * @date 2013-9-29
 * @description：缴费但支付完成后，回调缴费前置DTO
 */
public class PayOverNoticeDTO extends BaseDTO {

	private static final long serialVersionUID = 1916797400979742834L;

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
	private String requestPaySn;
	
	/**
	 * 支付完成时间
	 */
	private Date payDate;
	
	/**
	 * 支付创建时间
	 */
	private Date payCreatedTime;
	
	private String callbackUrl;
	
	private String notifyUrl;
	
	public String toString(){
		return "PayOverNoticeDTO=[isSuccess="+isSuccess+";payStatus="+payStatus+";tradeId="+tradeId+";requestPaySn="+requestPaySn+";payDate="+payDate+
				";payCreatedTime="+payCreatedTime+";callbackUrl="+callbackUrl+";notifyUrl="+notifyUrl+"]";
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
	
	public static PayOverNoticeDTO strToObject(String str)
	{
		String[] params=str.split("&");
		PayOverNoticeDTO dto=new PayOverNoticeDTO();
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


	public static PayOverNoticeDTO strToPayNoticeDTO(String str)
	{
		String[] params=str.split("&");
		PayOverNoticeDTO dto=new PayOverNoticeDTO();
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
	public String getRequestPaySn() {
		return requestPaySn;
	}
	public void setRequestPaySn(String requestPaySn) {
		this.requestPaySn = requestPaySn;
	}
	public String getCallbackUrl() {
		return callbackUrl;
	}
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}
	
}
