/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-11-1
 */

/**
 * PaymentType.java
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司 
 * 创建:YG.HU 2012-11-1
 */
package com.ylink.ylpay.common.project.pay.constant;

import java.util.HashMap;
import java.util.Map;

/** 
 * @author YG.HU
 * @date 2012-11-1
 * @description：支付交易类型
 */
public enum PaymentType {
    
    ACCOUNT_PAYMENT("00", "账户支付"), 
    GATEWAY_PAYMENT_RECHARGE("01", "网关支付"),
    SHORTCUT_PAYMENT("02", "快捷支付"), 
    BANK_ACCOUNT_TRANSFER("03", "银行账户转账"), 
    BANK_ACCOUNT_COLLECTION("04", "银行收账"),
    
    ;
    
    private String value;
    private String displayName;
    
    public String getValue() {
        return this.value;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }
    
    PaymentType(String value, String displayName){
        this.value = value ;
        this.displayName = displayName ;
    }
    
    private static Map<String, PaymentType> valueMap = new HashMap<String, PaymentType>();

	static {
		for (PaymentType _enum : PaymentType.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	/**
	 * 枚举转换
	 */
	public static PaymentType parseOf(String value){
		for(PaymentType item : values())
			if(item.getValue().equals(value))
				return item;
		
		throw new IllegalArgumentException("支付交易类型["+value+"]不匹配!");
	}
}
