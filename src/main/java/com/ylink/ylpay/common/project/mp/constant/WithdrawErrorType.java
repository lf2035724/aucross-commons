/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 */
package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * @author yanghan
 * @date 2013-5-29
 */
public enum WithdrawErrorType implements PersistentEnum<WithdrawErrorType, String>{
		ERROR_CARD_NO("RC09","帐号不符"),
		ERROR_AMT_ERROR("RC10","金额不一致")
	;
	
	private String value;
	private String displayName;
	
	private static Map<String, WithdrawErrorType> valueMap = new HashMap<String, WithdrawErrorType>();
	
	private WithdrawErrorType(String value,String displayName){
		this.value = value;
		this.displayName = displayName;
	}
	
	static{
		for (WithdrawErrorType _enum : WithdrawErrorType.values()) {
			valueMap.put(_enum.getValue(), _enum);
		}
	}
	
	/**
	 * @see com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum#getValue()
	 */
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return value;
	}

	/**
	 * @see com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum#getDisplayName()
	 */
	@Override
	public String getDisplayName() {
		// TODO Auto-generated method stub
		return displayName;
	}

	/**
	 * @see com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum#getEnum(java.lang.Object)
	 */
	@Override
	public WithdrawErrorType getEnum(String value) {
		// TODO Auto-generated method stub
		return valueMap.get(value);
	}

	/**
	 * @see com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum#getAllValueMap()
	 */
	@Override
	public Map<String, WithdrawErrorType> getAllValueMap() {
		// TODO Auto-generated method stub
		return valueMap;
	}
	public static WithdrawErrorType parseOf( String value ) {
		for ( WithdrawErrorType item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "枚举值[" + value + "]不匹配!" );
	}
	
}
