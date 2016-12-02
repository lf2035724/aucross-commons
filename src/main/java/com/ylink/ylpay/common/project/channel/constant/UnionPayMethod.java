package com.ylink.ylpay.common.project.channel.constant;

import java.util.HashMap;
import java.util.Map;

/** 
* @Description:中国银联支付方式
* @author yangchen
* @date 2014-3-11 上午11:55:57 
*/ 
public enum UnionPayMethod {

	UPOP("01","中国银联互联网(快捷)支付"),
	UPMP("02","中国银联移动支付"),
	UPGP("03","中国银联网关支付"),
	UPAP("04","中国银联代付");
	
	private String value;
	private String displayName;
	
	UnionPayMethod(String value,String displayName){
		this.value = value;
		this.displayName = displayName;
	}

	private static Map<String, UnionPayMethod> valueMap = new HashMap<String, UnionPayMethod>();

	static {
		for ( UnionPayMethod _enum : UnionPayMethod.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}
	
	public static UnionPayMethod parseOf(String value) {
		for (UnionPayMethod item : values())
			if (item.getValue().equals(value))
				return item;
		return null;
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
}
