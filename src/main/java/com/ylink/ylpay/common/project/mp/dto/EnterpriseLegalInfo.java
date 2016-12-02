/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 */
package com.ylink.ylpay.common.project.mp.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * @author yanghan
 * @date 2013-4-13
 * @description：门户企业客户（法人信息）
 */
public class EnterpriseLegalInfo extends BaseDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1395357485426851313L;
	
	/**企业客户编号*/
	private String custId;
	/**法人归属地ID*/
	private String legalpersonGeoNo;
	/**法人归属地名称*/
	private String legalpersonName;
	/**法人证件类型 （枚举：com.ylink.ylpay.common.project.mp.constant.CertificationType）*/
	private String legalpersonCertType;
	/**法人证件号码*/
	private String legalpersonCertNo;
	/**法人手机号码*/
	private String legalpersonMobile;
	/**
	 * @return the custId
	 */
	public String getCustId() {
		return custId;
	}
	/**
	 * @param custId the custId to set
	 */
	public void setCustId(String custId) {
		this.custId = custId;
	}
	/**
	 * @return the legalpersonGeoNo
	 */
	public String getLegalpersonGeoNo() {
		return legalpersonGeoNo;
	}
	/**
	 * @param legalpersonGeoNo the legalpersonGeoNo to set
	 */
	public void setLegalpersonGeoNo(String legalpersonGeoNo) {
		this.legalpersonGeoNo = legalpersonGeoNo;
	}
	/**
	 * @return the legalpersonName
	 */
	public String getLegalpersonName() {
		return legalpersonName;
	}
	/**
	 * @param legalpersonName the legalpersonName to set
	 */
	public void setLegalpersonName(String legalpersonName) {
		this.legalpersonName = legalpersonName;
	}
	/**
	 * @return the legalpersonCertType
	 */
	public String getLegalpersonCertType() {
		return legalpersonCertType;
	}
	/**
	 * @param legalpersonCertType the legalpersonCertType to set
	 */
	public void setLegalpersonCertType(String legalpersonCertType) {
		this.legalpersonCertType = legalpersonCertType;
	}
	/**
	 * @return the legalpersonCertNo
	 */
	public String getLegalpersonCertNo() {
		return legalpersonCertNo;
	}
	/**
	 * @param legalpersonCertNo the legalpersonCertNo to set
	 */
	public void setLegalpersonCertNo(String legalpersonCertNo) {
		this.legalpersonCertNo = legalpersonCertNo;
	}
	/**
	 * @return the legalpersonMobile
	 */
	public String getLegalpersonMobile() {
		return legalpersonMobile;
	}
	/**
	 * @param legalpersonMobile the legalpersonMobile to set
	 */
	public void setLegalpersonMobile(String legalpersonMobile) {
		this.legalpersonMobile = legalpersonMobile;
	}
	
	
}
