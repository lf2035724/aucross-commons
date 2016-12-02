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
 * @description：对账平衡标志
 */

public enum ReconBalanceFlag {
	
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
	
	ReconBalanceFlag(String value, String displayName){
		this.value = value ;
		this.displayName = displayName ;
	}
	
	private static Map<String, ReconBalanceFlag> valueMap = new HashMap<String, ReconBalanceFlag>();

	static {
		for (ReconBalanceFlag _enum : ReconBalanceFlag.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	/**
	 * 枚举转换
	 */
	public static ReconBalanceFlag parseOf(String value){
		for(ReconBalanceFlag item : values())
			if(item.getValue().equals(value))
				return item;
		
		throw new IllegalArgumentException("试算平衡标志["+value+"]不匹配!");
	}
	
}