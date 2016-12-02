/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 */
package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yanghan
 * @date 2013-7-9
 */
public enum CurrencyType {
	RMB("001","人民币");
	;
	private String value;
	private String displayName;
	
	private static Map<String, CurrencyType> valueMap = new HashMap<String, CurrencyType>();

	static {
		for ( CurrencyType _enum : CurrencyType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}
	/**
	 * 
	 */
	CurrencyType(String value,String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
	
	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public CurrencyType getEnum( String value ) {
		return valueMap.get( value );
	}

	public static CurrencyType returnEnum( String value ) {
		return valueMap.get( value );
	}

	public Map<String, CurrencyType> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	/**
	 * 枚举转换
	 */
	public static CurrencyType parseOf( String value ) {
		for ( CurrencyType item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "枚举值[" + value + "]不匹配!" );
	}
}
