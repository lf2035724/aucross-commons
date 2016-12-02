/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-10-29
 */

package com.ylink.ylpay.common.project.channel.exception;

import com.ylink.ylpay.common.core.exception.CodeCheckedException;

/** 
 * @author ZhangDM(Mingly)
 * @date 2012-10-29
 * @description：渠道系统对外接口异常
 */

public class ChannelCheckedException extends CodeCheckedException {

	private static final long serialVersionUID = 1L;
	
	public ChannelCheckedException() {
		super();
	}

	public ChannelCheckedException(String message, Throwable cause) {
		super(message, cause);
	}

	public ChannelCheckedException(String message) {
		super(message);
	}
	
	public ChannelCheckedException(String code, String message) {
		super(code, message);
	}

	public ChannelCheckedException(Throwable cause) {
		super(cause);
	}
}
