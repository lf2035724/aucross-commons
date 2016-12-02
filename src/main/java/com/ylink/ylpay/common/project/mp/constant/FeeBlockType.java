package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * 分段标志.
 * 
 * @author 潘瑞峥
 * @date 2012-11-15
 */
public enum FeeBlockType implements PersistentEnum<FeeBlockType, String> {

	BLOCK( "BLOCK", "分段" ),

	PROGRESSION( "PROGRESSION", "累进" ),

	NOT_BLOCK( "NOT_BLOCK", "不分段" );

	private String value;
	private final String displayName;

	private static Map<String, FeeBlockType> valueMap = new HashMap<String, FeeBlockType>();

	static {
		for ( FeeBlockType _enum : FeeBlockType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	FeeBlockType( String value, String displayName ) {
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
	public FeeBlockType getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, FeeBlockType> getAllValueMap() {
		return valueMap;
	}
	
	public static FeeBlockType[] getSupportedValues(){
		return new FeeBlockType[]{BLOCK,NOT_BLOCK};
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

}