package com.ylink.ylpay.common.project.portal.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/****
 * 性别
 * @author lyg
 *
 */
public enum ServiceType implements PersistentEnum<ServiceType, String> {

	

	T01( "01", "仅邮件通知" ),
	T02( "02", "仅短信通知" )
	;

	private String value;
	private final String displayName;


	private static Map<String, ServiceType> valueMap = new HashMap<String, ServiceType>();

	static {
		for ( ServiceType _enum : ServiceType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	ServiceType( String value, String displayName ) {
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
	public ServiceType getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, ServiceType> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	public static ServiceType returnEnum( String value ) {
		return valueMap.get( value );
	}

	

}