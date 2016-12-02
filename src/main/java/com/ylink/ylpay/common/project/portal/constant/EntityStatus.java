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
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.constant.OptType;
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
public enum EntityStatus implements PersistentEnum<EntityStatus, String>,Serializable{
	
	NEW("02","新建"),
	NORMAL("00","正常"),
	DISABLED("01","停用");
	
	private String value;
	private final String displayName;
	
	private static Map<String, EntityStatus> valueMap = new HashMap<String, EntityStatus>();

	static {
		for (EntityStatus _enum : EntityStatus.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	EntityStatus(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
	
	EntityStatus(String value, String displayName, boolean hasRefundNo) {
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
	public EntityStatus getEnum(String value) {
		return valueMap.get(value);
	}

	@Override
	public Map<String, EntityStatus> getAllValueMap() {
		return valueMap;
	}
	
	/**
	 * 枚举转换
	 */
	public static EntityStatus parseOf(String value) {
		for (EntityStatus item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}
	
	/**
	 * 枚举转换
	 */
	public static EntityStatus parseOfDisplayName(String value) {
		for (EntityStatus item : values())
			if (item.getDisplayName().equals(value))
				return item;

		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}
	
	public static List<EntityStatus> canUpdate(){
		return Arrays.asList(new EntityStatus[] {
				NORMAL,DISABLED
		});
	}
	
	@Override
	public String toString() {
		return this.getDisplayName();
	}
}
