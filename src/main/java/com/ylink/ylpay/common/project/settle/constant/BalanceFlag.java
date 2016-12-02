/**
 * 版权所有(C) 2012 证联融通
 * 创建:HuAJ 2012-11-28
 */

package com.ylink.ylpay.common.project.settle.constant;

import java.util.HashMap;
import java.util.Map;

/** 
 * @author HuAJ
 * @date 2012-11-28
 * @description：试算平衡标志
 */

public enum BalanceFlag {
	
	UNBALANCE("0", "不平衡"),
	BALANCE("1", "平衡"),
	
	;
	
	private String value;
	private String displayName;
	
	public String getValue() {
		return this.value;
	}
	
	public String getDisplayName() {
		return this.displayName;
	}
	
	BalanceFlag(String value, String displayName){
		this.value = value ;
		this.displayName = displayName ;
	}
	
	private static Map<String, BalanceFlag> valueMap = new HashMap<String, BalanceFlag>();

	static {
		for (BalanceFlag _enum : BalanceFlag.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	/**
	 * 枚举转换
	 */
	public static BalanceFlag parseOf(String value){
		for(BalanceFlag item : values())
			if(item.getValue().equals(value))
				return item;
		
		throw new IllegalArgumentException("试算平衡标志["+value+"]不匹配!");
	}
	
}