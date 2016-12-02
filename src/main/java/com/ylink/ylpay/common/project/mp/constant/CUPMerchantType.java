/**
 * 版权所有(C) 2014 证联融通电子有限公司
 * 创建:feng.li 2014-12-5
 */

/**
 * CUPMerchantType.java
 * 版权所有(C) 2014 证联融通电子有限公司
 * 创建:feng.li 2014-12-5
 */
package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/** 
 * @author feng.li
 * @date 2014-12-5
 * @description：TODO
 */

/**
 * @author feng.li
 *
 */
public enum CUPMerchantType implements PersistentEnum<CUPMerchantType, String>{
	
	NORMAL("0","银联普通商户"),
	PLATFORM("1","银联平台商户");
	
	private String value;
	
	/**
	 * 描述
	 */
	private String displayName;
	
	private static Map<String, CUPMerchantType> valueMap = new HashMap<String, CUPMerchantType>();
	
	static {
		for (CUPMerchantType _enum : CUPMerchantType.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}

	
	private CUPMerchantType(String value,  String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
	
	/**
	 * 枚举转换
	 */
	public static CUPMerchantType parseOf(String value) {
		for (CUPMerchantType item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	@Override
	public CUPMerchantType getEnum(String value) {
		return valueMap.get(value);
	}

	@Override
	public Map<String, CUPMerchantType> getAllValueMap() {
		return valueMap;
	}
}
