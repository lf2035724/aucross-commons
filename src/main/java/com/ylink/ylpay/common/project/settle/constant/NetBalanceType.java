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
public enum NetBalanceType {

	FUND_NETBALANCE("0", "基金普通轧差"),
	NETBALANCE("0", "基金普通轧差"),
	FUND_QNETBALANCE("1", "基金快速轧差"),
	QNETBALANCE("1", "基金快速轧差"),
	OTCBB_NETBALANCE("2", "交易所普通轧差"),
	CONSUMPTION_NETBALANCE("3", "消费普通轧差"),
	;
	
	private String value;
	private final String displayName;

	private static Map<String, NetBalanceType> valueMap = new HashMap<String, NetBalanceType>();

	static {
		for ( NetBalanceType _enum : NetBalanceType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	NetBalanceType( String value, String displayName ) {
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
	public static NetBalanceType parseOf( String value ) {
		for ( NetBalanceType item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "基金扎差方式[" + value + "]不匹配!" );
	}

}