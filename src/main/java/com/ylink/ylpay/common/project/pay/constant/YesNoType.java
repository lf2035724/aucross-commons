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
 * @description：是/否类型
 */

public enum YesNoType {
	
	NO("0", "否"),
	YES("1", "是"),
	;
	
	private String value;
	private String displayName;
	
	public String getValue() {
		return this.value;
	}
	
	public String getDisplayName() {
		return this.displayName;
	}
	
	YesNoType(String value, String displayName){
		this.value = value ;
		this.displayName = displayName ;
	}
	
	private static Map<String, YesNoType> valueMap = new HashMap<String, YesNoType>();

	static {
		for (YesNoType _enum : YesNoType.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	/**
	 * 枚举转换
	 */
	public static YesNoType parseOf(String value){
		for(YesNoType item : values())
			if(item.getValue().equals(value))
				return item;
		
		throw new IllegalArgumentException("是/否类型["+value+"]不匹配!");
	}
}
