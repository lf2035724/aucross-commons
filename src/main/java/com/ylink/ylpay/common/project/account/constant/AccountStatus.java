/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Iquil 2012-10-30
 */

package com.ylink.ylpay.common.project.account.constant;


/** 
 * @author Iquil
 * @date 2012-10-30
 * @description：账户状态
 */

public enum AccountStatus {
	VALID("00", "生效"), 
	FREEZED("01", "冻结"),
	DRNOTALLOW("03", "禁止借记"),
	CRNOTALLOW("04", "禁止贷记"),
	;

	private String value;
	private String displayName;
	
	/**
	 * 枚举转换
	 */
	public static AccountStatus parseOf( String value ){
		for( AccountStatus item:values() )
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

	AccountStatus(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
}
