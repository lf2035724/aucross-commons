package com.ylink.ylpay.common.project.supplychain.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

public enum ContractStatus implements PersistentEnum<ContractStatus, String> {
	CONTRACTSTATUS_DRAFT("1", "草稿"),

	CONTRACTSTATUS_SIGNING("2", "签署中"),

	CONTRACTSTATUS_FAILED("3", "协议失败"),
	
	CONTRACTSTATUS_SUCCESS("4", "协议成功"),
	
	CONTRACTSTATUS_ABOLISHED("5","废除"),
	
	CONTRACTSTATUS_ALL("6", "全部");


	private String value;
	private final String displayName;
	
	private static Map<String, ContractStatus> valueMap = new HashMap<String, ContractStatus>();

	static {
		for (ContractStatus _enum : ContractStatus.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	ContractStatus(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
	
	ContractStatus(String value, String displayName, boolean hasRefundNo) {
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
	public ContractStatus getEnum(String value) {
		return valueMap.get(value);
	}

	@Override
	public Map<String, ContractStatus> getAllValueMap() {
		return valueMap;
	}
	
	/**
	 * 枚举转换
	 */
	public static ContractStatus parseOf(String value) {
		for (ContractStatus item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}
}
