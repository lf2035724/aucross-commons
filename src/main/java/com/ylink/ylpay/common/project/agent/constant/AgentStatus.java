package com.ylink.ylpay.common.project.agent.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * @author wanglei
 * @date 2014-7-9
 * @description：
 */
public enum AgentStatus implements PersistentEnum<AgentStatus, String>{
	AGENTSTATUS_0("0", "发往银行处理中"),
	AGENTSTATUS_1("1", "销帐成功"),
	AGENTSTATUS_2("2", "销帐失败"),
	AGENTSTATUS_3("3", "待处理"),
	AGENTSTATUS_4("4", "银行受理成功");

	private String value;
	private final String displayName;
	
	private static Map<String, AgentStatus> valueMap = new HashMap<String, AgentStatus>();

	static {
		for (AgentStatus _enum : AgentStatus.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	AgentStatus(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
	
	AgentStatus(String value, String displayName, boolean hasRefundNo) {
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
	public AgentStatus getEnum(String value) {
		return valueMap.get(value);
	}
	@Override
	public Map<String, AgentStatus> getAllValueMap() {
		return valueMap;
	}
	
	/**
	 * 枚举转换
	 */
	public static AgentStatus parseOf(String value) {
		for (AgentStatus item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}
}
