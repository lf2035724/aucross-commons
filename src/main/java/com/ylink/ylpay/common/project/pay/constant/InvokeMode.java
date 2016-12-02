/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-11-13
 */

package com.ylink.ylpay.common.project.pay.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * @author YG.HU
 * @date 2012-11-13
 * @description：调用方式 线下、线上
 */
public enum InvokeMode implements PersistentEnum<InvokeMode, String> {

	ONLINE("0", "线上"),

	OFFLINE("1", "线下"),

	ONLINE_OR_OFFLINE("2", "线上或线下");

	private String value;
	private final String displayName;

	private static Map<String, InvokeMode> valueMap = new HashMap<String, InvokeMode>();

	static {
		for (InvokeMode _enum : InvokeMode.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}

	InvokeMode(String value, String displayName) {
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
	public InvokeMode getEnum(String value) {
		return valueMap.get(value);
	}

	@Override
	public Map<String, InvokeMode> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	/**
	 * 枚举转换
	 */
	public static InvokeMode parseOf(String value) {
		for (InvokeMode item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("充值订单状态[" + value + "]不匹配!");
	}

	public static InvokeMode[] onlineOfflines() {
		InvokeMode[] invokeModes = new InvokeMode[] { ONLINE, OFFLINE };
		return invokeModes;
	}

}