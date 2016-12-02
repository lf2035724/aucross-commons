/**
 * 版权所有(C) 2014 证联支付有限责任公司
 * 创建:jf.zhao 2014-11-23
 */

package com.ylink.ylpay.common.project.otcbb.constant;

import java.util.HashMap;
import java.util.Map;

/** 
 * @author jf.zhao
 * @date 2014-11-23
 * @description：TODO
 */

public enum BizType {

	SYSTEM_OPEN("00", "系统开启"),
/*	SYSTEM_OPEN("00", "系统开启"),
	SYSTEM_OPEN("00", "系统开启"),
	SYSTEM_OPEN("00", "系统开启"),
	SYSTEM_OPEN("00", "系统开启"),
	SYSTEM_OPEN("00", "系统开启"),
*/	SYSTEM_CLOSE("99", "系统关闭");

	private String value;
	private final String displayName;

	public String getValue() {
		return this.value;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	BizType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	private static Map<String, BizType> valueMap = new HashMap<String, BizType>();

	static {
		for (BizType _enum : BizType.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}

	/**
	 * 枚举转换
	 */
	public static BizType parseOf(String value) {
		for (BizType item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}
}
