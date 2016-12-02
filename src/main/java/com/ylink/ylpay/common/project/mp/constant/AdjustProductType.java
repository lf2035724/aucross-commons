/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 */
package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * @author yanghan
 * @date 2013-7-3
 */
public enum AdjustProductType implements PersistentEnum<AdjustProductType, String>{
	
	CONSUMPTION( "1", "普通消费类" ),

	FUND( "2", "基金类" ),
	
	OTC( "3", "交易所" ),
	;
	private String value;
	private String displayName;

	private static Map<String, AdjustProductType> valueMap = new HashMap<String, AdjustProductType>();

	static {
		for ( AdjustProductType _enum : AdjustProductType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}
	
	AdjustProductType( String value, String displayName ) {
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
	public AdjustProductType getEnum(String value) {
		// TODO Auto-generated method stub
		return valueMap.get(value);
	}

	/**
	 * @see com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum#getAllValueMap()
	 */
	@Override
	public Map<String, AdjustProductType> getAllValueMap() {
		// TODO Auto-generated method stub
		return valueMap;
	}
	
	public static AdjustProductType parseOf( String value ){
		for( AdjustProductType item:values() )
			if( item.getValue().equals(value) )
				return item;
		
		throw new IllegalArgumentException("产品类型["+value+"]不匹配!");
	}
}
