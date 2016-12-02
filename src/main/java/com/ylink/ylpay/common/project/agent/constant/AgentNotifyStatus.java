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
 * @description：通知状态
 */
public enum AgentNotifyStatus  implements PersistentEnum<AgentNotifyStatus, String> {
	
	NoticeStatus_NO("0", "未通知"),

	NoticeStatus_YES("1", "已通知");


	private String value;
	private final String displayName;
	
	private static Map<String, AgentNotifyStatus> valueMap = new HashMap<String, AgentNotifyStatus>();

	static {
		for (AgentNotifyStatus _enum : AgentNotifyStatus.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	AgentNotifyStatus(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
	
	AgentNotifyStatus(String value, String displayName, boolean hasRefundNo) {
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
	public AgentNotifyStatus getEnum(String value) {
		return valueMap.get(value);
	}

	@Override
	public Map<String, AgentNotifyStatus> getAllValueMap() {
		return valueMap;
	}
	
	/**
	 * 枚举转换
	 */
	public static AgentNotifyStatus parseOf(String value) {
		for (AgentNotifyStatus item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}
}
