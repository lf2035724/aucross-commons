/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-10-29
 */

package com.ylink.ylpay.common.project.order.exception;

import com.ylink.ylpay.common.core.exception.CodeCheckedException;

/** 
 * @author ZhangDM(Mingly)
 * @date 2012-10-29
 * @description：收单系统对外接口异常
 */

public class OrderCheckedException extends CodeCheckedException {

	private static final long serialVersionUID = 1L;
	
	public OrderCheckedException() {
		super();
	}

	public OrderCheckedException(String message, Throwable cause) {
		super(message, cause);
	}

	public OrderCheckedException(String message) {
		super(message);
	}

	public OrderCheckedException(Throwable cause) {
		super(cause);
	}
}
