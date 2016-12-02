package com.ylink.ylpay.common.project.invest.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wanglei
 * @date 2014-10-14
 * @description：划款结果状态
 */
public enum TransferPayStatus {
	TRANSFERPAYSTATUS_WAIT("9", "待处理"),
	TRANSFERPAYSTATUS_SUCCESS("0", "成功"),
	TRANSFERPAYSTATUS_LOSS("1", "失败"),
	TRANSFERPAYSTATUS_PARTSUCESS("2", "部分成功");
	private String value;
	private String displayName;
	
	public String getValue() {
		return this.value;
	}
	
	public String getDisplayName() {
		return this.displayName;
	}
	
	TransferPayStatus(String value, String displayName){
		this.value = value ;
		this.displayName = displayName ;
	}
	
	private static Map<String, TransferPayStatus> valueMap = new HashMap<String, TransferPayStatus>();

	static {
		for (TransferPayStatus _enum : TransferPayStatus.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	/**
	 * 枚举转换
	 */
	public static TransferPayStatus parseOf(String value){
		for(TransferPayStatus item : values())
			if(item.getValue().equals(value))
				return item;
		
		throw new IllegalArgumentException("支付系统接口类型["+value+"]不匹配!");
	}	
}
