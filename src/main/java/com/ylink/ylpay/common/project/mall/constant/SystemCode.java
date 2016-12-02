package com.ylink.ylpay.common.project.mall.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * 前置编码
 * 
 * @author 潘瑞峥
 * @date 2012-11-1
 */
public enum SystemCode implements PersistentEnum<SystemCode, String> {

	FUND( "FUND", "基金前置" ),

	WINE( "WINE", "白酒前置"),

	MALL( "MALL", "商城前置"),
	
	AGENT( "AGENT", "缴费前置"),

	OTHER( "OTHER", "其它");

	private String value;
	private final String displayName;

	private static Map<String, SystemCode> valueMap = new HashMap<String, SystemCode>();

	static {
		for ( SystemCode _enum : SystemCode.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	SystemCode( String value, String displayName ) {
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
	public SystemCode getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, SystemCode> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	/**
	 * 枚举转换
	 */
	public static SystemCode parseOf( String value ) {
		for ( SystemCode item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "枚举值[" + value + "]不匹配!" );
	}

}