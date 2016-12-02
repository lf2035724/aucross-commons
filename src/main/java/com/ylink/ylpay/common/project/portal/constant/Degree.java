package com.ylink.ylpay.common.project.portal.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/****
 * 性别
 * @author lyg
 *
 */
public enum Degree implements PersistentEnum<Degree, String> {

	

	T01( "01", "专科" ),
	T02( "02", "本科" )
	;

	private String value;
	private final String displayName;


	private static Map<String, Degree> valueMap = new HashMap<String, Degree>();

	static {
		for ( Degree _enum : Degree.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	Degree( String value, String displayName ) {
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
	public Degree getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, Degree> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	public static Degree returnEnum( String value ) {
		return valueMap.get( value );
	}

	

}