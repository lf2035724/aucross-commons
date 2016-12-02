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

public enum SupervisionBusinessPayFlag {

	// 0已支付，1支付失败，9未支付
	/*
	 * PAY_SUC( "0", "已支付" ),
	 * 
	 * PAY_FAIL( "1", "支付失败" ),
	 * 
	 * PAY_NOT( "9", "未支付" );
	 */

	PAY_SUC("0", "已入账"),

	PAY_FAIL("1", "入账失败"),

	PAY_NOT("9", "未入账");

	private String value;
	private String displayName;

	public String getValue() {
		return this.value;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	SupervisionBusinessPayFlag(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	private static Map<String, SupervisionBusinessPayFlag> valueMap = new HashMap<String, SupervisionBusinessPayFlag>();

	static {
		for (SupervisionBusinessPayFlag _enum : SupervisionBusinessPayFlag
				.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}

	/**
	 * 枚举转换
	 */
	public static SupervisionBusinessPayFlag parseOf(String value) {
		for (SupervisionBusinessPayFlag item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("异常错误代码[" + value + "]不匹配!");
	}
}
