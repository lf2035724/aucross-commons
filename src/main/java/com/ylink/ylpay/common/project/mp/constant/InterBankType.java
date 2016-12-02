package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.channel.constant.BankType;
import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * 跨行类型.
 * 
 * @author 潘瑞峥
 * @date 2013-3-14
 */
public enum InterBankType implements PersistentEnum<InterBankType, String> {

	INTER_BANK( "1", "跨行" ),

	INTERNAL( "2", "同行" ),

	BOTH( "3", "跨行和同行" );

	private String value;
	private final String displayName;

	private static Map<String, InterBankType> valueMap = new HashMap<String, InterBankType>();

	static {
		for ( InterBankType _enum : InterBankType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	InterBankType( String value, String displayName ) {
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
	public InterBankType getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, InterBankType> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}
	/**
	 * 枚举转换
	 */
	public static InterBankType parseOf(String value) {
		for (InterBankType item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}
}