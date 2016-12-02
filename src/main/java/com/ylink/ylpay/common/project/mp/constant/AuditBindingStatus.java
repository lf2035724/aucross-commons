/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 */
package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * @author yanghan
 * @date 2013-5-27
 */
public enum AuditBindingStatus implements PersistentEnum<AuditBindingStatus, String>{
	BINDING("0","绑卡"),
	UNBINDING("1","解绑")
	;
	private String value;
	private String displayName;
	
	private static Map<String,AuditBindingStatus> valueMap = new HashMap<String, AuditBindingStatus>();
	
	static {
		for ( AuditBindingStatus _enum : AuditBindingStatus.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}
	/**
	 * 
	 */
	private AuditBindingStatus(String value,String displayName) {
		// TODO Auto-generated constructor stub
		this.value = value;
		this.displayName = displayName;
	}
	/**
	 * @see com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum#getValue()
	 */
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
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
	public AuditBindingStatus getEnum(String value) {
		// TODO Auto-generated method stub
		return valueMap.get(value);
	}

	/**
	 * @see com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum#getAllValueMap()
	 */
	@Override
	public Map<String, AuditBindingStatus> getAllValueMap() {
		// TODO Auto-generated method stub
		return valueMap;
	}
	public String toString() {
		return this.getDisplayName();
	}
	public static AuditBindingStatus parseOf( String value ) {
		for ( AuditBindingStatus item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "枚举值[" + value + "]不匹配!" );
	}
	
}
