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
 * @description：账务系统与支付系统对账状态
 */
public enum AccountPayUnbalanceCheckStatus {

	ACC_SUCC_PAY_FAIL("00", "账务系统成功，支付系统失败"),
	AMOUNT_INCONFORMITY("01", "金额不一致" ),
	ACCOUNTDATE_INCONFORMITY("02", "账务日期不一致"),
	ACC_EXIST_PAY_NOEXIST("03", "账务系统成功，支付系统不存在"),
	PAY_EXIST_ACC_NOEXIST("03", "支付系统成功，账务系统不存在"),
	;

	private String value;
	private final String displayName;

	private static Map<String, AccountPayUnbalanceCheckStatus> valueMap = new HashMap<String, AccountPayUnbalanceCheckStatus>();

	static {
		for ( AccountPayUnbalanceCheckStatus _enum : AccountPayUnbalanceCheckStatus.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	AccountPayUnbalanceCheckStatus( String value, String displayName ) {
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
	public static AccountPayUnbalanceCheckStatus parseOf( String value ) {
		for ( AccountPayUnbalanceCheckStatus item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "账务系统与支付系统对账状态[" + value + "]不匹配!" );
	}

}