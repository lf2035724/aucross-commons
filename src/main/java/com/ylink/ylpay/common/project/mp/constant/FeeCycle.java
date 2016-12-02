package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * 计费规则.
 * 
 * @author 潘瑞峥
 * @date 2012-11-15
 */
public enum FeeCycle implements PersistentEnum<FeeCycle, String> {

	YEAR( "YEAR", "年" ),

	SEASON( "SEASON", "季" ),

	MONTH( "MONTH", "月" ),

	DAY( "DAY", "日" );

	private String value;
	private final String displayName;

	private static Map<String, FeeCycle> valueMap = new HashMap<String, FeeCycle>();

	static {
		for ( FeeCycle _enum : FeeCycle.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	FeeCycle( String value, String displayName ) {
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
	public FeeCycle getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, FeeCycle> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

}