package com.ylink.ylpay.common.project.invest.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wanglei
 * @date 2014-10-14
 * @description：核算状态
 */
public enum IsCheckStatus {
	ISCHECKSTATUS_WAIT("99", "待处理"),
	ISCHECKSTATUS_SUCCESS("00", "成功"),
	ISCHECKSTATUS_LOSS("01", "失败");
	private String value;
	private String displayName;
	
	public String getValue() {
		return this.value;
	}
	
	public String getDisplayName() {
		return this.displayName;
	}
	
	IsCheckStatus(String value, String displayName){
		this.value = value ;
		this.displayName = displayName ;
	}
	
	private static Map<String, IsCheckStatus> valueMap = new HashMap<String, IsCheckStatus>();

	static {
		for (IsCheckStatus _enum : IsCheckStatus.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	/**
	 * 枚举转换
	 */
	public static IsCheckStatus parseOf(String value){
		for(IsCheckStatus item : values())
			if(item.getValue().equals(value))
				return item;
		
		throw new IllegalArgumentException("支付系统接口类型["+value+"]不匹配!");
	}	
}
