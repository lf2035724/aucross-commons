/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-10-30
 */

package com.ylink.ylpay.common.project.settle.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ZhangDM(Mingly)
 * @date 2013-1-9
 * @description：基金扎差净额类型
 */
public enum FundNetType {

	BALANCE("00", "平帐"),
	INCOME("01", "入监管帐户"),
	PAYOUT("02", "出监管帐户"),
	
	;
	
	private String value;
	private final String displayName;

	private static Map<String, FundNetType> valueMap = new HashMap<String, FundNetType>();

	static {
		for ( FundNetType _enum : FundNetType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	FundNetType( String value, String displayName ) {
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
	public static FundNetType parseOf( String value ) {
		for ( FundNetType item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "基金扎差净额类型[" + value + "]不匹配!" );
	}

}