/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-10-30
 */

package com.ylink.ylpay.common.project.account.constant;

import java.util.HashMap;
import java.util.Map;

/** 
 * @author ZhangDM(Mingly)
 * @date 2012-10-30
 * @description：是否计息类型
 */

public enum IsInterest {
	/**不计息*/
	NOINTEREST("0", "不计息"),
	/**需要计息*/
	INTEREST("1", "计息"),
	;
	
	private String value;
	private String displayName;
	
	public String getValue() {
		return this.value;
	}
	
	public String getDisplayName() {
		return this.displayName;
	}
	
	IsInterest(String value, String displayName){
		this.value = value ;
		this.displayName = displayName ;
	}
	
	private static Map<String, IsInterest> valueMap = new HashMap<String, IsInterest>();

	static {
		for (IsInterest _enum : IsInterest.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	/**
	 * 枚举转换
	 */
	public static IsInterest parseOf(String value){
		for(IsInterest item : values())
			if(item.getValue().equals(value))
				return item;
		
		throw new IllegalArgumentException("是否计息类型["+value+"]不匹配!");
	}
}
