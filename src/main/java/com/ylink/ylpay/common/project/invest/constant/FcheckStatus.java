/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 * 创建:Pengyindong 2013-1-17
 */

package com.ylink.ylpay.common.project.invest.constant;

import java.util.HashMap;
import java.util.Map;

/** 
 * @author Pengyindong
 * @date 2013-1-17
 * @description：TODO
 */

public enum FcheckStatus {

	NOTHAVE( "0", "未对账" ),
	HANDLING( "1", "对账中" ),
	SUCCESS( "2", "对账成功" ),
	FAIL( "3", "对账失败" ),
	SUCFAIL( "4", "对账成功但交易失败" );

	private String value;
	private final String displayName;

	private static Map<String, FcheckStatus> valueMap = new HashMap<String, FcheckStatus>();

	static {
		for ( FcheckStatus _enum : FcheckStatus.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	FcheckStatus( String value, String displayName ) {
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
	public static FcheckStatus parseOf( String value ) {
		for ( FcheckStatus item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "对账状态[" + value + "]不匹配!" );
	}
	
}
