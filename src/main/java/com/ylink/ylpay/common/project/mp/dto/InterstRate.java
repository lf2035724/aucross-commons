package com.ylink.ylpay.common.project.mp.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;
/**
 * 活期利率DTO
 * @author YangHan
 *
 */
public class InterstRate extends BaseDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 二级科目编号
	 */
	private String subjectCode;
	/**
	 * 活期利率 :单位(万分之一)
	 */
	private Integer rate;
	/**
	 * 生效时间
	 */
	private Date effectiveTime;
	public String getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}
	public Integer getRate() {
		return rate;
	}
	public void setRate(Integer rate) {
		this.rate = rate;
	}
	public Date getEffectiveTime() {
		return effectiveTime;
	}
	public void setEffectiveTime(Date effectiveTime) {
		this.effectiveTime = effectiveTime;
	}
	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "InterstRate [subjectCode=" + subjectCode + ", rate=" + rate
				+ ", effectiveTime=" + effectiveTime + "]";
	}
	
	
}
