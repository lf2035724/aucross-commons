/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 */
package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * 调用支付状态
 * @author yanghan
 * @date 2013-5-20
 */
public enum InvokingPayStatus implements PersistentEnum<InvokingPayStatus, String>{
	FAIL("0","失败"),
	SUCCESS("1","成功")
	;
	private String value;
	private String displayName;
	private static Map<String,InvokingPayStatus> valueMap = new HashMap<String, InvokingPayStatus>();
	/**
	 * 
	 */
	InvokingPayStatus(String value,String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
	static{
		for (InvokingPayStatus _emum : InvokingPayStatus.values()) {
			valueMap.put( _emum.value, _emum );
		}
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
	public InvokingPayStatus getEnum(String value) {
		// TODO Auto-generated method stub
		return valueMap.get(value);
	}

	/**
	 * @see com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum#getAllValueMap()
	 */
	@Override
	public Map<String, InvokingPayStatus> getAllValueMap() {
		// TODO Auto-generated method stub
		return valueMap;
	}
	public static InvokingPayStatus parseOf( String value ) {
		for ( InvokingPayStatus item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "枚举值[" + value + "]不匹配!" );
	}
}
