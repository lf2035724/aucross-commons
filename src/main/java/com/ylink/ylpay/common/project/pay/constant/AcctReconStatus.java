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
 * @description：账务对账状态
 */

public enum AcctReconStatus {
	
	NOTHAVE("00", "未对账"),
	SUCCESS("01", "平帐"),
	FAIL("02", "不平帐"),
	ADJUST("03", "调平帐"),
	NEEDHANDLE("04", "需要手工对账"),
	NOTNEED( "05", "无需对账" ),
	;
	
	private String value;
	private String displayName;
	
	public String getValue() {
		return this.value;
	}
	
	public String getDisplayName() {
		return this.displayName;
	}
	private static Map<String,AcctReconStatus> valueMap = new HashMap<String, AcctReconStatus>();
	
	static{
		for (AcctReconStatus _emun : AcctReconStatus.values()) {
			valueMap.put(_emun.value, _emun);
		}
	}
	
	/**
	 * 枚举转化
	 */
	public static AcctReconStatus parseOf(String value){
		for(AcctReconStatus item : values())
			if(item.getValue().equals(value))
				return item;
		
		throw new IllegalArgumentException("账务对账状态["+value+"]不匹配!");
	}
	
	AcctReconStatus(String value, String displayName){
		this.value = value ;
		this.displayName = displayName ;
	}
}
