/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Iquil 2012-11-19
 */

package com.ylink.ylpay.common.project.account.constant;


/** 
 * @author Iquil
 * @date 2012-11-19
 * @description：记账接口来源
 */

public enum BookSource {
	PAY("0", "支付系统"), 
	MP("1", "管理系统"),
	;

	private String value;
	private String displayName;
	
	/**
	 * 枚举转换
	 */
	public static BookSource parseOf( String value ){
		for( BookSource item:values() )
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

	BookSource(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
}
