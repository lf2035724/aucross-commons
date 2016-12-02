/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-10-31
 */

/**
 * ErrorCode.java
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司 
 * 创建:YG.HU 2012-10-31
 */
package com.ylink.ylpay.common.project.pay.constant;

import java.util.HashMap;
import java.util.Map;

/** 
 * @author YG.HU
 * @date 2012-10-31
 * @description：异常错误代码
 */

public enum ErrorCode {
    
    NoFail("00", "无异常"),
    AccFail("01", "记账失败"),
    ChnnlFail("02", "支付失败"),
    AccReverseFail("03", "冲正失败"),
    AccBalanceInsufficient("04", "账户余额不足"),
    ;
    
    private String value;
    private String displayName;
    
    public String getValue() {
        return this.value;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }
    
    ErrorCode(String value, String displayName){
        this.value = value ;
        this.displayName = displayName ;
    }
    
    private static Map<String, ErrorCode> valueMap = new HashMap<String, ErrorCode>();

	static {
		for (ErrorCode _enum : ErrorCode.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	/**
	 * 枚举转换
	 */
	public static ErrorCode parseOf(String value){
		for(ErrorCode item : values())
			if(item.getValue().equals(value))
				return item;
		
		throw new IllegalArgumentException("异常错误代码["+value+"]不匹配!");
	}
}
