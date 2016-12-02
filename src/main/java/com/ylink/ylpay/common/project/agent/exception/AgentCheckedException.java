/**
 * SupplyChianCheckedException.java
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-9-29
 */
package com.ylink.ylpay.common.project.agent.exception;

import com.ylink.ylpay.common.core.exception.CodeCheckedException;

/** 
 * @author wanglei
 * @date 2013-9-29
 * @description：缴费对外接口异常
 */

public class AgentCheckedException extends CodeCheckedException {

	private static final long serialVersionUID = 1L;
	
	public AgentCheckedException() {
		super();
	}

	public AgentCheckedException(String message, Throwable cause) {
		super(message, cause);
	}

	public AgentCheckedException(String message) {
		super(message);
	}
	
	public AgentCheckedException(String code, String message) {
		super(code, message);
	}

	public AgentCheckedException(Throwable cause) {
		super(cause);
	}
}
