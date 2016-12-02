package com.ylink.ylpay.common.project.invest.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wanglei
 * @date 2014-10-14
 * @description：核算结果状态
 */
public enum ResuleStatus {
	RESULESTATUS_WAIT("99", "待核算"),
	RESULESTATUS_SUCCESS("00", "核算一致"),
	RESULESTATUS_LOSS("01", "核算不一致");
	private String value;
	private String displayName;
	
	public String getValue() {
		return this.value;
	}
	
	public String getDisplayName() {
		return this.displayName;
	}
	
	ResuleStatus(String value, String displayName){
		this.value = value ;
		this.displayName = displayName ;
	}
	
	private static Map<String, ResuleStatus> valueMap = new HashMap<String, ResuleStatus>();

	static {
		for (ResuleStatus _enum : ResuleStatus.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	/**
	 * 枚举转换
	 */
	public static ResuleStatus parseOf(String value){
		for(ResuleStatus item : values())
			if(item.getValue().equals(value))
				return item;
		
		throw new IllegalArgumentException("支付系统接口类型["+value+"]不匹配!");
	}	
}
