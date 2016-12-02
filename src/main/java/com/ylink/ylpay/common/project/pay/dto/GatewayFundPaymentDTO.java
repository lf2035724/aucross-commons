/**
 * GatewayPaymentDTO.java
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司 
 * 创建:yu.hanyu 2013-1-30
 */
package com.ylink.ylpay.common.project.pay.dto;

import com.ylink.ylpay.common.project.channel.constant.FundOrPayType;

/** 
 * @author yu.han
 * @date 2013-1-30
 * @description：基金网关支付DTO
 */
public class GatewayFundPaymentDTO extends GatewayPaymentDTO {
    
    private static final long serialVersionUID = 1L;
    /** 基金支付类型*/
  	private FundOrPayType fundOrPayType;
  	/**证件类型*/
  	private String dType;        
  	/**证件号码*/
  	private String idNumber; 
  	/** 银行卡主键ID--为门户传值*/
  	private String bankCardId;
  	
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
