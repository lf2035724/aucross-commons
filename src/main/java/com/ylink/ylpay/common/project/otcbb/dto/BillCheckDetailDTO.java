/**
 * 版权所有(C) 2013 证联融通
 * 创建:jf.zhao 2013-5-29
 */
package com.ylink.ylpay.common.project.otcbb.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * @author jf.zhao
 * @date 2013-5-29
 * @description：对账明细 DTO
 */
public class BillCheckDetailDTO extends BaseDTO {

	private static final long serialVersionUID = -2020958551012847782L;
	/**
	 * 明细id
	 */
	private String id;
	/**
	 * 主表id
	 */
	private String checkId;
	private String bizNo;// 业务流水号
	/**
	 * 客户号
	 */
	private String custId;
	/**
	 * 银行类别
	 */
	private String bankType;
	/**
	 * 帐号名称
	 */
	private String cardName;
	/**
	 * 帐号
	 */
	private String cardNo;
	/**
	 * 金额
	 */
	private Long amount;
	/**
	 * 业务类别
	 */
	private String bizType;
	private String type;
	private String status;
	private String reqDate;
	private String callBackDate;
	private Date createTime;//
	private String description;// DESCRIPTION
	private String userNameText;// USER_NAME_TEXT
	private String reconStatus;// RECON_STATUS;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCheckId() {
		return checkId;
	}

	public void setCheckId(String checkId) {
		this.checkId = checkId;
	}

	public String getBizNo() {
		return bizNo;
	}

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getBizType() {
		return bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReqDate() {
		return reqDate;
	}

	public void setReqDate(String reqDate) {
		this.reqDate = reqDate;
	}

	public String getCallBackDate() {
		return callBackDate;
	}

	public void setCallBackDate(String callBackDate) {
		this.callBackDate = callBackDate;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUserNameText() {
		return userNameText;
	}

	public void setUserNameText(String userNameText) {
		this.userNameText = userNameText;
	}

	public String getReconStatus() {
		return reconStatus;
	}

	public void setReconStatus(String reconStatus) {
		this.reconStatus = reconStatus;
	}
}
