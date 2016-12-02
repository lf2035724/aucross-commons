/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-10-30
 */

package com.ylink.ylpay.common.project.pay.constant;

import java.util.HashMap;
import java.util.Map;


/** 
 * @author ZhangDM(Mingly)
 * @date 2013-1-10
 * @description：支付订单类型
 */

public enum PayOrderType {
	
	BUSINESS("0", "业务支付订单"),
	FEE("1", "手续费支付订单"),
	REVERSE("2", "冲正支付订单"),
	;
	
	
	private String value;
	private String displayName;
	
	public String getValue() {
		return this.value;
	}
	
	public String getDisplayName() {
		return this.displayName;
	}
	
	private static Map<String, PayOrderType> valueMap = new HashMap<String, PayOrderType>();

	static {
		for (PayOrderType _enum : PayOrderType.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	/**
	 * 枚举转换
	 */
	public static PayOrderType parseOf(String value){
		for(PayOrderType item : values())
			if(item.getValue().equals(value))
				return item;
		
		throw new IllegalArgumentException("支付订单类型["+value+"]不匹配!");
	}
	
	PayOrderType(String value, String displayName){
		this.value = value ;
		this.displayName = displayName ;
	}
}
