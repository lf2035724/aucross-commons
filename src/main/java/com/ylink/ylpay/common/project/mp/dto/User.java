package com.ylink.ylpay.common.project.mp.dto;

import java.util.Calendar;

import com.ylink.ylpay.common.core.dto.BaseDTO;
import com.ylink.ylpay.common.project.mp.constant.UserType;

/**
 * 登录用户
 * 
 * @author YangXiaojin
 * 
 */
public class User extends BaseDTO {

	private static final long serialVersionUID = -3047419918827544823L;

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 登录名
	 */
	private String loginName;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 邮箱
	 */
	private String email;

	/**
	 * 手机号
	 */
	private String mobile;

	/**
	 * 是否有效
	 */
	private Boolean enabled;
	
	/**
	 * 状态
	 */
	private String status;
	
	/**
	 * 状态
	 */
	private String payPassword;

	/**
	 * 最近一次登录错误锁定时间
	 */
	private Calendar lastLoginLockTime;

	/** 客户. */
	private Customer customer;

	/** 客户类型. */
	private UserType userType;
	
	/** 客户号 */
	private String customerId;
	
	/**用户角色*/
	private String role;
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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

	public void setLoginName( String loginName ) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword( String password ) {
		this.password = password;
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

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled( Boolean enabled ) {
		this.enabled = enabled;
	}

	public Calendar getLastLoginLockTime() {
		return lastLoginLockTime;
	}

	public void setLastLoginLockTime( Calendar lastLoginLockTime ) {
		this.lastLoginLockTime = lastLoginLockTime;
	}

	public Long getId() {
		return id;
	}

	public void setId( Long id ) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer( Customer customer ) {
		this.customer = customer;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType( UserType userType ) {
		this.userType = userType;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getPayPassword() {
		return payPassword;
	}

	public void setPayPassword(String payPassword) {
		this.payPassword = payPassword;
	}
}