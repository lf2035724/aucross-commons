/**
 * 版权所有(C) 2014 证联融通电子有限公司
 * 创建:feng.li 2014-5-8
 */

/**
 * LicensedType.java
 * 版权所有(C) 2014 证联融通电子有限公司
 * 创建:feng.li 2014-5-8
 */
package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

/** 
 * @author feng.li
 * @date 2014-5-8
 * @description：TODO
 */

/**
 * @author feng.li
 *
 */
public enum LicensedType {
	
	PWD_AUTH("0","验证密码"),
	SECOND_AUTH("1","二次授权")
	;
	private String value;
	private String displayName;
	
	private static Map<String, LicensedType> valueMap = new HashMap<String, LicensedType>();
	
	static {
		for ( LicensedType _enum : LicensedType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}
	
	LicensedType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}
	
	public String getValue() {
		return this.value;
	}
	public String getDisplayName() {
		return this.displayName;
	}
	
	public LicensedType getEnum( String value ) {
		return valueMap.get( value );
	}

	public Map<String, LicensedType> getAllValueMap() {
		return valueMap;
	}
	
	public static LicensedType parseOf( String value ) {
		for ( LicensedType item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "枚举值[" + value + "]不匹配!" );
	}
}
