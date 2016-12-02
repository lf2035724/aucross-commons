package com.ylink.ylpay.common.project.portal.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/****
 * 性别
 * @author lyg
 *
 */
public enum MaritalStatus implements PersistentEnum<MaritalStatus, String> {

	

	T01( "01", "已婚" ),
	T02( "02", "未婚" )
	;

	private String value;
	private final String displayName;


	private static Map<String, MaritalStatus> valueMap = new HashMap<String, MaritalStatus>();

	static {
		for ( MaritalStatus _enum : MaritalStatus.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	MaritalStatus( String value, String displayName ) {
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
	public MaritalStatus getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, MaritalStatus> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	public static MaritalStatus returnEnum( String value ) {
		return valueMap.get( value );
	}

	

}