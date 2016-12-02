/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 */

package com.ylink.ylpay.common.project.mp.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author YangXiaojin
 * @date 2012-12-10
 * @description：TODO
 */

public class Param extends BaseDTO{

	private static final long serialVersionUID = -3276159748184604385L;
	
	/**
	 * 组名
	 */
	private String group;
	
	/**
	 * 参数名
	 */
	private String name;
	
	/**
	 * 参数值
	 */
	private String value;
	
	/**
	 * 是否有效
	 */
	private Boolean enabled;

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

}
