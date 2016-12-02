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
 * @description：批次流水操作状态
 */
public enum BatchBillOperateStatus {

	WAITING( "0", "待操作" ),
	OVER( "1", "已操作" ),
	CANCEL("2", "取消操作")
	;

	private String value;
	private final String displayName;

	private static Map<String, BatchBillOperateStatus> valueMap = new HashMap<String, BatchBillOperateStatus>();

	static {
		for ( BatchBillOperateStatus _enum : BatchBillOperateStatus.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	BatchBillOperateStatus( String value, String displayName ) {
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
	public static BatchBillOperateStatus parseOf( String value ) {
		for ( BatchBillOperateStatus item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "批次流水操作状态[" + value + "]不匹配!" );
	}

}