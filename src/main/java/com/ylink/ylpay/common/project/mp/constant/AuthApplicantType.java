package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * 实名认证申请人类型.
 * 
 * @author 潘瑞峥
 * @date 2013-3-26
 */
public enum AuthApplicantType implements PersistentEnum<AuthApplicantType, String> {

	THE_LEGAL_REPRESENTATIVE( "1", "法定代表人" ),

	THE_AGENT( "2", "代理人" );

	private String value;
	private final String displayName;

	private static Map<String, AuthApplicantType> valueMap = new HashMap<String, AuthApplicantType>();

	static {
		for ( AuthApplicantType _enum : AuthApplicantType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	AuthApplicantType( String value, String displayName ) {
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
	public AuthApplicantType getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, AuthApplicantType> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

}