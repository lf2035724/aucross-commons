/**
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-9-15
 */

/**
 * UseCycleType.java
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-9-15
 */
package com.ylink.ylpay.common.project.supplychain.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/** 
 * @author feng.li
 * @date 2013-9-15
 * @description：使用方式枚举
 */

/**
 * @author feng.li
 *
 */
public enum UseCycleType implements PersistentEnum<UseCycleType, String> {
	
	DISPOSABLE("1", "一次性"),

	LOOP("2", "循环");


	private String value;
	private final String displayName;
	
	private static Map<String, UseCycleType> valueMap = new HashMap<String, UseCycleType>();

	static {
		for (UseCycleType _enum : UseCycleType.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	UseCycleType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
	
	UseCycleType(String value, String displayName, boolean hasRefundNo) {
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
	public UseCycleType getEnum(String value) {
		return valueMap.get(value);
	}

	@Override
	public Map<String, UseCycleType> getAllValueMap() {
		return valueMap;
	}
	
	/**
	 * 枚举转换
	 */
	public static UseCycleType parseOf(String value) {
		for (UseCycleType item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}
}
