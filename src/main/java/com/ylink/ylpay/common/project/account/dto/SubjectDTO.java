/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Iquil 2012-10-31
 */

package com.ylink.ylpay.common.project.account.dto;

import java.util.List;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author Iquil
 * @date 2012-10-31
 * @description：t_subject表的实体类
 */

public class SubjectDTO extends BaseDTO {
	
	private static final long serialVersionUID = -3888949318093356093L;

	/**
	 * 科目编号
	 */
	private String subjectNo;
	
	/**
	 * 科目名称
	 */
	private String subjectName;
	
	/**
	 * 科目类型：1资产；2负债3；权益；4损益-收入；5损益-支出
	 */
	private String subjectType;
	
	/**
	 * 借贷方向：借DR ；贷CR
	 */
	private String drCrFlag;
	
	/**
	 * 1一级科目；2二级科目
	 */
	private String subjectLevel;
	
	/**
	 * 0叶子科目；1非叶子科目
	 */
	private String isLeaf;
	
	/**
	 * 备注
	 */
	private String remark;
	
	/**
	 * 上级科目
	 */
	private String parentSubject;
	
	private String isInterest;
	
	/**
	 * 子科目
	 */
	private List<SubjectDTO> childrenList;

	public String getSubjectNo() {
		return subjectNo;
	}

	public void setSubjectNo(String subjectNo) {
		this.subjectNo = subjectNo;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectType() {
		return subjectType;
	}

	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}

	public String getDrCrFlag() {
		return drCrFlag;
	}

	public void setDrCrFlag(String drCrFlag) {
		this.drCrFlag = drCrFlag;
	}

	public String getSubjectLevel() {
		return subjectLevel;
	}

	public void setSubjectLevel(String subjectLevel) {
		this.subjectLevel = subjectLevel;
	}

	public String getIsLeaf() {
		return isLeaf;
	}

	public void setIsLeaf(String isLeaf) {
		this.isLeaf = isLeaf;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getParentSubject() {
		return parentSubject;
	}

	public void setParentSubject(String parentSubject) {
		this.parentSubject = parentSubject;
	}

	public String getIsInterest() {
		return isInterest;
	}

	public void setIsInterest(String isInterest) {
		this.isInterest = isInterest;
	}

	public List<SubjectDTO> getChildrenList() {
		return childrenList;
	}

	public void setChildrenList(List<SubjectDTO> childrenList) {
		this.childrenList = childrenList;
	}

}
