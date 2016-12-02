package com.ylink.ylpay.common.project.portal.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * 绑卡类型
 * @author yu.han
 *
 */
public enum TiedCardType implements PersistentEnum<TiedCardType, String> {

	EBS("0", "快捷"),

	EBANK("1", "网银")
	;

	private String value;
	private final String displayName;


	private static Map<String, TiedCardType> valueMap = new HashMap<String, TiedCardType>();

	static {
		for ( TiedCardType _enum : TiedCardType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	TiedCardType( String value, String displayName ) {
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
	public TiedCardType getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, TiedCardType> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	public static TiedCardType returnEnum( String value ) {
		return valueMap.get( value );
	}
	/**
	 * 枚举转换
	 */
	public static TiedCardType parseOf( String value ){
		for( TiedCardType item:values() )
			if( item.getValue().equals(value) )
				return item;		
		throw new IllegalArgumentException("枚举值["+value+"]不匹配!");
	}

}