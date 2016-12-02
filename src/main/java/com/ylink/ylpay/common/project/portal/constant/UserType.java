package com.ylink.ylpay.common.project.portal.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.fund.constant.CertType;
import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * 用户类型
 * @author yu.han
 *
 */
public enum UserType implements PersistentEnum<UserType, String> {

	
	
	PERSONAL( "0", "个人" ),
	
	COMPANY( "1", "企业" ),
	;

	private String value;
	private final String displayName;


	private static Map<String, UserType> valueMap = new HashMap<String, UserType>();

	static {
		for ( UserType _enum : UserType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	UserType( String value, String displayName ) {
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
	public UserType getEnum( String value ) {
		return valueMap.get( value );
	}
	/**
	 * 获取枚举
	 */
	public static UserType returnEnum(String value) {
		return valueMap.get(value);
	}
	@Override
	public Map<String, UserType> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	/**
	 * 枚举转换
	 */
	public static UserType parseOf( String value ){
		for( UserType item:values() )
			if( item.getValue().equals(value) )
				return item;		
		throw new IllegalArgumentException("枚举值["+value+"]不匹配!");
	}

}