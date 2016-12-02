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

public enum OrderStatus {

	ORDER_STATUS_00 ("00","等待付款"),
	ORDER_STATUS_01 ("01","付款成功"),
	ORDER_STATUS_02 ("02","撤单中"),
	ORDER_STATUS_03 ("03","撤单完成"),
	ORDER_STATUS_04 ("04","付款失败");
    
    private String value;
    private String displayName;
    
    public String getValue() {
        return this.value;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }
    
    
    OrderStatus(String value, String displayName){
        this.value = value ;
        this.displayName = displayName ;
    }
    
    private static Map<String, OrderStatus> valueMap = new HashMap<String, OrderStatus>();

    static {
        for (OrderStatus _enum : OrderStatus.values()) {
            valueMap.put(_enum.value, _enum);
        }
    }
    
    /**
     * 枚举转换
     */
    public static OrderStatus parseOf(String value){
        for(OrderStatus item : values())
            if(item.getValue().equals(value))
                return item;
        
        throw new IllegalArgumentException("异常错误代码["+value+"]不匹配!");
    }
    
}
