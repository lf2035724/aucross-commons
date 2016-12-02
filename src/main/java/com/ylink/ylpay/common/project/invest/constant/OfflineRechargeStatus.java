/**
 * OfflineRechargeStatus.java
 * 版权所有(C) 2013 证联融通电子有限公司 
 * 创建:LiuQ 2013-12-12
 */
package com.ylink.ylpay.common.project.invest.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LiuQ
 * @date 2013-12-12
 * @description 线下充值状态
 */
public enum OfflineRechargeStatus {

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
    
    
    OfflineRechargeStatus(String value, String displayName){
        this.value = value ;
        this.displayName = displayName ;
    }
    
    private static Map<String, OfflineRechargeStatus> valueMap = new HashMap<String, OfflineRechargeStatus>();

    static {
        for (OfflineRechargeStatus _enum : OfflineRechargeStatus.values()) {
            valueMap.put(_enum.value, _enum);
        }
    }
    
    /**
     * 枚举转换
     */
    public static OfflineRechargeStatus parseOf(String value){
        for(OfflineRechargeStatus item : values())
            if(item.getValue().equals(value))
                return item;
        
        throw new IllegalArgumentException("异常错误代码["+value+"]不匹配!");
    }
}
