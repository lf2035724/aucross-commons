/**
 * WithdrawOrderStatus.java
 * 版权所有(C) 2014 证联融通电子有限公司 
 * 创建:LiuQ 2014-3-7
 */
package com.ylink.ylpay.common.project.fund.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LiuQ
 * @date 2014-3-7
 * @description 股交所资金转出订单状态
 */
public enum WithdrawOrderStatus {

	ORDER_STATUS_00 ("00","新建"),
	ORDER_STATUS_01 ("01","支付处理中"),
	ORDER_STATUS_02 ("02","支付成功"),
	ORDER_STATUS_03 ("03","支付失败");
    
    private String value;
    private String displayName;
    
    public String getValue() {
        return this.value;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }
    
    
    WithdrawOrderStatus(String value, String displayName){
        this.value = value ;
        this.displayName = displayName ;
    }
    
    private static Map<String, WithdrawOrderStatus> valueMap = new HashMap<String, WithdrawOrderStatus>();

    static {
        for (WithdrawOrderStatus _enum : WithdrawOrderStatus.values()) {
            valueMap.put(_enum.value, _enum);
        }
    }
    
    /**
     * 枚举转换
     */
    public static WithdrawOrderStatus parseOf(String value){
        for(WithdrawOrderStatus item : values())
            if(item.getValue().equals(value))
                return item;
        
        throw new IllegalArgumentException("异常错误代码["+value+"]不匹配!");
    }
}
