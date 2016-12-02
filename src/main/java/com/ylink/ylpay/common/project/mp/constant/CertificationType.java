package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * 证件类型.
 * 
 * @author 潘瑞峥
 * @date 2012-11-5
 */
public enum CertificationType implements PersistentEnum<CertificationType, String> {

	P01( "P01", "居民身份证" ),
	
	P03( "P03", "临时身份证" ),

	P01_B( "P01_B", "居民身份证背面" ),

	P04( "P04", "军人证" ),
	
	P08("P08","武警证"),

	P16("P16","居民户口簿"),
	
	P31( "P31", "护照" ),
	
	P41("P41", "港澳台居民来往内地通行证"),

	C01( "C01", "营业执照" ),

	C08( "C08", "事业法人登记证书" ),

	C09( "C09", "组织机构代码证" ),

	C11( "C11", "国家税务登记证" ),

	C12( "C12", "地方税务登记证" ),
	
	C13( "C13", "企业委托书" );
	
	

	private String value;
	private final String displayName;

	private static Map<String, CertificationType> valueMap = new HashMap<String, CertificationType>();

	static {
		for ( CertificationType _enum : CertificationType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	CertificationType( String value, String displayName ) {
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
	public CertificationType getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, CertificationType> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	public static CertificationType returnEnum( String value ) {
		return valueMap.get( value );
	}

	/**
	 * 企业客户的证件类型.
	 */
	public static CertificationType[] enterpriseValues() {
		CertificationType[] values = new CertificationType[] { C01, C09 };
		return values;
	}

	/**
	 * 枚举转换
	 */
	public static CertificationType parseOf( String value ) {
		for ( CertificationType item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "枚举值[" + value + "]不匹配!" );
	}

}