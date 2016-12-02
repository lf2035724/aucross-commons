/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:yu.han 2013-1-28
 */

package com.ylink.ylpay.common.project.pay.dto;

import com.ylink.ylpay.common.project.channel.constant.FundOrPayType;


/** 
 * @author yu.han
 * @date 2013-1-28
 * @description：基金网关充值DTO
 */

public class GatewayFundRechargeDTO extends GatewayRechargeDTO {

	private static final long serialVersionUID = 1L;
	
	/**充值银行卡卡号 */
	private String bankCardNo;
	/** 支付类型*/
	private FundOrPayType fundOrPayType;
	/**证件类型*/
	private String dType;        
	/**证件号码*/
	private String idNumber; 
	/** 银行卡主键ID--为门户传值*/
	private String bankCardId; 
	/**
	 * @return the bankCardNo
	 */
	public String getBankCardNo() {
		return bankCardNo;
	}
	/**
	 * @param bankCardNo the bankCardNo to set
	 */
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}
	/**
	 * @return the fundOrPayType
	 */
	public FundOrPayType getFundOrPayType() {
		return fundOrPayType;
	}
	/**
	 * @param fundOrPayType the fundOrPayType to set
	 */
	public void setFundOrPayType(FundOrPayType fundOrPayType) {
		this.fundOrPayType = fundOrPayType;
	}
	/**
	 * @return the dType
	 */
	public String getdType() {
		return dType;
	}
	/**
	 * @param dType the dType to set
	 */
	public void setdType(String dType) {
		this.dType = dType;
	}
	/**
	 * @return the idNumber
	 */
	public String getIdNumber() {
		return idNumber;
	}
	/**
	 * @param idNumber the idNumber to set
	 */
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	/**
	 * @return the bankCardId
	 */
	public String getBankCardId() {
		return bankCardId;
	}
	/**
	 * @param bankCardId the bankCardId to set
	 */
	public void setBankCardId(String bankCardId) {
		this.bankCardId = bankCardId;
	}
}
