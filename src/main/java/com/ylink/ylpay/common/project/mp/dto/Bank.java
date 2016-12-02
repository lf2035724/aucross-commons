/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 */
package com.ylink.ylpay.common.project.mp.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * @author yanghan
 * @date 2013-3-20上午10:58:04
 * @description：银行信息DTO
 */
public class Bank extends BaseDTO{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8556297599035566170L;

	public String bankCode;//银行行号
	
	public String bankName;//银行名称
	
	public String bankType;//银行行别
	
	public String geoCode;//二级所在地
	
	public String geoFristCode;//一级所在地
	
	public String geoName;//二级所在地名称（如没有二级取一级地名）

	/**
	 * @return the bankCode
	 */
	public String getBankCode() {
		return bankCode;
	}

	/**
	 * @param bankCode the bankCode to set
	 */
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**
	 * @return the bankType
	 */
	public String getBankType() {
		return bankType;
	}

	/**
	 * @param bankType the bankType to set
	 */
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	/**
	 * @return the geoCode
	 */
	public String getGeoCode() {
		return geoCode;
	}

	/**
	 * @param geoCode the geoCode to set
	 */
	public void setGeoCode(String geoCode) {
		this.geoCode = geoCode;
	}

	/**
	 * @return the geoFristCode
	 */
	public String getGeoFristCode() {
		return geoFristCode;
	}

	/**
	 * @param geoFristCode the geoFristCode to set
	 */
	public void setGeoFristCode(String geoFristCode) {
		this.geoFristCode = geoFristCode;
	}

	/**
	 * @return the geoName
	 */
	public String getGeoName() {
		return geoName;
	}

	/**
	 * @param geoName the geoName to set
	 */
	public void setGeoName(String geoName) {
		this.geoName = geoName;
	}
}
