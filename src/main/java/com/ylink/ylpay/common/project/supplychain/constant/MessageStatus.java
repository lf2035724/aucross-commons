/**
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-10-8
 */

/**
 * SenderMessageStatus.java
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-10-8
 */
package com.ylink.ylpay.common.project.supplychain.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/** 
 * @author feng.li
 * @date 2013-10-8
 * @description：TODO
 */

/**
 * @author feng.li
 */
public enum MessageStatus implements PersistentEnum<MessageStatus, String>{
	
	NEW("1","新建"),
	SENT("2","已发送"),
	READ("3","已阅读"),
	DELETED("4","已删除");
	
	private String value;
	private final String displayName;
	
	private static Map<String, MessageStatus> valueMap = new HashMap<String, MessageStatus>();

	static {
		for (MessageStatus _enum : MessageStatus.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	MessageStatus(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
	
	MessageStatus(String value, String displayName, boolean hasRefundNo) {
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
	public MessageStatus getEnum(String value) {
		return valueMap.get(value);
	}

	@Override
	public Map<String, MessageStatus> getAllValueMap() {
		return valueMap;
	}
	
	/**
	 * 枚举转换
	 */
	public static MessageStatus parseOf(String value) {
		for (MessageStatus item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}
}
