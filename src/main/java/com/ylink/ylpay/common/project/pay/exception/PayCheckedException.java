/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-10-29
 */

package com.ylink.ylpay.common.project.pay.exception;

import com.ylink.ylpay.common.core.exception.CodeCheckedException;

/** 
 * @author ZhangDM(Mingly)
 * @date 2012-10-29
 * @description：支付系统对外接口异常
 */

public class PayCheckedException extends CodeCheckedException {

	private static final long serialVersionUID = 1L;
	
	public PayCheckedException() {
		super();
	}

	public PayCheckedException(String message, Throwable cause) {
		super(message, cause);
	}

	public PayCheckedException(String message) {
		super(message);
	}
	
	public PayCheckedException(String code, String message) {
		super(code, message);
	}

	public PayCheckedException(Throwable cause) {
		super(cause);
	}
}
