package com.ylink.ylpay.common.project.portal.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/****
 * 门户证件类型
 * @author lyg
 *
 */
public enum CardType implements PersistentEnum<CardType, String> {

	CARD_TYPE1("1", "储蓄卡"),

	CARD_TYPE2("2", "信用卡")
	;

	private String value;
	private final String displayName;


	private static Map<String, CardType> valueMap = new HashMap<String, CardType>();

	static {
		for ( CardType _enum : CardType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	CardType( String value, String displayName ) {
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
	public CardType getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, CardType> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	public static CardType returnEnum( String value ) {
		return valueMap.get( value );
	}


}