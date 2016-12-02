/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 * @author yu.hanyu
 * @date 2013-5-13
 */

package com.ylink.ylpay.common.project.otcbb.constant;

import java.util.HashMap;
import java.util.Map;

/** 
 * 提现明细状态
 * 
 * @author yu.hanyu
 * @date 2013-5-13
 * @description
 * 	DRAW_NEW( "00", "新建" )</br>
	PAY_SUCCESS( "01", "支付处理中" )</br>
	SUCCESS( "05", "交易成功" )</br>
	FAIL( "07", "交易失败" )</br>
 */

public enum WithdrawDetailStatus {
	
	DRAW_NEW( "00", "新建" ),
	PAY_SUCCESS( "01", "支付处理中" ),
	SUCCESS( "05", "交易成功" ),
	FAIL( "07", "交易失败" );

	private String value;
	private final String displayName;

	private static Map<String, WithdrawDetailStatus> valueMap = new HashMap<String, WithdrawDetailStatus>();

	static {
		for ( WithdrawDetailStatus _enum : WithdrawDetailStatus.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	WithdrawDetailStatus( String value, String displayName ) {
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
	public static WithdrawDetailStatus parseOf( String value ) {
		for ( WithdrawDetailStatus item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "对账状态[" + value + "]不匹配!" );
	}
}
