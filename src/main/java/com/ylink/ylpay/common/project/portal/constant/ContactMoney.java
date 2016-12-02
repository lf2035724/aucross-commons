package com.ylink.ylpay.common.project.portal.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

public enum ContactMoney implements PersistentEnum<ContactMoney, String> {
	CM01( "1000000-10000000", "1万-10万" ),
	CM02( "10000000-50000000", "10万-50万" ),
	CM03( "50000000-100000000", "50万-100万" ),
	CM04( "100000000-*", "100万以上" ),
	ALL( "00", "全部" ),
	;

	private String value;
	private final String displayName;


	private static Map<String, ContactMoney> valueMap = new HashMap<String, ContactMoney>();

	static {
		for ( ContactMoney _enum : ContactMoney.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	ContactMoney( String value, String displayName ) {
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
	public ContactMoney getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, ContactMoney> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	public static ContactMoney returnEnum( String value ) {
		return valueMap.get( value );
	}

}
