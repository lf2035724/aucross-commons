/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Leo 2012-11-22
 */

/**
 * CheckStandDTO.java
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Leo 2012-11-22
 */
package com.ylink.ylpay.common.project.fund.dto;

import java.lang.reflect.Method;

import com.ylink.ylpay.common.project.utils.ContextUtil;

/** 
 * @author Leo
 * @date 2012-11-22
 * @description：TODO
 */

/**
 * @author LEO
 *
 */
public class CheckStandDTO {
	
	private String instuId;    			//商户custId
	private String bussiTime;    		//商户交易时间
	private String fundSeqId;    		//前置流水号
	private String transAmt;    		//支付金额
	private String optCode;    			//操作代码  对应OptType枚举
	private String productType;    	//业务类型  基金为2，普通消费为1
	private String systemCode;    	//回调URL
	private String orderId;
	
	public String getInstuId() {
		return instuId;
	}
	public void setInstuId(String instuId) {
		this.instuId = instuId;
	}
	public String getBussiTime() {
		return bussiTime;
	}
	public void setBussiTime(String bussiTime) {
		this.bussiTime = bussiTime;
	}
	public String getFundSeqId() {
		return fundSeqId;
	}
	public void setFundSeqId(String fundSeqId) {
		this.fundSeqId = fundSeqId;
	}
	public String getTransAmt() {
		return transAmt;
	}
	public void setTransAmt(String transAmt) {
		this.transAmt = transAmt;
	}
	public String getOptCode() {
		return optCode;
	}
	public void setOptCode(String optCode) {
		this.optCode = optCode;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	
	public String getSystemCode() {
		return systemCode;
	}
	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	
	public static String CheckStandDTOToStr(CheckStandDTO checkStandDTO){
		StringBuffer sBuffer = new StringBuffer(); 
		sBuffer.append("instuId="+checkStandDTO.getInstuId()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("bussiTime="+checkStandDTO.getBussiTime()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("fundSeqId="+checkStandDTO.getFundSeqId()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("transAmt="+checkStandDTO.getTransAmt()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("optCode="+checkStandDTO.getOptCode()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("productType="+checkStandDTO.getProductType()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("orderId="+checkStandDTO.getOrderId()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("systemCode="+checkStandDTO.getSystemCode()+ ContextUtil.URL_FIELD_DELIMITER);
		return sBuffer.toString();
	}
		
	public static CheckStandDTO strToCheckStandDTO(String str)
	{
		String[] params=str.split( ContextUtil.URL_FIELD_DELIMITER);
		CheckStandDTO dto=new CheckStandDTO();
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
