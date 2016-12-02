/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Iquil 2013-2-26
 */

package com.ylink.ylpay.common.project.account.constant;


/** 
 * @author Iquil
 * @date 2013-2-26
 * @description：记账流水类型
 */

public enum AccountBillType {
	BOOK("0", "记账流水"), 
	REVERSE("1", "记账冲正流水"),
	;

	private String value;
	private String displayName;
	
	/**
	 * 枚举转换
	 */
	public static AccountBillType parseOf( String value ){
		for( AccountBillType item:values() )
			if( item.getValue().equals(value) )
				return item;
		
		throw new IllegalArgumentException("记账流水类型举值["+value+"]不匹配!");
	}

	public String getValue() {
		return this.value;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	AccountBillType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
}
