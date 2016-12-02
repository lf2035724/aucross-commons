package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * 借贷方向.
 * 
 * @author 潘瑞峥
 * @date 2012-12-13
 */
public enum CreditDebitMark implements PersistentEnum<CreditDebitMark, String> {

	INTERNAL_TRANSFER( "0", "头寸调拨" ),

	CREDIT( "1", "资金转出" ),

	DEBIT( "2", "资金转入" );

	private String value;
	private final String displayName;

	private static Map<String, CreditDebitMark> valueMap = new HashMap<String, CreditDebitMark>();

	static {
		for ( CreditDebitMark _enum : CreditDebitMark.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	CreditDebitMark( String value, String displayName ) {
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
	public CreditDebitMark getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, CreditDebitMark> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}
	/**
	 * 枚举转换
	 */
	public static CreditDebitMark parseOf( String value ) {
		for ( CreditDebitMark item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "枚举值[" + value + "]不匹配!" );
	}
}