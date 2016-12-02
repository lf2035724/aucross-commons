/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-10-30
 */

package com.ylink.ylpay.common.project.pay.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * @author ZhangDM(Mingly)
 * @date 2012-10-30
 * @description：计费方式
 */
public enum FeeType implements PersistentEnum<FeeType, String> {

	NONEED( "0", "无需计费" ),

	BEFORE( "1", "事前计费" ),

	AFTER( "2", "事后计费" );

	private String value;
	private final String displayName;

	private static Map<String, FeeType> valueMap = new HashMap<String, FeeType>();

	static {
		for ( FeeType _enum : FeeType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	FeeType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	@Override
	public FeeType getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, FeeType> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	/**
	 * 枚举转换
	 */
	public static FeeType parseOf( String value ) {
		for ( FeeType item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "计费方式[" + value + "]不匹配!" );
	}

}