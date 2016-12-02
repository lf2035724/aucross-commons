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
 * @description：渠道对账状态
 */

public enum ChnnlReconStatus {
	
	NONEED("00", "无需对账"),
	NOTHAVE("01", "未对账"),
	SUCCESS("02", "平帐"),
	FAIL("03", "不平帐"),
	ADJUST("04", "调平帐")
	;
	
	private String value;
	private String displayName;
	
	public String getValue() {
		return this.value;
	}
	
	public String getDisplayName() {
		return this.displayName;
	}
	private static Map<String,ChnnlReconStatus> valueMap = new HashMap<String,ChnnlReconStatus>();
	
	static{
		for (ChnnlReconStatus _enum : ChnnlReconStatus.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	/**
	 * 枚举转化
	 */
	public static ChnnlReconStatus parseOf(String value){
		for(ChnnlReconStatus item : values())
			if(item.getValue().equals(value))
				return item;
		
		throw new IllegalArgumentException("渠道对账状态["+value+"]不匹配!");
	}
	
	ChnnlReconStatus(String value, String displayName){
		this.value = value ;
		this.displayName = displayName ;
	}
}
