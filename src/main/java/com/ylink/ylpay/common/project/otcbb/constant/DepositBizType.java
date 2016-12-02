package com.ylink.ylpay.common.project.otcbb.constant;

import java.util.HashMap;
import java.util.Map;

public enum DepositBizType {
	ORDINARY( "01", "普通收款" ),
	INTEREST( "02", "利息结算" ),
	DIAL( "03", "头寸调拨收款" ),
	INTERNAL( "04", "内部调账" );
	
	private String value;
	private final String displayName;

	private static Map<String, DepositBizType> valueMap = new HashMap<String, DepositBizType>();

	static {
		for ( DepositBizType _enum : DepositBizType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	DepositBizType( String value, String displayName ) {
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
	public String toString() {
		return this.getDisplayName();
	}

	/**
	 * 枚举转换
	 */
	public static DepositBizType parseOf( String value ) {
		for ( DepositBizType item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "入金类型[" + value + "]不匹配!" );
	}
}
