package com.ylink.ylpay.common.project.supervision.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * 证件类型.
 * 
 * @author 潘瑞峥
 * @date 2012-11-5
 */
public enum CertificationTypeCCB implements PersistentEnum<CertificationTypeCCB, String> {

	P01( "P01", "居民身份证" ,"1010"),
	
	P03( "P03", "临时身份证" ,"1011"),

	P01_B( "P01_B", "居民身份证背面" ),

	P04( "P04", "军人证" ,"1020"),
	
	P08("P08","武警证","2060"),

	P16("P16","居民户口簿","1040"),
	
	P31( "P31", "护照" ,"1050"),
	
	P41("P41", "港澳台居民来往内地通行证","1070"),

	C01( "C01", "营业执照" ,"2010"),

	C08( "C08", "事业法人登记证书" ,"2040"),

	C09( "C09", "组织机构代码证" ,"2020"),

	C11( "C11", "国家税务登记证" ,"2091"),

	C12( "C12", "地方税务登记证" ,"2092"),
	
	C13( "C13", "企业委托书" );
	
	

	private String value;
	private final String displayName;
	private String ccbType;

	private static Map<String, CertificationTypeCCB> valueMap = new HashMap<String, CertificationTypeCCB>();

	static {
		for ( CertificationTypeCCB _enum : CertificationTypeCCB.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}
	

	/**
	 * @param value
	 * @param displayName
	 */
	CertificationTypeCCB(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	/**
	 * @param value
	 * @param displayName
	 * @param ccbType
	 */
	private CertificationTypeCCB(String value, String displayName, String ccbType) {
		this.value = value;
		this.displayName = displayName;
		this.ccbType = ccbType;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	@Override
	public CertificationTypeCCB getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, CertificationTypeCCB> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	public static CertificationTypeCCB returnEnum( String value ) {
		return valueMap.get( value );
	}
	
	/**
	 * 企业客户的证件类型.
	 */
	public static CertificationTypeCCB[] enterpriseValues() {
		CertificationTypeCCB[] values = new CertificationTypeCCB[] { C01, C09 };
		return values;
	}
	public static String toCCBType(String certType){
		if(valueMap.containsKey(certType)){
			return valueMap.get(certType).ccbType;
		}
		throw new IllegalArgumentException( "枚举值[" + certType + "]不匹配!" );
	}

	/**
	 * 枚举转换
	 */
	public static CertificationTypeCCB parseOf( String value ) {
		for ( CertificationTypeCCB item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "枚举值[" + value + "]不匹配!" );
	}

	/**
	 * @return the ccbType
	 */
	public String getCcbType() {
		return ccbType;
	}
	
}