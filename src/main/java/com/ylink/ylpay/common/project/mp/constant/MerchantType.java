package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.account.constant.CustSubject;
import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * 商户类型.
 * 
 * @author 潘瑞峥
 * @date 2012-11-1
 */
public enum MerchantType implements PersistentEnum<MerchantType, String> {

	NORMAL( "NORMAL", "一般商户" ),

	FIANCING( "FIANCING", "融资类商户" ),

	OTHER( "OTHER", "其它" );

	private String value;
	private final String displayName;

	private static Map<String, MerchantType> valueMap = new HashMap<String, MerchantType>();

	static {
		for ( MerchantType _enum : MerchantType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	MerchantType( String value, String displayName ) {
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
	public MerchantType getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, MerchantType> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	/**
	 * 枚举转换
	 */
	public static MerchantType parseOf( String value ) {
		for ( MerchantType item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "枚举值[" + value + "]不匹配!" );
	}

}