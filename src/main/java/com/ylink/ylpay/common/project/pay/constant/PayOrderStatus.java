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
 * @description：支付订单状态
 */

public enum PayOrderStatus {
	
	SUCCESS("00", "支付成功"),
	FAIL("01", "支付失败"),
	HANDLING_CHANNEL("02", "渠道处理中"),
	HANDLING_ACC("03", "记账处理中"),
	HANDLING_REVERSE("04", "冲正中"),
	HANDLING_OFFLINE("05", "线下渠道处理中"),
	HANDLING_REVERSE_SUCC("06", "冲正成功"),
	REVERSE_FAIL("07", "冲正失败"),
	ADDITIONAL_RECORD("08", "已补录"),
	;
	
	private String value;
	private String displayName;
	
	public String getValue() {
		return this.value;
	}
	
	public String getDisplayName() {
		return this.displayName;
	}
	
	PayOrderStatus(String value, String displayName){
		this.value = value ;
		this.displayName = displayName ;
	}
	
	private static Map<String, PayOrderStatus> valueMap = new HashMap<String, PayOrderStatus>();

	static {
		for (PayOrderStatus _enum : PayOrderStatus.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	/**
	 * 枚举转换
	 */
	public static PayOrderStatus parseOf(String value){
		for(PayOrderStatus item : values())
			if(item.getValue().equals(value))
				return item;
		
		throw new IllegalArgumentException("支付订单状态["+value+"]不匹配!");
	}
}
