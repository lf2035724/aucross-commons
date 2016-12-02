/**
 * 版权所有(C) 2013 证联融通
 * 创建:jf.zhao 2014-3-3
 */
package com.ylink.ylpay.common.project.pay.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * @author jf.zhao
 * @date 2014-3-3
 * @description： 提现类型
 */
public enum WithdrawType implements PersistentEnum<WithdrawType, String>{
	/**
	 * 版权所有(C) 2013 证联融通 创建:jf.zhao 2014-3-3
	 */

	WITHDRAW_QUICKLY("0", "快速提现"),

	WITHDRAW_COMMON("1", "普通提现");
	private String value;
	private final String displayName;

	private static Map<String, WithdrawType> valueMap = new HashMap<String, WithdrawType>();

	static {
		for (WithdrawType _enum : WithdrawType.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}

	WithdrawType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	@Override
	public WithdrawType getEnum(String value) {
		return valueMap.get(value);
	}

	@Override
	public Map<String, WithdrawType> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	/**
	 * 枚举转换
	 */
	public static WithdrawType parseOf(String value) {
		for (WithdrawType item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("提现类型[" + value + "]不匹配!");
	}
}
