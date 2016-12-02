/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 * 创建:Pengyindong 2013-1-10
 */

package com.ylink.ylpay.common.project.fund.constant;

import java.util.HashMap;
import java.util.Map;

/** 
 * @author Pengyindong
 * @date 2013-1-10
 * @description：订单状态
 */

public enum PayType {
	//申购方式
	PAY_TYPE_0("0","银行卡支付"),
	PAY_TYPE_1("1","账户支付"),
	PAY_TYPE_00 ("00","虚户支付"),
	PAY_TYPE_01 ("01","快捷支付"),
	PAY_TYPE_02 ("02","网关支付");
    
    private String value;
    private String displayName;
    
    public String getValue() {
        return this.value;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }
    
    
    PayType(String value, String displayName){
        this.value = value ;
        this.displayName = displayName ;
    }
    
    private static Map<String, PayType> valueMap = new HashMap<String, PayType>();

    static {
        for (PayType _enum : PayType.values()) {
            valueMap.put(_enum.value, _enum);
        }
    }
    
    /**
     * 枚举转换
     */
    public static PayType parseOf(String value){
        for(PayType item : values())
            if(item.getValue().equals(value))
                return item;
        
        throw new IllegalArgumentException("异常错误代码["+value+"]不匹配!");
    }
    
}
