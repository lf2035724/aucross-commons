package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * 是或否状态.
 * 
 * @author 潘瑞峥
 * @date 2013-1-4
 */
public enum WhetherStatus implements PersistentEnum<WhetherStatus, String> {

	NO( "0", "否" ),

	YES( "1", "是" );

	private String value;
	private final String displayName;

	private static Map<String, WhetherStatus> valueMap = new HashMap<String, WhetherStatus>();

	static {
		for ( WhetherStatus _enum : WhetherStatus.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	WhetherStatus( String value, String displayName ) {
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
	public WhetherStatus getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, WhetherStatus> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

}