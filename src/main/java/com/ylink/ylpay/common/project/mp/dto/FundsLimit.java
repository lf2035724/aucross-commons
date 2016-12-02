/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 */

package com.ylink.ylpay.common.project.mp.dto;

import com.ylink.ylpay.common.project.account.constant.CustSubject;
import com.ylink.ylpay.common.project.mp.constant.OptType;

/** 
 * @author YangXiaojin
 * @date 2012-11-1
 * @description：客户资金限额
 */

public class FundsLimit {
	
	/**
	 * 客户号
	 */
	private String custId;
	
	/**
	 * 帐户类型
	 */
	private CustSubject custSubjet;
	
	/**
	 * 交易类型
	 */
	private OptType optType;
	
	/**
	 * 单笔警告额（单位：分）
	 */
	private Long singleWarn;
	
	/**
	 * 单笔限额（单位：分）
	 */
	private Long singleLimit;
	
	/**
	 * 每天累计警告额（单位：分）
	 */
	private Long dayWarn;
	
	/**
	 * 每天累计限额（单位：分）
	 */
	private Long dayLimit;

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public CustSubject getCustSubjet() {
		return custSubjet;
	}

	public void setCustSubjet(CustSubject custSubjet) {
		this.custSubjet = custSubjet;
	}

	public OptType getOptType() {
		return optType;
	}

	public void setOptType(OptType optType) {
		this.optType = optType;
	}

	public Long getSingleWarn() {
		return singleWarn;
	}

	public void setSingleWarn(Long singleWarn) {
		this.singleWarn = singleWarn;
	}

	public Long getSingleLimit() {
		return singleLimit;
	}

	public void setSingleLimit(Long singleLimit) {
		this.singleLimit = singleLimit;
	}

	public Long getDayWarn() {
		return dayWarn;
	}

	public void setDayWarn(Long dayWarn) {
		this.dayWarn = dayWarn;
	}

	public Long getDayLimit() {
		return dayLimit;
	}

	public void setDayLimit(Long dayLimit) {
		this.dayLimit = dayLimit;
	}

}
