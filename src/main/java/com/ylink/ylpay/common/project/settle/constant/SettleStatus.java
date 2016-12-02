package com.ylink.ylpay.common.project.settle.constant;

import java.util.HashMap;
import java.util.Map;

/** 
 * @author yu.han
 * @date 2013-1-24
 * @description：计息汇总表状态标志
 */

public enum SettleStatus {
	/**账户结息处理中*/
	INTEREST_ACCOUNT_SETTLEING("00","账户结息处理中"),
	/**账户结息成功*/
	INTEREST_ACCOUNT_SETTLE_SUCCESS("01","账户结息成功"),
	/**账户结息失败*/
	INTEREST_ACCOUNT_SETTLE_FAIL("02","账户结息失败"),
	/**成本记账处理中*/
	CAPITAL_ACCOUNTING("03","成本记账处理中"),
	/**成本记账成功*/
	CAPITAL_ACCOUNT_SUCCESS("04","成本记账成功"),
	/**成本记账失败*/
	CAPITAL_ACCOUNT_FAIL("05","成本记账失败"),
	/**结息记账处理中*/
	INTEREST_ACCOUNTING("06","结息记账处理中"),
	/**结息记账成功*/
	INTEREST_ACCOUNT_SUCCESS("07","结息记账成功"),
	/**结息记账失败*/
	INTEREST_ACCOUNT_FAIL("08","结息记账失败"),
	;
	
	private String value;
	private String displayName;
	
	public String getValue() {
		return this.value;
	}
	
	public String getDisplayName() {
		return this.displayName;
	}
	
	SettleStatus(String value, String displayName){
		this.value = value ;
		this.displayName = displayName ;
	}
	
	private static Map<String, SettleStatus> valueMap = new HashMap<String, SettleStatus>();

	static {
		for (SettleStatus _enum : SettleStatus.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	/**
	 * 枚举转换
	 */
	public static SettleStatus parseOf(String value){
		for(SettleStatus item : values())
			if(item.getValue().equals(value))
				return item;
		
		throw new IllegalArgumentException("计息汇总表状态标志["+value+"]不匹配!");
	}
	
}