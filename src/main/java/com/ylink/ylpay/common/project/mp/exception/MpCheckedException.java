/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-10-29
 */

package com.ylink.ylpay.common.project.mp.exception;

import com.ylink.ylpay.common.core.exception.CodeCheckedException;
import com.ylink.ylpay.common.project.mp.constant.ErrorCode;

/**
 * 管理平台对外接口异常
 * @author YangXiaojin
 *
 */
public class MpCheckedException extends CodeCheckedException {

	private static final long serialVersionUID = 1L;
	
	public MpCheckedException() {
		super();
	}

	public MpCheckedException(String message, Throwable cause) {
		super(message, cause);
	}

	public MpCheckedException(String message) {
		super(message);
	}
	
	public MpCheckedException(String code, String message) {
		super(code,message);
	}
	
	public MpCheckedException(ErrorCode code, String message) {
		super(code.getValue(),message);
	}

	public MpCheckedException(Throwable cause) {
		super(cause);
	}
}
