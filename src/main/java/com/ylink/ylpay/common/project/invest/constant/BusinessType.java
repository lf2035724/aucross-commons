package com.ylink.ylpay.common.project.invest.constant;

import java.util.HashMap;
import java.util.Map;



/**
 * @author wanglei
 * @date 2014-9-23
 * @description：000通知类字段BusinessType枚举
 */
public enum BusinessType {
	
	BusinessType_0001("0001", "申购对账"),
	BusinessType_0002("0002", "申购结算"),
	BusinessType_0003("0003", "赎回交易"),
	BusinessType_0004("0004", "赎回结算");
	
	private String value;
	private String displayName;
	
	public String getValue() {
		return this.value;
	}
	
	public String getDisplayName() {
		return this.displayName;
	}
	
	
	BusinessType(String value, String displayName){
		this.value = value ;
		this.displayName = displayName ;
	}
	
	private static Map<String, BusinessType> valueMap = new HashMap<String, BusinessType>();

	static {
		for (BusinessType _enum : BusinessType.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	/**
	  * @description 枚举转换
	  * @param 
	  * @return BusinessType
	  * @author wanglei
	  * @date 2014-9-23
	 */
	public static BusinessType parseOf(String value){
		for(BusinessType item : values())
			if(item.getValue().equals(value))
				return item;
		
		throw new IllegalArgumentException("["+value+"]不在枚举内!");
	}	
	
	/**
	  * @description 是否是BusinessType中的类型
	  * @param 
	  * @return boolean
	  * @author wanglei
	  * @date 2014-9-23
	 */
	public static boolean investBusiType(String value){
		try{
			BusinessType BusinessType = com.ylink.ylpay.common.project.invest.constant.BusinessType.parseOf(value);
			if(BusinessType==null){
				return false;
			}
		}catch(Exception e){
			return false;
		}
		return true;
	}
}
