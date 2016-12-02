package com.ylink.ylpay.common.project.securitydeposit.dto;

import com.ylink.ylpay.common.project.channel.dto.AbstractDTO;

/**
 * @author wanglei
 * @date 2014-4-23
 * @description：保证金银证转账返回DTO
 */
public class SecurityDepositAccountTransferReturnDTO extends AbstractDTO{

	private static final long serialVersionUID = 3977905058927004372L;
	/**错误序号*/
	private String errorNo;
	/**错误信息*/
	private String errorInfo;
	/**委托编号*/
	private String entrustNo;
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
	public String getEntrustNo() {
		return entrustNo;
	}
	public void setEntrustNo(String entrustNo) {
		this.entrustNo = entrustNo;
	}
}
