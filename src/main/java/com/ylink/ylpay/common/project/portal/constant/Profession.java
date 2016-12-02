package com.ylink.ylpay.common.project.portal.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/****
 * 性别
 * @author lyg
 *
 */
public enum Profession implements PersistentEnum<Profession, String> {

	

	T01( "01", "公务员" ),
	T02( "02", "IT民工" )
	;

	private String value;
	private final String displayName;


	private static Map<String, Profession> valueMap = new HashMap<String, Profession>();

	static {
		for ( Profession _enum : Profession.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	Profession( String value, String displayName ) {
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
	public Profession getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, Profession> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	public static Profession returnEnum( String value ) {
		return valueMap.get( value );
	}

	

}