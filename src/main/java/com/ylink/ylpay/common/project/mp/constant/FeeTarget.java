package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * 计费对象.
 * 
 * 收取付款方或收款方等的手续费.
 * 
 * @author 潘瑞峥
 * @date 2013-3-22
 */
public enum FeeTarget implements PersistentEnum<FeeTarget, String> {

	PAYER( "1", "付款方" ),

	PAYEE( "2", "收款方" );

	//BOTH( "9", "付款方和收款方" );

	private String value;
	private final String displayName;

	private static Map<String, FeeTarget> valueMap = new HashMap<String, FeeTarget>();

	static {
		for ( FeeTarget _enum : FeeTarget.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	FeeTarget( String value, String displayName ) {
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
	public FeeTarget getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, FeeTarget> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

}