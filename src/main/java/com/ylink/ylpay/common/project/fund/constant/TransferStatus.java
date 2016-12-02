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

public enum TransferStatus {

	/*
	 * TRANSFER_SUC( "00", "转账成功" ),
	 * 
	 * TRANSFER_FAIL( "01", "转账失败" ),
	 * 
	 * TRANSFER_NOT( "99", "未转账" );
	 */
	TRANSFER_SUC("00", "已发送"),

	TRANSFER_FAIL("01", "发送失败"),

	TRANSFER_NOT("99", "未发送");

	private String value;
	private String displayName;

	public String getValue() {
		return this.value;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	TransferStatus(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	private static Map<String, TransferStatus> valueMap = new HashMap<String, TransferStatus>();

	static {
		for (TransferStatus _enum : TransferStatus.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}

	/**
	 * 枚举转换
	 */
	public static TransferStatus parseOf(String value) {
		for (TransferStatus item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("异常错误代码[" + value + "]不匹配!");
	}
}
