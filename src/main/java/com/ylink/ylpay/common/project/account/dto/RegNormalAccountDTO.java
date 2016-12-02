/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Iquil 2013-2-21
 */

package com.ylink.ylpay.common.project.account.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author Iquil
 * @date 2013-2-21
 * @description：普通账户DTO
 */

public class RegNormalAccountDTO extends BaseDTO {

	private static final long serialVersionUID = 1L;
	
	private String custId;
	private String accountName;
	private String subjectNo2;
	private long initAmount;
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getSubjectNo2() {
		return subjectNo2;
	}
	public void setSubjectNo2(String subjectNo2) {
		this.subjectNo2 = subjectNo2;
	}
	public long getInitAmount() {
		return initAmount;
	}
	public void setInitAmount(long initAmount) {
		this.initAmount = initAmount;
	}
		
}
