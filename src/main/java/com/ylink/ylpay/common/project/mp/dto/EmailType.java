package com.ylink.ylpay.common.project.mp.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;


/**
 * 邮件服务器地址
 * @author XUWEI
 *
 */
public class EmailType extends BaseDTO{

	private static final long serialVersionUID = 3436657855661948781L;
	
	/**
	 * 邮件服务器名称
	 */
	private String serverName;
	
	/**
	 * 邮件服务器URL
	 */
	private String serverUrl;
	
	/**
	 * 备注
	 */
	private String description;

	//-- getters and setters --------------------------------------------------

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getServerUrl() {
		return serverUrl;
	}

	public void setServerUrl(String serverUrl) {
		this.serverUrl = serverUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
