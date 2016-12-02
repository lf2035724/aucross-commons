/**
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:yu.han 2013-7-9
 */

/**
 * ExportChannelDetailDTO.java
 * 版权所有(C) 2013 证联融通电子有限公司 
 * 创建:yu.han 2013-7-9
 */
package com.ylink.ylpay.common.project.channel.dto;

import java.util.Date;

/** 
 * @author yu.han
 * @date 2013-7-9
 * @description：TODO
 */
public class ChannelDetailDTO extends AbstractDTO {
	private static final long serialVersionUID = -1894623435713514837L;
	private String channelSn;
	/**发往银行流水号*/
	private String requestSn;
	private String merchantId;
	private String bankSn;//其它行凭证号
	private String creditNo;//建行凭证号
	private String agrmtNo;//
	private String bankType;
	private Date recivDateTime;
	
	
	/**
	 * 
	 */
	public ChannelDetailDTO() {
		super();
	}
	/**
	 * @param channelSn
	 * @param requestSn
	 * @param merchantId
	 * @param bankSn
	 * @param bankType
	 * @param recivDateTime
	 */
	public ChannelDetailDTO(String channelSn, String requestSn, String merchantId, String bankSn,String bankType, Date recivDateTime,String creditNo,String agrmtNo) {
		super();
		this.channelSn = channelSn;
		this.requestSn = requestSn;
		this.merchantId = merchantId;
		this.bankSn = bankSn;
		this.bankType = bankType;
		this.recivDateTime = recivDateTime;
		this.creditNo = creditNo;
		this.agrmtNo = agrmtNo;
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
	 * @return the bankSn
	 */
	public String getBankSn() {
		return bankSn;
	}
	/**
	 * @param bankSn the bankSn to set
	 */
	public void setBankSn(String bankSn) {
		this.bankSn = bankSn;
	}
	/**
	 * @return the bankType
	 */
	public String getString() {
		return bankType;
	}
	/**
	 * @param bankType the bankType to set
	 */
	public void setString(String bankType) {
		this.bankType = bankType;
	}
	/**
	 * @return the recivDateTime
	 */
	public Date getRecivDateTime() {
		return recivDateTime;
	}
	/**
	 * @param recivDateTime the recivDateTime to set
	 */
	public void setRecivDateTime(Date recivDateTime) {
		this.recivDateTime = recivDateTime;
	}
	public String getCreditNo() {
		return creditNo;
	}
	public void setCreditNo(String creditNo) {
		this.creditNo = creditNo;
	}
	public String getAgrmtNo() {
		return agrmtNo;
	}
	public void setAgrmtNo(String agrmtNo) {
		this.agrmtNo = agrmtNo;
	}
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	
	
}
