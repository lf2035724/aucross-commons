package com.ylink.ylpay.common.project.otcbb.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wanglei
 * @date 2014-11-20
 * @description：对账文件状态
 */
public enum FileStatus {
	SUCCESS("00", "成功"),
	FAIL("01","失败");

	private String value;
	private final String displayName;

	public String getValue() {
		return this.value;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	FileStatus(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	private static Map<String, FileStatus> valueMap = new HashMap<String, FileStatus>();

	static {
		for (FileStatus _enum : FileStatus.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}

	/**
	 * 枚举转换
	 */
	public static FileStatus parseOf(String value) {
		for (FileStatus item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}
}
