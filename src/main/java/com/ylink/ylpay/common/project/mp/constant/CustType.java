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
public enum CustType implements PersistentEnum<CustType, String> {

	FUND( "FUND", "基金", CustSubject.FUND_PAYABLES ),

	WINE( "WINE", "白酒", CustSubject.SPIRIT_PAYABLES ),

	MALL( "MALL", "商城", CustSubject.SHOP_PAYABLES ),
	
	OTCBB( "OTCBB", "交易所", CustSubject.OTCBB_PAYABLES ),

	OTHER( "OTHER", "其它" );

	private String value;
	private final String displayName;
	private CustSubject custSubject;

	private static Map<String, CustType> valueMap = new HashMap<String, CustType>();

	static {
		for ( CustType _enum : CustType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	CustType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	CustType( String value, String displayName, CustSubject custSubject ) {
		this.value = value;
		this.displayName = displayName;
		this.custSubject = custSubject;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public CustSubject getCustSubject() {
		return custSubject;
	}

	@Override
	public CustType getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, CustType> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	/**
	 * 枚举转换
	 */
	public static CustType parseOf( String value ) {
		for ( CustType item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "枚举值[" + value + "]不匹配!" );
	}

}