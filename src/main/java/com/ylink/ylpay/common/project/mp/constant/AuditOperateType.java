/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 */
package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * @author yanghan
 * @date 2013-7-11
 */
public enum AuditOperateType implements PersistentEnum<AuditOperateType, String>{
	ALREADY("0","已操作"),
	NOT("1","未操作")
	;
	private String value;
	private String displayName;
	
	private static Map<String,AuditOperateType> valueMap = new HashMap<String, AuditOperateType>();
	
	static{
		for ( AuditOperateType _enum : AuditOperateType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}
	/**
	 * 
	 */
	AuditOperateType(String value,String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	/**
	 * @see com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum#getValue()
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * @see com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum#getDisplayName()
	 */
	@Override
	public String getDisplayName() {
		// TODO Auto-generated method stub
		return displayName;
	}

	/**
	 * @see com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum#getEnum(java.lang.Object)
	 */
	@Override
	public AuditOperateType getEnum(String value) {
		// TODO Auto-generated method stub
		return valueMap.get(value);
	}

	/**
	 * @see com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum#getAllValueMap()
	 */
	@Override
	public Map<String, AuditOperateType> getAllValueMap() {
		// TODO Auto-generated method stub
		return valueMap;
	}
}
