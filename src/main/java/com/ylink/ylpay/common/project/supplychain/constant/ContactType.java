/**
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-9-15
 */

/**
 * ContactType.java
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
 * @description：联系方式
 */

/**
 * @author feng.li
 *
 */
public enum ContactType  implements PersistentEnum<ContactType, String> {
	
	TELEPHONE("T", "电话"),

	EMAIL("M", "邮件");


	private String value;
	private final String displayName;
	
	private static Map<String, ContactType> valueMap = new HashMap<String, ContactType>();

	static {
		for (ContactType _enum : ContactType.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	ContactType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
	
	ContactType(String value, String displayName, boolean hasRefundNo) {
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
	public ContactType getEnum(String value) {
		return valueMap.get(value);
	}

	@Override
	public Map<String, ContactType> getAllValueMap() {
		return valueMap;
	}
	
	/**
	 * 枚举转换
	 */
	public static ContactType parseOf(String value) {
		for (ContactType item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}
}
