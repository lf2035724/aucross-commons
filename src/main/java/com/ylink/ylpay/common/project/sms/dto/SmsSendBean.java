package com.ylink.ylpay.common.project.sms.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * 短信发送DTO.
 * 
 * @author 潘瑞峥
 * @date 2012-11-8
 */
public class SmsSendBean extends BaseDTO {

	private static final long serialVersionUID = -6313663343493250084L;

	/** 被叫手机号. */
	private String destaddr;

	/** 短信内容(NULL). */
	private String content;

	/** 批次号(NULL). */
	private Integer batchid;

	/** 备注(NULL). */
	private String bz;

	public String getDestaddr() {
		return destaddr;
	}

	public void setDestaddr( String destaddr ) {
		this.destaddr = destaddr;
	}

	public String getContent() {
		return content;
	}

	public void setContent( String content ) {
		this.content = content;
	}

	public Integer getBatchid() {
		return batchid;
	}

	public void setBatchid( Integer batchid ) {
		this.batchid = batchid;
	}

	public String getBz() {
		return bz;
	}

	public void setBz( String bz ) {
		this.bz = bz;
	}

}