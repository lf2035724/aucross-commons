/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-10-30
 */

package com.ylink.ylpay.common.project.pay.constant;

/** 
 * @author ZhangDM(Mingly)
 * @date 2012-10-30
 * @description：充值方式
 */

public enum RechargeType {
	
	EBANK("00", "网银充值"),
	SHORTCUT("01", "快捷充值"),
	ADDITIONAL("02", "补录"),
	OFFLINE("03", "线下转账"),
	OTHER("04", "其他"),
	;
	
	private String value;
	private String displayName;
	
	public String getValue() {
		return this.value;
	}
	
	public String getDisplayName() {
		return this.displayName;
	}
	
	RechargeType(String value, String displayName){
		this.value = value ;
		this.displayName = displayName ;
	}
	
	/**
	 * 枚举转换
	 */
	public static RechargeType parseOf( String value ){
		for( RechargeType item:values() )
			if( item.getValue().equals(value) )
				return item;		
		throw new IllegalArgumentException("枚举值["+value+"]不匹配!");
	}
}
