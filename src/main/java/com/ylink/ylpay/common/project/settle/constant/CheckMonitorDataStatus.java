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
 * @description：渠道对账数据状态
 */
public enum CheckMonitorDataStatus {

	NOTHAVE( "0", "未处理" ),
	HANDLING( "1", "处理中" ),
	SUCCESS( "2", "处理成功" ),
	FAIL( "3", "处理失败" ),
	NOTNEED( "4", "无需对账" ),
	;

	private String value;
	private final String displayName;

	private static Map<String, CheckMonitorDataStatus> valueMap = new HashMap<String, CheckMonitorDataStatus>();

	static {
		for ( CheckMonitorDataStatus _enum : CheckMonitorDataStatus.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	CheckMonitorDataStatus( String value, String displayName ) {
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
	public static CheckMonitorDataStatus parseOf( String value ) {
		for ( CheckMonitorDataStatus item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "渠道对账数据状态[" + value + "]不匹配!" );
	}

}