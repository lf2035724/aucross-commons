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
 * @description：异常编码
 */

public enum ExceptionCode {
	
	NORMAL("00", "无异常"),
	ACCOUNT("01", "记账失败"),
	PAY("02", "支付失败"),
	;
	
	private String value;
	private String displayName;
	
	public String getValue() {
		return this.value;
	}
	
	public String getDisplayName() {
		return this.displayName;
	}
	
	ExceptionCode(String value, String displayName){
		this.value = value ;
		this.displayName = displayName ;
	}
	
	private static Map<String, ExceptionCode> valueMap = new HashMap<String, ExceptionCode>();

	static {
		for (ExceptionCode _enum : ExceptionCode.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	/**
	 * 枚举转换
	 */
	public static ExceptionCode parseOf(String value){
		for(ExceptionCode item : values())
			if(item.getValue().equals(value))
				return item;
		
		throw new IllegalArgumentException("异常编码["+value+"]不匹配!");
	}
}
