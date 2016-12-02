/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Iquil 2012-11-19
 */

package com.ylink.ylpay.common.project.account.constant;


/** 
 * @author Iquil
 * @date 2012-11-19
 * @description：记账接口状态
 */

public enum AccountBookState {
	VALID("00", "已记账"), 
	REVERSE("01", "已冲正"),
	;

	private String value;
	private String displayName;
	
	/**
	 * 枚举转换
	 */
	public static AccountBookState parseOf( String value ){
		for( AccountBookState item:values() )
			if( item.getValue().equals(value) )
				return item;
		
		throw new IllegalArgumentException("枚举值["+value+"]不匹配!");
	}

	public String getValue() {
		return this.value;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	AccountBookState(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
}
