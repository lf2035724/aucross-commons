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
 * @description：发起方类型
 */
public enum AgentChannelType  implements PersistentEnum<AgentChannelType, String> {
	
	ChannelType_ZLRT("0", "ZLRT"),

	ChannelType_OTHER("1", "其它");


	private String value;
	private final String displayName;
	
	private static Map<String, AgentChannelType> valueMap = new HashMap<String, AgentChannelType>();

	static {
		for (AgentChannelType _enum : AgentChannelType.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	AgentChannelType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
	
	AgentChannelType(String value, String displayName, boolean hasRefundNo) {
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
	public AgentChannelType getEnum(String value) {
		return valueMap.get(value);
	}

	@Override
	public Map<String, AgentChannelType> getAllValueMap() {
		return valueMap;
	}
	
	/**
	 * 枚举转换
	 */
	public static AgentChannelType parseOf(String value) {
		for (AgentChannelType item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}
}
