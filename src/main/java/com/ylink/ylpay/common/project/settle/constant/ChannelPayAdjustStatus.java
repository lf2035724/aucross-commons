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
 * @description：渠道系统与支付系统调账状态
 */
public enum ChannelPayAdjustStatus {
	
	UNADJUST("0", "未调账"),
	AUTO_ADJUST("1", "已自动调账"),
	HANDBY_ADJUST("2", "已人工调账"),
	NONEED_ADJUST("3", "无需调账"),
	ADJUSTING("4", "调账处理中"),
	;

	private String value;
	private final String displayName;

	private static Map<String, ChannelPayAdjustStatus> valueMap = new HashMap<String, ChannelPayAdjustStatus>();

	static {
		for ( ChannelPayAdjustStatus _enum : ChannelPayAdjustStatus.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	ChannelPayAdjustStatus( String value, String displayName ) {
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
	public static ChannelPayAdjustStatus parseOf( String value ) {
		for ( ChannelPayAdjustStatus item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "渠道系统与支付系统对账状态[" + value + "]不匹配!" );
	}

}