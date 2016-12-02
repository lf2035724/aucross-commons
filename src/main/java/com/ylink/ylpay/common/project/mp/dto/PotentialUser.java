package com.ylink.ylpay.common.project.mp.dto;

import java.util.Calendar;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * 潜在客户信息
 * 
 * @author 潘瑞峥
 * @date 2012-10-29
 */
public class PotentialUser extends BaseDTO {

	private static final long serialVersionUID = -2322778490672846915L;

	/** ID */
	private String id;

	/** 邮箱 */
	private String email;

	/** 手机 */
	private String mobile;

	/** 状态 */
	private String status;

	/** 创建日期 */
	private Calendar createdTime;

	public String getId() {
		return id;
	}

	public void setId( String id ) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail( String email ) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile( String mobile ) {
		this.mobile = mobile;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus( String status ) {
		this.status = status;
	}

	public Calendar getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime( Calendar createdTime ) {
		this.createdTime = createdTime;
	}

}