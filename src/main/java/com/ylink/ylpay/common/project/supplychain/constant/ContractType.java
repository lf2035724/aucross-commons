/**
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-9-25
 */

/**
 * ContractType.java
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-9-25
 */
package com.ylink.ylpay.common.project.supplychain.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/** 
 * @author feng.li
 * @date 2013-9-25
 * @description：TODO
 */

/**
 * @author feng.li
 *
 */
public enum ContractType implements PersistentEnum<ContractType, String>{
	
	TWO_SIDES("1", "两方"),
	
	THIRD_SIDES("2", "三方");

	private String value;
	private final String displayName;
	
	private static Map<String, ContractType> valueMap = new HashMap<String, ContractType>();

	static {
		for (ContractType _enum : ContractType.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	ContractType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
	
	ContractType(String value, String displayName, boolean hasRefundNo) {
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
	public ContractType getEnum(String value) {
		return valueMap.get(value);
	}

	@Override
	public Map<String, ContractType> getAllValueMap() {
		return valueMap;
	}
	
	/**
	 * 枚举转换
	 */
	public static ContractType parseOf(String value) {
		for (ContractType item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}
}
