/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 */

package com.ylink.ylpay.common.project.mp.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * @author YangXiaojin
 * @date 2012-10-29
 * @description：通用返回结果
 */
public class Result extends BaseDTO {

	private static final long serialVersionUID = 1239389350768197589L;

	/**
	 * 返回结果
	 */
	private boolean success;

	/**
	 * 返回消息
	 */
	private String message;

	public Result() {
	}

	public Result( boolean success, String message ) {
		super();
		this.success = success;
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess( boolean success ) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage( String message ) {
		this.message = message;
	}

}
