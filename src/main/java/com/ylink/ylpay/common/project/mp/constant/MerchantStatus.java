/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 */

package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * @author YangXiaojin
 * @date 2012-10-31
 * @description：TODO
 */
public enum MerchantStatus implements PersistentEnum<MerchantStatus, String> {

	EFFECTIVE( "EFFECTIVE", "有效" ),

	FROZEN( "FROZEN", "冻结" );

	private String value;
	private final String displayName;

	private static Map<String, MerchantStatus> valueMap = new HashMap<String, MerchantStatus>();

	static {
		for ( MerchantStatus _enum : MerchantStatus.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	MerchantStatus( String value, String displayName ) {
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
	public MerchantStatus getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, MerchantStatus> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	/**
	 * 枚举转换
	 */
	public static MerchantStatus parseOf( String value ) {
		for ( MerchantStatus item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "枚举值[" + value + "]不匹配!" );
	}

}