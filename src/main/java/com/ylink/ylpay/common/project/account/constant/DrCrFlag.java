/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Iquil 2012-10-29
 */

package com.ylink.ylpay.common.project.account.constant;


/**
 * @author Iquil
 * @date 2012-10-29
 * @description：借贷
 */

public enum DrCrFlag {

	DR("DR", "借"), 
	CR("CR", "贷"),
	;

	private String value;
	private String displayName;
	
	/**
	 * 枚举转换
	 */
	public static DrCrFlag parseOf( String value ){
		for( DrCrFlag item:values() )
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

	DrCrFlag(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
}
