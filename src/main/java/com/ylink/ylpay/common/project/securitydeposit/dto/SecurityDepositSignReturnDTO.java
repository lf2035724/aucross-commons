package com.ylink.ylpay.common.project.securitydeposit.dto;

import com.ylink.ylpay.common.project.channel.dto.AbstractDTO;

/**
 * @author wanglei
 * @date 2014-4-11
 * @description：保证金签约返回DTO
 */
public class SecurityDepositSignReturnDTO extends AbstractDTO{

	private static final long serialVersionUID = -8015015974426393682L;
	
	/**错误序号*/
	private String errorNo;
	/**错误信息*/
	private String errorInfo;
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
}
