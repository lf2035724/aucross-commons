package com.ylink.ylpay.common.project.invest.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wanglei
 * @date 2014-10-14
 * @description：转账结果状态
 */
public enum TransferStatus {
	TRANSFERSTATUS_WAIT("02", "待处理"),
	TRANSFERSTATUS_SUCCESS("00", "成功"),
	TRANSFERSTATUS_LOSS("01", "失败");
	private String value;
	private String displayName;
	
	public String getValue() {
		return this.value;
	}
	
	public String getDisplayName() {
		return this.displayName;
	}
	
	TransferStatus(String value, String displayName){
		this.value = value ;
		this.displayName = displayName ;
	}
	
	private static Map<String, TransferStatus> valueMap = new HashMap<String, TransferStatus>();

	static {
		for (TransferStatus _enum : TransferStatus.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	/**
	 * 枚举转换
	 */
	public static TransferStatus parseOf(String value){
		for(TransferStatus item : values())
			if(item.getValue().equals(value))
				return item;
		
		throw new IllegalArgumentException("支付系统接口类型["+value+"]不匹配!");
	}	
}
