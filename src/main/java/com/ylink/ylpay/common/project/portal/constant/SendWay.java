package com.ylink.ylpay.common.project.portal.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/****
 * 性别
 * @author lyg
 *
 */
public enum SendWay implements PersistentEnum<SendWay, String> {

	

	T01( "01", "电子邮寄" ),
	T02( "02", "短信通知" )
	;

	private String value;
	private final String displayName;


	private static Map<String, SendWay> valueMap = new HashMap<String, SendWay>();

	static {
		for ( SendWay _enum : SendWay.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	SendWay( String value, String displayName ) {
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
	public SendWay getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, SendWay> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	public static SendWay returnEnum( String value ) {
		return valueMap.get( value );
	}

	

}