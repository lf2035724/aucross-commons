/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-12-19
 */

package com.ylink.ylpay.common.project.fund.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * @author YG.HU
 * @date 2012-12-19
 * @description：TODO
 */

public enum SupervisionBusinessResultFinishType {
	/*
	 * RESUlT_FINISH_SUC( "0", "核算状态更新成功" ),
	 * 
	 * RESUlT_FINISH_FAIL( "1", "核算状态更新失败" ),
	 * 
	 * RESUlT_FINISH_NOT( "9", "核算状态未更新" );
	 */

	RESUlT_FINISH_SUC("0", "更新成功"),

	RESUlT_FINISH_FAIL("1", "更新失败"),

	RESUlT_FINISH_NOT("9", "未更新");

	private String value;
	private String displayName;

	public String getValue() {
		return this.value;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	SupervisionBusinessResultFinishType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	private static Map<String, SupervisionBusinessResultFinishType> valueMap = new HashMap<String, SupervisionBusinessResultFinishType>();

	static {
		for (SupervisionBusinessResultFinishType _enum : SupervisionBusinessResultFinishType
				.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}

	/**
	 * 枚举转换
	 */
	public static SupervisionBusinessResultFinishType parseOf(String value) {
		for (SupervisionBusinessResultFinishType item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("异常错误代码[" + value + "]不匹配!");
	}
}
