/**
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-9-29
 */

/**
 * SystemMessageDTO.java
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-9-29
 */
package com.ylink.ylpay.common.project.supplychain.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author feng.li
 * @date 2013-9-29
 * @description：TODO
 */

/**
 * @author feng.li
 *
 */
public class SystemMessageDTO extends BaseDTO{

	private static final long serialVersionUID = 268929761302510662L;
	private String messageSeq;
	private String messageType;
	private String messageContent;
	private String senderCustId;
	private String senderCustName;
	private String receiveCustId;
	private String receiveCustName;
	private Date createDate;
	private String senderMessageStatus;
	private String receiveMessageStatus;
	
	public String getMessageSeq() {
		return messageSeq;
	}
	public void setMessageSeq(String messageSeq) {
		this.messageSeq = messageSeq;
	}
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public String getMessageContent() {
		return messageContent;
	}
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
	public String getSenderCustId() {
		return senderCustId;
	}
	public void setSenderCustId(String senderCustId) {
		this.senderCustId = senderCustId;
	}
	public String getSenderCustName() {
		return senderCustName;
	}
	public void setSenderCustName(String senderCustName) {
		this.senderCustName = senderCustName;
	}
	public String getReceiveCustId() {
		return receiveCustId;
	}
	public void setReceiveCustId(String receiveCustId) {
		this.receiveCustId = receiveCustId;
	}
	public String getReceiveCustName() {
		return receiveCustName;
	}
	public void setReceiveCustName(String receiveCustName) {
		this.receiveCustName = receiveCustName;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getSenderMessageStatus() {
		return senderMessageStatus;
	}
	public void setSenderMessageStatus(String senderMessageStatus) {
		this.senderMessageStatus = senderMessageStatus;
	}
	public String getReceiveMessageStatus() {
		return receiveMessageStatus;
	}
	public void setReceiveMessageStatus(String receiveMessageStatus) {
		this.receiveMessageStatus = receiveMessageStatus;
	}
}
