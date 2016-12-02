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
 * @description：渠道对账中渠道类型
 */
public enum CheckMonitorChannelType {

	CHANNELTYPE_CBS( "0", "快捷" ),
	CHANNELTYPE_IBP( "1", "网银支付" ),
	CHANNELTYPE_UNDERLINEREFUND( "2", "网银充值退回" ),
	CHANNELTYPE_ONLINEREFUND( "3", "快捷充值退回" ),
	CHANNELTYPE_B2B_TRANSFER( "4", "B2B转账" ),
	CHANNELTYPE_PAYMENT( "5", "付款类" );

	private String value;
	private final String displayName;

	private static Map<String, CheckMonitorChannelType> valueMap = new HashMap<String, CheckMonitorChannelType>();

	static {
		for ( CheckMonitorChannelType _enum : CheckMonitorChannelType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	CheckMonitorChannelType( String value, String displayName ) {
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
	public static CheckMonitorChannelType parseOf( String value ) {
		for ( CheckMonitorChannelType item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "渠道对账中渠道类型[" + value + "]不匹配!" );
	}

}