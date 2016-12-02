/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-12-10
 */

package com.ylink.ylpay.common.core.exception;

/** 
 * @author ZhangDM(Mingly)
 * @date 2012-12-10
 * @description：代码运行异常
 */

public class CodeCheckedException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	private String code;
	
	public CodeCheckedException() {
		super();
	}

	public CodeCheckedException(String message, Throwable cause) {
		super(message, cause);
	}

	public CodeCheckedException(String message) {
		super(message);
	}
	
	public CodeCheckedException(String code, String message) {
		super(message);
		this.code = code;
	}

	public CodeCheckedException(Throwable cause) {
		super(cause);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
