package com.ylink.ylpay.common.project.portal.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/****
 * 性别
 * @author lyg
 *
 */
public enum SexType implements PersistentEnum<SexType, String> {

	

	MALE( "male", "男" ),

	FEMALE( "female", "女")
	;

	private String value;
	private final String displayName;


	private static Map<String, SexType> valueMap = new HashMap<String, SexType>();

	static {
		for ( SexType _enum : SexType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	SexType( String value, String displayName ) {
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
	public SexType getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, SexType> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	public static SexType returnEnum( String value ) {
		return valueMap.get( value );
	}

	

}