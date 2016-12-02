/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:HuAJ 2012-10-29
 */

package com.ylink.ylpay.common.project.account.exception;

import com.ylink.ylpay.common.core.exception.CodeCheckedException;

/** 
 * @author HuAJ
 * @date 2012-10-29
 * @description：账务系统对外接口异常
 */

public class AccountCheckedException extends CodeCheckedException {

	private static final long serialVersionUID = 1L;
	
	public AccountCheckedException() {
		super();
	}

	public AccountCheckedException(String message, Throwable cause) {
		super(message, cause);
	}

	public AccountCheckedException(String message) {
		super(message);
	}
	
	public AccountCheckedException(String code, String message) {
		super(code, message);
	}

	public AccountCheckedException(Throwable cause) {
		super(cause);
	}
}
