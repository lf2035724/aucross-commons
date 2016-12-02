package com.ylink.ylpay.common.project.supplychain.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;
/**
 * 
 * @author wanglei
 * @date 2013-9-16
 * @description：供应链审核状态枚举类
 */
public enum AuditStatus implements PersistentEnum<AuditStatus, String> {
	AuditStatus_WAIT("0", "未审核"),

	AuditStatus_PASS("1", "审核通过"),

	AuditStatus_REFUSE("2", "审核拒绝");


	private String value;
	private final String displayName;
	
	private static Map<String, AuditStatus> valueMap = new HashMap<String, AuditStatus>();

	static {
		for (AuditStatus _enum : AuditStatus.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	AuditStatus(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
	
	AuditStatus(String value, String displayName, boolean hasRefundNo) {
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
	public AuditStatus getEnum(String value) {
		return valueMap.get(value);
	}

	@Override
	public Map<String, AuditStatus> getAllValueMap() {
		return valueMap;
	}
	
	/**
	 * 枚举转换
	 */
	public static AuditStatus parseOf(String value) {
		for (AuditStatus item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}
}
