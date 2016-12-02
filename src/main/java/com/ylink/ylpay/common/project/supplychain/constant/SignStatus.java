package com.ylink.ylpay.common.project.supplychain.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

public enum SignStatus implements PersistentEnum<SignStatus, String> {
	
	SIGNSTATUS_NOSIGN("0", "未签约"),

	SIGNSTATUS_AGREE("1", "同意"),

	SIGNSTATUS_REFUSE("2", "拒绝");


	private String value;
	private final String displayName;
	
	private static Map<String, SignStatus> valueMap = new HashMap<String, SignStatus>();

	static {
		for (SignStatus _enum : SignStatus.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	SignStatus(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
	
	SignStatus(String value, String displayName, boolean hasRefundNo) {
		this.value = value;
		this.displayName = displayName;
	}
	
	@Override
	public String getValue() {
		return value;
	}

	@Override
	public String getDisplayName() {
		return displayName;
	}

	@Override
	public SignStatus getEnum(String value) {
		return valueMap.get(value);
	}

	@Override
	public Map<String, SignStatus> getAllValueMap() {
		return valueMap;
	}
	
	/**
	 * 枚举转换
	 */
	public static SignStatus parseOf(String value) {
		for (SignStatus item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}

}
