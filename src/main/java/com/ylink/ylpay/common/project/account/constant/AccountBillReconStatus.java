/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Iquil 2012-10-30
 */

package com.ylink.ylpay.common.project.account.constant;


/** 
 * @author Iquil
 * @date 2012-10-30
 * @description：记账流水对账状态
 */

public enum AccountBillReconStatus {
	UNRECON("0", "未对账"), 
	AUTO_RECON("1", "自动对账"),
	HANDBY_RECON("2", "手工对账"),
	NO_RECON("3", "无需对账"),
	;

	private String value;
	private String displayName;
	
	/**
	 * 枚举转换
	 */
	public static AccountBillReconStatus parseOf( String value ){
		for( AccountBillReconStatus item:values() )
			if( item.getValue().equals(value) )
				return item;
		
		throw new IllegalArgumentException("记账流水对账状态枚举值["+value+"]不匹配!");
	}

	public String getValue() {
		return this.value;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	AccountBillReconStatus(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
}
