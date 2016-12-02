/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 */
package com.ylink.ylpay.common.project.mp.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 *  企业客户审核明细信息DTO
 * @author yanghan
 * @date 2013-4-12
 * @description
 */
public class PortalEnterpriseAuditDetail extends BaseDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7455296947728999354L;
	/**主键*/
	private String id;
	/**错误类型（引用类型：com.ylink.ylpay.common.project.mp.constant.PortalEnterpriseAuditErrorType）*/
	private String type;
	/**是否通过*/
	private Boolean isPassed;
	/**描述*/
	private String description;
	/**是否修改*/
	private Boolean isModify;
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the isPassed
	 */
	public Boolean getIsPassed() {
		return isPassed;
	}

	/**
	 * @param isPassed the isPassed to set
	 */
	public void setIsPassed(Boolean isPassed) {
		this.isPassed = isPassed;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the isModify
	 */
	public Boolean getIsModify() {
		return isModify;
	}

	/**
	 * @param isModify the isModify to set
	 */
	public void setIsModify(Boolean isModify) {
		this.isModify = isModify;
	}
}
