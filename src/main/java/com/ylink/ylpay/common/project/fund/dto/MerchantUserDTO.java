package com.ylink.ylpay.common.project.fund.dto;

import java.io.Serializable;

/**
 * 基金前置用户表
 * @author LiXiPing
 * @date 2013-11-23
 * @description：
 */
public class MerchantUserDTO implements Serializable {
	private static final long serialVersionUID = 7348179091968178637L;
	
	private String id;
	private String merchant_code;//用户名
	private String password;     //密码
	private String state;        //状态
	private String instuid_info; //授权商户
	
	
	/**
	 * @return the instuid_info
	 */
	public String getInstuid_info() {
		return instuid_info;
	}
	/**
	 * @param instuid_info the instuid_info to set
	 */
	public void setInstuid_info(String instuid_info) {
		this.instuid_info = instuid_info;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the merchant_code
	 */
	public String getMerchant_code() {
		return merchant_code;
	}
	/**
	 * @param merchant_code the merchant_code to set
	 */
	public void setMerchant_code(String merchant_code) {
		this.merchant_code = merchant_code;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
}
