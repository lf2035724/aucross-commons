package com.ylink.ylpay.common.project.fund.constant;

import java.util.HashMap;
import java.util.Map;

public enum ResultFinishType {
	
	SUCCEED("0", "成功"),
	
	FAIL("1", "失败");
	
	private String value;
	private String displayName;

	public String getValue() {
		return this.value;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	ResultFinishType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	private static Map<String, ResultFinishType> valueMap = new HashMap<String, ResultFinishType>();

	static {
		for (ResultFinishType _enum : ResultFinishType.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}

	/**
	 * 枚举转换
	 */
	public static ResultFinishType parseOf(String value) {
		for (ResultFinishType item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("异常错误代码[" + value + "]不匹配!");
	}
}
