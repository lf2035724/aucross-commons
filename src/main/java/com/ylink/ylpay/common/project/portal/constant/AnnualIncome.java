package com.ylink.ylpay.common.project.portal.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/****
 * 性别
 * @author lyg
 *
 */
public enum AnnualIncome implements PersistentEnum<AnnualIncome, String> {

	

	T01( "01", "5万以下" ),
	T02( "02", "10万以下" )
	;

	private String value;
	private final String displayName;


	private static Map<String, AnnualIncome> valueMap = new HashMap<String, AnnualIncome>();

	static {
		for ( AnnualIncome _enum : AnnualIncome.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	AnnualIncome( String value, String displayName ) {
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
	public AnnualIncome getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, AnnualIncome> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	public static AnnualIncome returnEnum( String value ) {
		return valueMap.get( value );
	}

	

}