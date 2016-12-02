package com.ylink.ylpay.common.project.channel.constant;

import java.util.HashMap;
import java.util.Map;

/** 
* @Description:渠道连接方式
* @author yangchen
* @date 2014-4-11 下午1:45:33 
*/ 
public enum LinkMethod {

	DIRECT_BANK("0","银行"),
	INDIRECT_UNIONPAY("1","银联"),
	INDIRECT_NCPS("2","金融联");
	
	private String value;
	private final String displayName;

	private static Map<String, LinkMethod> valueMap = new HashMap<String, LinkMethod>();

	static {
		for ( LinkMethod _enum : LinkMethod.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	LinkMethod( String value, String displayName ) {
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
	* @return LinkMethod
	* @author yang_chen
	* @date 2014-4-11 下午1:42:27
	*/
	public static LinkMethod parseOf(String value) {
		for (LinkMethod item : values())
			if (item.getValue().equals(value))
				return item;
		return null;
	}
}
