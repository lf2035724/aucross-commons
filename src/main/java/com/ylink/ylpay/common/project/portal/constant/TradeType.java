package com.ylink.ylpay.common.project.portal.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/****
 * 性别
 * @author lyg
 *
 */
public enum TradeType implements PersistentEnum<TradeType, String> {

	

	T01( "01", "网上" ),
	T02( "02", "电话" ),
	T03( "03", "传真" ),
	T04( "04", "手机" )
	;

	private String value;
	private final String displayName;


	private static Map<String, TradeType> valueMap = new HashMap<String, TradeType>();

	static {
		for ( TradeType _enum : TradeType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	TradeType( String value, String displayName ) {
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
	public TradeType getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, TradeType> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	public static TradeType returnEnum( String value ) {
		return valueMap.get( value );
	}

	

}