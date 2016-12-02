/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-10-30
 */

package com.ylink.ylpay.common.project.pay.constant;

import java.util.HashMap;
import java.util.Map;

/** 
 * @author ZhangDM(Mingly)
 * @date 2012-10-30
 * @description：交易类型
 */

public enum TradeType {
	
	RECHARGE("00", "充值"),
	WITHDRAW("01", "提现"),
	PAY("02", "支付"),
	;
	
	private String value;
	private String displayName;
	
	public String getValue() {
		return this.value;
	}
	
	public String getDisplayName() {
		return this.displayName;
	}
	
	TradeType(String value, String displayName){
		this.value = value ;
		this.displayName = displayName ;
	}
	
	private static Map<String, TradeType> valueMap = new HashMap<String, TradeType>();

	static {
		for (TradeType _enum : TradeType.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	/**
	 * 枚举转换
	 */
	public static TradeType parseOf(String value){
		for(TradeType item : values())
			if(item.getValue().equals(value))
				return item;
		
		throw new IllegalArgumentException("交易类型["+value+"]不匹配!");
	}
}
