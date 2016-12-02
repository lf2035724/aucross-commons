package com.ylink.ylpay.common.project.supplychain.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

public enum LimitUnit implements PersistentEnum<LimitUnit, String> {
	LIMITUNIT_DAY("D", "天"),

	LIMITUNIT_MONTH("M", "月"),

	LIMITUNIT_SENSON("S", "季度"),
	
	LIMITUNIT_YEAR("Y", "年");


	private String value;
	private final String displayName;
	
	private static Map<String, LimitUnit> valueMap = new HashMap<String, LimitUnit>();

	static {
		for (LimitUnit _enum : LimitUnit.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	LimitUnit(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
	
	LimitUnit(String value, String displayName, boolean hasRefundNo) {
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
	public LimitUnit getEnum(String value) {
		return valueMap.get(value);
	}

	@Override
	public Map<String, LimitUnit> getAllValueMap() {
		return valueMap;
	}
	
	/**
	 * 枚举转换
	 */
	public static LimitUnit parseOf(String value) {
		for (LimitUnit item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}
}
