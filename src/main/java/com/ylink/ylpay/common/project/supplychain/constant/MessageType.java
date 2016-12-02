package com.ylink.ylpay.common.project.supplychain.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * @description 融资信息，消息类型类型枚举
 * @author wanglei
 *
 */
public enum MessageType implements PersistentEnum<MessageType, String> {
	MESSAGETYPE_ZERO("2", "融资需求"),
	
	MESSAGETYPE_TWO("0", "融资供给两方"),

	MESSAGETYPE_THREE("1", "融资供给三方");


	private String value;
	private final String displayName;
	
	private static Map<String, MessageType> valueMap = new HashMap<String, MessageType>();

	static {
		for (MessageType _enum : MessageType.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	MessageType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
	
	MessageType(String value, String displayName, boolean hasRefundNo) {
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
	public MessageType getEnum(String value) {
		return valueMap.get(value);
	}

	@Override
	public Map<String, MessageType> getAllValueMap() {
		return valueMap;
	}
	
	/**
	 * 枚举转换
	 */
	public static MessageType parseOf(String value) {
		for (MessageType item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}
}
