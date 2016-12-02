package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

/** 
* @Description:交易来源枚举
* @author yangchen
* @date 2014-4-11 下午1:36:47 
*/ 
public enum TradeOrigin {

	INTERNET("0","互联网"),
	MOBILE_TERMINAL("1","移动终端");
	
	private String value;
	private final String displayName;

	private static Map<String, TradeOrigin> valueMap = new HashMap<String, TradeOrigin>();

	static {
		for ( TradeOrigin _enum : TradeOrigin.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	TradeOrigin( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
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
	
	/** 
	* @Title: parseOf 
	* @Description: 根据枚举值转换成枚举类型
	* @param value
	* @return TradeOrigin
	* @author yang_chen
	* @date 2014-4-11 下午1:42:27
	*/
	public static TradeOrigin parseOf(String value) {
		for (TradeOrigin item : values())
			if (item.getValue().equals(value))
				return item;
		return null;
	}
	
}
