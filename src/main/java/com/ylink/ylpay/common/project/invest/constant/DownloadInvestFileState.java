package com.ylink.ylpay.common.project.invest.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wanglei
 * @date 2014-10-14
 * @description：下载慧投结算类文件操作状态
 */
public enum DownloadInvestFileState {
	DOWNLOADINVESTFILESTATE_WAIT("0", "待处理"),
	DOWNLOADINVESTFILESTATE_SUCCESS("1", "成功"),
	DOWNLOADINVESTFILESTATE_LOSS("2", "失败");
	private String value;
	private String displayName;
	
	public String getValue() {
		return this.value;
	}
	
	public String getDisplayName() {
		return this.displayName;
	}
	
	DownloadInvestFileState(String value, String displayName){
		this.value = value ;
		this.displayName = displayName ;
	}
	
	private static Map<String, DownloadInvestFileState> valueMap = new HashMap<String, DownloadInvestFileState>();

	static {
		for (DownloadInvestFileState _enum : DownloadInvestFileState.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	/**
	 * 枚举转换
	 */
	public static DownloadInvestFileState parseOf(String value){
		for(DownloadInvestFileState item : values())
			if(item.getValue().equals(value))
				return item;
		
		throw new IllegalArgumentException("支付系统接口类型["+value+"]不匹配!");
	}	
}
