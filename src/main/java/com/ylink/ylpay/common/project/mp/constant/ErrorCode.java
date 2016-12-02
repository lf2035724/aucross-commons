package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

public enum ErrorCode {
    
	PAY_CHECK_PARAM_ERROR("0101", "参数错误"),
    PAY_CHECK_CUST_STATUS("0102", "客户状态正确"),
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
