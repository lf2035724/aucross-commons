/**
 * 版权所有(C) 2013 证联融通
 * 创建:jf.zhao 2013-5-14
 */
package com.ylink.ylpay.common.project.otcbb.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jf.zhao
 * @date 2013-5-14
 * @description：
 */
public enum BillCheckDetailStatus {

	FAIL("00", "失败"),

	SUCCESS("01", "成功");

	private String value;
	private final String displayName;

	public String getValue() {
		return this.value;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	BillCheckDetailStatus(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	private static Map<String, BillCheckDetailStatus> valueMap = new HashMap<String, BillCheckDetailStatus>();

	static {
		for (BillCheckDetailStatus _enum : BillCheckDetailStatus.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}

	/**
	 * 枚举转换
	 */
	public static BillCheckDetailStatus parseOf(String value) {
		for (BillCheckDetailStatus item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}

}
