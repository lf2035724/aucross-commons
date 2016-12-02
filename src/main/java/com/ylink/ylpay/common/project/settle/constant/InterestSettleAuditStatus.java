package com.ylink.ylpay.common.project.settle.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author jf.zhao
 * @date 2013-5-2
 * @description： 科目计息汇总管理平台审核状态
 */
public enum InterestSettleAuditStatus {
	
	

	
	WAITING_AUDIT("01","等待审核"),
	AUDIT_PASS("02","审核通过"),
	AUDIT_REJECT("03","审核拒绝"),
	AUDIT_INGING("04","审核中")
	
	;
	
	private String value;
	private String displayName;
	
	public String getValue() {
		return this.value;
	}
	
	public String getDisplayName() {
		return this.displayName;
	}
	
	InterestSettleAuditStatus(String value, String displayName){
		this.value = value ;
		this.displayName = displayName ;
	}
	
	private static Map<String, InterestSettleAuditStatus> valueMap = new HashMap<String, InterestSettleAuditStatus>();

	static {
		for (InterestSettleAuditStatus _enum : InterestSettleAuditStatus.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	/**
	 * 枚举转换
	 */
	public static InterestSettleAuditStatus parseOf(String value){
		for(InterestSettleAuditStatus item : InterestSettleAuditStatus.values())
			if(item.getValue().equals(value))
				return item;
		
		throw new IllegalArgumentException("商户计费状态["+value+"]不匹配!");
	}

}
