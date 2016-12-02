/**
 * 版权所有(C) 2013 证联融通
 * 创建:jf.zhao 2013-5-16
 */
package com.ylink.ylpay.common.project.otcbb.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jf.zhao
 * @date 2013-5-16
 * @description：
 */
public enum BillCheckCheckStatus {

	SUCCESS("00", "平帐"),
	AMT_NOT_EQUAL("02","金额不一致"),
	OTCBB_SUCCESS_PAY_FAILER("03","前置成功支付失败"),
	OTCBB_SUCCESS_PAY_FAILER2("08","前置成功支付失败，无支付订单"),
	PAY_SUCCESS_OTCBB_FAILER("05","前置失败支付成功"),
	ERROR_STATUS("06","前置状态不正确"),
	ADJUST("04", "调平帐"),
	CANCEL("07","取消对账"),
	FAILER("01", "不平帐");

	private String value;
	private final String displayName;

	public String getValue() {
		return this.value;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	BillCheckCheckStatus(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	private static Map<String, BillCheckCheckStatus> valueMap = new HashMap<String, BillCheckCheckStatus>();

	static {
		for (BillCheckCheckStatus _enum : BillCheckCheckStatus.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}

	/**
	 * 枚举转换
	 */
	public static BillCheckCheckStatus parseOf(String value) {
		for (BillCheckCheckStatus item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}

}
