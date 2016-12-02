package com.ylink.ylpay.common.project.agent.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * @author wanglei
 * @date 2013-9-29
 * @description：支付状态
 */
public enum AgentPayStatus implements PersistentEnum<AgentPayStatus, String> {

	PayStatus_WAITPAY("0", "等待付款"),

	PayStatus_PAYSUCCESS("1", "支付成功"),
	
	PayStatus_PAYFAIL("2", "支付失败");

	private String value;
	private final String displayName;
	
	private static Map<String, AgentPayStatus> valueMap = new HashMap<String, AgentPayStatus>();

	static {
		for (AgentPayStatus _enum : AgentPayStatus.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	AgentPayStatus(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
	
	AgentPayStatus(String value, String displayName, boolean hasRefundNo) {
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
	public AgentPayStatus getEnum(String value) {
		return valueMap.get(value);
	}

	@Override
	public Map<String, AgentPayStatus> getAllValueMap() {
		return valueMap;
	}
	
	/**
	 * 枚举转换
	 */
	public static AgentPayStatus parseOf(String value) {
		for (AgentPayStatus item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}
}
