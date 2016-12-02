/**
 * PortalCommunicationDTO.java
 * 版权所有(C) 2014 证联融通电子有限公司 
 * 创建:LiuQ 2014-3-10
 */
package com.ylink.ylpay.common.project.fund.dto;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.core.dto.BaseDTO;
import com.ylink.ylpay.common.project.utils.ContextUtil;

/**
 * @author LiuQ
 * @date 2014-3-10
 * @description 前置与门户系统通信通用DTO
 */
public class PortalCommunicationDTO extends BaseDTO {

	private static final long serialVersionUID = 2568737210498032285L;
	
	/**
	 * 业务流水号
	 */
	private String businessSn;
	
	/**
	 * 商户号
	 */
	private String merchantId;
	
	/**
	 * 回调地址
	 */
	private String reBackUrl;
	
	/**
	 * 支付系统流水号
	 */
	private String pnrSeqId;
	
	/**
	 * 通信数据
	 */
	private Map<String, String> data;

	/**
	 * @return the businessSn
	 */
	public String getBusinessSn() {
		return businessSn;
	}

	/**
	 * @param businessSn the businessSn to set
	 */
	public void setBusinessSn(String businessSn) {
		this.businessSn = businessSn;
	}

	/**
	 * @return the merchantId
	 */
	public String getMerchantId() {
		return merchantId;
	}

	/**
	 * @param merchantId the merchantId to set
	 */
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
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
	 * @return the data
	 */
	public Map<String, String> getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Map<String, String> data) {
		this.data = data;
	}
	
	/**
	 * @description 还原DTO
	 * @param str
	 * @return  
	 * @author LiuQ
	 * @date 2014-3-11
	 */
	public static PortalCommunicationDTO strToPortalCommunicationDTO(String str)
	{
		String[] params=str.split(ContextUtil.URL_FIELD_DELIMITER_TRANS);
		PortalCommunicationDTO dto=new PortalCommunicationDTO();
		Map<String, String> dataMap = new HashMap<String, String>();
		for(String param:params)
		{
			int index=param.indexOf(ContextUtil.URL_EQUAL_DELIMITER);
			if(index>0)
			{
				String key=param.substring(0,index);
				String value=param.substring(index+1);
				try {
					Method methodsn =dto.getClass().getMethod("set" + key.substring(0, 1).toUpperCase() 
							+ key.substring(1), String.class);
					methodsn.invoke(dto, value);
				} catch (NoSuchMethodException  ne) {
					dataMap.put(key, value);
				}catch (Exception e) {
					
				}
			}
		}
		
		dto.setData(dataMap);
		return dto;
	}
	
	/**
	 * @description 请求DTO拼装字符串
	 * @param portalCommunicationDTO
	 * @return  
	 * @author LiuQ
	 * @date 2014-3-11
	 */
	public static String portalCommunicationDTOToStr(PortalCommunicationDTO portalCommunicationDTO) {
		StringBuffer sBuffer = new StringBuffer(); 
		sBuffer.append("businessSn=" + portalCommunicationDTO.getBusinessSn() + ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("merchantId=" + portalCommunicationDTO.getMerchantId() + ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("reBackUrl=" + portalCommunicationDTO.getReBackUrl() + ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("pnrSeqId=" + portalCommunicationDTO.getPnrSeqId() + ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("respCode=" + portalCommunicationDTO.getRespCode() + ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("respDesc=" + portalCommunicationDTO.getRespDesc() + ContextUtil.URL_FIELD_DELIMITER);
		Map<String, String> data = portalCommunicationDTO.getData();
		for(String key : data.keySet())
			sBuffer.append(key  +ContextUtil.URL_EQUAL_DELIMITER+ data.get(key) + ContextUtil.URL_FIELD_DELIMITER);
			
		return sBuffer.toString();
	}
	
}
