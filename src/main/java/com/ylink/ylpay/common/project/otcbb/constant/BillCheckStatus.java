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
public enum BillCheckStatus {

	NEW("00", "新建"),

	WAIT("01", "等待"), 
	
	FAILURE("03", "失败"),

	SUCCESS("02", "数据准备完成");

	private String value;
	private final String displayName;

	public String getValue() {
		return this.value;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	BillCheckStatus(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	private static Map<String, BillCheckStatus> valueMap = new HashMap<String, BillCheckStatus>();

	static {
		for (BillCheckStatus _enum : BillCheckStatus.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}

	/**
	 * 枚举转换
	 */
	public static BillCheckStatus parseOf(String value) {
		for (BillCheckStatus item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}

}
