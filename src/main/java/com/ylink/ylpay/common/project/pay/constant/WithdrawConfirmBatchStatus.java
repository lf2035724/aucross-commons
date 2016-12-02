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
 * @description：提现确认批量状态
 */

public enum WithdrawConfirmBatchStatus {
	
	UNHANDLE("00", "未处理"),
	HANDLING("01", "处理中"),
	OVER("02", "处理完成"),
	FAIL("03", "处理失败"),
	;
	
	private String value;
	private String displayName;
	
	public String getValue() {
		return this.value;
	}
	
	public String getDisplayName() {
		return this.displayName;
	}
	
	private static Map<String, WithdrawConfirmBatchStatus> valueMap = new HashMap<String, WithdrawConfirmBatchStatus>();

	static {
		for (WithdrawConfirmBatchStatus _enum : WithdrawConfirmBatchStatus.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	/**
	 * 枚举转换
	 */
	public static WithdrawConfirmBatchStatus parseOf(String value){
		for(WithdrawConfirmBatchStatus item : values())
			if(item.getValue().equals(value))
				return item;
		
		throw new IllegalArgumentException("充值订单状态["+value+"]不匹配!");
	}
	
	WithdrawConfirmBatchStatus(String value, String displayName){
		this.value = value ;
		this.displayName = displayName ;
	}
}
