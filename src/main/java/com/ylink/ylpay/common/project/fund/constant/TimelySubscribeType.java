package com.ylink.ylpay.common.project.fund.constant;

import java.util.HashMap;
import java.util.Map;

public enum TimelySubscribeType {

	ORDER_STATUS_00("00","新建"),
	ORDER_STATUS_01("01","等待支付"),
	ORDER_STATUS_02("02","支付成功"),
	ORDER_STATUS_03("03","支付失败");
	
    private String value;
    private String displayName;
    
    public String getValue() {
        return this.value;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }
    
    TimelySubscribeType(String value, String displayName){
        this.value = value ;
        this.displayName = displayName ;
    }
    
    private static Map<String, TimelySubscribeType> valueMap = new HashMap<String, TimelySubscribeType>();

    static {
        for (TimelySubscribeType _enum : TimelySubscribeType.values()) {
            valueMap.put(_enum.value, _enum);
        }
    }

    /**
     * 枚举转换
     */
    public static TimelySubscribeType parseOf(String value){
        for(TimelySubscribeType item : values())
            if(item.getValue().equals(value))
                return item;
        throw new IllegalArgumentException("异常错误代码["+value+"]不匹配!");
    }
}
