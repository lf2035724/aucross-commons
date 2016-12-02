/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-10-29
 */

package com.ylink.ylpay.common.project.notice.exception;

import com.ylink.ylpay.common.core.exception.CodeCheckedException;

/** 
 * @author ZhangDM(Mingly)
 * @date 2012-10-29
 * @description：信息服务系统对外接口异常
 */

public class NoticeCheckedException extends CodeCheckedException {

	private static final long serialVersionUID = 1L;
	
	public NoticeCheckedException() {
		super();
	}

	public NoticeCheckedException(String message, Throwable cause) {
		super(message, cause);
	}

	public NoticeCheckedException(String message) {
		super(message);
	}

	public NoticeCheckedException(Throwable cause) {
		super(cause);
	}
}
