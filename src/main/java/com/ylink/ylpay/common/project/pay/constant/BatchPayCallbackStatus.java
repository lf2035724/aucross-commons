/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-10-30
 */

package com.ylink.ylpay.common.project.pay.constant;

import java.util.HashMap;
import java.util.Map;

/** 
 * @author ZhangDM(Mingly)
 * @date 2012-11-12
 * @description：批量支付回执状态
 */

public enum BatchPayCallbackStatus {
	
	UNHANDLE("00", "未处理"),
	HANDLING("01", "处理中"),
	OVER("02", "处理完成"),
	;
	
	private String value;
	private String displayName;
	
	public String getValue() {
		return this.value;
	}
	
	public String getDisplayName() {
		return this.displayName;
	}
	
	private static Map<String, BatchPayCallbackStatus> valueMap = new HashMap<String, BatchPayCallbackStatus>();

	static {
		for (BatchPayCallbackStatus _enum : BatchPayCallbackStatus.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	/**
	 * 枚举转换
	 */
	public static BatchPayCallbackStatus parseOf(String value){
		for(BatchPayCallbackStatus item : values())
			if(item.getValue().equals(value))
				return item;
		
		throw new IllegalArgumentException("批量支付回执状态["+value+"]不匹配!");
	}
	
	BatchPayCallbackStatus(String value, String displayName){
		this.value = value ;
		this.displayName = displayName ;
	}
}
