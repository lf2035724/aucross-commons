/**
 * 版权所有(C) 2015 证联融通电子有限公司
 * 创建:feng.li 2015-1-7
 */

/**
 * PublicNoticeStatus.java
 * 版权所有(C) 2015 证联融通电子有限公司
 * 创建:feng.li 2015-1-7
 */
package com.ylink.ylpay.common.project.portal.constant;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/** 
 * @author feng.li
 * @date 2015-1-7
 * @description：TODO
 */

/**
 * @author feng.li
 *
 */
public enum ArticleType implements PersistentEnum<ArticleType, String>,Serializable{
	
	NORMAL("00","正常"),
	HOT("01","热");
	
	private String value;
	private final String displayName;
	
	private static Map<String, ArticleType> valueMap = new HashMap<String, ArticleType>();

	static {
		for (ArticleType _enum : ArticleType.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	ArticleType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
	
	ArticleType(String value, String displayName, boolean hasRefundNo) {
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
	public ArticleType getEnum(String value) {
		return valueMap.get(value);
	}

	@Override
	public Map<String, ArticleType> getAllValueMap() {
		return valueMap;
	}
	
	/**
	 * 枚举转换
	 */
	public static ArticleType parseOf(String value) {
		for (ArticleType item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}
	
	@Override
	public String toString() {
		return this.getDisplayName();
	}
}
