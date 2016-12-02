package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * 手机号归属区域.
 * 
 * @author 潘瑞峥
 * @date 2012-11-7
 */
public enum SmsMobileArea implements PersistentEnum<SmsMobileArea, String> {

	S1( "1", "省内" ),

	S2( "2", "省外" );

	private String value;
	private final String displayName;

	private static Map<String, SmsMobileArea> valueMap = new HashMap<String, SmsMobileArea>();

	static {
		for ( SmsMobileArea _enum : SmsMobileArea.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	SmsMobileArea( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	@Override
	public SmsMobileArea getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, SmsMobileArea> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	public static SmsMobileArea returnEnum( String value ) {
		return valueMap.get( value );
	}

}