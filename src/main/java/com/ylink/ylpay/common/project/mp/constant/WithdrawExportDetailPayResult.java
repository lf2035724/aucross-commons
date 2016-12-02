package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * 提现导出数据支付结果.
 * 
 * @author 潘瑞峥
 * @date 2012-12-1
 */
public enum WithdrawExportDetailPayResult implements PersistentEnum<WithdrawExportDetailPayResult, String> {

	UNKNOWN( "UNKNOWN", "银行支付中" ),

	FAILURE( "FAILURE", "银行支付失败" ),

	SUCCESS( "SUCCESS", "银行支付成功" );

	private String value;
	private final String displayName;

	private static Map<String, WithdrawExportDetailPayResult> valueMap = new HashMap<String, WithdrawExportDetailPayResult>();

	static {
		for ( WithdrawExportDetailPayResult _enum : WithdrawExportDetailPayResult.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	WithdrawExportDetailPayResult( String value, String displayName ) {
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
	public WithdrawExportDetailPayResult getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, WithdrawExportDetailPayResult> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}
	public static WithdrawExportDetailPayResult parseOf( String value ) {
		for ( WithdrawExportDetailPayResult item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "枚举值[" + value + "]不匹配!" );
	}
}