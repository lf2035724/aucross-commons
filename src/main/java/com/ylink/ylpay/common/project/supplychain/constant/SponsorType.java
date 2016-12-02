package com.ylink.ylpay.common.project.supplychain.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.constant.OptType;
import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

public enum SponsorType implements PersistentEnum<SponsorType, String> {

	SPONSORTYPE_CREDITOR("C", "债权人"),

	SPONSORTYPE_DEBTOR("D", "债务人"),

	SPONSORTYPE_ACCEPTOR("A", "受让方"),
	
	SPONSORTYPE_ALL("S", "全部");

	private String value;
	private final String displayName;
	
	private static Map<String, SponsorType> valueMap = new HashMap<String, SponsorType>();

	static {
		for (SponsorType _enum : SponsorType.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	SponsorType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
	
	SponsorType(String value, String displayName, boolean hasRefundNo) {
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
	public SponsorType getEnum(String value) {
		return valueMap.get(value);
	}

	@Override
	public Map<String, SponsorType> getAllValueMap() {
		return valueMap;
	}

	/**
	 * 枚举转换
	 */
	public static SponsorType parseOf(String value) {
		for (SponsorType item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}
}
