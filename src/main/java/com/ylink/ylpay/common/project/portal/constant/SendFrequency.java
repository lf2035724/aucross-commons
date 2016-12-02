package com.ylink.ylpay.common.project.portal.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/****
 * 性别
 * @author lyg
 *
 */
public enum SendFrequency implements PersistentEnum<SendFrequency, String> {

	

	T01( "01", "不寄送" ),
	T02( "02", "寄送" )
	;

	private String value;
	private final String displayName;


	private static Map<String, SendFrequency> valueMap = new HashMap<String, SendFrequency>();

	static {
		for ( SendFrequency _enum : SendFrequency.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	SendFrequency( String value, String displayName ) {
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
	public SendFrequency getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, SendFrequency> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	public static SendFrequency returnEnum( String value ) {
		return valueMap.get( value );
	}

	

}