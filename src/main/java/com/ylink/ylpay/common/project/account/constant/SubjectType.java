/**
 * 版权所有(C) 2012 证联融通
 * 创建:HuAJ 2012-11-19
 */

package com.ylink.ylpay.common.project.account.constant;

/** 
 * @author HuAJ
 * @date 2012-11-19
 * @description：科目类型
 */

public enum SubjectType {
	ASSET("1", "资产"), 
	DEBT("2", "负债"),
	EQUITY("3","权益"),
	INCOME("4","损益-收入"),
	OUTLAY("5","损益-支出");

	private String value;
	private String displayName;

	public String getValue() {
		return this.value;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	SubjectType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	/**
	 * 枚举转换
	 */
	public static SubjectType parseOf( String value ){
		for( SubjectType item:values() )
			if( item.getValue().equals(value) )
				return item;
		
		throw new IllegalArgumentException("枚举值["+value+"]不匹配!");
	}
	
}
