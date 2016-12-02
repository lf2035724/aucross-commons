/**
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-9-16
 */

/**
 * OpenEnterLinkStatus.java
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-9-16
 */
package com.ylink.ylpay.common.project.supplychain.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/** 
 * @author feng.li
 * @date 2013-9-16
 * @description：企业通开通状态
 */

/**
 * @author feng.li
 *
 */
public enum OpenEnterLinkStatus implements PersistentEnum<OpenEnterLinkStatus, String>{
	
	OPEN("1", "已开通"),

	NOTOPEN("0", "未开通");


	private String value;
	private final String displayName;
	
	private static Map<String, OpenEnterLinkStatus> valueMap = new HashMap<String, OpenEnterLinkStatus>();

	static {
		for (OpenEnterLinkStatus _enum : OpenEnterLinkStatus.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	OpenEnterLinkStatus(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
	
	OpenEnterLinkStatus(String value, String displayName, boolean hasRefundNo) {
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
	public OpenEnterLinkStatus getEnum(String value) {
		return valueMap.get(value);
	}

	@Override
	public Map<String, OpenEnterLinkStatus> getAllValueMap() {
		return valueMap;
	}
	
	/**
	 * 枚举转换
	 */
	public static OpenEnterLinkStatus parseOf(String value) {
		for (OpenEnterLinkStatus item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}
}
