/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 * 创建:Pengyindong 2013-1-17
 */

package com.ylink.ylpay.common.project.fund.constant;

import java.util.HashMap;
import java.util.Map;

/** 
 * @author Pengyindong
 * @date 2013-1-17
 * @description：TODO
 */

public enum FfileStatus {
	
	NOTHAVE( "0", "未生成" ),
	SUCCESS( "1", "生成成功" ),
	FAIL( "2", "生成失败" );

	private String value;
	private final String displayName;

	private static Map<String, FfileStatus> valueMap = new HashMap<String, FfileStatus>();

	static {
		for ( FfileStatus _enum : FfileStatus.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	FfileStatus( String value, String displayName ) {
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
	public static FfileStatus parseOf( String value ) {
		for ( FfileStatus item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "文件生成状态[" + value + "]不匹配!" );
	}
	
}
