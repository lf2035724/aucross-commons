/**
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-10-25
 */

/**
 * AuthMoneyStatus.java
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-10-25
 */
package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/** 
 * @author feng.li
 * @date 2013-10-25
 * @description：金汇宝授信状态
 */

/**
 * @author feng.li
 */
public enum AuthMoneyStatus implements PersistentEnum<AuthMoneyStatus, String>{
	
	NORMAL("00","正常"),
	FROZEN("01","冻结");
	
	private String value;
	private final String displayName;
	
	private static Map<String, AuthMoneyStatus> valueMap = new HashMap<String, AuthMoneyStatus>();

	static {
		for (AuthMoneyStatus _enum : AuthMoneyStatus.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	AuthMoneyStatus(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
	
	AuthMoneyStatus(String value, String displayName, boolean hasRefundNo) {
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
	public AuthMoneyStatus getEnum(String value) {
		return valueMap.get(value);
	}

	@Override
	public Map<String, AuthMoneyStatus> getAllValueMap() {
		return valueMap;
	}
	
	/**
	 * 枚举转换
	 */
	public static AuthMoneyStatus parseOf(String value) {
		for (AuthMoneyStatus item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}
}
