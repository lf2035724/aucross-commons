package com.ylink.ylpay.common.project.settle.constant;

import java.util.HashMap;
import java.util.Map;

/** 
 * @author yu.han
 * @date 2013-3-28
 * @description：账户汇总表状态标志
 */

public enum AccountSettleStatus {
	/**已结息*/
	INTEREST_SETTLE("00","已结息"),
	/**记账中*/
	INTEREST_ACCOUNTING("01","记账中"),
	/**记账成功*/
	INTEREST_ACCOUNT_SUCCESS("02","记账成功"),
	/**记账失败*/
	INTEREST_ACCOUNT_FAIL("03","记账失败"),
	;
	
	private String value;
	private String displayName;
	
	public String getValue() {
		return this.value;
	}
	
	public String getDisplayName() {
		return this.displayName;
	}
	
	AccountSettleStatus(String value, String displayName){
		this.value = value ;
		this.displayName = displayName ;
	}
	
	private static Map<String, AccountSettleStatus> valueMap = new HashMap<String, AccountSettleStatus>();

	static {
		for (AccountSettleStatus _enum : AccountSettleStatus.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	/**
	 * 枚举转换
	 */
	public static AccountSettleStatus parseOf(String value){
		for(AccountSettleStatus item : values())
			if(item.getValue().equals(value))
				return item;
		
		throw new IllegalArgumentException("账户汇总表状态标志["+value+"]不匹配!");
	}
	
}