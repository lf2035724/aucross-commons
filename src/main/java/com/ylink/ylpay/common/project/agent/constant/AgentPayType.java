/**
 * ContactType.java
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:wanglei 2013-9-29
 */
package com.ylink.ylpay.common.project.agent.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/** 
 * @author wanglei
 * @date 2013-9-29
 * @description：支付方式
 */
public enum AgentPayType  implements PersistentEnum<AgentPayType, String> {
	
	PayType_PROTAL("0", "收银台支付"),

	PayType_BANK("1", "网银直付");


	private String value;
	private final String displayName;
	
	private static Map<String, AgentPayType> valueMap = new HashMap<String, AgentPayType>();

	static {
		for (AgentPayType _enum : AgentPayType.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	AgentPayType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
	
	AgentPayType(String value, String displayName, boolean hasRefundNo) {
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
	public AgentPayType getEnum(String value) {
		return valueMap.get(value);
	}

	@Override
	public Map<String, AgentPayType> getAllValueMap() {
		return valueMap;
	}
	
	/**
	 * 枚举转换
	 */
	public static AgentPayType parseOf(String value) {
		for (AgentPayType item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}
}
