package com.ylink.ylpay.common.project.portal.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/****
 * 性别
 * @author lyg
 *
 */
public enum InvestmentExp implements PersistentEnum<InvestmentExp, String> {

	

	T01( "01", "有丰富投资经验" ),
	T02( "02", "没有投资经验" )
	;

	private String value;
	private final String displayName;


	private static Map<String, InvestmentExp> valueMap = new HashMap<String, InvestmentExp>();

	static {
		for ( InvestmentExp _enum : InvestmentExp.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	InvestmentExp( String value, String displayName ) {
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
	public InvestmentExp getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, InvestmentExp> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	public static InvestmentExp returnEnum( String value ) {
		return valueMap.get( value );
	}

	

}