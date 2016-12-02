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
 * @description：支付系统接口类型
 */

public enum PayOptType {
	
	GATEWAY_RECHARGE("00", "网关充值"),
	SHORTCUT_RECHARGE("01", "快捷充值"),
	GATEWAY_PAYMENT("02", "网关支付"),
	SHORTCUT_PAYMENT("03", "快捷支付"),
	WITHDRAW_CONFIRM("04", "提现确认"),
	BANK_ACCOUNT_TRANSFER("05", "银行账户转账"),
	RECHARGE_ROLLBACK_CONFIRM("06", "充值回退确认"),
	WITHDRAW_CONFIRM_SINGLE("07", "单笔提现"),
	GUARANTEE_PAYMENT_GATEWAY("08","网关担保支付"),
	GUARANTEE_PAYMENT_SHORTCUT("09","快捷担保支付"),
	JHB_GATEWAY_RECHARGE("10","金汇宝网关充值"),
	;
	
	
	private String value;
	private String displayName;
	
	public String getValue() {
		return this.value;
	}
	
	public String getDisplayName() {
		return this.displayName;
	}
	
	private static Map<String, PayOptType> valueMap = new HashMap<String, PayOptType>();

	static {
		for (PayOptType _enum : PayOptType.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	/**
	 * 枚举转换
	 */
	public static PayOptType parseOf(String value){
		for(PayOptType item : values())
			if(item.getValue().equals(value))
				return item;
		
		throw new IllegalArgumentException("支付系统接口类型["+value+"]不匹配!");
	}
	
	PayOptType(String value, String displayName){
		this.value = value ;
		this.displayName = displayName ;
	}
}
