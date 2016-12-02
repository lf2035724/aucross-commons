package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * 人工找回密码, 需找回的项目类型.
 * 
 * @author 潘瑞峥
 * @date 2013-1-4
 */
public enum RecoveryType implements PersistentEnum<RecoveryType, String> {

	LOGIN( "1", "登录密码" ),

	PAY( "2", "支付密码" ),

	LOGIN_PAY( "3", "登录密码和支付密码" );

	private String value;
	private final String displayName;

	private static Map<String, RecoveryType> valueMap = new HashMap<String, RecoveryType>();

	static {
		for ( RecoveryType _enum : RecoveryType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	RecoveryType( String value, String displayName ) {
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
	public RecoveryType getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, RecoveryType> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

}