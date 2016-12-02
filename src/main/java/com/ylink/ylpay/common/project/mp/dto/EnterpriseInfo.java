/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 */
package com.ylink.ylpay.common.project.mp.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * @author yanghan
 * @date 2013-4-13
 * @description：门户企业客户（企业信息）
 */
public class EnterpriseInfo extends BaseDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4583192666579056112L;
	
	/**企业客户ID*/
	private String custId;
	/**企业客户名称*/
	private String name;
	/**营业执照注册号*/
	private String licenseNo;
	/**营业执照所在地ID*/
	private String licenseGeoNo;
	/**营业执照期限*/
	private String licenseLegalValidTerm;
	/**营业执照是否长期（枚举：com.ylink.ylpay.common.project.mp.constant.WhetherStatus ）*/
	private String licenseIsLongterm;
	/**营业执照住所*/
	private String licenseResidence;
	/**营业执照范围*/
	private String licenseLegalScope;
	/**营业执照注册资本*/
	private String licenseRegCapital;
	/**组织机构号*/
	private String orgNo;
	/**联系电话*/
	private String phone;
	/**传真*/
	private String fax;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the licenseNo
	 */
	public String getLicenseNo() {
		return licenseNo;
	}
	/**
	 * @param licenseNo the licenseNo to set
	 */
	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}
	/**
	 * @return the licenseGeoNo
	 */
	public String getLicenseGeoNo() {
		return licenseGeoNo;
	}
	/**
	 * @param licenseGeoNo the licenseGeoNo to set
	 */
	public void setLicenseGeoNo(String licenseGeoNo) {
		this.licenseGeoNo = licenseGeoNo;
	}
	/**
	 * @return the licenseLegalValidTerm
	 */
	public String getLicenseLegalValidTerm() {
		return licenseLegalValidTerm;
	}
	/**
	 * @param licenseLegalValidTerm the licenseLegalValidTerm to set
	 */
	public void setLicenseLegalValidTerm(String licenseLegalValidTerm) {
		this.licenseLegalValidTerm = licenseLegalValidTerm;
	}
	/**
	 * @return the licenseIsLongterm
	 */
	public String getLicenseIsLongterm() {
		return licenseIsLongterm;
	}
	/**
	 * @param licenseIsLongterm the licenseIsLongterm to set
	 */
	public void setLicenseIsLongterm(String licenseIsLongterm) {
		this.licenseIsLongterm = licenseIsLongterm;
	}
	/**
	 * @return the licenseResidence
	 */
	public String getLicenseResidence() {
		return licenseResidence;
	}
	/**
	 * @param licenseResidence the licenseResidence to set
	 */
	public void setLicenseResidence(String licenseResidence) {
		this.licenseResidence = licenseResidence;
	}
	/**
	 * @return the licenseLegalScope
	 */
	public String getLicenseLegalScope() {
		return licenseLegalScope;
	}
	/**
	 * @param licenseLegalScope the licenseLegalScope to set
	 */
	public void setLicenseLegalScope(String licenseLegalScope) {
		this.licenseLegalScope = licenseLegalScope;
	}
	/**
	 * @return the licenseRegCapital
	 */
	public String getLicenseRegCapital() {
		return licenseRegCapital;
	}
	/**
	 * @param licenseRegCapital the licenseRegCapital to set
	 */
	public void setLicenseRegCapital(String licenseRegCapital) {
		this.licenseRegCapital = licenseRegCapital;
	}
	/**
	 * @return the orgNo
	 */
	public String getOrgNo() {
		return orgNo;
	}
	/**
	 * @param orgNo the orgNo to set
	 */
	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the fax
	 */
	public String getFax() {
		return fax;
	}
	/**
	 * @param fax the fax to set
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}
	
	
}
