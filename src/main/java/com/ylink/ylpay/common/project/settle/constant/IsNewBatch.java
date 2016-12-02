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
 * @description：是否最新批次
 */
public enum IsNewBatch {

	YSE( "0", "是" ),
	NO( "1", "否" ),
	;

	private String value;
	private final String displayName;

	private static Map<String, IsNewBatch> valueMap = new HashMap<String, IsNewBatch>();

	static {
		for ( IsNewBatch _enum : IsNewBatch.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	IsNewBatch( String value, String displayName ) {
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
	public static IsNewBatch parseOf( String value ) {
		for ( IsNewBatch item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "是否最新批次[" + value + "]不匹配!" );
	}

}