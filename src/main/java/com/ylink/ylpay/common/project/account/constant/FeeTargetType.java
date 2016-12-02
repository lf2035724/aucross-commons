/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Iquil 2012-10-29
 */

package com.ylink.ylpay.common.project.account.constant;

/**
 * @author Iquil
 * @date 2012-10-29
 * @description：手续费收费对象
 */

public enum FeeTargetType {

	DEFAULT("0", "无"),
	PAYER("1", "付方收费"),
	PAYEE("2", "收方收费"),
	;

	private String value;
	private String displayName;

	public static FeeTargetType parseOf( String value ){
		for( FeeTargetType item:values() )
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

	FeeTargetType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
}
