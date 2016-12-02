/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 */
package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yanghan
 * @date 2013-7-3
 */
public enum AdjustType {
	INTEREST_ACCT("0","利息收入入账"),
	INCOME_OUT("1","收入汇缴转出"),
	FEE_OUT("2","手续费支出"),
	WRITEDOWN_FEE_OUT("3","冲减手续费支出")
	;
	private String value;
	private String displayName;
	
	private static Map<String, AdjustType> valueMap = new HashMap<String, AdjustType>();
	
	static {
		for ( AdjustType _enum : AdjustType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}
	
	AdjustType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}
	
	public String getValue() {
		return this.value;
	}
	public String getDisplayName() {
		return this.displayName;
	}
	
	public AdjustType getEnum( String value ) {
		return valueMap.get( value );
	}

	public Map<String, AdjustType> getAllValueMap() {
		return valueMap;
	}
	
	public static AdjustType parseOf( String value ) {
		for ( AdjustType item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "枚举值[" + value + "]不匹配!" );
	}
}
