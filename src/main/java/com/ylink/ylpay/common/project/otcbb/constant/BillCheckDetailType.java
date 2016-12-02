/**
 * 版权所有(C) 2013 证联融通
 * 创建:jf.zhao 2013-5-15
 */
package com.ylink.ylpay.common.project.otcbb.constant;

import java.util.HashMap;
import java.util.Map;


/**
 * @author jf.zhao
 * @date 2013-5-15
 * @description：
 */
public enum BillCheckDetailType {
	

	RECHARGE("00", "资金转入"),

	WITHDRAW("01", "资金转出");

	private String value;
	private final String displayName;

	public String getValue() {
		return this.value;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	BillCheckDetailType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	private static Map<String, BillCheckDetailType> valueMap = new HashMap<String, BillCheckDetailType>();

	static {
		for (BillCheckDetailType _enum : BillCheckDetailType.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}

	/**
	 * 枚举转换
	 */
	public static BillCheckDetailType parseOf(String value) {
		for (BillCheckDetailType item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}

}
