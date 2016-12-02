/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-10-30
 */

package com.ylink.ylpay.common.project.settle.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ZhangDM(Mingly)
 * @date 2013-1-4
 * @description：渠道对账状态
 */
public enum CheckMonitorCheckStatus {

	NOTHAVE( "0", "未对账" ),
	HANDLING( "1", "对账中" ),
	SUCCESS( "2", "对账成功" ),
	FAIL( "3", "对账失败" );

	private String value;
	private final String displayName;

	private static Map<String, CheckMonitorCheckStatus> valueMap = new HashMap<String, CheckMonitorCheckStatus>();

	static {
		for ( CheckMonitorCheckStatus _enum : CheckMonitorCheckStatus.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	CheckMonitorCheckStatus( String value, String displayName ) {
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
	public static CheckMonitorCheckStatus parseOf( String value ) {
		for ( CheckMonitorCheckStatus item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "渠道对账状态[" + value + "]不匹配!" );
	}

}