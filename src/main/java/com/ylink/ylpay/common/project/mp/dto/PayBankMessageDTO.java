/**
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-11-7
 */

/**
 * PayBankMessageDTO.java
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-11-7
 */
package com.ylink.ylpay.common.project.mp.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;
import com.ylink.ylpay.common.project.mp.constant.BankAccountType;

/** 
 * @author feng.li
 * @date 2013-11-7
 * @description：付款行信息传输对象
 */
public class PayBankMessageDTO extends BaseDTO{

	private static final long serialVersionUID = 7434870955281732326L;
	
	private String identity;
	
	private String id;
	
    /**
     * 收款行别
     */
	private String recevBankType;
	
	/**
	 * 业务类型
	 */
	private String optType;
	
    /**
     * 客户类型
     */
	private String userType;
	
	/**
	 * 付款行类型
	 */
	private String payBankType;
	
    /**
     * 渠道方
     */
	private String channelApply;
	
    /**
     * 
     */
	private String lineType;
	
    /**
     * 创建时间
     */
	private Date createdTime;
	
    /**
     * 更新时间
     */
	private Date updateDate;
	
    /**
     * 描述
     */
	private String description;
	
    /**
     * 支付订单类型
     */
	private String payerOrderType;
	
	//付款行账户类型
	private String payBankAccountType;
	//渠道方帐户类型
	private String applyBankAccountType;

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRecevBankType() {
		return recevBankType;
	}

	public void setRecevBankType(String recevBankType) {
		this.recevBankType = recevBankType;
	}

	public String getOptType() {
		return optType;
	}

	public void setOptType(String optType) {
		this.optType = optType;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getPayBankType() {
		return payBankType;
	}

	public void setPayBankType(String payBankType) {
		this.payBankType = payBankType;
	}

	public String getChannelApply() {
		return channelApply;
	}

	public void setChannelApply(String channelApply) {
		this.channelApply = channelApply;
	}

	public String getLineType() {
		return lineType;
	}

	public void setLineType(String lineType) {
		this.lineType = lineType;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPayerOrderType() {
		return payerOrderType;
	}

	public void setPayerOrderType(String payerOrderType) {
		this.payerOrderType = payerOrderType;
	}
	public String getPayBankAccountType() {
		return payBankAccountType;
	}

	public void setPayBankAccountType(String payBankAccountType) {
		this.payBankAccountType = payBankAccountType;
	}

	public String getApplyBankAccountType() {
		return applyBankAccountType;
	}

	public void setApplyBankAccountType(String applyBankAccountType) {
		this.applyBankAccountType = applyBankAccountType;
	}
	
	public boolean isTotalAccountConfig(){
		if(BankAccountType.FUND_TOTAL.getValue().equals(this.getPayBankAccountType())){
			return true;
		}
		return false;
	}
	
	public boolean isApplyTotalAccountConfig(){
		if( BankAccountType.FUND_TOTAL.getValue().equals(this.getApplyBankAccountType())){
			return true;
		}
		return false;
	}

}
