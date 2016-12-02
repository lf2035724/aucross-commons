/**
 * 版权所有(C) 2015 证联融通电子有限公司
 * 创建:feng.li 2015-1-8
 */

/**
 * PlateType.java
 * 版权所有(C) 2015 证联融通电子有限公司
 * 创建:feng.li 2015-1-8
 */
package com.ylink.ylpay.common.project.portal.constant;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/** 
 * @author feng.li
 * @date 2015-1-8
 * @description：TODO
 */

/**
 * @author feng.li
 *
 */
public enum PlateType implements PersistentEnum<PlateType, String>,Serializable{
	
	PARK_ACTIVITIES("01","园区活动","yqjs"),
	GUIDANCE_OF_EXPERTS("02","指导专家","zdzj"),
	COMPANY_INTRODUCTION("03","企业介绍","index"),
	NEWS("04","新闻资讯","xwzx"),
	RESULTS_SHOW_PARK("05","园区成果","cgzs"),
	RESULTS_SHOW_Event("06","赛事成果","sscg"),
	THE_PARK_SUPPORTS("07","园区扶持","yqfc"),
	THE_STATE_SUPPORTS("08","国家扶持","gjfc"),
	VENTURE_CAPITAL_FUND("09","创业基金","cyjj"),
	VC_FUND("10","VC基金","vcjj"),
	PUBLIC_NOTICE("11","公告","gg"),
	PARK_INTRODUCE("12","首页园区介绍","index"),
	MV_NEWS("13","视频新闻","spxw");
	
	private String value;
	private final String displayName;
	private String url;
	
	private static Map<String, PlateType> valueMap = new HashMap<String, PlateType>();

	static {
		for (PlateType _enum : PlateType.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	PlateType(String value, String displayName, String url) {
		this.value = value;
		this.displayName = displayName;
		this.url = url;
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
	public PlateType getEnum(String value) {
		return valueMap.get(value);
	}

	@Override
	public Map<String, PlateType> getAllValueMap() {
		return valueMap;
	}
	
	/**
	 * 枚举转换
	 */
	public static PlateType parseOf(String value) {
		for (PlateType item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}
	
	/**
	 * 枚举转换
	 */
	public static String getUrlByValue(String value) {
		for (PlateType item : values())
			if (item.getValue().equals(value))
				return item.getUrl();

		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString() {
		return this.getDisplayName();
	}

	public String getUrl() {
		return url;
	}
}
