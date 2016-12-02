/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Iquil 2012-10-31
 */

package com.ylink.ylpay.common.project.account.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author Iquil
 * @date 2012-10-31
 * @description：t_account_param表的实体类
 */

public class AccountParamDTO extends BaseDTO {
	
	private static final long serialVersionUID = -3146156521059039976L;

	/**
	 * 参数编码
	 */
	private String id;
	
	/**
	 * 参数值
	 */
	private String value;
	
	/**
	 * 参数名称
	 */
	private String name;
	
	/**
	 * 更新时间
	 */
	private String updateTime;
	
	/**
	 * 备注
	 */
	private String remark;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
