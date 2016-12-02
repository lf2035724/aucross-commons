/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-10-29
 */

package com.ylink.ylpay.common.project.securitydeposit.exception;

import com.ylink.ylpay.common.core.exception.CodeCheckedException;

/**
 * @author wanglei
 * @date 2014-4-11
 * @description：保证金对外接口异常
 */
public class SecurityDepositCheckedException extends CodeCheckedException {

	private static final long serialVersionUID = 1L;
	
	public SecurityDepositCheckedException() {
		super();
	}

	public SecurityDepositCheckedException(String message, Throwable cause) {
		super(message, cause);
	}

	public SecurityDepositCheckedException(String message) {
		super(message);
	}
	
	public SecurityDepositCheckedException(String code, String message) {
		super(code, message);
	}

	public SecurityDepositCheckedException(Throwable cause) {
		super(cause);
	}
}
