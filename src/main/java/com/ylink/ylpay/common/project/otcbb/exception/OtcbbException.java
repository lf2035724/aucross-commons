/**
 * 版权所有(C) 2013 证联融通
 * 创建:jf.zhao 2013-5-13
 */
package com.ylink.ylpay.common.project.otcbb.exception;

import com.ylink.ylpay.common.core.exception.CodeCheckedException;

/**
 * @author jf.zhao
 * @date 2013-5-13
 * @description：交易所前置对外抛出异常
 */
public class OtcbbException extends CodeCheckedException {

	private static final long serialVersionUID = 1L;

	public OtcbbException() {
		super();
	}

	public OtcbbException(String message, Throwable cause) {
		super(message, cause);
	}

	public OtcbbException(String message) {
		super(message);
	}

	public OtcbbException(String code, String message) {
		super(code, message);
	}

	public OtcbbException(Throwable cause) {
		super(cause);
	}

}
