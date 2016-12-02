package com.ylink.ylpay.common.project.supplychain.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

public enum ExecuteStatus implements PersistentEnum<ExecuteStatus, String> {
	EXECUTESTATUS_NOEXECUTE("1", "未执行"),

	EXECUTESTATUS_WAITPAY("2", "等待付款"),

	EXECUTESTATUS_TRANSFERPAYED("3", "转让款已支付"),
	
	EXECUTESTATUS_CLEARPAYED("4", "清偿款已支付"),
	
	EXECUTESTATUS_LOAN_PAYMENT("5", "借款已支付"),
	
	EXECUTESTATUS_LOAN_REPAYMENT("6", "借款已偿还"),
	
	EXECUTESTATUS_ALL("9", "全部");

	private String value;
	private final String displayName;
	
	private static Map<String, ExecuteStatus> valueMap = new HashMap<String, ExecuteStatus>();

	static {
		for (ExecuteStatus _enum : ExecuteStatus.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	ExecuteStatus(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
	
	ExecuteStatus(String value, String displayName, boolean hasRefundNo) {
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
	public ExecuteStatus getEnum(String value) {
		return valueMap.get(value);
	}

	@Override
	public Map<String, ExecuteStatus> getAllValueMap() {
		return valueMap;
	}
	
	/**
	 * 枚举转换
	 */
	public static ExecuteStatus parseOf(String value) {
		for (ExecuteStatus item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}
}
