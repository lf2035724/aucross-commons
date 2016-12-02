package com.ylink.ylpay.common.project.otcbb.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wanglei
 * @date 2014-11-20
 * @description：系统状态标志
 */
public enum LoginStatus {
	LOGIN("00", "登录"),
	LOGOUT("01","登出");

	private String value;
	private final String displayName;

	public String getValue() {
		return this.value;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	LoginStatus(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	private static Map<String, LoginStatus> valueMap = new HashMap<String, LoginStatus>();

	static {
		for (LoginStatus _enum : LoginStatus.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}

	/**
	 * 枚举转换
	 */
	public static LoginStatus parseOf(String value) {
		for (LoginStatus item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}
}
