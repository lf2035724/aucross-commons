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
 * @description：报表结算状态
 */
public enum DayReportSettleStatus {
	
	UNSETTLE("0", "未结算"),
	SETTLED("1", "已结算"),
	HANDLING("2", "结算处理中"),
	;

	private String value;
	private final String displayName;

	private static Map<String, DayReportSettleStatus> valueMap = new HashMap<String, DayReportSettleStatus>();

	static {
		for ( DayReportSettleStatus _enum : DayReportSettleStatus.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	DayReportSettleStatus( String value, String displayName ) {
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
	public static DayReportSettleStatus parseOf( String value ) {
		for ( DayReportSettleStatus item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "渠道系统与支付系统对账状态[" + value + "]不匹配!" );
	}

}