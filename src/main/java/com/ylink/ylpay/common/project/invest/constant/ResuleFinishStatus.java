package com.ylink.ylpay.common.project.invest.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wanglei
 * @date 2014-10-14
 * @description：核算结果更新状态
 */
public enum ResuleFinishStatus {
	RESULEFINISHSTATUS_NOT("9", "未更新"),
	RESULEFINISHSTATUS_SUCCESS("0", "更新成功"),
	RESULEFINISHSTATUS_LOSS("1", "更新失败");
	private String value;
	private String displayName;
	
	public String getValue() {
		return this.value;
	}
	
	public String getDisplayName() {
		return this.displayName;
	}
	
	ResuleFinishStatus(String value, String displayName){
		this.value = value ;
		this.displayName = displayName ;
	}
	
	private static Map<String, ResuleFinishStatus> valueMap = new HashMap<String, ResuleFinishStatus>();

	static {
		for (ResuleFinishStatus _enum : ResuleFinishStatus.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	/**
	 * 枚举转换
	 */
	public static ResuleFinishStatus parseOf(String value){
		for(ResuleFinishStatus item : values())
			if(item.getValue().equals(value))
				return item;
		
		throw new IllegalArgumentException("支付系统接口类型["+value+"]不匹配!");
	}	
}
