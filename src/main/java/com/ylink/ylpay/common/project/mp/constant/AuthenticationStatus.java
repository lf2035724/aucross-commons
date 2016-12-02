package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * 认证状态.
 * 
 * @author 潘瑞峥
 * @date 2012-11-6
 */
public enum AuthenticationStatus implements PersistentEnum<AuthenticationStatus, String> {

	NEW( "NEW", "未认证" ),

	PASSED( "PASSED", "已认证通过" ),

	NOT_PASSED( "NOT_PASSED", "未认证通过" ),

	AUTHING( "AUTHING", "认证中" );

	private String value;
	private final String displayName;

	private static Map<String, AuthenticationStatus> valueMap = new HashMap<String, AuthenticationStatus>();

	static {
		for ( AuthenticationStatus _enum : AuthenticationStatus.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	AuthenticationStatus( String value, String displayName ) {
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
	public AuthenticationStatus getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, AuthenticationStatus> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	public static AuthenticationStatus returnEnum( String value ) {
		return valueMap.get( value );
	}

	/**
	 * 枚举转换
	 */
	public static AuthenticationStatus parseOf( String value ) {
		for ( AuthenticationStatus item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "枚举值[" + value + "]不匹配!" );
	}

}