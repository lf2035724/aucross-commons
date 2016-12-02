/**
 * RefundOrderStatus.java
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司-证联融通电子有限公司 
 * 创建:LiuQ 2013-4-15
 */
package com.ylink.ylpay.common.project.pay.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LiuQ
 * @date 2013-4-15
 * @description 担保支付--退款单状态
 */
public enum RefundOrderStatus {

	WAIT_SELLER_CONFIRM("00", "退款协议等待卖家确认中"),
	REFUND_REFUSE("01", "拒绝退款"),
	REFUND_SUCCESS("02", "退款成功"),
	REFUND_CLOSE("03", "退款关闭")
	;
	
	private String value;
    private String displayName;
    
    public String getValue() {
        return this.value;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }
    
    
    RefundOrderStatus(String value, String displayName){
        this.value = value ;
        this.displayName = displayName ;
    }
    
    private static Map<String, RefundOrderStatus> valueMap = new HashMap<String, RefundOrderStatus>();

    static {
        for (RefundOrderStatus _enum : RefundOrderStatus.values()) {
            valueMap.put(_enum.value, _enum);
        }
    }
    
    /**
     * 枚举转换
     */
    public static RefundOrderStatus parseOf(String value){
        for(RefundOrderStatus item : values())
            if(item.getValue().equals(value))
                return item;
        
        throw new IllegalArgumentException("异常错误代码["+value+"]不匹配!");
    }
}
