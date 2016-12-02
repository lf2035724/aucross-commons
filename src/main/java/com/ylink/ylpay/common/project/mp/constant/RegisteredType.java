package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * 注册类型.
 * 
 * @author 潘瑞峥
 * @date 2012-11-6
 */
public enum RegisteredType implements PersistentEnum<RegisteredType, String> {

	GATEWAY( "GATEWAY", "网关" ),

	PROTAL( "PROTAL", "门户" ),
	
	OTCBB( "OTCBB", "交易所前置" ),

	MANAGER( "MANAGER", "管理平台" );

	private String value;
	private final String displayName;

	private static Map<String, RegisteredType> valueMap = new HashMap<String, RegisteredType>();

	static {
		for ( RegisteredType _enum : RegisteredType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	RegisteredType( String value, String displayName ) {
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
	public RegisteredType getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, RegisteredType> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	public static RegisteredType returnEnum( String value ) {
		return valueMap.get( value );
	}

	/**
	 * 枚举转换
	 */
	public static RegisteredType parseOf( String value ) {
		for ( RegisteredType item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "枚举值[" + value + "]不匹配!" );
	}

}