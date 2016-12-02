package com.ylink.ylpay.common.project.securitydeposit.dto;

import com.ylink.ylpay.common.project.channel.dto.AbstractDTO;

/**
 * @author wanglei
 * @date 2014-4-15
 * @description：保证金支付状态查询返回DTO
 */
public class SecurityDepositQueryPayStateReturnDTO extends AbstractDTO{

	private static final long serialVersionUID = 7748656531515044960L;
	/**错误序号*/
	private String errorNo;
	/**错误信息*/
	private String errorInfo;
	/**原商户订单日期*/
	private String preBusiDate;
	/**原商户订单号*/
	private String preBusiNo;
	/**业务类型*/
	private String busiType;
	/**订单交易代码（保证金支付对应pay_status、余额提现到保证金对应withdraw_status）*/
	private String busiRespCode;
	/**订单交易明细描述*/
	private String busiRespDesc;
	/**订单金额*/
	private String busiAmount;
	/**消费记录号，资金支付平台生成*/
	private String batchNo;
	/**交易凭证号，华创柜台生成*/
	private String voucherNo;
	public String getErrorNo() {
		return errorNo;
	}
	public void setErrorNo(String errorNo) {
		this.errorNo = errorNo;
	}
	public String getErrorInfo() {
		return errorInfo;
	}
	public void setErrorInfo(String errorInfo) {
		this.errorInfo = errorInfo;
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
	public String getBusiRespCode() {
		return busiRespCode;
	}
	public void setBusiRespCode(String busiRespCode) {
		this.busiRespCode = busiRespCode;
	}
	public String getBusiRespDesc() {
		return busiRespDesc;
	}
	public void setBusiRespDesc(String busiRespDesc) {
		this.busiRespDesc = busiRespDesc;
	}
	public String getBusiAmount() {
		return busiAmount;
	}
	public void setBusiAmount(String busiAmount) {
		this.busiAmount = busiAmount;
	}
	public String getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getVoucherNo() {
		return voucherNo;
	}
	public void setVoucherNo(String voucherNo) {
		this.voucherNo = voucherNo;
	}
}
