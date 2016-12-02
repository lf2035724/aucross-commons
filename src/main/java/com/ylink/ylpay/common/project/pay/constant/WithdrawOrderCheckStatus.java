/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-11-1
 */

/**
 * PaymentOrderStatus.java
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司 
 * 创建:YG.HU 2012-11-1
 */
package com.ylink.ylpay.common.project.pay.constant;

import java.util.HashMap;
import java.util.Map;

/** 
 * @author ZhangDM(Mingly)
 * @date 2012-11-6
 * @description：提现交易订单审核状态
 */
public enum WithdrawOrderCheckStatus {
    
    UNCHECK("0", "未审核"),
    SUCCESS("1", "审核通过"),
    FAIL("2", "审核拒绝"),
    ;
    
    private String value;
    private String displayName;
    
    public String getValue() {
        return this.value;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }
    
    WithdrawOrderCheckStatus(String value, String displayName){
        this.value = value ;
        this.displayName = displayName ;
    }
    
    private static Map<String, WithdrawOrderCheckStatus> valueMap = new HashMap<String, WithdrawOrderCheckStatus>();

	static {
		for (WithdrawOrderCheckStatus _enum : WithdrawOrderCheckStatus.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	/**
	 * 枚举转换
	 */
	public static WithdrawOrderCheckStatus parseOf(String value){
		for(WithdrawOrderCheckStatus item : values())
			if(item.getValue().equals(value))
				return item;
		
		throw new IllegalArgumentException("提现交易订单审核状态["+value+"]不匹配!");
	}
}
