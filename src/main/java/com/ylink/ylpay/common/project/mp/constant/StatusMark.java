package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * 有效状态位.
 * 
 * @author 潘瑞峥
 * @date 2012-12-25
 */
public enum StatusMark implements PersistentEnum<StatusMark, String> {

	INVALID( "0", "无效" ),

	VALID( "1", "有效" ),

	FROZEN( "9", "冻结" );

	private String value;
	private final String displayName;

	private static Map<String, StatusMark> valueMap = new HashMap<String, StatusMark>();

	static {
		for ( StatusMark _enum : StatusMark.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	StatusMark( String value, String displayName ) {
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
	public StatusMark getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, StatusMark> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}
	
	/**
	 * 枚举转换
	 */
	public static StatusMark parseOf( String value ) {
		for ( StatusMark item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "枚举值[" + value + "]不匹配!" );
	}
	public static StatusMark[] bankList(){
		StatusMark[] statusMarks = new StatusMark[]{VALID,INVALID};
		return statusMarks;
	}
}