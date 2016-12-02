/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建: Iquil 2012-10-30
 */

package com.ylink.ylpay.common.project.account.dto;

import java.io.Serializable;

/**
 * @author Iquil
 * @date 2012-10-30
 * @description：客户开户返回实体类
 */

public class RegAccountReturnDTO implements Serializable {

	private static final long serialVersionUID = 9136340837629611823L;

	private String subjectNo2;

	private String accountName;

	private String accountId;
	
	private String custId;

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getSubjectNo2() {
		return subjectNo2;
	}

	public void setSubjectNo2(String subjectNo2) {
		this.subjectNo2 = subjectNo2;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
}
