package com.ylink.ylpay.common.project.invest.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wanglei
 * @date 2014-10-14
 * @description：数据保存状态
 */
public enum DataSaveStatus {
	DATASAVESTATUS_WAIT("0", "待处理"),
	DATASAVESTATUS_SUCCESS("1", "成功"),
	DATASAVESTATUS_LOSS("2", "失败");
	private String value;
	private String displayName;
	
	public String getValue() {
		return this.value;
	}
	
	public String getDisplayName() {
		return this.displayName;
	}
	
	DataSaveStatus(String value, String displayName){
		this.value = value ;
		this.displayName = displayName ;
	}
	
	private static Map<String, DataSaveStatus> valueMap = new HashMap<String, DataSaveStatus>();

	static {
		for (DataSaveStatus _enum : DataSaveStatus.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	/**
	 * 枚举转换
	 */
	public static DataSaveStatus parseOf(String value){
		for(DataSaveStatus item : values())
			if(item.getValue().equals(value))
				return item;
		
		throw new IllegalArgumentException("支付系统接口类型["+value+"]不匹配!");
	}	
}
