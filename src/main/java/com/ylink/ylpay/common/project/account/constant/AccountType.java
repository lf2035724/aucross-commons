/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Iquil 2012-10-29
 */

package com.ylink.ylpay.common.project.account.constant;

/**
 * @author Iquil
 * @date 2012-10-29
 * @description：记账类型
 */

public enum AccountType {

	FEE("0", "手续费记账"), 
	BUSINESS("1", "业务记账"),
	INCOMETRANSFER("2", "年末结转—收入结转"), 
	OUTLAYTRANSFER("3", "年末结转—支出结转"),
	YEARPROFITTRANSFER("4", "年末结转—本年利润结转"), 
	;

	private String value;
	private String displayName;
	
	public static AccountType parseOf( String value ){
		for( AccountType item:values() )
			if( item.getValue().equals(value) )
				return item;
		
		throw new IllegalArgumentException("枚举值["+value+"]不匹配!");
	}
	public String getValue() {
		return this.value;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	AccountType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
}
