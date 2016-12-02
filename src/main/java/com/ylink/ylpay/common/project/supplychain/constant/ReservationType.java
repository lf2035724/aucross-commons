/**
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-10-9
 */

/**
 * ReservationType.java
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-10-9
 */
package com.ylink.ylpay.common.project.supplychain.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/** 
 * @author feng.li
 * @date 2013-10-9
 * @description：TODO
 */

/**
 * @author feng.li
 *
 */
public enum ReservationType implements PersistentEnum<ReservationType, String>{
	
	SUPPLY("1","供给预约"),
	REQUIREMENTS("2","需求预约");
	
	private String value;
	private final String displayName;
	
	private static Map<String, ReservationType> valueMap = new HashMap<String, ReservationType>();

	static {
		for (ReservationType _enum : ReservationType.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	ReservationType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
	
	ReservationType(String value, String displayName, boolean hasRefundNo) {
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
	public ReservationType getEnum(String value) {
		return valueMap.get(value);
	}

	@Override
	public Map<String, ReservationType> getAllValueMap() {
		return valueMap;
	}
	
	/**
	 * 枚举转换
	 */
	public static ReservationType parseOf(String value) {
		for (ReservationType item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}
}
