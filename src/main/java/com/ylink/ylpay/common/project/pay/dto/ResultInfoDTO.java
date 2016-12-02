/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 */
package com.ylink.ylpay.common.project.pay.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * @author yanghan
 * @date 2013-7-15
 */
public class ResultInfoDTO extends BaseDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6448284559939553479L;
	
	private String additionalRecordId;
	
	private String channelSn;
	
	private String requestSn;
	
	private String actualBankType;

	public ResultInfoDTO obtainResultInfoDTO(){
		ResultInfoDTO mResultInfoDTO = new ResultInfoDTO();
		mResultInfoDTO.setAdditionalRecordId(additionalRecordId);
		mResultInfoDTO.setChannelSn(channelSn);
		mResultInfoDTO.setRequestSn(requestSn);
		mResultInfoDTO.setActualBankType(actualBankType);
		return mResultInfoDTO;
	}
	
	public void setResultInfo(ResultInfoDTO resultInfoDTO){
		if(resultInfoDTO == null)
			return;
		this.setAdditionalRecordId(resultInfoDTO.getAdditionalRecordId());
		this.setChannelSn(resultInfoDTO.getChannelSn());
		this.setRequestSn(resultInfoDTO.getRequestSn());
		this.setActualBankType(resultInfoDTO.getActualBankType());
	}
	
	/**
	 * @return the additionalRecordId
	 */
	public String getAdditionalRecordId() {
		return additionalRecordId;
	}

	/**
	 * @param additionalRecordId the additionalRecordId to set
	 */
	public void setAdditionalRecordId(String additionalRecordId) {
		this.additionalRecordId = additionalRecordId;
	}

	/**
	 * @return the channelSn
	 */
	public String getChannelSn() {
		return channelSn;
	}

	/**
	 * @param channelSn the channelSn to set
	 */
	public void setChannelSn(String channelSn) {
		this.channelSn = channelSn;
	}

	/**
	 * @return the requestSn
	 */
	public String getRequestSn() {
		return requestSn;
	}

	/**
	 * @param requestSn the requestSn to set
	 */
	public void setRequestSn(String requestSn) {
		this.requestSn = requestSn;
	}

	/**
	 * @return the requestSn
	 */
	public String getActualBankType() {
		return actualBankType;
	}

	/**
	 * @param requestSn the requestSn to set
	 */
	public void setActualBankType(String actualBankType) {
		this.actualBankType = actualBankType;
	}
}	
