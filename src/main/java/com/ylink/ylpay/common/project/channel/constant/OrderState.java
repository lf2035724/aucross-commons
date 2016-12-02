package com.ylink.ylpay.common.project.channel.constant;

import java.util.HashMap;
import java.util.Map;



public enum OrderState  {


	SUCCESS( "0000", "支付成功" ),
	FAIL( "0001", "支付失败" ),
	SUCCESSORFAIL( "0002", "支付状态不确定" ),
	NOORDERNO( "0003", "无此订单" ),
	WAITPAY( "0004", "待支付" );
	private String value;
	private final String displayName;

	private static Map<String, OrderState> valueMap = new HashMap<String, OrderState>();

	static {
		for ( OrderState _enum : OrderState.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	OrderState( String value, String displayName ) {
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
	public static OrderState parseOf( String value ) {
		for ( OrderState item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "枚举值[" + value + "]不匹配!" );
	}

}