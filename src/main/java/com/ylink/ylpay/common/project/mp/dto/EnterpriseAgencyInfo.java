/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 */

package com.ylink.ylpay.common.project.mp.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * @author yanghan
 * @date 2013-4-13
 * @description：门户企业客户（代理人信息）
 */
public class EnterpriseAgencyInfo extends BaseDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8249053395263423934L;

	/**企业客户编号*/
	private String custId;
	/**代理人姓名*/
	private String agentName;
	/**代理人证件号码*/
	private String agentCertNo;
	/**代理人证件类型 (枚举:com.ylink.ylpay.common.project.mp.constant.CertificationType)*/
	private String agentCertType;
	/**代理人手机号码*/
	private String agentMobile;
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
	 * @return the agentName
	 */
	public String getAgentName() {
		return agentName;
	}
	/**
	 * @param agentName the agentName to set
	 */
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	/**
	 * @return the agentCertNo
	 */
	public String getAgentCertNo() {
		return agentCertNo;
	}
	/**
	 * @param agentCertNo the agentCertNo to set
	 */
	public void setAgentCertNo(String agentCertNo) {
		this.agentCertNo = agentCertNo;
	}
	/**
	 * @return the agentCertType
	 */
	public String getAgentCertType() {
		return agentCertType;
	}
	/**
	 * @param agentCertType the agentCertType to set
	 */
	public void setAgentCertType(String agentCertType) {
		this.agentCertType = agentCertType;
	}
	/**
	 * @return the agentMobile
	 */
	public String getAgentMobile() {
		return agentMobile;
	}
	/**
	 * @param agentMobile the agentMobile to set
	 */
	public void setAgentMobile(String agentMobile) {
		this.agentMobile = agentMobile;
	}
}
