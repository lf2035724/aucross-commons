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
 * @description：渠道系统与支付系统对账不平原因
 */
public enum ChannelPayUnbalanceReason {
	
	AMOUNT_INCONFORMITY("00", "金额不一致"),
	BANK_EXIST_PAY_NOEXIST("01", "银行有、账务无"),
	PAY_EXIST_BANK_NOEXIST("02", "账务有、银行无"),
	BANK_EXIST_PAY_NOEXIST_HANDBY("03", "银行有、账务无、需人工处理"),
	STATUS_INCONFORMITY("04", "状态不一致"),
	;

	private String value;
	private final String displayName;

	private static Map<String, ChannelPayUnbalanceReason> valueMap = new HashMap<String, ChannelPayUnbalanceReason>();

	static {
		for ( ChannelPayUnbalanceReason _enum : ChannelPayUnbalanceReason.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	ChannelPayUnbalanceReason( String value, String displayName ) {
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
	public static ChannelPayUnbalanceReason parseOf( String value ) {
		for ( ChannelPayUnbalanceReason item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "渠道系统与支付系统对账状态[" + value + "]不匹配!" );
	}

}