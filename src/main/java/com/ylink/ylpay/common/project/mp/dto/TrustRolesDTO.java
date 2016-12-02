package com.ylink.ylpay.common.project.mp.dto;

import java.io.Serializable;

public class TrustRolesDTO implements Serializable {

	private static final long serialVersionUID = 880719774615027112L;
	
	private String identity;
	
	/**
	 * 客户ID
	 */
	private String customerId;
	
	/**
	 * 登录名
	 */
	private String loginName;
	
	/**
	 * 登录角色
	 */
	private String loginRole;
	
	/**
	 * 登录手机号
	 */
	private String loginMobile;
	
	/**
	 * 登录密码
	 */
	private String password;
	/**
	 * 支付密码
	 */
	private String payPassword;
	/**
	 * 创建时间
	 */
	private String createTime;
	/**
	 * 修改时间
	 */
	private String updateTime;
	/**
	 * 状态
	 */
	private String status;
	/**
	 * email
	 */
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginRole() {
		return loginRole;
	}
	public void setLoginRole(String loginRole) {
		this.loginRole = loginRole;
	}
	public String getLoginMobile() {
		return loginMobile;
	}
	public void setLoginMobile(String loginMobile) {
		this.loginMobile = loginMobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPayPassword() {
		return payPassword;
	}
	public void setPayPassword(String payPassword) {
		this.payPassword = payPassword;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
