/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-10-29
 */

package com.ylink.ylpay.common.project.settle.exception;

import com.ylink.ylpay.common.core.exception.CodeCheckedException;

/** 
 * @author ZhangDM(Mingly)
 * @date 2012-10-29
 * @description：结算系统对外接口异常
 */

public class SettleCheckedException extends CodeCheckedException {

	private static final long serialVersionUID = 1L;
	
	public SettleCheckedException() {
		super();
	}

	public SettleCheckedException(String message, Throwable cause) {
		super(message, cause);
	}

	public SettleCheckedException(String message) {
		super(message);
	}
	
	public SettleCheckedException(String code, String message) {
		super(code, message);
	}

	public SettleCheckedException(Throwable cause) {
		super(cause);
	}
}
