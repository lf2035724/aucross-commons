/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Iquil 2012-10-30
 */

package com.ylink.ylpay.common.project.account.constant;

/** 
 * @author Iquil
 * @date 2012-10-30
 * @description：账务参数
 */

public enum ParamValue {
	
	ACCOUNTDATE("001", "账务日期"),
	LASTACCOUNTDATE("002", "上一账务日期"),
	FUNDNETNO("003", "基金扎差场次"),
	
	;
	
	private String value;
	private String displayName;
	
	public String getValue() {
		return this.value;
	}
	
	public String getDisplayName() {
		return this.displayName;
	}
	
	ParamValue(String value, String displayName){
		this.value = value ;
		this.displayName = displayName ;
	}
}
