/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Iquil 2013-3-3
 */

package com.ylink.ylpay.common.project.pay.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author ZhangDM(Mingly)
 * @date 2013-3-3
 * @description：预记账接口返回实体类
 */

public class PreAccountBookReturnDTO extends BaseDTO {


	private static final long serialVersionUID = 1L;

	/**
	 * 记账金额
	 */
	private long amount;
	
	/**
	 * 借方科目
	 */
	private String drSubjectNo;

	/**
	 * 贷方科目
	 */
	private String crSubjectNo;
	
	/**
	 * 借方科目名称
	 */
	private String drSubjectName;

	/**
	 * 贷方科目名称
	 */
	private String crSubjectName;

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public String getDrSubjectNo() {
		return drSubjectNo;
	}

	public void setDrSubjectNo(String drSubjectNo) {
		this.drSubjectNo = drSubjectNo;
	}

	public String getCrSubjectNo() {
		return crSubjectNo;
	}

	public void setCrSubjectNo(String crSubjectNo) {
		this.crSubjectNo = crSubjectNo;
	}

	public String getDrSubjectName() {
		return drSubjectName;
	}

	public void setDrSubjectName(String drSubjectName) {
		this.drSubjectName = drSubjectName;
	}

	public String getCrSubjectName() {
		return crSubjectName;
	}

	public void setCrSubjectName(String crSubjectName) {
		this.crSubjectName = crSubjectName;
	}

}
