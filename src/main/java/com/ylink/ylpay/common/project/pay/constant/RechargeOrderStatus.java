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
 * @description：充值订单状态
 */

public enum RechargeOrderStatus {
	
	HANDLING("00", "处理中"),
	SUCCESS("01", "充值成功"),
	FAIL("02", "充值失败"),
	FAIL_REVERSE("03", "充值失败,已冲正"),
	CALLBACK_HANDLING("04", "处理中"),
	FAIL_ADDITIONAL("05", "充值失败,已补录"),
	;
	
	private String value;
	private String displayName;
	
	public String getValue() {
		return this.value;
	}
	
	public String getDisplayName() {
		return this.displayName;
	}
	
	private static Map<String, RechargeOrderStatus> valueMap = new HashMap<String, RechargeOrderStatus>();

	static {
		for (RechargeOrderStatus _enum : RechargeOrderStatus.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	/**
	 * 枚举转换
	 */
	public static RechargeOrderStatus parseOf(String value){
		for(RechargeOrderStatus item : values())
			if(item.getValue().equals(value))
				return item;
		
		throw new IllegalArgumentException("充值订单状态["+value+"]不匹配!");
	}
	
	RechargeOrderStatus(String value, String displayName){
		this.value = value ;
		this.displayName = displayName ;
	}
}
