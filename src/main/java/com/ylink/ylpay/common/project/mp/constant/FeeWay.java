package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * 计费方式.
 * 
 * @author 潘瑞峥
 * @date 2012-11-15
 */
public enum FeeWay implements PersistentEnum<FeeWay, String> {

	BEFORE( "BEFORE", "事前" ),

	AFTER( "AFTER", "事后" );

	private String value;
	private final String displayName;

	private static Map<String, FeeWay> valueMap = new HashMap<String, FeeWay>();

	static {
		for ( FeeWay _enum : FeeWay.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	FeeWay( String value, String displayName ) {
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
	public FeeWay getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, FeeWay> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

}