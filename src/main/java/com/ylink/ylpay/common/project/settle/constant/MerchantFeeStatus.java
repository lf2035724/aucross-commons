/*******************************************************************************
 * Project   : aucross-common
 * Class Name: com.ylink.ylpay.common.project.settle.constant.MerchantFeeStatus
 * Created By: 杜波 159-9965-3650
 * Created on: 2013-3-27 上午11:29:35
 * Copyright © 2010-2012 证联融通 All rights reserved.
 ******************************************************************************/
package com.ylink.ylpay.common.project.settle.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * <P>商户计费状态</P>
 * @author 杜波 159-9965-3650
 * @description：
 */
public enum MerchantFeeStatus {
	WAITING_GATHER("0", "等待收取"),
	WAITING_AUDIT("1","等待审核"),
	AUDIT_PASS("2","审核通过"),
	AUDIT_REJECT("3","审核拒绝"),
	
	;
	
	private String value;
	private String displayName;
	
	public String getValue() {
		return this.value;
	}
	
	public String getDisplayName() {
		return this.displayName;
	}
	
	MerchantFeeStatus(String value, String displayName){
		this.value = value ;
		this.displayName = displayName ;
	}
	
	private static Map<String, MerchantFeeStatus> valueMap = new HashMap<String, MerchantFeeStatus>();

	static {
		for (MerchantFeeStatus _enum : MerchantFeeStatus.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	/**
	 * 枚举转换
	 */
	public static MerchantFeeStatus parseOf(String value){
		for(MerchantFeeStatus item : values())
			if(item.getValue().equals(value))
				return item;
		
		throw new IllegalArgumentException("商户计费状态["+value+"]不匹配!");
	}
}
