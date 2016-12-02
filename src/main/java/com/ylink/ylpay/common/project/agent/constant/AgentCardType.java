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
 * @description：卡类型
 */
public enum AgentCardType  implements PersistentEnum<AgentCardType, String> {
	
	CardType_DCARD("0", "储蓄卡"),

	CardType_CCARD("1", "贷记卡");


	private String value;
	private final String displayName;
	
	private static Map<String, AgentCardType> valueMap = new HashMap<String, AgentCardType>();

	static {
		for (AgentCardType _enum : AgentCardType.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	AgentCardType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
	
	AgentCardType(String value, String displayName, boolean hasRefundNo) {
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
	public AgentCardType getEnum(String value) {
		return valueMap.get(value);
	}

	@Override
	public Map<String, AgentCardType> getAllValueMap() {
		return valueMap;
	}
	
	/**
	 * 枚举转换
	 */
	public static AgentCardType parseOf(String value) {
		for (AgentCardType item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}
}
