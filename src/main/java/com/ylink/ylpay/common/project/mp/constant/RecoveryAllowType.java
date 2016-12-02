package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * 人工找回密码, 上传文件支持的类型.
 * 
 * 完整类型参照tomcat下web.xml.
 * 
 * @author 潘瑞峥
 * @date 2013-1-4
 */
public enum RecoveryAllowType implements PersistentEnum<RecoveryAllowType, String> {

	PNG( "PNG", "png", "image/png" ),

	BMP( "BMP", "bmp", "image/bmp" ),

	JPG( "JPG", "jpg", "image/jpeg" ),

	JPEG( "JPEG", "jpeg", "image/jpeg" );

	private String value;
	private final String displayName;
	private String type;

	private static Map<String, RecoveryAllowType> valueMap = new HashMap<String, RecoveryAllowType>();

	static {
		for ( RecoveryAllowType _enum : RecoveryAllowType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	RecoveryAllowType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	private RecoveryAllowType( String value, String displayName, String type ) {
		this.value = value;
		this.displayName = displayName;
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public String getType() {
		return type;
	}

	public static RecoveryAllowType parseOf( String value ) {
		return valueMap.get( value );
	}

	@Override
	public RecoveryAllowType getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, RecoveryAllowType> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

}