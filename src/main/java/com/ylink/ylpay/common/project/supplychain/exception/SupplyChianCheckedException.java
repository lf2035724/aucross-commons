/**
 * SupplyChianCheckedException.java
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-9-4
 */
package com.ylink.ylpay.common.project.supplychain.exception;

import com.ylink.ylpay.common.core.exception.CodeCheckedException;

/** 
 * @author feng.li
 * @date 2013-9-4
 * @description：供应链系统对外接口异常
 */

public class SupplyChianCheckedException extends CodeCheckedException {

	private static final long serialVersionUID = 1L;
	
	public SupplyChianCheckedException() {
		super();
	}

	public SupplyChianCheckedException(String message, Throwable cause) {
		super(message, cause);
	}

	public SupplyChianCheckedException(String message) {
		super(message);
	}
	
	public SupplyChianCheckedException(String code, String message) {
		super(code, message);
	}

	public SupplyChianCheckedException(Throwable cause) {
		super(cause);
	}
}
