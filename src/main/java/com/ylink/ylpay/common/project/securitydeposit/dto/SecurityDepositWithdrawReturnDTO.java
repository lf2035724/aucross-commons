package com.ylink.ylpay.common.project.securitydeposit.dto;

import com.ylink.ylpay.common.project.channel.dto.AbstractDTO;

/**
 * @author wanglei
 * @date 2014-4-14
 * @description：保证金提现返回DTO
 */
public class SecurityDepositWithdrawReturnDTO extends AbstractDTO{

	private static final long serialVersionUID = 747752674020336982L;
	/**错误序号*/
	private String errorNo;
	/**错误信息*/
	private String errorInfo;
	/**提现订单号*/
	private String withdrawNo;
	/**提现金额*/
	private String withdrawAmount;
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
	public String getWithdrawNo() {
		return withdrawNo;
	}
	public void setWithdrawNo(String withdrawNo) {
		this.withdrawNo = withdrawNo;
	}
	public String getWithdrawAmount() {
		return withdrawAmount;
	}
	public void setWithdrawAmount(String withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
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
