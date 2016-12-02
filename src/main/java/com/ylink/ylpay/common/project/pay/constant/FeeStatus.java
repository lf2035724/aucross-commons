/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-10-30
 */

package com.ylink.ylpay.common.project.pay.constant;

import java.util.HashMap;
import java.util.Map;

/** 
 * @author ZhangDM(Mingly)
 * @date 2012-10-30
 * @description：计费状态
 */

public enum FeeStatus {
	
	NOCHARGE("0", "未计费"),
	CHARGE("1", "已计费"),
	;
	
	private String value;
	private String displayName;
	
	public String getValue() {
		return this.value;
	}
	
	public String getDisplayName() {
		return this.displayName;
	}
	
	FeeStatus(String value, String displayName){
		this.value = value ;
		this.displayName = displayName ;
	}
	
	private static Map<String, FeeStatus> valueMap = new HashMap<String, FeeStatus>();

	static {
		for (FeeStatus _enum : FeeStatus.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	/**
	 * 枚举转换
	 */
	public static FeeStatus parseOf(String value){
		for(FeeStatus item : values())
			if(item.getValue().equals(value))
				return item;
		
		throw new IllegalArgumentException("计费状态["+value+"]不匹配!");
	}
}
