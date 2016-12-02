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
 * @description：账务系统与支付系统对账处理结果
 */
public enum AccountPayUnbalanceDealResult {

	NOTHAVE("00", "未处理"),
	HANDLED("01", "已处理"),
	CANCEL("02", "取消处理"),
	;

	private String value;
	private final String displayName;

	private static Map<String, AccountPayUnbalanceDealResult> valueMap = new HashMap<String, AccountPayUnbalanceDealResult>();

	static {
		for ( AccountPayUnbalanceDealResult _enum : AccountPayUnbalanceDealResult.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	AccountPayUnbalanceDealResult( String value, String displayName ) {
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
	public static AccountPayUnbalanceDealResult parseOf( String value ) {
		for ( AccountPayUnbalanceDealResult item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException("账务系统与支付系统对账处理结果[" + value + "]不匹配!");
	}

}