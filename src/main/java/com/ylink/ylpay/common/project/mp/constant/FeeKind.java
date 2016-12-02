package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * 计费类型.
 * 
 * @author 潘瑞峥
 * @date 2012-11-15
 */
public enum FeeKind implements PersistentEnum<FeeKind, String> {

	TIMES( "TIMES", "笔数" ),

	AMOUNT( "AMOUNT", "金额" );

	private String value;
	private final String displayName;

	private static Map<String, FeeKind> valueMap = new HashMap<String, FeeKind>();

	static {
		for ( FeeKind _enum : FeeKind.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	FeeKind( String value, String displayName ) {
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
	public FeeKind getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, FeeKind> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

}