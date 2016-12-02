/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-10-27
 */

package com.ylink.ylpay.common.core.dto;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * @author ZhangDM(Mingly)
 * @date 2012-10-27
 * @description：DTO基类
 */

public abstract class BaseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString( this, ToStringStyle.MULTI_LINE_STYLE );
	}
	
	private String respCode;//	应答码
	private String respDesc;//	业务应答描述

	/**
	 * @return the respCode
	 */
	public String getRespCode() {
		return respCode;
	}
	/**
	 * @param respCode the respCode to set
	 */
	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}
	/**
	 * @return the respDesc
	 */
	public String getRespDesc() {
		return respDesc;
	}
	/**
	 * @param respDesc the respDesc to set
	 */
	public void setRespDesc(String respDesc) {
		this.respDesc = respDesc;
	}

}