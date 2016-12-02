package com.ylink.ylpay.common.project.securitydeposit.dto;

import com.ylink.ylpay.common.project.channel.dto.AbstractDTO;

/**
 * @author wanglei
 * @date 2014-4-15
 * @description：保证金支付状态查询DTO
 */
public class SecurityDepositQueryPayStateDTO extends AbstractDTO{

	private static final long serialVersionUID = -2763534409769381182L;
	/**证券公司代码*/
	private String bankCode;
	/**接入商户号*/
	private String merchantNo;
	/**原商户订单日期*/
	private String preBusiDate;
	/**原商户订单号*/
	private String preBusiNo;
	/**业务类型*/
	private String busiType;
	/**备注*/
	private String remark;
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getMerchantNo() {
		return merchantNo;
	}
	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}
	public String getPreBusiDate() {
		return preBusiDate;
	}
	public void setPreBusiDate(String preBusiDate) {
		this.preBusiDate = preBusiDate;
	}
	public String getPreBusiNo() {
		return preBusiNo;
	}
	public void setPreBusiNo(String preBusiNo) {
		this.preBusiNo = preBusiNo;
	}
	public String getBusiType() {
		return busiType;
	}
	public void setBusiType(String busiType) {
		this.busiType = busiType;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
