/**
 * 版权所有(C) 2013 证联融通
 * 创建:jf.zhao 2013-5-28
 */
package com.ylink.ylpay.common.project.otcbb.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * @author jf.zhao
 * @date 2013-5-28
 * @description：
 */
public class WorkDateDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3063158313849187301L;
	/**
	 * 当前账务日期
	 */
	private String workDate;
	/**
	 * 上一账务日期
	 */
	private String lastWorkDate;
	
	/**
	 * 更新日期
	 */
	private Date updateTime;
	
	/**
	 * 开闭市状态
	 */
	private String loginStatus;

	public String getWorkDate() {
		return workDate;
	}

	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}

	public String getLastWorkDate() {
		return lastWorkDate;
	}

	public void setLastWorkDate(String lastWorkDate) {
		this.lastWorkDate = lastWorkDate;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}


}
