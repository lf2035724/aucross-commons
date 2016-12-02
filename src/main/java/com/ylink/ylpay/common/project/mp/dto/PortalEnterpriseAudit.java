/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 */
package com.ylink.ylpay.common.project.mp.dto;

import java.util.List;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * 企业客户审核信息DTO
 * @author yanghan
 * @date 2013-4-12
 * @description
 */
public class PortalEnterpriseAudit extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3301154757080101831L;
	/**主键*/
	private String id;
	/**企业客户编号*/
	private String custId;
	/**审核状态(引用枚举:com.ylink.ylpay.common.project.mp.constant.AuditStatus)*/
	private String result;
	/**审核明细*/
	private List<PortalEnterpriseAuditDetail> details;
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
	 * @return the result
	 */
	public String getResult() {
		return result;
	}
	/**
	 * @param result the result to set
	 */
	public void setResult(String result) {
		this.result = result;
	}
	/**
	 * @return the details
	 */
	public List<PortalEnterpriseAuditDetail> getDetails() {
		return details;
	}
	/**
	 * @param details the details to set
	 */
	public void setDetails(List<PortalEnterpriseAuditDetail> details) {
		this.details = details;
	}
}
